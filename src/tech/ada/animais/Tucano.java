package tech.ada.animais;

public class Tucano implements Ave, Cloneable, Comparable<Tucano> {
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
    public void andar() {
        Ave.super.andar();
    }
}
