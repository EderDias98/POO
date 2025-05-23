public class Ponto {
    private double x,y;


    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distanciaDeDoisPontos(Ponto a){
        return Math.sqrt(Math.pow(a.getX() - this.getX(),2) + Math.pow(a.getY()- this.getY(),2));
    }
}
