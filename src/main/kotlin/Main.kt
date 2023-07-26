import javax.swing.text.StyledEditorKit.BoldAction


fun main(args: Array<String>) {

            var numeros: List<Int> = listOf(1,2,3,4,5)
            println("PARTE 1: "+calculateMean(numeros))


            val numerosImpares = numeros.filter { num -> num % 2 != 0 }
            println("PARTE 2: "+numerosImpares)


            println("PARTE 3: "+isPalindrome("somos"))

            println("PARTE 4: " + performOperation(2,4,"suma"))

            println("PARTE 5: ")

            val persons = listOf<Person>(
                Person("Pepe", 34, "F"),
                Person("Marlon", 45, "M"),
                Person("Karla", 24, "F")
            )

            val students = map2Student(persons)

            for(student in students){
                println("El estudiante ${student.name} tiene ${student.age} años.")
            }

    }


    fun calculateMean(numbers: List<Int>): Int {
        return (numbers.reduce { acc, num -> acc + num })/ numbers.size;
    }

    fun isPalindrome(texto: String): Boolean {
        return (texto.equals(texto.reversed()));
    }

    fun performOperation(num1 : Int, num2 : Int, lamda : String): Int {
    when(lamda){
        "suma" -> return num1 + num2;
        "resta" -> return num1 - num2;
        "multiplicacion" -> return num1 * num2;

    }
        return 0;

    }


    fun map2Student(persons: List<Person>): List<Student>{
        return persons.map { person -> Student(person.name, person.age, person.gender, "455")}
    }








