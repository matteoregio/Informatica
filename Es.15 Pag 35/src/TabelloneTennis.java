public class TabelloneTennis {
    private String g1;
    private String g2;
    private int s;
    private int s1 = 0;
    private int s2 = 0;
    private int ga1 = 0;
    private int ga2 = 0;
    private int p1;
    private int p2;
    private int t;

    public TabelloneTennis(String g1, String g2, int s, int t){
        this.g1 = g1;
        this.g2 = g2;
        if(s != 1 && s != 2){
            s = 1;
        }if(t != 3 && t != 5){
            t = 3;
        }
        this.s = s;
        this.t = t;
    }

    public boolean aggiungiPunto(int g){
        if(g == 1) {
            if (this.p1 == 0 || this.p1 == 15) {
                this.p1 += 15;
            } else
                this.p1 += 10;
            if (this.p1 == 50) {
                this.ga1++;
            }
        }
        if(g == 2){
            if(this.p2 == 0 || this.p2 == 15){
                this.p2 += 15;
            }else
                this.p2 += 10;
            if(this.p2 == 50){
                this.ga2++;
            }
        }

        if(this.ga1 == 6){
            this.s1++;
        }
        if(this.ga2 == 6){
            this.s2++;
        }

        if(g != 1 && g != 2){
            return false;
        }else return true;
    }

    public String vittoria(){
        if(this.t == 3){
            if(s1 == 3){
                return g1;
            }else if (s2 == 3){
                return g2;
            }
        }

    }


}
