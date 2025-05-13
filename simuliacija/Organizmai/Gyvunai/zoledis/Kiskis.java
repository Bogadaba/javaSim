package Organizmai.Gyvunai.zoledis;

import java.util.Random;
import Organizmai.Gyvunai.Gyvunas;
import Organizmai.Gyvunai.MaistingumoTrukumas;

public class Kiskis extends Gyvunas implements Cloneable{
    // Removed final since nutrition is meant to change
    public int nutrition ;

    protected Random random = new Random();

    public Kiskis(double x, double y) throws MaistingumoTrukumas{
        super(x, y);
        this.nutrition = 20;
        super.move(1, 1); // first step
    }


    public void jump() {
        this.x += 4;
        this.y += 4;
    }

        @Override
        public Object clone(){
           return super.clone();
        }


        /*
            @Override
    public Gyvunas clone() {
        try {
            return (Gyvunas) super.clone();
        }
        catch (CloneNotSupportedException e){
            throw new Error (e.getMessage());
        }
    }
        public void scared(Vilkas vilkas) {
            double distance = Math.sqrt(Math.pow(this.x - vilkas.x, 2) + Math.pow(this.y - vilkas.y, 2));

            if (distance > 10) {
                return;
            }

            // Closer wolf = Higher fear
            int fear = (int) Math.max(0, 10 - distance); // Max fear is 10, min is 0

            // Direction away from wolf
            double deltaX = this.x - vilkas.x;
            double deltaY = this.y - vilkas.y;

            // Fear-based speed
            double length = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
            if (length > 0) {
                deltaX = (deltaX / length) * fear;
                deltaY = (deltaY / length) * fear;
            }

            move(deltaX, deltaY);
        }
        */
    @Override
    public void eat(Gyvunas other) {
        this.nutrition += 1;
    }

    @Override
    public void move(double deltaX, double deltaY) throws MaistingumoTrukumas {
        // Scalable speed multiplier applied
        if (this.nutrition == 0) {
            throw new MaistingumoTrukumas("Kiskis negali judėti - nėra maistingumo!", this.nutrition);
        }
        this.x += deltaX * 2;
        this.y += deltaY * 2;
    }

/*
    public void tryMove(double deltaX, double deltaY) throws MaistingumoTrukumas {
        if (this.nutrition == 0) {
            throw new MaistingumoTrukumas("Kiskis negali judėti - nėra maistingumo!", this.nutrition);
        }

        move(deltaX * 2, deltaY * 2); // Call final method in base class
    }
*/
    @Override
    public String toString() {
        // Referencing superclass variables `health` and `hunger`
        return "Kiskis (" + this.x + ", " + this.y + ") | Sveikata: " + this.health + " | nutrinional value: " + this.nutrition;
    }
}