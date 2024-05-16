
public class ListaArray {

  private int n = 0;
  private Pessoa[] el = new Pessoa[1];

  private void expande() {
    if (n == el.length) {
      Pessoa aux[] = new Pessoa[n * 2];
      System.arraycopy(el, 0, aux, 0, n);
      el = aux;
    }
  }

  private void encolhe() {
    if (n <= el.length / 4) {
      Pessoa aux[] = new Pessoa[el.length / 2];
      System.arraycopy(el, 0, aux, 0, n);
      el = aux;
    }
  }

  public void insere(Pessoa pessoa) {
    insere(pessoa, n);
  }

  public void insere(Pessoa pessoa, int p) {
    if (p >= 0 && p <= n) {
      for (int k = n; k > p; k--) {
        el[k] = el[k - 1];
      }
      el[p] = pessoa;
      n++;
      expande();
    } else {
      System.err.println("Posicao invalida [n=" + n + ", p=" + p + "]");
    }
  }

  public void remove(int p) {
    if (p < 0 || p >= n) {
      System.err.println("Posicao invalida [n=" + n + ", p=" + p + "]");
    } else {
      for (int k = p; k < n; k++) {
        el[k] = el[k + 1];
      }
      el[n - 1] = null;
      n--;
      encolhe();
    }
  }

  public Object seleciona(int p) {
    if (p >= 0 || p < n) {
      return el[p];
    }
    System.err.println("Posicao invalida [n=" + n + ", p=" + p + "]");
    return null;
  }

  public void altera(Pessoa pessoa, int p) {
    if (p >= 0 || p < n) {
      el[p] = pessoa;
    }
    System.err.println("Posicao invalida [n=" + n + ", p=" + p + "]");
  }

  public void exibe() {
    System.out.println("");
    for (int i = 0; i < n; i++) {
      System.out.print(el[i]);
    }
  }
}
