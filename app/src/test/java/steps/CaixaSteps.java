package steps;


import bancool.*;

import cucumber.api.java.pt.*;

import support.ConheceDominio;


import static org.assertj.core.api.Assertions.assertThat;


public class CaixaSteps {
  private final ConheceDominio dominio;

  public CaixaSteps(final ConheceDominio dominio) {
    this.dominio = dominio;
  }

  @Quando("solicito saque de ${double}")
  public void solicitoSaqueDe(final Double montante) {
    dominio.caixa().sacarDe(dominio.conta(), new Dinheiro(montante));
  }

  @Então("${double} deve ser entregue")
  public void deveSerEntregue(final Double montante) {
    assertThat(
      dominio.caixa().distribuidora()
    ).isEqualTo(new Distribuidora(new Dinheiro(montante)));
  }
}
