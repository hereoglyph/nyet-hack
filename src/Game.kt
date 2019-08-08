fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal

    val auraColor = if (auraVisible) "Aura is green" else "There is no aura"

    println(auraColor)

    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches"
        in 75..99 -> if (isBlessed) {
            "has some minor wounds but healing pretty quickly "
        } else {
            "has some minor wounds"
        }
        in 15..74 -> "looks pretty hurt"
        else -> "is in awful condition!"
    }

    println("$name $healthStatus")

    val race = "gnome"
    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" ->  "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> "none"
    }

    println(faction)
}