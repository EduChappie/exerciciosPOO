package files

import User

fun main() {
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6);
    val numbers2 = listOf<Int>(1, 2, 5, 10, 12, 16);

    val result = numbers.union(numbers2);

    /*
    result.forEachIndexed { i, it ->
        println("$i: $it");
    }

    println("tamanho: " + numbers2.size);
    for (number in numbers2) {
        println(number);
    }*/

    /*for (index in numbers.size downTo  0) {
        println(index);
    }*/

    /*
    * Itens Imutáveus        Mutável
    *  - listOf()      --> mutableListOf()
    *  - setOf()       --> mutableSetOf()
    *  - mapOf()       --> mutableMapOf()
    * */

    val product = mapOf(
        "Android" to numbers,
        "IOS" to "Apple",
        "Windows" to "Microsft"
    )

    //val res = product["Android"];
    //val res = product.getOrDefault("Android2", "Não existe essa empresa.")
    /*val res = product.getOrElse("Android2", {
        println("Não existe!!");
    })*/

    val u = User.createUsers(10);

    u.forEach{
        println("${it.nome} ${it.lastName} - ${it.isAdmin}");
    }

}