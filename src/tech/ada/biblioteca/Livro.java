package tech.ada.biblioteca;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Livro implements Legivel {
    private String titulo;
    private int paginas;
    private String autor;

    public Livro(String titulo, int paginas, String autor, String editora, String texto) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.autor = autor;
        this.editora = editora;
        this.texto = texto;
    }

    private String editora;
    private String texto;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String getTexto() {
        return texto;
    }

    @Override
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean palavraExiste(String palavra) {
        return texto.contains(palavra);
    }

    public boolean substituirPalavra(String palavraAntiga, String palavraNova) {
        this.texto = texto.replace(palavraAntiga, palavraNova);
        return !(texto
            .contains(palavraAntiga));
    }

    public void printToConsola() {
        System.out.println(this.texto);
    }

    public void printToFile() throws IOException {
        FileOutputStream out = new FileOutputStream(("C:\\" + this.titulo + ".txt"));
        out.write(texto.getBytes("UTF-8"));
        out.close();
    }
}
