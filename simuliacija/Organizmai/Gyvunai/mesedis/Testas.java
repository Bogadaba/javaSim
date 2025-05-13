package Organizmai.Gyvunai.mesedis;

public class Testas implements Cloneable{

    public String city;
    public Testas(String city) {
        this.city = city;
    }

    @Override
    public  Object clone()
            throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "Testas x=" + this.city ;
    }
}


