package tech.ada.animais;

public class Tucano implements Ave, Ave2, Cloneable, Comparable{
    private int idade;

    public Tucano(int idade) {
        this.idade = idade;
    }

    public Tucano cloneMe() throws CloneNotSupportedException {
        return (Tucano) this.clone();
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
    public int compareTo(Object o) {
        if (!(o instanceof Tucano)) {
            return -99;
        }
        Tucano t = (Tucano) o;
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
