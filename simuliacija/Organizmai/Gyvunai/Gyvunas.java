package Organizmai.Gyvunai;

import java.util.Random;

//import Organizmai.Gyvunai.mesedis.Vilkas;
public abstract class Gyvunas implements jumpable,Cloneable {

    protected double x, y;
    protected double speed;
    public String health = "Gyvas";
    private Random random = new Random();
    public static int animalCount = 0;

    public Gyvunas() {
        this(0.0, 0.0);
    }

    //  constructor
    public Gyvunas(double x, double y) {
        this.x = x;
        this.y = y;
        this.speed = 2.0; // final
        this.health = "Gyvas";
     
        animalCount++; 
    }

    // (overloaded)
    public final void move() throws MaistingumoTrukumas{
        move(new Random().nextInt() * 4 - 2, new Random().nextInt() * 4 - 2);
    }

    public void move(double deltaX, double deltaY) throws MaistingumoTrukumas {
            this.x += deltaX * speed;
            this.y += deltaY * speed;
    }


    @Override
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e){
            throw new Error (e.getMessage());
        }
    }
   // public void tryMove(double deltaX, double deltaY) throws MaistingumoTrukumas {
   //     move(deltaX, deltaY); // use final base method
   // }
    public void wander() {
       double deltaX = random.nextInt(7) - 4; // Moves between -2 and +2
       double deltaY = random.nextInt(7) - 4;
     //   try {
           // move(deltaX, deltaY);
       // } catch (MaistingumoTrukumas e) {
            // Optional: handle it gracefully
           // System.out.println("Wandering failed due to lack of nutrients: " + e.getMessage());
      //  }
    }

    //public void  jump(){};



        public void eat(Gyvunas other) {
            if(Math.abs(this.x - other.x) <= 1 && Math.abs(this.y - other.y) <= 1){
                other.health = "Negyvas";
            }
        }

        public boolean isNear(Gyvunas other) {
            return Math.abs(this.x - other.x) <= 1 && Math.abs(this.y - other.y) <= 1;
            }
        
      //  public void eat(){
         //   if( isNear(Gyvunas other) == true)

      public String toString(){
            return "Gyvunas (" + this.x + ", " + this.y + ") Sveikata: " + this.health;
      };


    // Static method
    public static int getAnimalCount() {
        return animalCount;
    }

    public double getX() { return x; }
    public double getY() { return y; }


}

