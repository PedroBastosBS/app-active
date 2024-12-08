package com.app_aula;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.main_image); 
        EditText editText = findViewById(R.id.edit_text);    
        ImageView iconView = findViewById(R.id.app_icon);    

        TextView titleView = findViewById(R.id.title_text);  
        TextView subtitleView = findViewById(R.id.subtitle_text); 
    }
}
