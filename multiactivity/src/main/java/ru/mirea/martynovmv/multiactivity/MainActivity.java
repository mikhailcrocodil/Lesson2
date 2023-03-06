package ru.mirea.martynovmv.multiactivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText PlainText;
    private Button ClickButton;
    public void btnClick(View view)
    {
        // выводим сообщение
        Intent secondIntent = new Intent(this, Secondactivity.class);
        secondIntent.putExtra("key", PlainText.getText().toString());
        startActivity(secondIntent);
    }
    private String tag = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PlainText = findViewById(R.id.PlainText2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "invoke onResume method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "invoke onPause method");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(tag, "invoke onSaveInstanceState method");
//        outState.putString("value",editText.getText().toString());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "invoke onStart method");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String text = savedInstanceState.getString("key");
        Log.d(tag, "Saved text:"+text);
//        editText.setText(text);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(tag, "invoke onPostCreate method");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(tag, "invoke onPostResume method");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(tag, "invoke onAttachedToWindow method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "invoke onStop method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "invoke onDestroy method");
    }


}