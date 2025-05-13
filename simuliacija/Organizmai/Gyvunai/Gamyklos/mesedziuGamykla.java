package Organizmai.Gyvunai.Gamyklos;
import Organizmai.Gyvunai.Gyvunas;
import Organizmai.Gyvunai.MaistingumoTrukumas;
import Organizmai.Gyvunai.mesedis.Vilkas;
import Organizmai.Gyvunai.mesedis.Testas;


public class mesedziuGamykla implements Gamykla {

    public Gyvunas sukurkGyvuna() throws MaistingumoTrukumas {
        Testas address = new Testas("Vilniaus karalius");
        return new Vilkas(1,1, address);
    }

}
