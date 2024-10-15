package game

class Knight: Human(){
    var defence:Int = 1
    override fun take_dmg() {
        if (((0..1).random()) == 1) {
            health -= dmgin - defence
        } else {
            health -= dmgin
        }
    }
}