package files

fun main() {

    var eu = Cliente("Eduardo");
    eu.menus = buscarRestaurantes();
    // ação de pegar o menu do restaurante escolhido
    eu.pegarMenu();
}
// Ação de escolher um restaurante e pegar ele
fun buscarRestaurantes(): Menu {
    return PicanhaMania();
}


class Cliente(val nome: String) {

    lateinit var menus: Menu;

    fun pegarMenu() {

        var loja = menus.nomeLoja;
        println("A loja escolhida é: $loja");
        var r = menus.comboDoDia()
        println("Combo $r");
    }
}


// A ideia geral do Menu que o cliente tem acesso
interface Menu { // como se fosse abstrata tenho que definir valores a serem
                 //  informados pela loja

    var nomeLoja: String;

    fun comboDoDia(): String;
}


// As lojas existentes no banco de dados que vão responder a essa ação
class BurguerKing() : Menu {

    override var nomeLoja = "Burguer King";

    override fun comboDoDia(): String {
        return "X-salsichão R$ 12,00";
    }
}
class McDonalds(): Menu {

    override var nomeLoja = "McDonalds";

    override fun comboDoDia(): String {
        return "McLanche Feliz R$ 220,00";
    }
}
class PicanhaMania(): Menu {

    override var nomeLoja = "Picanha Mania";

    override fun comboDoDia(): String {
        return "Carne de Picanha R$ 509,00";
    }
}


/*
fun buscarInstrumento(): Playable {
    return Guitarra();
}

fun main() {
    val ms1 = Musico("Eduardo")
    ms1.playable = buscarInstrumento();
    ms1.startplay()
}

class Musico(nome: String) {

    lateinit var playable: Playable

    fun startplay() {
        playable.play();
    }
}

interface Playable {
    fun play()
}

class Guitarra: Playable {

    override fun play() {
        println("tocando guitarra");
    }
}
class Bateria: Playable {

    override fun play() {
        println("tocando bateria");
    }
}
class Violino: Playable {

    override fun play() {
        println("tocando violiono");
    }
}*/