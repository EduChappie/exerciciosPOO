fun main() {

    var g = Guitarra("Les Paul")
    g.afinar()
    g.quebrarCorda()

    var v = Violino("Yamaha")
    v.afinar()
    v.quebrarCorda()

    var f = Flauta("adven")
    f.afinar()

}

// vó
abstract class Instrumento(var nome: String) {
    abstract fun afinar();
}

// mãe
abstract class InstrumentoDeCordas(nome: String, var numerosCordas: Int) : Instrumento(nome) {
    abstract fun quebrarCorda()
}

// filho
class Guitarra(nome: String) : InstrumentoDeCordas(nome, 6) {
    override fun afinar() {
        println("Afinado em MI(E)")
    }

    override fun quebrarCorda() {
        println("As ${this.numerosCordas} corda quebrou")
    }

}
class Violino(nome: String) : InstrumentoDeCordas(nome, 4) {
    override fun afinar() {
        println("Afinar em DO(C)")
    }

    override fun quebrarCorda() {
        println("As ${this.numerosCordas} corda quebrou")
    }
}

class Flauta(nome: String) : Instrumento(nome) {
    override fun afinar() {
        println("Afinado em RE(D)")
    }
}

