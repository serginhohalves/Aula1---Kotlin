fun main(){
    val sergio = Cliente("Sérgio", "Alves")
    val conta1 = Conta(123,50.03,sergio)
    with(conta1) {
        deposito(30.90)
    }

}




class Cliente (
    val nome: String,
    val sobrenome: String
    )

class Conta(
    val numeroConta: Int,
    var saldo: Double,
    val titular: Cliente
){
    fun deposito(novoDeposito: Double){
    saldo+=novoDeposito
        println("Deposito ${titular.nome} ${titular.sobrenome}, $saldo")
    }
    fun saque(valorSaque: Double){
        if(valorSaque > saldo){
            println("Saldo Insuficiente")
        }else{
            saldo -= valorSaque
            println("Transacao Realizada")
        }
    }
}

