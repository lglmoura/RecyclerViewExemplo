package pooa20171.iff.br.recyclerviewexample.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import pooa20171.iff.br.recyclerviewexample.R;

/**
 * Created by lglmo on 19/06/2017.
 */

public class LivroViewHolder extends RecyclerView.ViewHolder{

    private final TextView nomeLivro;
    private final TextView nomeAutor;
    private final TextView descricao;


    public LivroViewHolder(View itemView) {
        super(itemView);
        nomeLivro = (TextView) itemView.findViewById(R.id.nomeLivro);
        nomeAutor = (TextView) itemView.findViewById(R.id.nomAuto);
        descricao = (TextView) itemView.findViewById(R.id.descricao);


    }

    public TextView getNomeLivro() {
        return nomeLivro;
    }

    public TextView getNomeAutor() {
        return nomeAutor;
    }

    public TextView getDescricao() {
        return descricao;
    }
}