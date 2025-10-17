public class TabellonePallavolo {
    private int pc = 0;
    private int po = 0;
    private String sc;
    private String so;
    private int setc = 0;
    private int seto = 0;
    private int s;

    public TabellonePallavolo(String sc, String so, int s){
        this.sc = sc;
        this.so = so;
        this.s = s;
    }

    public void puntoCasa(){
        this.s = 1;
        this.pc++;
        if (this.pc >= 24 && this.po >= 24) {
            int dif = this.pc - this.po;
            if(dif == 2){
                this.setc++;
            }
        }
    }

    public void puntoOspiti(){
        this.s = 2;
        this.po++;
        if (this.pc >= 24 && this.po >= 24) {
            int dif = this.po - this.pc;
            if(dif == 2){
                this.seto++;
            }
        }
    }

    @Override
    public String toString(){
        if(this.s == 1){
            return sc + " - " + so + "\n" + "   " + pc + "*     " + po + "\n" + "S   " + setc + "       " + seto;
        }else{
            return sc + " - " + so + "\n" + "   " + pc + "     " + po + "*" + "\n" + "S   " + setc + "       " + seto;

        }
    }


}
