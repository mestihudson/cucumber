package bancool;


public final class Conta {
  private Dinheiro saldo;

  public Conta() {
    this.saldo = new Dinheiro(0.00);
  }

  public void depositar(final Dinheiro montante) {
    this.saldo = saldo.adicionar(montante);
  }

  public void debitar(final Dinheiro montante) {
    this.saldo = saldo.diminuir(montante);
  }

  public Dinheiro saldo() {
    return saldo;
  }
}
