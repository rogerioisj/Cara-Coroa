package br.com.rogerioisj.coc.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

import br.com.rogerioisj.coc.R;

public class MainActivity extends AppCompatActivity {

    Button botaoJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = findViewById(R.id.main_botao_jogar);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Resultado.class);

                intent.putExtra("jogada", defineRodada());

                startActivity(intent);
            }
        });

    }

    int defineRodada(){
        int jogada = new Random().nextInt(2);

        return jogada;
    }
}