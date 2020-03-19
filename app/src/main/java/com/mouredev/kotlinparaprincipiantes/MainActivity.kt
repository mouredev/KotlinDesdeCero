package com.mouredev.kotlinparaprincipiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lección 1
        //variablesYConstantes()

        // Lección 2
        //tiposDeDatos()

        // Lección 3
        //sentenciaIf()

        // Lección 4
        //sentenciaWhen()

        // Lección 5
        //arrays()

        // Lección 6
        //maps()

        // Lección 7
        //loops()

        // Lección 8
        //nullSafety()

        // Lección 9
        //funciones()

        // Lección 10
        classes()
    }

    /*
    Aquí vamos a hablar de variables y constantes
     */
    private fun variablesYConstantes() {

        // Variables

        var myFirstVariable = "Hello Hackermen!"
        var myFirstNumber = 1

        println(myFirstVariable)

        myFirstVariable = "Bienvenidos a MoureDev"

        println(myFirstVariable)

        // No podemos asignar un tipo Int a una variable de tipo String
        //myFirstVariable = 1

        var mySecondVariable = "Suscríbete!"

        println(mySecondVariable)

        mySecondVariable = myFirstVariable

        println(mySecondVariable)

        myFirstVariable = "¿Ya te has suscrito?"

        println(myFirstVariable)

        // Constantes

        val myFirstConstant = "¿Te ha gustado el tutorial?"

        println(myFirstConstant)

        // Una constante no puede modificar su valor
        //myFirstConstant = "Si te ha gustado, dale a LIKE"

        val mySecondConstant = myFirstVariable

        println(mySecondConstant)
    }

    /*
    Aquí vamos hablar de tipos de datos (data types)
     */
    private fun tiposDeDatos() {

        // String

        val myString: String = "Hola Hackermen!"
        val myString2 = "Bienvenidos a MoureDev"
        val myString3 = myString + " " + myString2
        println(myString3)

        // Enteros (Byte, Short, Int, Long)

        val myInt: Int = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        // Decimales (Float, Double)

        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1 // En realidad este es Int
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        // Boolean (Bool)
        val myBool: Boolean = true
        val myBool2 = false
        //val myBool3 = myBool + myBool2
        println(myBool == myBool2)
        println(myBool && myBool2)

    }

    /*
    Aquí vamos a hablar de la sentencia if
     */
    private fun sentenciaIf() {

        val myNumber = 71

        // Operadores condicionales
        // > mayor que
        // < menor que
        // >= (> =) mayor o igual que
        // <= (< =) menor o igual que
        // == (= =) igualdad
        // != (! =) desigualdad

        // Operadores lógicos
        // && operador "y"
        // || operador "o"
        // ! operador "no"

        if (!(myNumber <= 10 && myNumber > 5) || myNumber == 53) {
            // Sentencia if
            println("$myNumber es menor o igual que 10 y mayor que 5 o es igual a 53")

        } else if(myNumber == 60) {

            // Sentencia else if
            println("$myNumber es igual a 60")

        } else if(myNumber != 70) {

            // Sentencia else if
            println("$myNumber no es igual a 70")

        } else {
            // Sentencia else
            println("$myNumber es mayor que 10 o menor o igual que 5 y no es igual a 53")
        }

    }

    /*
    Aquí vamos a hablar de la sentencia when
     */
    fun sentenciaWhen() {

        // When con String
        val country = "Italia"

        when (country) {
            "España", "Mexico", "Perú", "Colombia", "Argentina" -> {
                println("El idioma es Español")
            } "EEUU" -> {
                println("El idioma es Inglés")
            } "Francia" -> {
                println("El idioma es Francés")
            } else -> {
                println("No conocemos el idioma")
            }
        }

        // When con Int
        val age = 100

        when (age) {
            0, 1, 2 -> {
                println("Eres un bebé")
            } in 3..10 -> {
                println("Eres un niño")
            } in 11..17 -> {
                println("Eres un adolescente")
            } in 18..69 -> {
                println("Eres adulto")
            } in 70..99 -> {
                println("Eres anciano")
            } else -> {
                println("😱")
            }
        }

    }

    /*
    Aquí vamos a hablar de arrays o arreglos
     */
    fun arrays() {

        val name = "Brais"
        val surname = "Moure"
        val company = "MoureDev"
        val age = "32"

        // Creación de un Array

        val myArray = arrayListOf<String>()

        // Añadir datos de uno en uno

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        //myArray.add(age)
        //myArray.add(age)

        println(myArray)

        // Añadir un conjunto de datos

        myArray.addAll(listOf("Hola", "Bienvenidos al tutorial"))

        println(myArray)

        // Acceso a datos

        val myCompany = myArray[2]

        println(myCompany)

        // Modificación de datos

        myArray[5] = "Suscríbete y activa la campana"

        println(myArray)

        // Eliminar datos

        myArray.removeAt(4)

        println(myArray)

        // Recorrer datos

        myArray.forEach {
            println(it)
        }

        // Otras operaciones

        println(myArray.count())

        myArray.clear()

        println(myArray.count())

        // myArray.first()
        // myArray.last()
        // myArray.sort()
    }

    /*
    Aquí vamos a hablar de mapas, también llamados diccionarios
     */
    fun maps() {

        // Sintaxis
        var myMap: Map<String,Int> = mapOf()
        println(myMap)

        // Añadir elementos
        myMap = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)
        println(myMap)

        // Añadir un solo valor
        myMap["Ana"] = 7
        myMap.put("María",8)
        println(myMap)

        // Actualización de un dato
        myMap.put("Brais",3)
        myMap["Brais"] = 4
        println(myMap)

        myMap.put("Marcos",3)
        println(myMap)

        // Acceso a un dato
        println(myMap["Brais"])

        // Eliminar un dato
        myMap.remove("Brais")
        println(myMap)
    }

    /*
    Aquí vamos a hablar de loops, también llamados bucles
    */
    private fun loops() {

        // Bucles

        val myArray = listOf("Hola", "Bienvenidos al tutorial", "Suscríbete!")
        val myMap = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)

        // For

        for (myString in myArray) {
            println(myString)
        }

        for (myElement in myMap) {
            println("${myElement.key}-${myElement.value}")
        }

        for (x in 0..10) {
            println(x)
        }

        for (x in 9 until 30) {
            println(x)
        }

        for (x in 0..10 step 2) {
            println(x)
        }

        for (x in 10 downTo 0 step 3) {
            println(x)
        }

        val myNumericArray = (0..20)
        for (myNum in myNumericArray) {
            println(myNum)
        }

        // While

        var x = 0

        while (x < 10) {
            println(x)
            x += 2
        }

    }

    /*
    Aquí vamos a hablar de seguridad contra nulos (Null Safety)
     */
    fun nullSafety() {

        var myString = "MoureDev"
        // myString = null Esto daría un error de compilación
        println(myString)

        // Variable null safety
        var mySafetyString: String? = "MoureDev null safety"
        mySafetyString = null
        println(mySafetyString)

        //mySafetyString = "Suscríbete!"
        //println(mySafetyString)

        /*if (mySafetyString != null) {
            println(mySafetyString!!)
        } else {
            println(mySafetyString)
        }*/

        // Safe call

        println(mySafetyString?.length)

        mySafetyString?.let {
            println(it)
        } ?: run {
            println(mySafetyString)
        }

    }

    /*
    Aquí vamos a hablar de funciones
    */
    fun funciones() {

        sayHello()
        sayHello()
        sayHello()

        sayMyName("Brais")
        sayMyName("Pedro")
        sayMyName("Sara")

        sayMyNameAndAge("Brais", 32)

        val sumResult = sumTwoNumbers(10, 5)
        println(sumResult)

        println(sumTwoNumbers(15, 9))

        println(sumTwoNumbers(10, sumTwoNumbers(5, 5)))
    }

    // Función simple
    fun sayHello() {
        println("Hola!")
    }

    // Funciones con un parámetro de entrada
    fun sayMyName(name: String) {
        println("Hola, mi nombre es $name")
    }

    // Funciones con más de un parámetro de entrada
    fun sayMyNameAndAge(name: String, age: Int) {
        println("Hola, mi nombre es $name y mi edad es $age")
    }

    // Funciones con un valor de retorno
    fun sumTwoNumbers(firstNumber: Int, secondNumber: Int) : Int {
        val sum = firstNumber + secondNumber
        return sum
    }

    /*
    Aquí vamos a hablar de las clases
    */
    fun classes() {

        val brais = Programmer("Brais", 32, arrayOf(Programmer.Language.KOTLIN, Programmer.Language.SWIFT))
        println(brais.name)

        brais.age = 40
        brais.code()

        val sara = Programmer("Sara", 35, arrayOf(Programmer.Language.JAVA), arrayOf(brais))
        sara.code()

        println("${sara.friends?.first()?.name} es amigo de ${sara.name}")
    }

}
