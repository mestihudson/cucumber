package bancool;


public final class Distribuidora {
  private final Dinheiro conteudo;

  public Distribuidora(final Dinheiro conteudo) {
    this.conteudo = conteudo;
  }

  public Dinheiro conteudo() {
    return conteudo;
  }

  @Override public boolean equals(final Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof Distribuidora)) {
      return false;
    }
    final Distribuidora distribuidora = (Distribuidora) o;
    return conteudo.equals(distribuidora.conteudo());
  }
}
