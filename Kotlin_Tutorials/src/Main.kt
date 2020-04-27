import javax.print.attribute.standard.PrinterLocation

fun main() {
//    println("Hello, World!")
//    println("My first Kotlin program :)")
//    print("***\n")
//
    /**   V a r i a b l e s   a n d   t y p e s   **/
//
//    var name = "Serkan Ok"
//    println(name)
//    name = "Ersin Ok"
//    println(name)
//    print("***\n")
//
//    val age = 36
//    println("${age/2} is half of my age.")
//
//    val weeklySalary = 1000
//    val monthlySalary  = weeklySalary * 4
//    println("A man earns $weeklySalary$ a week, earns $monthlySalary$ a month.")
//
//    val apples = 6
//    val oranges = 5
//    val fruit: Int = apples + oranges
//    println("Total number of apples and oranges is $fruit.")
//    println("A quarter of the apples is ${apples/4}.")
//    print("***\n")
//
//    val weeks  = 130
//    val years: Double = weeks / 52.0
//    println("$weeks weeks is $years years.")
//
//    println("My name is $name.")
//    name = "Serkan Ok"
//    println("Oops! My name is $name.")

    /**   C o n d i t i o n s   **/

//    val lives = 0
//    var isGameOver = (lives < 1)
//    println(isGameOver)
//    if (isGameOver) {
//        println("Game Over!")
//    } else {
//        println("You're still alive!")
//    }
//    println()
//    println("How old are you?")
//    val myAge = readLine()!!.toInt()
//    println("You are $myAge years old.")
//
//    val message: String
//    message = when {
//        myAge < 18 -> {
//            "You're too young to vote."
//        }
//        myAge == 100 -> {
//            "Congratulations."
//        }
//        else -> {
//            "You can vote."
//        }
//    }
//    if (myAge < 18) {
//        message = "You're too young to vote."
//    } else if (myAge == 100) {
//        message = "Congratulations."
//    } else {
//        message = "You can vote."
//    }
//    println(message)

    /**   C l a s s e s   **/

//    val serkan = Player("Serkan")
////    println(serkan.name)
////    println(serkan.lives)
////    println(serkan.level)
////    println(serkan.score)
////    println(serkan)
//    serkan.show()
//
//    val sevda = Player("Sevda", 5)
//    sevda.level = 5
//    sevda.show()
//
//    val player1 = Player("Player-1", 4, 8)
//    val player2 = Player("Player-2", 2, 5, 1000)
//    player1.show()
//    player2.show()
//    println(player1.weapon.name.toUpperCase())
//    println(player1.weapon.damageInflicted)
//
//    val axe = Weapon("Axe", 12)
//    player1.weapon = axe
//    println(player1.weapon.name.toUpperCase())
//    println(axe.name.toUpperCase())
//
//    axe.damageInflicted = 24
//    println(axe.damageInflicted)
//    println(player1.weapon.damageInflicted)
//
//    player2.weapon = Weapon("Sword", 10)
//    println(player2.weapon.name.toUpperCase())
//
//    player2.weapon = Weapon("Spear", 14)
//    println(player2.weapon.name.toUpperCase())

    // **********

//    val tim = Player("Tim", 1, 3, 0)
//    tim.weapon = Weapon("Sword", 10)
//    tim.show()
//
//    val louise = Player("Louise", 5)
//    louise.weapon = tim.weapon
//    louise.show()
//
//    tim.weapon = Weapon("Spear", 14)
//    tim.show()
//    println()
//
//    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
////    tim.inventory.add(redPotion)
//    tim.getLoot(redPotion)
//
//    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.00)
////    tim.inventory.add(chestArmor)
//    tim.getLoot(chestArmor)
//
//    tim.showInventory()
//    tim.inventory.add(Loot("Ring of Protection +2", LootType.RING, 40.25))
//    tim.inventory.add(Loot("Invisibility Potion", LootType.POTION, 35.95))
//    tim.getLoot(Loot("Ring of Protection", LootType.RING, 40.25))
//    tim.getLoot(Loot("Invisibility Potion", LootType.POTION, 35.95))
//    tim.showInventory()
//
//    if (tim.dropLoot(redPotion)) {
//        tim.showInventory()
//    } else {
//        println("You don't have a ${redPotion.name}")
//    }
//
//    val bluePotion = Loot("Blue Potion", LootType.POTION, 6.00)
//    if (tim.dropLoot(bluePotion)) {
//        tim.showInventory()
//    } else {
//        println("You don't have a ${bluePotion.name}")
//    }
//
//    if (tim.dropLoot("Invisibility Potion")) {
//        tim.showInventory()
//    } else {
//        println("You don't have an Invisibility Potion")
//    }

//    println()
//    println(tim.toString())

    /**   L o o p s   **/

//    for (i in 1..10) {
//        //print(i)
//        //println(i)
//        println("$i squared is ${i * i}")
//    }
//
//    for (i in 0 until 10) {
//        println("$i to the power of 3 is ${i * i * i}")
//    }
//
//    for (i in 10 downTo 0) {
//        print(" $i ")
//    }
//
//    for (i in 10 downTo 0 step 2) {
//        print(" $i ")
//    }
//
//    for (i in 1..100) {
//        print(" sevda ")
//    }
//
//    for (i in 0..100) {
//        if (i % 3 == 0 && i % 5 == 0) {
//            println(i)
//        }
//    }
//
//    for (i in 5..100 step 5) {
//        if (i % 3  == 0) {
//            println(i)
//        }
//    }

    /**   I n h e r i t a n c e   **/

//    val enemy = Enemy("test enemy",10,3)
//    println(enemy)
//
//    enemy.takeDamage(4)
//    println(enemy)
//
//    enemy.takeDamage(11)
//    println(enemy)
//
//    val uglyTroll = Troll("Ugly Troll")
//    println(uglyTroll)
//
//    uglyTroll.takeDamage(30)
//    println(uglyTroll)
//
//    val vlad = Vampyre("Vlad")
//    println(vlad)
//    vlad.takeDamage(8)
//    println(vlad)
//
//    for (i in 1 .. 10) {
//    val dracula = VampyreKing("Dracula")
//    println(dracula)

//    while (dracula.lives > 0) {
//        if (dracula.dodges()) {
//            continue
//        }
//        if (dracula.runAway()) {
//            println("Dracula ran away")
//            break
//        } else {
//            dracula.takeDamage(80)
//        }
//    }
//    println("---------------")
//    }
//    dracula.lives = 0
//    do {
//        if (dracula.dodges()) {
//            dracula.lives += 1
//            continue
//        }
//        if (dracula.runAway()) {
//            println("Dracula ran away")
//            break
//        } else {
//            dracula.takeDamage(80)
//        }
//    } while (dracula.lives > 0)
//    println("---------------")

    val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR, 183.0))
    conan.getLoot(Loot("Ring of speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Red Potion", LootType.POTION, 2.0))
//    conan.getLoot(Loot("Cursed Shield", LootType.ARMOR, -8.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING, 1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 3.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.showInventory()

    conan.dropLoot("Gold Ring")
    conan.showInventory()

    conan.dropLoot("Silver Ring")
    conan.showInventory()

    val dropped = conan.dropLoot("Sth not present")
    println(dropped)

    println(conan.dropLoot("Sth else"))

    if (conan.dropLoot("A bit of junk")) {
        println("Junk dropped")
    } else {
        println("You don't have any junk")
    }
}