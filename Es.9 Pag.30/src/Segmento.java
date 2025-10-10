public class Segmento {
    private Punto a;
    private Punto b;

    public Segmento(Punto a, Punto b){
        this.a = a;
        this.b = b;
    }

    public Segmento(Segmento s){
        this.a = s.a;
        this.b = s.b;
    }

    public boolean interseca(Segmento s){
        double d = (this.b.getX() - this.a.getX())*(s.b.getY() - s.a.getY()) - (this.b.getY() - this.a.getY())*(s.b.getX() - s.a.getX());

        if(d == 0){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Segmento)){
            return false;
        }
        Segmento s = (Segmento) o;
        if(this.a.getX() == this.b.getY() && this.a.getY() == this.b.getY());
    }

}
