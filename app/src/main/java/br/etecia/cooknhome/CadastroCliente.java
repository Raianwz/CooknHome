package br.etecia.cooknhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CadastroCliente extends AppCompatActivity implements View.OnClickListener {

    ImageView imgCadClienteSeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_cliente_layout);

        imgCadClienteSeta = findViewById(R.id.imgCadClienteSeta);
        imgCadClienteSeta.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.imgCadClienteSeta:
                startActivity(new Intent(getApplicationContext(), TelaEscolha.class));
                break;
        }
    }
}