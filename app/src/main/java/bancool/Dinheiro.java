package bancool;


public final class Dinheiro {
  private final double valor;

  public Dinheiro(final double valor) {
    this.valor = valor;
  }

  public Dinheiro(final String valor) {
    this(new Double(valor));
  }

  public Dinheiro adicionar(final Dinheiro quantidade) {
    return new Dinheiro(this.valor + quantidade.valor());
  }

  public Dinheiro diminuir(final Dinheiro quantidade) {
    return new Dinheiro(this.valor - quantidade.valor());
  }

  public double valor() {
    return valor;
  }

  @Override public boolean equals(final Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof Dinheiro)) {
      return false;
    }
    final Dinheiro dinheiro = (Dinheiro) o;
    return Double.compare(valor, dinheiro.valor()) == 0;
  }
}
