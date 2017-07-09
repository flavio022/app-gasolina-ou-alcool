package gasolinaoualcool.cursoandroid.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Localizar componentes na tela
        precoAlcool = (EditText) findViewById(R.id.alcool_id);
        precoGasolina = (EditText) findViewById(R.id.gasolina_id);
        botaoVerificar = (Button) findViewById(R.id.botao_verificar_id);
        textoResultado = (TextView) findViewById(R.id.texto_resultado_id);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Recupera valores digitados
                String textoAlcool = precoAlcool.getText().toString();
                String textoGasolina = precoGasolina.getText().toString();
                //Converte valores string para numero
                Double valorAlcool = Double.parseDouble(textoAlcool);
                Double valorGasolina = Double.parseDouble(textoGasolina);

                // alcool / gasolina
                double resultado = valorAlcool / valorGasolina;
                if (resultado>= 0.7){
                    textoResultado.setText("É melhor ultilizar a Gasolina!!");
                }else {
                    textoResultado.setText("É melhor ultilizar o Álcool!! ");
                }


            }
        });
    }
}
