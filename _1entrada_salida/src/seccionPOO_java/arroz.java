package seccionPOO_java;
//todo sobre encapsulacion
public class arroz {
    //atributos
    String marca;
    double peso;
    //metodo geters y seters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }
//obtenemos el peso
    public void setPeso(double peso) {
        this.peso = peso;
    }
    //encapsulamiento
    public double getpesokg(){
        return peso / 1000;
    }
}
