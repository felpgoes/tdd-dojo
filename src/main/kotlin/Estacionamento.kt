package org.study

// Entidades:
// - Carro
// - Moto
// - Caminhão
//
// Regras:
// - Carro paga R$ 50,00 por hora
// - Moto paga R$ 15,00 por hora
// - Caminhão paga R$ 120,00 por hora
//
// Vagas:
// - 10 vagas para carro
// - 20 vagas para moto
// - 5 vagas para caminhão

class Estacionamento (
    var vagasDisponiveisCarro: Int = 10,
    var vagasDisponiveisMoto: Int = 20,
    var vagasDisponiveisCaminhão: Int = 5
) {

    fun estacionar(veiculo: Veiculo): String {


        if (vagasDisponiveisCarro == 0 && veiculo.tipo == VeiculoTipo.CARRO) {
            return "Não há vagas"
        }

        if (vagasDisponiveisMoto == 0 && veiculo.tipo == VeiculoTipo.MOTO) {
            return "Não há vagas"
        }

        if (vagasDisponiveisCaminhão == 0 && veiculo.tipo == VeiculoTipo.CAMINHÃO) {
            return "Não há vagas"
        }

        if (veiculo.tipo == VeiculoTipo.CARRO || veiculo.tipo == VeiculoTipo.MOTO || veiculo.tipo == VeiculoTipo.CAMINHÃO) {
            return "Veiculo permitido"
        }

        return "Veículo não permitido"
    }
}
