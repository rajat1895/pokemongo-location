package com.example.rajat.pokemongolocation;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by rajat on 8/21/2016.
 */
public class customize_listdata extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] data;
    private final Integer[] imageId;
    public customize_listdata(Activity context,
                          String[] data, Integer[] imageId) {
        super(context, R.layout.list_view2, data);
        this.context = context;
        this.data = data;
        this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_view2, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(data[position]);

        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}

