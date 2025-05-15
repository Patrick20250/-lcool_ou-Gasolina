package Interface


/*
uma  Interface ela ja é abstrata por padrão

os Metodos em uma interface ele também sao abstrarto


para utiliar uma interface em uma clase precisa colocar uma virgula e chamar o nome da interface EX: class DesenvolvedorAndroid:Pessoa(), Presidenciavel
e podemos utilizar o : para indicar herança e para indicar a interface EX: class Jornalista: Presidenciavel
*/

interface  Presidenciavel{
    fun candidatarce()
}



abstract class Pessoa{

    fun comer() = println("Comendo")


}


class DesenvolvedorWeb:Pessoa(){
    fun programaandoEmJavaScript() = println("Desenvolvendo Web")
}
class DesenvolvedorAndroid:Pessoa(), Presidenciavel{
    fun programandoEmrKotlin() = println("Desenvolvendo App")
    override fun candidatarce() {
        println("Candidatar-se para Presidente ")
    }

}
class Jornalista:Pessoa(), Presidenciavel{
    fun escrevendoNoticia(){
        println("Escrever noticia")
    }

    override fun candidatarce() {
        println("Candidatr-se para presidente")
    }
}
class FuncionarioPublico:Pessoa(){

}


fun main(){

    val devWeb = DesenvolvedorWeb ()
    devWeb.comer()
    devWeb.programaandoEmJavaScript()
    println("=======")
    val devMobile = DesenvolvedorAndroid ()
    devMobile.comer()
    devMobile.programandoEmrKotlin()
    devMobile.candidatarce()
    println("=======")
    val jornal = Jornalista()
    jornal.comer()
    jornal.escrevendoNoticia()

    println("=======")

    val merendeira = FuncionarioPublico()
    merendeira.comer()
    println("=======")







}


