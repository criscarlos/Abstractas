package mx.edu.utng.abstractas;

/**
 * Created by ACER on 22/01/2016.
 */
public class Triangulo extends Figura {
    private float base;
    private float altura;

    public float calcularArea() {

        return (base*altura)/2;
    }

    public float getLado() {

        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {

        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
