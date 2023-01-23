package tech.ada.animais;

public interface Ave {

    void colocaOvo();

    String getNome();
     // String voa();
     String andar();
     String pular();

    private void correr() {
        System.out.println("Estou a correr!");
    }
}
