package tech.ada.animais;

public class Tucano implements Ave, AveVoadora, Cloneable, Comparable<Tucano> {
    private int idade;
    private String nome;

    public Tucano(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public Tucano cloneMe() throws CloneNotSupportedException {
        return (Tucano) this.clone();
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String voar() {
        return "Tucano a voar";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return ("Tucano");
    }

    public int getIdade() {
        return this.idade;
    }

    @Override
    public int compareTo(Tucano t) {
        return Integer.compare(getIdade(), t.getIdade());
    }

    @Override
    public void colocaOvo() {
        andar();
    }

    @Override
    public String andar() {
        return "Tucano a andar";
    }

    @Override
    public String pular() {
        return "Tucano a pular";
    }
}
