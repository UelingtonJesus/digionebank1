package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.*
import java.math.BigDecimal

fun main() {
    val maria = Gerente(nome = "Maria do Carmo", cpf = "12345678911", 5000.0)

    imprimeRelatorioFuncionario.imprime(maria)


}
