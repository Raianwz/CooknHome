package br.etecia.cooknhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CadastroCozinheiro extends AppCompatActivity implements View.OnClickListener {

    ImageView imgCadCozinheiroSeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_cozinheiro_layout);

        imgCadCozinheiroSeta = findViewById(R.id.imgCadCozinheiroSeta);
        imgCadCozinheiroSeta.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.imgCadCozinheiroSeta:
                startActivity(new Intent(getApplicationContext(), TelaEscolha.class));
                break;
        }
    }
}