package emcapsulamento

/** Modificadores de acesso
 *por padrão todos os menbros (class,propriradade,construtores,metodos e objeto) são publicos
 *
 * public -> Visivel em qualquer lugar dentroe fora do pacote
 *
 * privite -> Visivel apenas dentro da classe.
 *
 * protected -> Visivel apenas dentro da classe ou subclasses * classes filhas
 *
 * internal -> visivel em todo lugar dentro de um módulo
 *
 *
 *obs: Uma classe quando é privada ela não pode ter reção de herança
 * um metodo em private ele não pode ser sobrescrito
 *
 * Podemos ter um construtor private
 *
 *
 *
 * quando colocamos um metodo em private logo esse metodo ele só e visivel dentro da classe ou seja voce nao
 * consegue instancialo no main, caso o metodo seja dependemte do outro chamasos o metodo privado dentro do metodo publico
 *
 *
 *
 *
 *
 * quando utilizado o proted em um metodo ele tem que esta aberto para herança ** open
*
* */



open class Carro{
    var modelo: String = ""



    protected open fun inJecaoDeComBustiVel(){

        println("injecao de Combustiver")
    }

    fun acelerar() {
        println("Acelerar carro")
        inJecaoDeComBustiVel()

    }

}


class Gol(): Carro(){

    override fun inJecaoDeComBustiVel(){
        super.inJecaoDeComBustiVel()

    }

}


fun main() {

    println("=========")
    val carro = Carro()

    println(carro.modelo)
    carro.modelo ="Ford"
    println(carro.modelo)

    carro.acelerar()

    println("=========")

    val gol = Gol()
    gol.modelo = "G3"
    println(gol.modelo)
    gol.acelerar()


}