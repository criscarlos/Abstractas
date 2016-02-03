package mx.edu.utng.abstractas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ACER on 22/01/2016.
 */
public class AreasActivity extends Activity {
    private Cuadrado cuadrado;
    private EditText edtLado;
    private Triangulo triangulo;
    private EditText edtbase;
    private EditText edtaltura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.areas_layout);
        cuadrado = new Cuadrado();
         edtLado= (EditText)findViewById(R.id.edt_lado);

        setContentView(R.layout.area_triangulo);
        triangulo=new Triangulo();
        edtbase=(EditText)findViewById(R.layout.area_triangulo);
        edtaltura=(EditText)findViewById(R.layout.area_triangulo);

    }
    public void calcular(){

        float lado = Float.parseFloat(edtLado.getText().toString());
        cuadrado.setLado(lado);
        Toast.makeText(this, "Area de cuadrado:" +cuadrado.calcularArea(),
                Toast.LENGTH_SHORT).show();
    }

    public void calculartriangulo(){
        float base=Float.parseFloat(edtbase.getText().toString());
        triangulo.setBase(base);
        float altura=Float.parseFloat(edtaltura.getText().toString());
        triangulo.setAltura(altura);
        Toast.makeText(this,"Area del triangulo:"+triangulo.calcularArea(),Toast.LENGTH_SHORT).show();

    }
}
