package mx.unam.dgtic.evaluacionfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private final static String LOGTAG = "DEPURACION";

    TextView tvGrupo;
    TextView tvNutricional;
    Button  btnVolver;
    ImageView ivInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvGrupo = findViewById(R.id.tvGrupo);
        tvNutricional = findViewById(R.id.tvNutricional);
        btnVolver = findViewById(R.id.btnVolver);
        ivInfo = findViewById(R.id.ivInfo);

        Bundle bundle = this.getIntent().getExtras();
        Long id = bundle.getLong("ID");
        String grupo = bundle.getString("Grupo");
        String energia = bundle.getString("Energia");
        String carbohidratos = bundle.getString("Carbohidratos");
        String proteina = bundle.getString("Proteinas");
        String grasas = bundle.getString("Grasas");

        Toast.makeText(this,
                "El id del elemento seleccionado fue: " + (id+1),
                Toast.LENGTH_LONG).show();

        tvGrupo.setText(grupo);
        tvNutricional.setText("Contienen " +energia+", Hidratos de Carbono "+carbohidratos+", Proteinas "+proteina+
                ", Grasas "+grasas+ ", según la ración indicada.");
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.imss.gob.mx/sites/all/statics/salud/guia-alimentos.pdf"));


                startActivity(intent);
            }
        });
        switch (grupo){
            case "CEREALES":
                ivInfo.setImageResource(R.drawable.cerealesinfo);
                break;
            case "VERDURAS":
                ivInfo.setImageResource(R.drawable.verdurasinfo);
                break;
            case "FRUTAS":
                ivInfo.setImageResource(R.drawable.frutasinfo);
                break;
            case "ALIMENTOS DE ORIGEN ANIMAL":
                ivInfo.setImageResource(R.drawable.aoainfo);
                break;
            case "LECHE ENTERA":
                ivInfo.setImageResource(R.drawable.lecheinfo);
                break;
            case "LEGUMINOSAS":
                ivInfo.setImageResource(R.drawable.leguminosasinfo);
                break;
            case "AZUCAR":
                ivInfo.setImageResource(R.drawable.azucaresinfo);
                break;
            case "GRASA MONOSATURADA":
                ivInfo.setImageResource(R.drawable.grasasmonoinfo);
                break;
            case "GRASA TRANS":
                ivInfo.setImageResource(R.drawable.grasastransinfo);
                break;
            case "LIBRES":
                ivInfo.setImageResource(R.drawable.libresinfo);
                break;

        }
    }
}
