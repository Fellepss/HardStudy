package OK.GettersAndSetters;
public class GettersAndSetters {
  public static void main(String[] args) {
    Pessoa Morador = new Pessoa();
    Morador.setNome("Pedro");
    Morador.setIdade(15);
    Morador.setSexo("Masculino");

    System.out.println("O morador " + Morador.getNome() + " possui " + Morador.getIdade() + " anos e é do sexo " + Morador.getSexo() + ".");

    //Quero que o usuario escreva o nome
    //Quero transformar o nome em maisculo
    //Quero expor na tela o nome em maiusculo
  }
}
