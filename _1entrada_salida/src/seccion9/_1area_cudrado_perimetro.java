package seccion9;

/*
                                                   EJERCICIO 1
Construir un programa que calcule el area y elperimetro de un cuadrilatero
dada la longitud de sus dos lados los valores de la longitud deberan introducirse por linea de ordenes
si es un cuadrado solo se proporcionara la la longitud de uno de los lados al constructor
ingresa el lado 1 para calcular area y perimetro

 */
public class _1area_cudrado_perimetro {

    //atributos
    float area;
    float perimetro;
    private float lado1;
    private float lado2;

    //metodo constructor
    public _1area_cudrado_perimetro(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public _1area_cudrado_perimetro(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

//metodo geters y seters se hacen las operaciones de los lados
public float getPerimetro() {
    float perimetro = 2 * (lado1 + lado2);
    return perimetro;
}

    public float getArea() {
        float area = (lado1 * lado2);
        return area;
    }
}
