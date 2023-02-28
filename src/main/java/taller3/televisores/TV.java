package taller3.televisores;
public class TV{

    // atributos
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    Control control;
    private static int numTV;

    //constructor
    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        TV.numTV++;
    }


    //getters
    public Marca getMarca(){ return marca; }
    public Control getControl(){ return control; }
    public int getPrecio(){ return precio; }
    public int getVolumen(){ return volumen; }
    public int getCanal(){ return canal; }

    //setters
    public void setMarca(Marca marca){ this.marca = marca; }
    public void setControl(Control control){ this.control = control; }
    public void setPrecio(int precio){ this.precio = precio; }
    public void setVolumen(int volumen){ 
        if( 0<=volumen && volumen<=7 && this.estado == true){
            this.volumen = volumen; 
        }
    }
    public void setCanal(int canal){
        if (canal >=1 && canal <= 120 && this.estado == true){
            this.canal = canal;
        }
    }

    //otros
    public static int getNumTV(){ return numTV; }
    public static void setNumTV(int numTV){ TV.numTV = numTV; }

    public void turnOn(){ this.estado = true; }
    public void turnOff(){ this.estado = false; }

    public boolean getEstado(){ return estado; }

    public void canalUp(){
        if (this.estado == true && this.canal >=1 && this.canal < 120){
            this.canal+=1;
        }        
    }
    public void canalDown(){
        if (this.estado == true && this.canal >1 && this.canal <= 120){
            this.canal-=1;
        }        
    }

    public void volumenUp(){
        if (this.estado == true && this.volumen >=0 && this.volumen < 7){
            this.volumen+=1;
        }        
    }
    public void volumenDown(){
        if (this.estado == true && this.volumen >0 && this.volumen <= 7){
            this.volumen-=1;
        }       
    }

}