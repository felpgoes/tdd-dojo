import org.junit.jupiter.api.Test
import org.study.Estacionamento
import org.study.Veiculo
import org.study.VeiculoTipo
import java.time.LocalDateTime
import kotlin.test.assertEquals

// Requisito:
// - O sistema deve ser capaz de receber a entrada de um veículo, especificando o tipo de veículo e o horário de entrada
// Cenarios de Teste
// - Não deve permitir estacionar um veículo de tipo diferente de CARRO, MOTO ou CAMINHÃO
// - Não deve permitir estacionar um veículo de tipo CARRO, MOTO ou CAMINHÃO sem informar o horário de entrada
// - Deve permitir estacionar um veículo do tipo CARRO com o horário de entrada
// - Deve permitir estacionar um veículo do tipo MOTO com o horário de entrada
// - Deve permitir estacionar um veículo do tipo CAMINHÃO com o horário de entrada
// - Deve
class EstacionamentoTest {
    @Test
    fun `deve permitir estacionar um veículo de tipo CARRO com horario de entrada`() {
        val estacionamento = Estacionamento()
        val veiculo = Veiculo(VeiculoTipo.CARRO, LocalDateTime.now())

        val result = estacionamento.estacionar(veiculo)

        assertEquals("Veiculo permitido", result)
    }

    @Test
    fun `deve permitir estacionar um veículo de tipo MOTO com horario de entrada`() {
        val estacionamento = Estacionamento()

        val veiculo = Veiculo(VeiculoTipo.MOTO, LocalDateTime.now())

        val result = estacionamento.estacionar(veiculo)

        assertEquals("Veiculo permitido", result)
    }

    @Test
    fun `deve permitir estacionar um veículo de tipo CAMINHÃO com horario de entrada`() {
        val estacionamento = Estacionamento()

        val veiculo = Veiculo(VeiculoTipo.CAMINHÃO, LocalDateTime.now())

        val result = estacionamento.estacionar(veiculo)

        assertEquals("Veiculo permitido", result)
    }
}
