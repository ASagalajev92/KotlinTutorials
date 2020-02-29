@file:Suppress("NAME_SHADOWING")

fun main() {
//    val name = "Aleks"  // VAL is same as FINAL in java.
//    var age = 27
//    print(
//        "Hello, world !" +
//                "\nMy name is $name. And I am $age years old.\n" +
//                "In 5 years I will be ${age + 5}\n"
//    )
//    var stringAge = age.toString()
//    print(stringAge)
    val names = arrayOf("John", "James", "Billy", "Bob", "Molly", "Brian")
    names[1] = "Tramp" // Change array element

//    1.Variant
    print("Last element is : ${names.get(names.lastIndex)}\n")
//    2. Variant
    print("Last is : ${names.last()}\n")

    for (i in 1..10) { // # 1 - 10
        if (i == 10) {
            print("$i.\n")
            break
        }
        print("$i, ")
    }
    for (i in 1 until 10) { // # 1 - 9
        if (i == 9) {
            print("$i.\n")
            break
        }
        print("$i, ")
    }

    for (i in 10 downTo 1) print("$i ") // # 10 - 1
    print("\n")
    for (i in 10 downTo 1 step 2) print("$i ") // # 10,8,6,4,2
    print("\n")
    for (i in 10 downTo 1 step 2) print("$i ") // # 10,8,6,4,2
    print("\n")
    for (i in 'a'..'d') print("$i ") // CHARS # a b c d
    print("\n")

    for (index in names.indices) {
        print("Index : $index and Element : ${names[index]}\n")
    }  // # Element : 0 and Index : John etc...
    var i = 0

    while (i < 5) {
        print(i)
        i++
    }
    print("\n")

    var number = 8
    var count = 0
    while (number > 1) {
        number /= 2
        count++
    }
    print("$count\n")

    val time = 13
    val result = when (time) {
        in 0..11 -> {
            "Good morning !"
        }
        12 -> {
            "Time to lunch !"
        }
        else -> {
            "Good day !"
        }
    }
    print("$result\n")

    val time2 = 10000
    val isSunday = false

    val greetings = when {
        isSunday -> "I am sleeping until lunch !"
        time2 < 5 -> "Sleep its just some noise from street..."
        time2 in 0..11 -> "Good morning !"
        time2 == 12 -> "Lunch time !! "
        time2 in 13..14 -> {
            print("YESSS!!!")
            "Time to learn KOTLIN"
        }
        else -> "Good day !"
    }
    println(greetings)

    greeting("Aleks", 3)
    greeting2("Sipsik", repeat = 5)
    homeworkNumbers(10, 10)
    println(double(4))

    println(getSum(2, 2, 2, 3))

    val array = intArrayOf(1, 2, 645, 8, 6786)
    println(
        getSum2(
            2,
            4,
            6,
            7,
            8,
            3,
            234,
            *array,
            234,
            56,
            7
        )
    )           // * - Symbol makes int to intArray . Without * appears ERROR.

    val array2 = intArrayOf(11, 22, 64, 8, 645)
    println(biggestOneInArray(0, 65, 3, *array2))

    val s1: String? =
        null                                               // If You need null result You can add :Type? to variable
    val s2: String? = "Summa"
    val s3: String? = "simvolov v strokah."

    val resultSum: Int = (s1?.length ?: 0) + (s2?.length ?: 0) + (s3?.length
        ?: 0)  // When You check nullable variable SAFE METHOD is, to use VAR.?METHOD
    // if variable contents null = returns "null" string or You can put
    // VAR.?METHOD?:VALUE = if VAR is null returns VALUE
    println(resultSum)

    val currentTime = 10
    val isGoodWeather = false

    val timeResult = when {
        isGoodWeather && currentTime in 8..15 -> "Need to go outside and walk little bit !"
        !isGoodWeather && currentTime in 8..15 -> "Weather is not good ! Better stay at home and read a book !"
        currentTime in 0..7 -> "Its night time ! Sleep little hacker !"
        else -> "This is evening or that time on Earth we don't have !"
    }
    println(timeResult)

    val user1 = User()
    user1.age = 30
    user1.weight = 200
    user1.name  = "Fatty Boy"

    println("My name is ${user1.name} and I am ${user1.age} years old. My weight is ${user1.weight} kg! ")

    val mutable: MutableList<Int> = arrayListOf(1, 202, 3, 4, 7, 6, 8, 345)                       // Clean architecture say that we must use MutableList
    val hundredArray : Array<Int?> = arrayOfNulls<Int?>(301)                                                                                              // for our collections, because with mutable
                                                                                                // we can change collection type without big changes.
    var resultMutable = 0
    for (i2 in mutable) {
        if ((i2 % 2) == 0) {
            resultMutable += i2     // If element in array on % = 0 , then sum all same elements in array.
        }
        continue                    // else continue
    }
    println(resultMutable)

    for ((index,element) in (600 downTo 300).withIndex()) {
        hundredArray[index] = element
        if ((element % 5) == 0) {
            print("${hundredArray[index]} ")
        }
        continue
    }
    println()
    println(crop("Corona Virus"))                       // # Virus

    val arrayTest = arrayOf(1, 4, 6, 10, 3, 4) // Manual initialization of array
    println(arrayTest[2])                               // printing 2 element in array
    arrayTest[2] = arrayTest[2-1]                       // changing array element with index 2 to value of element with index 1
    println(arrayTest[2])                               // printing 3 element with index 2
    println(arrayTest[1])                               // printing 2 element with index 1

    val resultOfArraySort = sortArray(arrayTest)        // Applying the sort method to array
    for (number in resultOfArraySort) {                       // Reading all sorted elements from sorted array
        print("$number ")                                         // Printing each element to line with separation " "                # 1 3 4 4 4 10
    }
    println()

    printInfo("Bobkovich", "Bill","James")
    printInfo(name = "Bulbazavr")

    val volume = volumeRectangle(2,4,4)
    println(volume)




    val arraySorted = readLine()!!.split(" ").map { it.toInt() }.toMutableList()  // Taking input string numbers from console
                                                                                                            // splitting them with " " element
                                                                                                            // Mapping, converting String numbers to Int
    //                                                                                                  Initialization of entered numbers to MutableList()
    val countMap = arraySorted.count()                         // Counting how much elements we have in map collection
    println(countMap)
    val resultOfMutableSort = sort(arraySorted)
    for (number2 in resultOfMutableSort) {                    // Reading all sorted elements from sorted array
        print("$number2 ")                                        // Printing each element to line with separation " "
    }

}


    // FUNCTIONS



