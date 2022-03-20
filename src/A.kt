fun main(args: Array<String>) {
    print("Имя посетителя:")
    val name = readLine()
    print("Фамилия посетителя:")
    val seName = readLine()
    print("Возраст посетителя:")
    val age = readLine().toString()
    val a = age.toInt()
    if(a >= 18)
        println("Поситителя $name $seName пропустить в торговый центр")
    else
        if (a< 14)
            println("Вызвать полицию для поситителя $name $seName")
        else
            if (a >= 14)
                println("Поситителя $name $seName не пропускать в тороговый центр")
}