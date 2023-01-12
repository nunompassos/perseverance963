package tech.ada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import tech.ada.animais.Ave;
import tech.ada.animais.Tucano;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        final List array = new ArrayList();

        final Tucano t = new Tucano(1);
        final Tucano t2 = t.cloneMe();

        // Imprimir apenas se for Ave
        if(t2 instanceof Ave)
            System.out.println(t2);

        t2.colocaOvo();
    }

    private static List ordenar(List<Tucano> l) {
        Collections.sort(l);
        return l;
    }
}