package game

class Robot: Human() {
    var batarey: Int = 6
    var a: Int = 0
    override fun healing() {
        if ((((0..1).random()) == 1) and (batarey != 0)) {
            health += (1..3).random() + 1
            batarey -= 1
        } else {
            health += (1..3).random()
        }
    }
}