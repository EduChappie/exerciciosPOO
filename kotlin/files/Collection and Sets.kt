package files
import User

fun main() {

    val list = listOf<User>(
        User("Eduardo", "Fabrício", true),
        User("Madruguinha", "ceza", false),
        User("Eduardo", "Costa", false),
        User("admin", "admin", true)
    )

    /*
    // filter
    val newList = list.filter(::filtro);
    //forEach
    newList.forEach{
        println("Nome: ${it.nome} - isAdmin: ${it.isAdmin}");
    }

    println("=+++++++++++++++++++++++++=")
    val n = calc(5, 7, ::mult);
    println("resultado: $n");*/

    // map
    val newList = list.map { list ->
        list.nome.lowercase();
    }.filter { it.contains("e") }

    newList.forEach{
        println(it);
    }

}

fun soma(x: Int, y: Int): Int {
    return x+y;
}
fun mult(x: Int, y: Int): Int {
    return x*y;
}

fun filtro(user: User): Boolean {
    return user.isAdmin;
}

fun calc(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    val res = operation(a,b);
    return res;
}