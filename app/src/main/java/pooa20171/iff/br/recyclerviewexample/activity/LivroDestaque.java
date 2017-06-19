package pooa20171.iff.br.recyclerviewexample.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import pooa20171.iff.br.recyclerviewexample.R;
import pooa20171.iff.br.recyclerviewexample.model.Livro;

public class LivroDestaque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livro_destaque);
        Intent intent = getIntent();
        Livro livro = (Livro) intent.getSerializableExtra("livro");
        EditText nome = (EditText) findViewById(R.id.et_nome_livro_destaque);
        EditText autor = (EditText) findViewById(R.id.et_autor_livro_destaque);
        EditText descricao = (EditText) findViewById(R.id.et_descricao_livro_destaque);

        nome.setText(livro.getNomeLivro());
        autor.setText(livro.getNomeAutor());
        descricao.setText(livro.getDescricao());

    }
}
