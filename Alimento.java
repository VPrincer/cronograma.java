
public class Alimento {
    private String nome;
    private int calorias;

    public Alimento(String nome, int calorias) {
        this.nome = nome;
        this.calorias = calorias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Alimento: " + nome + ", Calorias: " + calorias;
    }
}
