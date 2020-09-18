package br.com.rogerioisj.coc.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import br.com.rogerioisj.coc.R;

public class Resultado extends AppCompatActivity {

    ImageView imagemMoeda;
    Button botaoVolta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imagemMoeda = findViewById(R.id.resultado_imagem);

        Bundle dados = getIntent().getExtras();

        int jogada = dados.getInt("jogada");

        defineLadoMoeda(jogada);

        botaoVolta = findViewById(R.id.resultado_botao_voltar);
        botaoVolta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void defineLadoMoeda(int jogada) {
        if (jogada == 0) {
            System.out.println("Jogada: Cara");
            imagemMoeda.setImageResource(R.drawable.moeda_cara);
        } else {
            System.out.println("Jogada: Coroa");
            imagemMoeda.setImageResource(R.drawable.moeda_coroa);
        }
    }
}