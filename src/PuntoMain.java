import java.util.Scanner;

public class PuntoMain {
    public static void main(String[] args) {

        Punto primero = new Punto(6, 5);
        Punto segundo = new Punto(3, 1);
        System.out.println("distancia(0,0)= " + primero.distancia1());
        System.out.println("distancia(segundo)= " + primero.distancia1(segundo));
        System.out.println("distancia(2,2)= " + primero.distancia2(2, 2));
        Punto punto = new Punto();
        System.out.println("distancia()= " + punto.distancia1());

//        Punto primero = new Punto(6, 5);
//        Punto segundo = new Punto(3, 1);
//        System.out.println("distancia(0,0)= " + primero.distancia1());
//        System.out.println("distancia(segundo)= " + primero.distancia1());
//        System.out.println("distancia(2,2)= " + primero.distancia2(2, 2));
//        Punto punto = new Punto();
//        System.out.println("distancia()= " + punto.distancia3(primero.getX(), segundo.getY()));
    }
}
