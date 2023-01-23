package tech.ada.animais;

public class Pinguim implements Ave{
    @Override
    public void colocaOvo() {
        System.out.println("Pinguim a colocar ovo");
    }

    @Override
    public String getNome() {
        return "Pinguim";
    }

    @Override
    public String andar() {
        return "Pinguim a andar";
    }

    @Override
    public String pular() {
        return "Pinguim a pular";
    }
}
