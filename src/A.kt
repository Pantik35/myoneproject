fun main(args:Array<String>) {
    val arraySize = 5
    var countPeople = 0
    val nameArray = arrayOfNulls<String>(arraySize)
    val surnameArray = arrayOfNulls<String>(arraySize)
    val ageArray = arrayOfNulls<Int>(arraySize)


    while (countPeople < 5) {
        println("age=")
        val age = readLine().toString()
        val a = age.toInt()
        println("name=")
        val name = readLine()
        println("surname=")
        val surname = readLine()


        if (a >= 18) {
            nameArray[countPeople] = name
            ageArray[countPeople] = a
            surnameArray[countPeople] = surname
            countPeople++


        }
        else {

        }

    }
    println("name=${nameArray[0]} surname=${surnameArray[0]} age=${ageArray[0]}")
    println("name=${nameArray[1]} surname=${surnameArray[1]} age=${ageArray[1]}")
    println("name=${nameArray[2]} surname=${surnameArray[2]} age=${ageArray[2]}")
    println("name=${nameArray[3]} surname=${surnameArray[3]} age=${ageArray[3]}")
    println("name=${nameArray[4]} surname=${surnameArray[4]} age=${ageArray[4]}")

}