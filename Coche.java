package coche;

public class Coche {

    int numPuertas = 0;
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void incrPuertas(){
        numPuertas = numPuertas + 1;
    }
    public void mostrarPuertas(){
        System.out.println("La candidad de puertas es: " + numPuertas);
    }
}
