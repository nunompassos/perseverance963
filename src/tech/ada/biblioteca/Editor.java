package tech.ada.biblioteca;

public class Editor<T extends Legivel> {

    T algoComTexto;

    public Editor(T novoLegivel) {
        this.algoComTexto = novoLegivel;
    }

    public boolean palavraExiste(String palavra) {
        return algoComTexto.getTexto().contains(palavra);
    }

    public boolean substituirPalavra(
        String palavraAntiga,
        String palavraNova
    ) {
        algoComTexto.setTexto(
            algoComTexto.getTexto().replace(palavraAntiga, palavraNova)
        );
        return !(algoComTexto.getTexto()
            .contains(palavraAntiga));
    }

}
