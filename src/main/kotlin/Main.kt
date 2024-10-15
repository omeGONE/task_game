package game

fun main() {
    var k:Int = 0
    var w:Int = 0
    var r:Int = 0
    var maxi:Int = 0
    for (n in 1..100) {
        if (knight_vs_wizard() == "w") {
            w += 1
        }
        if (knight_vs_wizard() == "k") {
            k += 1
        }
    }
    for (n in 1..100) {
        if (knight_vs_robot() == "r") {
            r += 1
        }
        if (knight_vs_robot() == "k") {
            k += 1
        }
    }
    for (n in 1..100) {
        if (robot_vs_wizard() == "r") {
            r += 1
        }
        if (robot_vs_wizard() == "w") {
            w += 1
        }
    }
    if ((r >= w) and (r >= k)) {
        println("Robot: $r")
        if (w >= k) {
            println("Wizard: $w")
            println("Knight: $k")
        } else {
            println("Knight: $k")
            println("Wizard: $w")
        }
    } else if ((w >= r) and (w >= k)){
        println("Wizard: $w")
        if (r >= k) {
            println("Robot: $r")
            println("Knight: $k")
        } else {
            println("Knight: $k")
            println("Robot: $r")
        }
    } else if ((k >= r) and (k >= w)){
        println("Knight: $k")
        if (w >= r) {
            println("Wizard: $w")
            println("Robot: $r")
        } else {
            println("Robot: $r")
            println("Wizard: $w")
        }
    }
}

fun knight_vs_wizard():String {
    val wiz: Wizard = Wizard()
    val kni: Knight = Knight()
    while ((wiz.health > 0) and (kni.health > 0)) {
        wiz.dmgin = kni.attack()
        kni.dmgin = wiz.attack()
        wiz.healing()
        kni.healing()
        wiz.take_dmg()
        kni.take_dmg()
    }
    if (wiz.health > 0) {
        return "w"
    } else {
        return "k"
    }
}

fun knight_vs_robot():String {

    val rob: Robot = Robot()
    val kni: Knight = Knight()
    while ((rob.health > 0) and (kni.health > 0)) {
        rob.dmgin = kni.attack()
        kni.dmgin = rob.attack()
        rob.healing()
        kni.healing()
        rob.take_dmg()
        kni.take_dmg()
    }
    if (rob.health > 0) {
        return "r"
    } else {
        return "k"
    }
}

fun robot_vs_wizard():String {
    val wiz: Wizard = Wizard()
    val rob: Robot = Robot()
    while ((wiz.health > 0) and (rob.health > 0)) {
        wiz.dmgin = rob.attack()
        rob.dmgin = wiz.attack()
        wiz.healing()
        rob.healing()
        wiz.take_dmg()
        rob.take_dmg()
    }
    if (wiz.health > 0) {
        return "w"
    } else {
        return "r"
    }
}