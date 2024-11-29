import java.time.LocalDateTime
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test
import org.study.Estacionamento
import org.study.Veiculo

// Requisito:
// - O sistema deve ser capaz de receber a entrada de um veículo, especificando o tipo de veículo e o horário de entrada
// Cenarios de Teste
// - Não deve permitir estacionar um veículo de tipo diferente de CARRO, MOTO ou CAMINHÃO
// - Não deve permitir estacionar um veículo de tipo CARRO, MOTO ou CAMINHÃO sem informar o horário de entrada
// - Deve permitir estacionar um veículo do tipo CARRO com o horário de entrada
// - Deve permitir estacionar um veículo do tipo MOTO com o horário de entrada
// - Deve permitir estacionar um veículo do tipo CAMINHÃO com o horário de entrada


class EstacionamentoTest {

    val estacionamento = Estacionamento()

    @Test
    fun `nao deve permitir estacionar um veículo de tipo diferente de carro moto ou caminhao`() {
        val veiculo = Veiculo("BICICLETA", LocalDateTime.now())

        val result = estacionamento.estacionar(veiculo)

        assertEquals("Veículo não permitido", result)
    }

    @Test
    fun `deve permitir estacionar um veículo de tipo carro com horario de entrada`() {
        val veiculo = Veiculo("CARRO", LocalDateTime.now())

        val result = estacionamento.estacionar(veiculo)

        assertEquals("Veiculo permitido", result)
    }

    //    @Test
    //    fun `deve permitir estacionar um veículo de tipo moto com horario de entrada`() {}
    //
    //    @Test
    //    fun `deve permitir estacionar um veículo de tipo caminhao com horario de entrada`() {}
}