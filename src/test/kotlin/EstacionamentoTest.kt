import org.junit.jupiter.api.Test
import org.study.Veiculo
import java.time.LocalDateTime

// Requisito:
// - O sistema deve ser capaz de receber a entrada de um veículo, especificando o tipo de veículo e o horário de entrada
// Cenarios de Teste
// - Não deve permitir estacionar um veículo de tipo diferente de CARRO, MOTO ou CAMINHÃO
// - Não deve permitir estacionar um veículo de tipo CARRO, MOTO ou CAMINHÃO sem informar o horário de entrada
// - Deve permitir estacionar um veículo do tipo CARRO com o horário de entrada
// - Deve permitir estacionar um veículo do tipo MOTO com o horário de entrada
// - Deve permitir estacionar um veículo do tipo CAMINHÃO com o horário de entrada


class EstacionamentoTest {

    //    val estacionamento = Estacionamento()

    @Test
    fun `nao deve permitir estacionar um veículo de tipo diferente de carro moto ou caminhao`() {
        val veiculo = Veiculo("BICICLETA", LocalDateTime.now())

        val result = estacionamento.estacionar(veiculo)

        assertThat(result).isEqualTo("Veículo não permitido")
    }

    //    @Test
    //    fun `nao deve permitir estacionar um veículo de tipo carro moto ou caminhao sem informar o horario de entrada`() {}
    //
    //    @Test
    //    fun `deve permitir estacionar um veículo de tipo carro com horario de entrada`() {}
    //
    //    @Test
    //    fun `deve permitir estacionar um veículo de tipo moto com horario de entrada`() {}
    //
    //    @Test
    //    fun `deve permitir estacionar um veículo de tipo caminhao com horario de entrada`() {}



    //    @Test
    //    fun `deve permitir estacionar um veículo recebendo o tipo e o horário de entrada`() {
    //        val veiculo = Veiculo("CARRO", LocalDateTime.now())
    //
    //        val result = estacionamento.estacionar(veiculo)
    //
    //        assertThat(result).isEqualTo("Veículo estacionado com sucesso")
    //    }

}