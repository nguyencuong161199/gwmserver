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
            about = "An Ionian of deep resolve, Yasuo is an agile swordsman who wields the air itself against his enemies. As a proud young man, he was falsely accused of murdering his master—unable to prove his innocence, he was forced to slay his own brother in self-defense. In time, his master’s true killer was revealed, and his brother mysteriously returned from death, yet Yasuo still could not forgive himself for all he had done. Now, he wanders the world with only the wind to guide his blade."
        ),
        Hero(
            id = 2,
            name = "Zed",
            image = "/images/zed.jpg",
            about = "Utterly ruthless and without mercy, Zed is the leader of the Order of Shadow, an organization he created with the intent of militarizing Ionia’s magical and martial traditions to drive out Noxian invaders. During the war, desperation led him to unlock the secret shadow form—a malevolent spirit magic as dangerous and corrupting as it is powerful. Zed has mastered all of these forbidden techniques to destroy anything he sees as a threat to his nation, or his new order."
        ),
        Hero(
            id = 3,
            name = "Vayne",
            image = "/images/vayne.jpg",
            about = "Shauna Vayne is a deadly, remorseless Demacian monster hunter, who has dedicated her life to finding and destroying the demon that murdered her family. Armed with a wrist-mounted crossbow and a heart full of vengeance, she is only truly happy when slaying practitioners or creations of the dark arts, striking from the shadows with a flurry of silver bolts."
        )
    )
    override val page2 = listOf(
        Hero(
            id = 4,
            name = "Tristana",
            image = "/images/tris.jpg",
            about = "While many other yordles channel their energy into discovery, invention, or just plain mischief-making, Tristana was always inspired by the adventures of great warriors. She had heard much about Runeterra, its factions, and its wars, and believed her kind could become worthy of legend too. Setting foot in the world for the first time, she took up her trusty cannon Boomer, and now leaps into battle with steadfast courage and optimism."
        ),
        Hero(
            id = 5,
            name = "Thresh",
            image = "/images/thresh.jpg",
            about = "Sadistic and cunning, Thresh is an ambitious and restless spirit of the Shadow Isles. Once the custodian of countless arcane secrets, he was undone by a power greater than life or death, and now sustains himself by tormenting and breaking others with slow, excruciating inventiveness. His victims suffer far beyond their brief mortal coil as Thresh wreaks agony upon their souls, imprisoning them in his unholy lantern to torture for all eternity."
        ),
        Hero(
            id = 6,
            name = "Morderkaiser",
            image = "/images/monder.jpg",
            about = "Twice slain and thrice born, Mordekaiser is a brutal warlord from a foregone epoch, who uses his necromantic sorcery to bind souls into an eternity of servitude. Few now remain who remember his earlier conquests, or know the true extent of his powers—but there are some ancient souls that do, and they fear the day when he may return to claim dominion over both the living and the dead."
        )
    )
    override val page3 = listOf(
        Hero(
            id = 7,
            name = "Malphite",
            image = "/images/mal.jpg",
            about = "Amassive creature of living stone, Malphite was born from the heart of the great Ixtali construct known as the Monolith. He has studied the elemental balance of Runeterra for centuries, using his tremendous strength to maintain order in a frequently chaotic world, and crush the dark things that crawl beneath it. Now, roused all too often from his slumbers, Malphite endures the fluid temperaments of mortals, in pursuit of the only cause worthy of the last of his kind."
        ),
        Hero(
            id = 8,
            name = "Leona",
            image = "/images/leona.jpg",
            about = "Imbued with the fire of the sun, Leona is a holy warrior of the Solari who defends Mount Targon with her Zenith Blade and the Shield of Daybreak. Her skin shimmers with starfire while her eyes burn with the power of the celestial Aspect within her. Armored in gold and bearing a terrible burden of ancient knowledge, Leona brings enlightenment to some, death to others."
        ),
        Hero(
            id = 9,
            name = "Kayle",
            image = "/images/kayle.png",
            about = "Born to a Targonian Aspect at the height of the Rune Wars, Kayle honored her mother’s legacy by fighting for justice on wings of divine flame. She and her twin sister Morgana were the protectors of Demacia for many years—until Kayle became disillusioned with the repeated failings of mortals, and abandoned this realm altogether. Still, legends are told of her punishing the unjust with her fiery swords, and many hope that she will one day return."
        )
    )
    override val page4 = listOf(
        Hero(
            id = 10,
            name = "Garen",
            image = "/images/garen.jpg",
            about = "Aproud and noble soldier, Garen fights at the head of the Dauntless Vanguard. He is popular among his fellows, and respected well enough by his enemies—not least as a scion of the prestigious Crownguard family, entrusted with defending Demacia and its ideals. Clad in magic-resistant armor and bearing a mighty broadsword, Garen stands ready to confront mages and sorcerers on the field of battle, in a veritable whirlwind of righteous steel."
        ),
        Hero(
            id = 11,
            name = "Ezreal",
            image = "/images/ez.jpg",
            about = "Adashing adventurer, unknowingly gifted in the magical arts, Ezreal raids long-lost catacombs, tangles with ancient curses, and overcomes seemingly impossible odds with ease. His courage and bravado knowing no bounds, he prefers to improvise his way out of any situation, relying partially on his wits, but mostly on his mystical Shuriman gauntlet, which he uses to unleash devastating arcane blasts. One thing is for sure—whenever Ezreal is around, trouble isn’t too far behind. Or ahead. Probably everywhere."
        ),
        Hero(
            id = 12,
            name = "Ekko",
            image = "/images/ekko.jpg",
            about = "Aprodigy from the rough streets of Zaun, Ekko manipulates time to twist any situation to his advantage. Using his own invention, the Z-Drive, he explores the branching possibilities of reality to craft the perfect moment. Though he revels in this freedom, when there’s a threat to his friends, he’ll do anything to defend them. To outsiders, Ekko seems to achieve the impossible the first time, every time."
        )
    )
    override val page5 = listOf(
        Hero(
            id = 13,
            name = "Diana",
            image = "/images/diana.png",
            about = "Bearing her crescent moonblade and clad in shimmering armor the color of winter snow at night, Diana is a living embodiment of the silver moon’s power. Imbued with the essence of an Aspect from beyond Targon’s towering summit, Diana is no longer wholly human, and struggles to understand her power and purpose in this world."
        ),
        Hero(
            id = 14,
            name = "Darius",
            image = "/images/darius.jpg",
            about = "There is no greater symbol of Noxian might than Darius, the nation’s most feared and battle-hardened leader. Rising from humble origins to become the Hand of Noxus, he cleaves through the empire’s enemies—many of them Noxians themselves. Knowing that he never doubts his cause is just, and never hesitates once his axe is raised, those who stand against the commander of the Trifarian Legion can expect no mercy."
        ),
        Hero(
            id = 15,
            name = "Blitzcrank",
            image = "/images/blitz.jpg",
            about = "Abehemoth of burnished metal, steam, and crackling electricity, Blitzcrank walks the streets of Zaun in a tireless effort to improve the undercity and give aid to those in need. Created to descend into the most caustic and dangerous of environments in Zaun to dispose of harmful waste, they have evolved beyond the bounds of their original programming, thanks to the genius of their inventor, and the mysterious power of hextech.",
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