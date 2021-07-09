package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.imprimeRelatorioFuncionario
import java.math.BigDecimal

fun main() {
    val joao = Analista(nome = "Uelington", cpf = "12345678911", 2000.0)

    imprimeRelatorioFuncionario.imprime(joao)


}
