package tech.ada.biblioteca;

import java.io.FileOutputStream;
import java.io.IOException;

public class Impressora {

    public static void printToConsola(String texto) {
        System.out.println(texto);
    }

    public static void printToConsola(Legivel l) {
        System.out.println(l.getTexto());
    }

    public void printToFile(String texto, String nomeArquivo) throws IOException {
        FileOutputStream out = new FileOutputStream(("C:\\" + nomeArquivo + ".txt"));
        out.write(texto.getBytes("UTF-8"));
        out.close();
    }

}
