package compainObject




/*
todos os metodos  que estiver dentro do copaniom eles serao metodos contidos como estaticos.
* tudo que for criado dentro do companiom object não precisa ser instanciado
* ou seja ele não e um atibuto de instancia mas sim um atributo da class
*
*
* um companiom object ele pode se nomeado  EX:  companion object RegrasDelogin quando for instanciar o compain objetct no main voce
* so chama pelo nome que voce deu para ele neste exemplo eu criri uma constante que estara recebendo o companiom objet com onome
*
*  val retorno = Usuario.RegrasDelogin
    println("Usuaio esta logado?: $retorno")
*
*
* */
class Veiculo(
    //propriedades
    var modelo:String= "" ,
    var ano: Int=1998  ,
    var velocidade: Int = 0
){

    companion object {
      private const val velocidadeMaximaPermitidaPorLei: Int =  120

        fun exibirVelocidadeMaxima(){
          println("velocidade Maxima permitida e: ${velocidadeMaximaPermitidaPorLei}")

        }
    }

    fun exibirInformacoes(){
        println("Informacoes modelo:$modelo Ano:$ano Velocidade: $velocidade")
    }
}

class Usuario(){

    companion object {
        fun verificaUsuarioLogado(): Boolean {
            return true
        }
    }
}




fun main() {

    val retorno = Usuario.verificaUsuarioLogado()
    println("Usuaio esta logado?: $retorno")



    Veiculo.exibirVelocidadeMaxima()

val gol = Veiculo("Gol",2015,65) // criando uma instancia do Objeto
    gol.exibirInformacoes()

    println("===========")
    val ferrari = Veiculo("Ferrari",2020,65)
    ferrari.exibirInformacoes()

}