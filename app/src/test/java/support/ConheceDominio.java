package support;


import bancool.*;


public final class ConheceDominio {
  private Conta conta;
  private Caixa caixa;

  public Conta conta() {
    if (conta == null) {
      conta = new Conta();
    }
    return conta;
  }

  public Caixa caixa() {
    if (caixa == null) {
      caixa = new Caixa();
    }
    return caixa;
  }
}
