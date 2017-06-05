package pooa20171.iff.br.recyclerviewexample.model;

/**
 * Created by lglmo on 05/06/2017.
 */

public class Livro {

    private final String nomeLivro;
    private final String nomeAutor;
    private final String descricao;


    public Livro(String nomeLivro, String nomeAutor,
                 String descricao) {

        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
        this.descricao = descricao;

    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getDescricao() {
        return descricao;
    }



}