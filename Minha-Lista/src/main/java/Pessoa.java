public class Pessoa {
  private String Nome;
  private int Idade;
  public Pessoa(String nome, int idade) {
    this.Nome = nome;
    this.Idade = idade;
  }
  public String getNome() {
    return this.Nome;
  }
  public int getIdade() {
    return this.Idade;
  }
  public void setNome(String nome) {
    this.Nome = nome;
  }
  public void setIdade(int idade) {
    this.Idade = idade;
  }
  @Override
  public String toString() {
    return "Nome: " + Nome + ", Idade: " + Idade;
  }
  public String toObject() {
    return "Nome: " + Nome + ", Idade: " + Idade;
  }
  public static Pessoa fromObject(Object obj) {
    if (obj instanceof String) {
        String[] dados = ((String) obj).split(",");
        String nome = dados[0].split(":")[1].trim();
        int idade = Integer.parseInt(dados[1].split(":")[1].trim());
        return new Pessoa(nome, idade);
    } else {
        return null;
    }
  }
}