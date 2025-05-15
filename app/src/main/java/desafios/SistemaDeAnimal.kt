package desafios

 abstract class Animal(var nome:String ="",var tipo:String = ""){


    init {
        println("Animal: $nome ele e do tipo: $tipo")
    }


    open fun exibirInfo()= println("$nome esta Fazendo um som Generico")

}

interface ComportamentoAnimal{

    fun emitirsom()
    fun dormir()
    fun comer()

}
interface RepitilComportamento{
    fun trocardePele()
    fun comer()
}

interface ComportamentoMamifero{
    fun amamentar()

}




class Carnivoros(nome: String, tipo: String,): Animal(nome,tipo), ComportamentoAnimal,
    ComportamentoMamifero{


    override fun amamentar() {
        return println("$nome dando de Amamentar")
    }


    override fun dormir() {
        println("$nome Dormindo dentro de uma caverna")
    }



    override fun emitirsom() {
        println("$nome Rujindo")
    }

    override fun comer() {
        println("Se Alimentando com carne de Animais ")
    }

}



class  Repitil(nome: String,tipo: String): Animal(nome,tipo), ComportamentoAnimal,
    RepitilComportamento{

    override fun trocardePele() {
        println("$nome trocando de pele")
    }


    override fun dormir() {
        println("Dormindo em uma arvore")
    }

    override fun emitirsom() {
        println("'grrrr','clac-clac', 'bloop', 'croac'")
    }

    override fun comer() {
        println("se Alimentando de animais pequenos")
    }
}



class Mamiferos(nome: String,tipo: String): Animal(nome,tipo),ComportamentoMamifero,ComportamentoAnimal{



    override fun amamentar() {
        println("$nome Amametando seu Filhote")
    }

    override fun comer() {
        println("$nome Comendo Racao")
    }

    override fun emitirsom() {
        println("WLF WOLF")
    }

    override fun dormir() {
        println("$nome Dormindo dentro de sua casinha ")
    }

}

fun main() {
    val leao = Carnivoros("Alex", "carnivoro")
    leao.dormir()
    leao.emitirsom()
    leao.amamentar()


    val rango = Repitil("Jubileu","Repitil")
    rango.emitirsom()
    rango.dormir()
    rango.trocardePele()


    val cao = Mamiferos("Rex", "Mamifero")
    cao.comer()
    cao.emitirsom()
    cao.dormir()

}