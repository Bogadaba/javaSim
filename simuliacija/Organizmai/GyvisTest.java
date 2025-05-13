package Organizmai;
import Organizmai.Gyvunai.Gamyklos.Gamykla;
import Organizmai.Gyvunai.Gamyklos.gamyklosCentras;
import Organizmai.Gyvunai.Gamyklos.mesedziuGamykla;
import Organizmai.Gyvunai.Gamyklos.zoledziuGamykla;
import Organizmai.Gyvunai.Gyvunas;
import Organizmai.Gyvunai.MaistingumoTrukumas;

import Organizmai.Gyvunai.zoledis.Kiskis;
import Organizmai.Gyvunai.mesedis.Vilkas;

public class GyvisTest {
    public static void main(String[] args) throws MaistingumoTrukumas, CloneNotSupportedException {

        Gamykla ZoledziuGamykla = new zoledziuGamykla();
        gamyklosCentras KiskioCentras = new gamyklosCentras(ZoledziuGamykla);
        Gyvunas Kiskis = KiskioCentras.getAnimal();



        Gamykla MesedziuGamykla = new mesedziuGamykla();
        gamyklosCentras VilkoCentras = new gamyklosCentras(MesedziuGamykla);
        Gyvunas Vilkas = VilkoCentras.getAnimal();

        Vilkas clonedVilkas = (Vilkas) Vilkas.clone();


       // Kiskis.wander();
      //  Kiskis.move();
        Kiskis.eat(Kiskis);
        Vilkas.eat(Kiskis);

        Gyvunas clonedKiskis = (Kiskis) Kiskis.clone();
        clonedKiskis.eat(clonedKiskis);



       // System.out.println(Kiskis);
        // System.out.println(clonedKiskis);

        System.out.println(Vilkas);
        System.out.println(clonedVilkas);

        clonedVilkas.testasObj1.city = "Kauno karalius";

        System.out.println(Vilkas);
        System.out.println(clonedVilkas);
    }
}


      //  Gyvunas k = new Kiskis(0, 0);
      //  Gyvunas v = new Vilkas(0, 0);

       // jumpable z = new Vilkas(0, 0);
       // jumpable z1 = new Kiskis(0, 0);




      //  System.out.println(k.toString());
      //  System.out.println(v.toString());


     //   k.move();
      //  v.move();
     //  v.eat(k);
        
/*
       try {
            k.move(1, 1);
       } catch (MaistingumoTrukumas e) {
          System.out.println("gyvunas mires: " + e.getMessage());
          System.out.println("Maistingumo lygis: " + e.nutriLygis());
       }
*/
      //  k.jump();
      //  k.jump();

       // v.wander();
       // v.wander();
        
        
      //  System.out.println("After actions:");
      //  System.out.println(k);
       // System.out.println(v);

        


        // Static field example
      //-  System.out.println("Total animals Created: " + Gyvunai.Gyvunas.getAnimalCount());


