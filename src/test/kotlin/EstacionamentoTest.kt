import org.junit.jupiter.api.Test
import org.study.Estacionamento
import org.study.Veiculo
import org.study.VeiculoTipo
import java.time.LocalDateTime
import kotlin.test.assertEquals

// Requisito: O sistema deve ser capaz de receber a entrada de um veículo, especificando o tipo de veículo e o horário de entrada
// - Não deve permitir estacionar um veículo de tipo diferente de CARRO, MOTO ou CAMINHÃO
// - Não deve permitir estacionar um veículo de tipo CARRO, MOTO ou CAMINHÃO sem informar o horário de entrada
// - Deve permitir estacionar um veículo do tipo CARRO com o horário de entrada
// - Deve permitir estacionar um veículo do tipo MOTO com o horário de entrada
// - Deve permitir estacionar um veículo do tipo CAMINHÃO com o horário de entrada

// Requisito: O sistema deve verificar a disponibilidade de vagas antes de permitir a entrada de um novo veículo.
// - Não deve permitir estacionar um veículo do tipo CARRO se não houver vagas disponíveis
// - Não deve permitir estacionar um veículo do tipo MOTO se não houver vagas disponíveis
// - Não deve permitir estacionar um veículo do tipo CAMINHÃO se não houver vagas disponíveis
// - Deve permitir estacionar um veículo do tipo CARRO se houver vagas disponíveis
// - Deve permitir estacionar um veículo do tipo MOTO se houver vagas disponíveis
// - Deve permitir estacionar um veículo do tipo CAMINHÃO se houver vagas disponíveis
// - Não deve permitir estacionar um carro se o número ultrapassar o limite de vagas
// - Não deve permitir estacionar um caminhao se o número ultrapassar o limite de vagas
// - Não deve permitir estacionar um moto se o número ultrapassar o limite de vagas

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

    @Test
    fun `não deve permitir estacionar um veículo do tipo CARRO se não houver vagas disponíveis`() {
        val estacionamento = Estacionamento(vagasDisponiveisCarro = 0)

        val veiculo = Veiculo(VeiculoTipo.CARRO, LocalDateTime.now())

        val result = estacionamento.estacionar(veiculo)

        assertEquals("Não há vagas", result)
    }

    @Test
    fun `não deve permitir estacionar um veículo do tipo MOTO se não houver vagas disponíveis`() {
        val estacionamento = Estacionamento(vagasDisponiveisMoto = 0)

        val veiculo = Veiculo(VeiculoTipo.MOTO, LocalDateTime.now())

        val result = estacionamento.estacionar(veiculo)

        assertEquals("Não há vagas", result)
    }

    @Test
    fun `não deve permitir estacionar um veículo do tipo CAMINHÃO se não houver vagas disponíveis`() {
        val estacionamento = Estacionamento(vagasDisponiveisCaminhão = 0)

        val veiculo = Veiculo(VeiculoTipo.CAMINHÃO, LocalDateTime.now())

        val result = estacionamento.estacionar(veiculo)

        assertEquals("Não há vagas", result)
    }

    @Test
    fun `deve permitir estacionar um veículo do tipo CARRO se houverem vagas disponíveis`() {
        val estacionamento = Estacionamento(vagasDisponiveisCarro = 10)

        val veiculo = Veiculo(VeiculoTipo.CARRO, LocalDateTime.now())

        val result = estacionamento.estacionar(veiculo)

        assertEquals("Veiculo permitido", result)
    }

    @Test
    fun `deve permitir estacionar um veículo do tipo MOTO se houverem vagas disponíveis`() {
        val estacionamento = Estacionamento(vagasDisponiveisMoto = 20)

        val veiculo = Veiculo(VeiculoTipo.MOTO, LocalDateTime.now())

        val result = estacionamento.estacionar(veiculo)

        assertEquals("Veiculo permitido", result)
    }

    @Test
    fun `deve permitir estacionar um veículo do tipo CAMINHÃO se houverem vagas disponíveis`() {
        val estacionamento = Estacionamento(vagasDisponiveisCaminhão = 5)

        val veiculo = Veiculo(VeiculoTipo.CAMINHÃO, LocalDateTime.now())

        val result = estacionamento.estacionar(veiculo)

        assertEquals("Veiculo permitido", result)
    }

    @Test
    fun `não deve permitir estacionar um carro se o número ultrapassar o limite de vagas`() {
        val estacionamento = Estacionamento(vagasDisponiveisCarro = 1, vagasDisponiveisMoto = 0, vagasDisponiveisCaminhão = 0)

        val veiculo1 = Veiculo(VeiculoTipo.CARRO, LocalDateTime.now())
        val veiculo2 = Veiculo(VeiculoTipo.CARRO, LocalDateTime.now())

        val result1 = estacionamento.estacionar(veiculo1)
        val result2 = estacionamento.estacionar(veiculo2)

        assertEquals("Veiculo permitido", result1)
        assertEquals("Não há vagas", result2)
    }

    @Test
    fun `não deve permitir estacionar um caminhao se o número ultrapassar o limite de vagas`() {
        val estacionamento = Estacionamento(vagasDisponiveisCarro = 0, vagasDisponiveisMoto = 0, vagasDisponiveisCaminhão = 1)

        val veiculo1 = Veiculo(VeiculoTipo.CAMINHÃO, LocalDateTime.now())
        val veiculo2 = Veiculo(VeiculoTipo.CAMINHÃO, LocalDateTime.now())

        val result1 = estacionamento.estacionar(veiculo1)
        val result2 = estacionamento.estacionar(veiculo2)

        assertEquals("Veiculo permitido", result1)
        assertEquals("Não há vagas", result2)
    }

//    @Test
//    fun `não deve permitir estacionar um moto se o número ultrapassar o limite de vagas`() {
//        val estacionamento = Estacionamento(vagasDisponiveisCarro = 0, vagasDisponiveisMoto = 0, vagasDisponiveisCaminhão = 0)
//
//        val veiculo = Veiculo(VeiculoTipo.MOTO, LocalDateTime.now())
//
//        val result = estacionamento.estacionar(veiculo)
//
//        assertEquals("Não há vagas", result)
//    }
}
