import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Ponto a = new Ponto(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
        Ponto b = new Ponto(Double.parseDouble(args[2]),Double.parseDouble(args[3]));
        Ponto c = new Ponto(Double.parseDouble(args[4]),Double.parseDouble(args[5]));

        Triangulo t = new Triangulo(a, b, c);

        System.out.println("O perimetro do triangulo é : " + t.PerimetroTriangulo());

    }
}
