package com.daiwei.learnandroid3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  /** Called when the user taps the Send button */
  public void sendMessage(View view) {
    Intent intent = new Intent(this, DisplayMessageActivity.class);
    EditText editText = findViewById(R.id.editText);
    String message = editText.getText().toString();
    intent.putExtra(EXTRA_MESSAGE, message);
    startActivity(intent);
  }

  public void sendMessageService(View view) {
    Intent intent = new Intent(this, LogMessageService.class);
    EditText editText = findViewById(R.id.editText);
    String message = editText.getText().toString();
    intent.putExtra(EXTRA_MESSAGE, message);
    startService(intent);
  }

  public void sendMessageBindService(View view) {
    Intent intent = new Intent(this, BindServiceWithCpp.class);
    startService(intent);
  }
}
