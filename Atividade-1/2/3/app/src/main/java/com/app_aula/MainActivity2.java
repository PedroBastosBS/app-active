package com.app_aula;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main2);
 Bundle extras = getIntent().getExtras();
 Produto produto = new Produto();
 produto = (Produto)
getIntent().getSerializableExtra("produto");
 TextView txtdadosproduto = findViewById(R.id.txtdadosproduto);
 txtdadosproduto.setText(produto.getNome());
 }
}