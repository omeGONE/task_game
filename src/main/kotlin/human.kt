package game

open class Human() {
    var power:Int = 3
    var health:Int = 20
    var dmgin:Int = 0
    open fun attack():Int {
       return power + (2..5).random()
    }

    open fun healing() {
        health += (1..3).random()
    }

    open fun take_dmg() {
        health -= dmgin
    }

}