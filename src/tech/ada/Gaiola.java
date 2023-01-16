package tech.ada;

public class Gaiola<K, V> {
    private K identificador;
    private V ave;

    public void inserirAnimal(K identificador, V animal) {
        this.identificador = identificador;
        this.ave = animal;
    }

    public boolean eAnimal(K identificador) {
        return this.identificador.equals(identificador);
    }
}
