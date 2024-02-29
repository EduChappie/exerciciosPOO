fun main() {

    val btn = Btn("Clique-me", 0xF0000, Pair(50, 50));
    val link = Link("info", Pair(20, 10));


    link.render();
    btn.render();

}

abstract class Component {
    abstract fun position(): Pair<Int, Int>

    open fun render() {
        println("Desenhando na tela! x:${position().first} - y:${position().second}")
    }
}

abstract class Text(val text: String): Component() {
    override fun render() {
        super.render();
        println("|'${text}'|");
    }
}

class Btn(text: String, val background: Int, val pos: Pair<Int, Int>) : Text(text) {
    override fun position(): Pair<Int, Int> {
        return pos;
    }

    override fun render() {
        super.render()
        println("|'$text'| -> $background")
    }
}

class Link(text: String, val pos: Pair<Int, Int>) : Text(text) {
    override fun position(): Pair<Int, Int> {
        return pos;
    }

}