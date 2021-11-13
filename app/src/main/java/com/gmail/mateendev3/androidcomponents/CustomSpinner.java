package com.gmail.mateendev3.androidcomponents;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomSpinner extends AppCompatActivity {
    private List<SpinnerItems> spinnerItemsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_spinner);

        Spinner spinner = findViewById(R.id.custom_spinner);

        initSpinnerItemsList();
        SpinnerAdapter adapter = new SpinnerAdapter(this, spinnerItemsList);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerItems currentInstance = (SpinnerItems) parent.getSelectedItem();
                Toast.makeText(
                        CustomSpinner.this,
                        currentInstance.getProgrammingLanguage() + " is selected",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }

    private void initSpinnerItemsList() {
        spinnerItemsList = new ArrayList<>();
        spinnerItemsList.add(new SpinnerItems("C", R.drawable.c));
        spinnerItemsList.add(new SpinnerItems("C++", R.drawable.c_plus_plus));
        spinnerItemsList.add(new SpinnerItems("C#", R.drawable.c_sharp));
        spinnerItemsList.add(new SpinnerItems("CSS", R.drawable.css));
        spinnerItemsList.add(new SpinnerItems("HTML", R.drawable.html));
        spinnerItemsList.add(new SpinnerItems("Java", R.drawable.java));
        spinnerItemsList.add(new SpinnerItems("JavaScript", R.drawable.java_script));
        spinnerItemsList.add(new SpinnerItems("PHP", R.drawable.php));
        spinnerItemsList.add(new SpinnerItems("Python", R.drawable.python));
    }
}