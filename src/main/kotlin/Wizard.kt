package game

class Wizard: Human(){
    var mana:Int = 4
    var a:Int = 0
    override fun attack(): Int {
        if (((0..1).random()) == 1) {
            a = power + (2..5).random() + mana
            mana -= 1
        } else {
            a = power + (2..5).random()
        }
        return power + (2..5).random() + mana / 2
    }
}