fun volumeRectangle(length: Double = 0.0, height: Double = 0.0, width: Double = 0.0):Double = length * height * width // Function to calculate Double type volume
fun volumeRectangle(length: Int, height: Int = length, width: Int = length):Int = length * height * width             // Same overloaded function to calculate Int type volume


fun printInfo(lastName: String = "", name: String = "", patronymic: String = "") {
    if (patronymic.isNotEmpty()) {
        println("Last name : $lastName Name : $name Patronymic : ${patronymic.ifBlank { "ERROR" }}")
                                                                  // .ifBlank checks if string = null or " " return { something }
    }
    else println("Last name : $lastName Name : $name")
}

fun sort(numbers: MutableList<Int>): List<Int> {   // BUBBLE SORT of numbers in MutableList
    for (i in 1 until numbers.size) {
        for (j in numbers.size - 1 downTo i) {
            if (numbers[j] < numbers[j - 1]) {
                val numberJ = numbers[j]
                numbers[j] = numbers[j - 1]
                numbers[j - 1] = numberJ
            }
        }
    }
    return numbers
}

fun sort(numbers: Array<Int>) = sort(numbers.toMutableList())           // Overloading function sort for taking Array elements
fun sort(vararg numbers: Int) = sort(numbers.toMutableList())           // Overloading function sort for taking Int elements

fun sortArray(numbers: Array<Int>): Array<Int> { // BUBBLE SORT of numbers in Array
    for (i in 1 until numbers.size) {
        for (j in numbers.size - 1 downTo i) {
            if (numbers[j] < numbers[j - 1]) {
                val numberJ = numbers[j]
                numbers[j] = numbers[j - 1]
                numbers[j - 1] = numberJ
            }
        }
    }
    return numbers
}


fun crop(s: String) = s.substring(7,12)

fun greeting(name: String, repeat: Int) {
    for (i in 0 until repeat) {
        println("Hello, $name. Nice to meet You!")
    }
}

fun greeting2(name: String, repeat: Int) {
    var count = repeat
    while (count > 0) {
        println("Next one is, $name. Nice to meet You!")
        count--
    }
}

fun homeworkNumbers(firstNumber: Int, secondNumber: Int) {
    val result = when {
        firstNumber > secondNumber -> "The bigger number vas FIRST NUMBER : $firstNumber"
        secondNumber > firstNumber -> "The bigger number vas SECOND NUMBER : $secondNumber"
        else -> "Numbers are equals, I will print second one : $secondNumber"
    }
    println(result)
}

fun double(num: Int): Int = num * 2         // We don't need to call return if its single line expression

fun getMax(b: Int, a: Int) = if (b > a) b else a            // Short way to check
fun getMax(b: Double, a: Double) = if (b > a) b else a            // Short way to check

fun getSum(num1: Int, num2: Int, num3: Int = 0, num4: Int = 0) = num1 + num2 + num3 + num4

fun getSum2(vararg numbers: Int):Int {
    var sum = 0
    for (number in numbers) sum += number
    return sum
}

fun biggestOneInArray(nFirst: Int, vararg nArray: Int): Int {
    var result = nFirst
        for (number in nArray) {
            if (number > result) result = number
        }
        return result
    }







