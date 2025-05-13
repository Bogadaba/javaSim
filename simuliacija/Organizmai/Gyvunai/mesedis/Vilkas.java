package Organizmai.Gyvunai.mesedis;

import java.util.Random;
import Organizmai.Gyvunai.Gyvunas;
import Organizmai.Gyvunai.MaistingumoTrukumas;
import Organizmai.Gyvunai.zoledis.Kiskis;

public class Vilkas extends Gyvunas implements Cloneable {

    //private int strength = 1;
    //private int stun = 1;
    String name;
    public Testas testasObj1 ;
    protected Testas testasObj2;
    private int endurance = 100;
    private Random random = new Random();

    public Vilkas(double x, double y, Testas testasObj1) throws MaistingumoTrukumas {
        super(x,y);

        this.name = name;
        this.testasObj1 = testasObj1 ;
       // this.testasObj2 =  new testas(2);;
        super.move(1,1); //first step
        //wander(); //learning period
    }

    public void jump() {
        this.x += 4;
        this.y += 4;
    }
/*
    @Override
    public Vilkas clone() {
        return (Vilkas) super.clone();
    }
*/
@Override
public Object clone() {
    try {
    Vilkas klonas = (Vilkas) super.clone();
  //  klonas.testasObj1 = (Testas) this.testasObj1.clone();
    return klonas;
    }
    catch (AssertionError  exc) {
        // Should never happen
        throw new Error ("Oi" +exc.getMessage());}
}
    @Override
    public void eat(Gyvunas other) {
        if (other instanceof Kiskis) {
            Kiskis kiskis = (Kiskis) other;
            if (isNear(kiskis)) {
                this.endurance += (kiskis.nutrition);  // Vilkas gains endurance
                kiskis.nutrition = 0;
                kiskis.health = "Negyvas";
            }
        }
    }

    @Override
    public void move(double deltaX, double deltaY) {
        if (this.endurance == 0) {
            //  throw new MaistingumoTrukumas("Kiskis negali judėti - nėra maistingumo!", this.endurance);
        }
        if(endurance > 0){
            this.x += deltaX * 3;
            this.y += deltaY * 3;
            this.endurance -= 10;
        }  else{
            this.x += deltaX;
            this.y += deltaY;
        }
    }

    @Override
    public String toString() {
        return "Vilkas (" + this.x + ", " + this.y + ") | Sveikata: " + this.health + " | Ištvermė: " + this.endurance + " " + testasObj1.city ;
    }
}