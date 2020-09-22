package br.etecia.cooknhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaEscolha extends AppCompatActivity implements View.OnClickListener {

    TextView txtEscCliente, txtEscCozinheiro;
    ImageView imgEscSeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_escolha);

        txtEscCliente = findViewById(R.id.txtEscCliente);
        txtEscCozinheiro = findViewById(R.id.txtEscCozinheiro);
        imgEscSeta = findViewById(R.id.imgEscSeta);

        txtEscCliente.setOnClickListener(this);
        txtEscCozinheiro.setOnClickListener(this);
        imgEscSeta.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.txtEscCliente:
                startActivity(new Intent(getApplicationContext(), CadastroCliente.class));
                break;
            case R.id.txtEscCozinheiro:
                startActivity(new Intent(getApplicationContext(), CadastroCozinheiro.class));
                break;
            case R.id.imgEscSeta:
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                break;
        }
    }
}