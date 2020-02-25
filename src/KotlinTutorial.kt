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

    greeting("Aleks",3)
    greeting2("Sipsik", repeat = 5)
    
}

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




