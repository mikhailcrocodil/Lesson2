package ru.mirea.martynovmv.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.PlainTextNum);
    }
    public void btnNum (View View)
    {
        int k = editText.getText().length();
        String msgNum = "Мартынов М.В. №22 ГРУППА БСБО-01-20 Количество символов - " + k;
        Toast toast = Toast.makeText(getApplicationContext(), msgNum, Toast.LENGTH_SHORT);
        toast.show();
    }
}