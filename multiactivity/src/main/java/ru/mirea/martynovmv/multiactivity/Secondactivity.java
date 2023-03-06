package ru.mirea.martynovmv.multiactivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Secondactivity extends AppCompatActivity {
    private TextView tvOut;
    private String tag = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        tvOut = findViewById(R.id.textView1);
        String text = (String) getIntent().getSerializableExtra("key");
        tvOut.setText(text);
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