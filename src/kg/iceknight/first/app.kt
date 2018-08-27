package kg.iceknight.first

data class Person(val name: String,
                  val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Kobe"), Person("Lebron", age = 33))

    val oldestPerson = persons.maxBy { it.age ?: 0 }
    print("Our oldest bitch is $oldestPerson")
}