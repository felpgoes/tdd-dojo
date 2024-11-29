# TDD Coding Dojo!

## Description
Você foi contratado para desenvolver um sistema de gerenciamento de um estacionamento. O estacionamento possui diferentes tipos de veículos e regras específicas para cobrança e alocação de vagas.​

## Objetivo:
- Calcular o valor a ser pago pelo tempo de permanência no estacionamento.
- Gerenciar a ocupação das vagas, garantindo que não sejam excedidas as capacidades máximas para cada tipo de veículo.

## Requisitos:
- O sistema deve ser capaz de receber a entrada de um veículo, especificando o tipo de veículo e o horário de entrada.
- O sistema deve possibilitar a saída de um veículo
- calcular o tempo total de permanência e o valor a ser pago com base nas regras de cobrança.
- O sistema deve verificar a disponibilidade de vagas antes de permitir a entrada de um novo veículo.
- O sistema deve possibilitar um "snapshot" da ocupação atual do estacionamento, indicando quantas vagas estão ocupadas e quantas estão disponíveis para cada tipo de veículo e quanto é o ganho estimado com os veículos que já estão estacionados.

## Entidades:
- Carro
- Moto
- Caminhão

## Regras de Cobrança:
- Carro paga R$ 50,00 por hora
- Moto paga R$ 15,00 por hora
- Caminhão paga R$ 120,00 por hora

## Capacidade de Vagas:
- 10 vagas para carro
- 20 vagas para moto
- 5 vagas para caminhão
