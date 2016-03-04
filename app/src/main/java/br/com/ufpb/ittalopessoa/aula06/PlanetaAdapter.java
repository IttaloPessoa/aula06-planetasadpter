package br.com.ufpb.ittalopessoa.aula06;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ittalo Pessoa on 03/03/2016.
 */
public class PlanetaAdapter extends BaseAdapter {

    private Context context;
    private List<Planeta> planetas;

    public PlanetaAdapter(Context context, List<Planeta> planetas) {
        this.context = context;
        this.planetas = planetas;
    }

    @Override
    public int getCount() {
        return planetas.size();
    }

    @Override
    public Object getItem(int position) {
        return planetas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item_list, parent, false);

        Planeta planeta = planetas.get(position);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        TextView textView = (TextView) view.findViewById(R.id.textView);

        imageView.setImageResource(planeta.getIdImage());
        textView.setText(planeta.getNome());

        return view;
    }
}
