import java.util.ArrayList;

/**
 * Classe que representa uma Refeição.
 */
public class Refeicao extends Alimento {
    private ArrayList<Alimento> alimentos;

    /**
     * Construtor da classe Refeição.
     * 
     * @param nome     Nome da refeição.
     * @param calorias Calorias da refeição.
     */
    public Refeicao(String nome, int calorias) {
        super(nome, calorias);
        this.alimentos = new ArrayList<>();
    }

    /**
     * Adiciona um alimento à refeição.
     * 
     * @param alimento Alimento a ser adicionado.
     */
    public void adicionarAlimento(Alimento alimento) {
        alimentos.add(alimento);
    }

    /**
     * Remove um alimento da refeição.
     * 
     * @param alimento Alimento a ser removido.
     */
    public void removerAlimento(Alimento alimento) {
        alimentos.remove(alimento);
    }

    /**
     * Lista os alimentos da refeição.
     * 
     * @return Lista de alimentos.
     */
    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Alimentos: " + alimentos.toString();
    }
}
