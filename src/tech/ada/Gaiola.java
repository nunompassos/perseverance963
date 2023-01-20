package tech.ada;

public class Gaiola<K, V> {
    private K identificador;
    private V animal;

    public void inserirAnimal(K identificador, V animal) {
        this.identificador = identificador;
        this.animal = animal;
    }

    public boolean eAnimal(K identificador) {
        return this.identificador.equals(identificador);
    }

    public void animalACantar(K id) {

    }
}
