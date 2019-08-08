fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false
    val race = "gnome"

    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)
    val faction = faction(race)

    printPlayerStatus(auraColor, name, healthStatus, faction)
}

private fun printPlayerStatus(
    auraColor: String,
    name: String,
    healthStatus: String,
    faction: String
) {
    println(auraColor)
    println("$name $healthStatus")
    println(faction)
}

private fun faction(race: String): String {
    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> "none"
    }
    return faction
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {

    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    return if (auraVisible) "Aura is green" else "There is no aura"
}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String {
    return when (healthPoints) {
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
}