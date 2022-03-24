
package GETTERS;

public class Pessoa 
{
    private String nome;
    private int idade;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getIdade() 
    {
        return idade;
    }

    public void setIdade(int idade) 
    {
        this.idade = idade;
    }
    
    public static void main(String[] args) 
    {
        Pessoa dgp = new Pessoa();
        //Enviando as informações
        dgp.setNome("Daniel Gusmão Pereira");
        dgp.setIdade(31);
    }
}
