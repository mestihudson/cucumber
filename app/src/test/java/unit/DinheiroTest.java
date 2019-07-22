package unit;


import bancool.Dinheiro;

import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;


public final class DinheiroTest {
  @Test public void criarDinheiro() {
    assertThat(new Dinheiro(100.00).valor()).isEqualTo(100.00);
    assertThat(new Dinheiro(0.01).valor()).isEqualTo(0.01);
    assertThat(new Dinheiro("100.01").valor()).isEqualTo(100.01);
    assertThat(new Dinheiro("0.01").valor()).isEqualTo(0.01);
  }

  @Test public void adicionar() {
    assertThat(
      new Dinheiro(100.00).adicionar(new Dinheiro(1.01)).valor()
    ).isEqualTo(101.01);
    assertThat(
      new Dinheiro("200.00").adicionar(new Dinheiro("2.02")).valor()
    ).isEqualTo(202.02);
    assertThat(
      new Dinheiro("300.00").adicionar(new Dinheiro(3.03)).valor()
    ).isEqualTo(303.03);
  }

  @Test public void diminuir() {
    assertThat(
      new Dinheiro(100.00).diminuir(new Dinheiro(1.01)).valor()
    ).isEqualTo(98.99);
    assertThat(
      new Dinheiro("200.00").diminuir(new Dinheiro("2.02")).valor()
    ).isEqualTo(197.98);
    assertThat(
      new Dinheiro("300.00").diminuir(new Dinheiro(3.03)).valor()
    ).isEqualTo(296.97);
  }
}
