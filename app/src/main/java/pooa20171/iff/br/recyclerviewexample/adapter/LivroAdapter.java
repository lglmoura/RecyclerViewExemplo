package pooa20171.iff.br.recyclerviewexample.adapter;

/**
 * Created by lglmo on 05/06/2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import pooa20171.iff.br.recyclerviewexample.R;
import pooa20171.iff.br.recyclerviewexample.holder.LivroViewHolder;
import pooa20171.iff.br.recyclerviewexample.model.Livro;

/**
 * Created by lglmo on 04/06/2017.
 */

public class LivroAdapter extends RecyclerView.Adapter {

    private List<Livro> livros;
    private Context context;

    public LivroAdapter(List<Livro> livros, Context context) {

        this.livros = livros;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_livro, parent, false);
        LivroViewHolder livroViewHolder = new LivroViewHolder(view);
        return livroViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder,
                                 int position) {

        LivroViewHolder holder = (LivroViewHolder) viewHolder;

        Livro livro  = livros.get(position) ;

        holder.getNomeLivro().setText(livro.getNomeLivro());
        holder.getNomeAutor().setText(livro.getNomeAutor());
        holder.getDescricao().setText(livro.getDescricao());
        Log.i("------XXXXXXXXX--", livro.getDescricao());


    }

    @Override
    public int getItemCount() {

        return livros.size();
    }

    private void updateItem(int position) {

    }

    // Método responsável por remover um usuário da lista.
    private void removerItem(int position) {

    }


}