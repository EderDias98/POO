public class Triangulo {
    private Ponto a,b,c;
    
    public Triangulo(Ponto a, Ponto b, Ponto c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double PerimetroTriangulo(){
        double d1 = a.distanciaDeDoisPontos(b);
        double d2 = b.distanciaDeDoisPontos(c);
        double d3 = c.distanciaDeDoisPontos(a);
        return d1+ d2+d3;
    } 
}
