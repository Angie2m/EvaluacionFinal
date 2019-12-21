package mx.unam.dgtic.evaluacionfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import mx.unam.dgtic.evaluacionfinal.modelo.Alimentos;

public class MainActivity extends AppCompatActivity {

    ArrayList<Alimentos> alimentos = new ArrayList<>();
    ListView lv;
    String[] grupos = {"CEREALES","VERDURAS","FRUTAS","ALIMENTOS DE ORIGEN ANIMAL","LECHE ENTERA", "LEGUMINOSAS","AZUCAR","GRASA MONOSATURADA","GRASA TRANS","LIBRES"} ;
    String[] energia = {"70 kcal","25 kcal","60 kcal","40 kcal","150 kcal","120 kcal","40 kcal","70 kcal","45 kcal","0 kcal"};
    String[] carbohidratos = {"15g","4g","15g","0g","12g","20g","10g","3g","0g","0g"};
    String[] grasa = {"0g","0g","0g","1g","8g","1g","0g","5g","5g","0g"};
    String[] proteina = {"2g","2g","0g","7g","9g","8g","0g","3g","0g","0g"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alimentos = Food();
        final Adaptador adaptador = new Adaptador(this,alimentos);

        lv = findViewById(R.id.lv);

        lv.setAdapter(adaptador);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                Bundle bundle = new Bundle();
                bundle.putLong("ID",l);

                Alimentos tmp = (Alimentos) adapterView.getItemAtPosition(i);

                bundle.putString("Grupo",tmp.getGrupo());
                bundle.putString("Energia",tmp.getEnergia());
                bundle.putString("Carbohidratos",tmp.getCarbohidratos());
                bundle.putString("Grasas",tmp.getGrasa());
                bundle.putString("Proteinas",tmp.getProteinas());

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
    }

    private ArrayList<Alimentos> Food(){
        ArrayList<Alimentos> nuevos = new ArrayList<>();
        Alimentos alim;
        for (int i = 0;i<10;i++){
            alim = new Alimentos(i,grupos[i],energia[i],carbohidratos[i],proteina[i],grasa[i]);
            nuevos.add(alim);
        }
        return nuevos;
    }
}
