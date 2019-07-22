# language: pt
Funcionalidade: Saque de dinheiro
  Cenário: Bem sucedido de uma conta em crédito
      Dado que eu tenho depositado $100.00 em minha conta
    Quando solicito saque de $20.00
     Então $20.00 deve ser entregue

