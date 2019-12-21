package mx.unam.dgtic.evaluacionfinal;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import mx.unam.dgtic.evaluacionfinal.modelo.Alimentos;

public class Adaptador extends BaseAdapter {
    Typeface fuenteFrontier;

    private static LayoutInflater inflater = null;
    Context context;
    ArrayList<Alimentos> alimentos;

    public Adaptador(Context context, ArrayList<Alimentos> alimentos) {
        this.context = context;
        this.alimentos = alimentos;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return alimentos.size();
    }

    @Override
    public Object getItem(int i) {
        return alimentos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return alimentos.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        final View vista = inflater.inflate(R.layout.prototipo,null);


        TextView tvGrupo = vista.findViewById(R.id.tvGrupo);
        TextView tvCarbohidratos = vista.findViewById(R.id.tvEnergia);
        ImageView ivLista = vista.findViewById(R.id.ivFood);

        tvGrupo.setText(alimentos.get(i).getGrupo());
        tvCarbohidratos.setText("Sólo en la medida que se indicada equivalen a "+alimentos.get(i).getEnergia()+".");
        switch (i+1){
            case 1:
                ivLista.setImageResource(R.drawable.cereales);
                break;
            case 2:
                ivLista.setImageResource(R.drawable.verduras);
                break;
            case 3:
                ivLista.setImageResource(R.drawable.frutas);
                break;
            case 4:
                ivLista.setImageResource(R.drawable.aoa);
                break;
            case 5:
                ivLista.setImageResource(R.drawable.leche);
                break;
            case 6:
                ivLista.setImageResource(R.drawable.leguminosas);
                break;
            case 7:
                ivLista.setImageResource(R.drawable.azucares);
                break;
            case 8:
                ivLista.setImageResource(R.drawable.grasasmono);
                break;
            case 9:
                ivLista.setImageResource(R.drawable.grasastrans);
                break;
            case 10:
                ivLista.setImageResource(R.drawable.libres);
                break;
            default:
                break;

        }


        return vista;
    }
}
