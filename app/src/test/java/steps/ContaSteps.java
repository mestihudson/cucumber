package steps;


import bancool.*;

import cucumber.api.java.pt.*;

import support.ConheceDominio;


import static org.assertj.core.api.Assertions.assertThat;


public class ContaSteps {
  private final ConheceDominio dominio;

  public ContaSteps(final ConheceDominio dominio) {
    this.dominio = dominio;
  }

  @Dado("que eu tenho depositado ${double} em minha conta")
  public void queEuTenhoDepositadoEmMinhaConta(final Double montante) {
    final Dinheiro dinheiro = new Dinheiro(montante);
    dominio.conta().depositar(dinheiro);
    assertThat(dominio.conta().saldo()).isEqualTo(dinheiro);
  }
}
