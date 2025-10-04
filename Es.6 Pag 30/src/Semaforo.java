public class Semaforo {
    private String luce;
    private boolean stato;

    public Semaforo(){
        this.stato = false;
    }

    public void accendi(){
        this.stato = true;
        this.luce = "VERDE";
    }

    public void spegni(){
        this.stato = false;
    }

    public void toggle(){
        if(!this.stato){
            this.stato = true;
        }else{
            this.stato = false;
        }
    }

    public void avanza(){
        if(!this.stato){
            return;
        }if(this.luce == "VERDE"){
            this.luce = "GIALLA";
        }else if(this.luce == "GIALLA"){
            this.luce = "ROSSO";
        }else if(this.luce == "ROSSO"){
            this.luce = "VERDE";
        }
    }

    public boolean isAcceso(){
        return this.stato;
    }

    public String getColore(){
        if(!this.stato){
            return "";
        }
        return this.luce;
    }

    @Override
    public String toString(){
        String s;
        if(!this.stato){
            s = "spento";
        }else{
            s = "acceso";
        }

        return "Il semaforo è " + s + " sul " + this.luce;
    }



}
