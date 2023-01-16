package tech.ada.animais;

public interface Ave {

    void colocaOvo();

    String getNome();

    default void andar() {
        System.out.println("Estou a andar!");
        this.correr();
    }

    private void correr() {
        System.out.println("Estou a correr!");
    }
}
