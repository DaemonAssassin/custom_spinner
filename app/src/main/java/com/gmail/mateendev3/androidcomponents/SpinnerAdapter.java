package com.gmail.mateendev3.androidcomponents;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.helper.widget.Layer;

import java.util.ArrayList;
import java.util.List;

public class SpinnerAdapter extends ArrayAdapter<SpinnerItems> {

    public SpinnerAdapter(Context context, List<SpinnerItems> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView (int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_spinner_layout_file, parent, false);
        }

        SpinnerItems currentInstance = getItem(position);

        TextView spinnerText = convertView.findViewById(R.id.tv_spinner);
        ImageView spinnerImage = convertView.findViewById(R.id.iv_spinner);

        spinnerText.setText(currentInstance.getProgrammingLanguage());
        spinnerImage.setImageResource(currentInstance.getLanguageLogo());

        return convertView;
    }
}
