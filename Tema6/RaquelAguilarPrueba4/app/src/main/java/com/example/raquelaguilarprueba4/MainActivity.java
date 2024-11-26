package com.example.raquelaguilarprueba4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner lista;
    private WebView webView;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Encapsulador> datos = new ArrayList<Encapsulador>();

        webView = findViewById(R.id.webView);
        lista = findViewById(R.id.lista);

        // Añadir datos al ArrayList
        datos.add(new Encapsulador(R.drawable.caravaggio, "CARAVAGGIO", "Pintor italiano entre los años de 1593 y 1610. Es considerado como el primer gran exponente de la pintura del Barroco.", "http://es.wikipedia.org/wiki/Caravaggio"));
        datos.add(new Encapsulador(R.drawable.rafael, "RAFAEL SANZIO", "Pintor y arquitecto italiano del Renacimiento, realizó importantes aportes en la arquitectura y, como inspector de antigüedades.", "http://es.wikipedia.org/wiki/Rafael_Sanzio"));
        datos.add(new Encapsulador(R.drawable.velazquez, "VELAZQUEZ", "Pintor Barroco nacido en Sevilla en 1599, es considerado uno de los máximos exponentes de la pintura española y maestro de la pintura universal.", "http://es.wikipedia.org/wiki/Diego_Vel%C3%A1zquez"));
        datos.add(new Encapsulador(R.drawable.miguelangel, "MIGUEL ANGEL", "Arquitecto, escultor y pintor italiano renacentista, considerado uno de los más grandes artistas de la historia.", "http://es.wikipedia.org/wiki/Miguel_%C3%81ngel"));
        datos.add(new Encapsulador(R.drawable.rembrant, "REMBRANDT", "Pintor y grabador holandés. La historia del arte le considera uno de los mayores maestros barrocos de la pintura y el grabado.", "http://es.wikipedia.org/wiki/Rembrandt"));
        datos.add(new Encapsulador(R.drawable.boticelli, "BOTICELLI", "Apodado Sandro Botticelli, fue un pintor cuatrocentista italiano.su obra se ha considerado representativa de la pintura del primer Renacimiento.", "http://es.wikipedia.org/wiki/Sandro_Botticelli"));
        datos.add(new Encapsulador(R.drawable.leonardo, "LEONARDO DA VINCI", "Notable polímata del Renacimiento italiano (a la vez anatomista, arquitecto, artista, botánico, científico, escritor, escultor, filósofo,ingeniero...)", "http://es.wikipedia.org/wiki/Leonardo_da_Vinci"));
        datos.add(new Encapsulador(R.drawable.renoir, "RENOIR", "Pintor francés impresionista, interesado por la pintura de cuerpos femeninos en paisajes, inspirados a menudo en pinturas clásicas renacentistas y barrocas.", "http://es.wikipedia.org/wiki/Pierre-Auguste_Renoir"));

        // Configurar WebView
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Habilitar JavaScript

        // Configurar para que las URLs se abran en el WebView y no en el navegador
        webView.setWebViewClient(new WebViewClient());

        // Configurar el adaptador para el Spinner
        lista.setAdapter(new Adaptador(datos, R.layout.entrada, this) {
            @Override
            public void onEntrada(Object entrada, View view) {
                if (entrada != null && view != null) {
                    TextView texto_superior_entrada = view.findViewById(R.id.texto_titulo);
                    TextView texto_inferior_entrada = view.findViewById(R.id.texto_datos);
                    ImageView imagen_entrada = view.findViewById(R.id.imagen);

                    if (texto_superior_entrada != null && texto_inferior_entrada != null && imagen_entrada != null) {
                        // Setear datos en las vistas
                        texto_superior_entrada.setText(((Encapsulador) entrada).getTitulo());
                        texto_inferior_entrada.setText(((Encapsulador) entrada).getContenido());
                        imagen_entrada.setImageResource(((Encapsulador) entrada).getImagen());

                    }
                }
            }
        });

        // Configurar el evento de selección en el Spinner
        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Obtener el objeto seleccionado
                Encapsulador elegido = (Encapsulador) parent.getItemAtPosition(position);
                String urlElegido = String.valueOf(elegido.getUrl());

                // Validar URL
                if (!urlElegido.isEmpty()) {
                    // Agregar "https://" si falta
                    if (!urlElegido.startsWith("http://") && !urlElegido.startsWith("https://")) {
                        urlElegido = "https://" + urlElegido;
                    }
                    // Cargar URL en el WebView
                    webView.loadUrl(urlElegido);
                } else {
                    // Mostrar error si el campo está vacío
                    Toast.makeText(MainActivity.this, "Please enter a URL", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Si no hay selección, no hacer nada
            }
        });



    }
    @Override
    public void onBackPressed() {
        // Permitir navegación hacia atrás en el WebView
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    // Clase POJO de Encapsulador
    public class Encapsulador {
        private int imagen;
        private String titulo, contenido;
        private String dato1;

        public Encapsulador(int imagen, String titulo, String contenido, String dato1) {
            this.imagen = imagen;
            this.titulo = titulo;
            this.contenido = contenido;
            this.dato1 = dato1;
        }

        public int getImagen() {
            return imagen;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getContenido() {
            return contenido;
        }

        public String getUrl() {
            return dato1;
        }
    }
}