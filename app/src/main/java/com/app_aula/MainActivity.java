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
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Configurar os itens da lista
        String[] options = {
                "Acessar Configurações",
                "Enviar SMS",
                "Efetuar Chamada",
                "Abrir Mapas"
        };

        // Configurar o adaptador da lista
        setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, options));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        switch (position) {
            case 0:
                // Abrir configurações
                startActivity(new Intent(android.provider.Settings.ACTION_SETTINGS));
                break;

            case 1:
                // Enviar SMS
                Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                smsIntent.setData(Uri.parse("smsto:123456789")); // Número de exemplo
                smsIntent.putExtra("sms_body", "Mensagem de exemplo");
                startActivity(smsIntent);
                break;

            case 2:
                // Efetuar chamada
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:123456789")); // Número de exemplo
                startActivity(callIntent);
                break;

            case 3:
                // Abrir mapas
                Intent mapIntent = new Intent(Intent.ACTION_VIEW);
                mapIntent.setData(Uri.parse("geo:0,0?q=-23.55052,-46.633308")); // Coordenadas de São Paulo
                startActivity(mapIntent);
                break;
        }
    }
}
