package taller3.televisores;

public class Control{
    private TV tv;

    public void turnOn(){ tv.turnOn(); }
    public void turnOff(){ tv.turnOff(); }

    public void canalUp(){ tv.canalUp(); }
    public void canalDown(){ tv.canalDown(); }

    public void volumenUp(){ tv.volumenUp(); }
    public void VolumenDown(){ tv.volumenDown(); }


    public TV getTv(){ return tv; }

    public void setTv(TV tv){ this.tv = tv; }
    public void setCanal(int canal){ tv.setCanal(canal); }

    public void enlazar(TV tv){
        this.tv = tv;
        this.tv.control = this;
    }
}