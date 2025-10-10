public class Punto {
    private double x;
    private double y;

    public Punto(){

    }

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punto(Punto p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanza(Punto p){
        double d = Math.sqrt(Math.pow((p.x - this.x), 2) + (Math.pow((p.y - this.y), 2)));
        return d;
    }

    public Punto puntoMedio(Punto p){
        double x1 = (this.x + p.x)/2;
        double y1 = (this.y + p.y)/2;
        Punto m = new Punto(x1, y1);

        return m;
    }

    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
}
