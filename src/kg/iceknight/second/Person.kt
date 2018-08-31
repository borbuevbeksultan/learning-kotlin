package kg.iceknight.second

class Person(val name: String)


class Superhero(val name: String, var isGood: Boolean){

    val isSuperhero: Boolean
    get() {
        return isGood
    }

}
