package com.example.repository

import com.example.model.ApiResponse
import com.example.model.Hero

const val NEXT_PAGE_KEY = "nextPage"
const val PREV_PAGE_KEY = "prevPage"

class HeroRepositoryImpl : HeroRepository {

    override val heroes: Map<Int, List<Hero>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }

    override val page1 = listOf(
        Hero(
            id = 1,
            name = "Yasuo",
            image = "/images/ys.jpg",
            about = "11"
        ),
        Hero(
            id = 2,
            name = "Zed",
            image = "/images/zed.jpg",
            about = "22"
        ),
        Hero(
            id = 3,
            name = "Vayne",
            image = "/images/vayne.jpg",
            about = "33"
        )
    )
    override val page2 = listOf(
        Hero(
            id = 4,
            name = "Tristana",
            image = "/images/tris.jpg",
            about = "44"
        ),
        Hero(
            id = 5,
            name = "Thresh",
            image = "/images/thresh.jpg",
            about = "55"
        ),
        Hero(
            id = 6,
            name = "Monderkaiser",
            image = "/images/monder.jpg",
            about = "66"
        )
    )
    override val page3 = listOf(
        Hero(
            id = 7,
            name = "Malphite",
            image = "/images/mal.jpg",
            about = "77"
        ),
        Hero(
            id = 8,
            name = "Leona",
            image = "/images/leona.jpg",
            about = "88"
        ),
        Hero(
            id = 9,
            name = "Kayle",
            image = "/images/kayle.png",
            about = "99"
        )
    )
    override val page4 = listOf(
        Hero(
            id = 10,
            name = "Garen",
            image = "/images/garen.jpg",
            about = "1010"
        ),
        Hero(
            id = 11,
            name = "Ezreal",
            image = "/images/ez.jpg",
            about = "1111"
        ),
        Hero(
            id = 12,
            name = "Ekko",
            image = "/images/ekko.jpg",
            about = "1212"
        )
    )
    override val page5 = listOf(
        Hero(
            id = 13,
            name = "Code",
            image = "/images/diana.png",
            about = "1313"
        ),
        Hero(
            id = 14,
            name = "Darius",
            image = "/images/darius.jpg",
            about = "1414"
        ),
        Hero(
            id = 15,
            name = "Blitzcrank",
            image = "/images/blitz.jpg",
            about = "1515",
        )
    )

    override suspend fun getAllHeroes(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREV_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            heroes = heroes[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page

        if (page in 1..4) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..5) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 5) {
            nextPage = null
        }
        return mapOf(PREV_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

    override suspend fun searchHeroes(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            heroes = findHeroes(query = name)
        )
    }

    private fun findHeroes(query: String?): List<Hero> {
        val founded = mutableListOf<Hero>()
        return if (!query.isNullOrEmpty()) {
            heroes.forEach { (_, heroes) ->
                heroes.forEach { hero ->
                    if (hero.name.lowercase().contains(query.lowercase())) {
                        founded.add(hero)
                    }
                }
            }
            founded
        } else {
            emptyList()
        }
    }


}