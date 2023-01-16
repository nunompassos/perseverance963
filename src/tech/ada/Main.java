package tech.ada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import tech.ada.animais.Ave;
import tech.ada.animais.Tucano;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        final List<Ave> array = new ArrayList<>();

        final Tucano t = new Tucano(1, "Tomé");
        final Tucano t2 = t.cloneMe();
        array.add(t2);

        for (Object tucano : array) {
            ((Tucano) tucano).colocaOvo();
        }

        // Imprimir apenas se for Ave
        if(t2 instanceof Ave)
            System.out.println(t2);

        t2.colocaOvo();
        colocarOvos(array);
        //colocarOvos(new Tucano(3, "António"));
        final Gaiola<Integer, Ave> g = new Gaiola<>();
        g.inserirAnimal(1, t);
        List<Gaiola> arrayGaiola = new ArrayList<>();
        //colocarOvos(arrayGaiola);

    }

    private static List ordenar(List<Tucano> l) {
        Collections.sort(l);
        return l;
    }

    private static void colocarOvos(List<? super Tucano> ave) {
        ave.forEach(t -> t.toString());
    }
}