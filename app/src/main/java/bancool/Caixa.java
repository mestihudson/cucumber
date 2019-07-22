package bancool;


public final class Caixa {
  private Distribuidora distribuidora;

  public void sacarDe(final Conta conta, final Dinheiro montante) {
    conta.debitar(montante);
    this.distribuidora = new Distribuidora(montante);
  }

  public Distribuidora distribuidora() {
    return this.distribuidora;
  }
}
