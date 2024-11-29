package org.study

//Entidades:
//- Carro
//- Moto
//- Caminhão
//
//Regras:
//- Carro paga R$ 50,00 por hora
//- Moto paga R$ 15,00 por hora
//- Caminhão paga R$ 120,00 por hora
//
//Vagas:
//- 10 vagas para carro
//- 20 vagas para moto
//- 5 vagas para caminhão


class Estacionamento {

    fun estacionar(veiculo: Veiculo): String {

        if(veiculo.tipo == VeiculoTipo.CARRO.name || veiculo.tipo == VeiculoTipo.MOTO.name || veiculo.tipo == VeiculoTipo.CAMINHÃO.name) {
            return "Veiculo permitido"
        }

        return "Veículo não permitido"
    }
}