@login @regressivo
Feature: login
Como usuario
Quero informar dados
Para realizar login

Background: acessar tela de login
Given que eu nao esteja logado	
@positivo @smoke @rapido


Scenario: login valido
When preencher dados validos
And clicar no botao login
Then usuario logado
@negativo
Scenario: login senha invalida
When preencher a senha errada
And clicar no botao login
Then mensagem de erro

