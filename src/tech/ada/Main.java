package tech.ada;

import java.util.*;

import tech.ada.animais.Ave;
import tech.ada.animais.AveVoadora;
import tech.ada.animais.Pinguim;
import tech.ada.animais.Tucano;
import tech.ada.logger.MyLog;

public class Main {

    private MyLog logger;
    public static void main(String[] args) throws CloneNotSupportedException {
        //MyLog logger = new MyLogImpl();

        final List<Ave> array = new ArrayList<>();

        final Tucano t = new Tucano(1, "Tomé");
        final Tucano t2 = t.cloneMe();
        array.add(t2);

        for (Object tucano : array) {
            ((Tucano) tucano).colocaOvo();
        }

        final Ave ave = new Pinguim();

        ave.colocaOvo();
        ave.andar();
        //logger.logInfo(ave.andar());

        // Imprimir apenas se for Ave
        if(t2 instanceof Ave)
            System.out.println(t2);

        t2.colocaOvo();
        colocarOvos(array);
        //colocarOvos(new Tucano(3, "António"));
        final Gaiola<Integer, Ave> g = new Gaiola<>();
        g.inserirAnimal(1, t);
        List<Gaiola> arrayGaiola = new ArrayList<>();
        //g.getAnimal(1).cantar();
        //colocarOvos(arrayGaiola);
        //Map<String, List<Ave>> aveAgrupada = new EnumMap<>(); // new HashMap<>();
        /*aveAgrupada.put(
            "José",
            List.of(new Tucano(12, "José"), new Tucano(2, "José"))
            );
*/
        array.stream().filter(it -> it instanceof AveVoadora);

/*
        Livro l = new Livro("Aula de POO", 3, "Nuno", "ADA", "Pricipios de SOLID");
        Editor<Livro> e = new Editor(l);
        if (e.palavraExiste("SOLID")) {
            System.out.println("A palavra 'SOLID' existe no texto!");
        }
        if (e.substituirPalavra("Pricipios", "Princípios")) {
            Impressora.printToConsola(l.getTexto());
        }*/


    }

    private static List ordenar(List<Tucano> l) {
        Collections.sort(l);
        return l;
    }

    private static void colocarOvos(List<? super Tucano> ave) {
        ave.forEach(t -> t.toString());
    }
}