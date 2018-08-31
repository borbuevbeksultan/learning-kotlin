package kg.iceknight.first

data class Person(val name: String,
                  val age: Int? = null)

fun main(args: Array<String>) {


    val persons = listOf(Person("Kobe"), Person("Lebron", age = 33))

    var javaClass : JavaClass
    javaClass = JavaClass("gdg", "dsadsa")

//    javaClass.printDescriptor()

    val kotlinClass = KotlinClass("KotlinClass", 231)
    println(kotlinClass)

    var dsadsa = JavaClassVerTwo(2)
    dsadsa.print()

    println(JavaClass.isClassJava)

    val oldestPerson = persons.maxBy { it.age ?: 0 }
    print("Our oldest baller is $oldestPerson")
}