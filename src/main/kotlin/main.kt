import model.Person
import java.text.DateFormat
import java.text.SimpleDateFormat

fun main(args: Array<String>) {
    val DATE_FORMATER : DateFormat = SimpleDateFormat("dd/MM/yyyy")
    println("Hello World!")

    // 3 - instantiate 4 persons
    val person1 = Person(1, "PHAM", "Thang", 40, DATE_FORMATER.parse("01/10/1981"))
    val person2 = Person(1, "PHAM", "Thang", 40, DATE_FORMATER.parse("01/10/1981"))
    val person3 = Person(3, "TRINH", "Mai", 32, DATE_FORMATER.parse("26/08/1989"))
    val person4 = Person(4, "PHAM", "Alexandre", 8, DATE_FORMATER.parse("14/08/2014"))

    // Create a MultableList
    val persons : List<Person> = mutableListOf(person1, person2, person3, person4)

    for (i in persons.indices) {
        for (j in i+1 until persons.size - 1) {
            if (persons[i] == persons[j]) {
                println("Person $i is identical to Person $j")
            }
        }
    }

}