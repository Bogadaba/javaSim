package Organizmai.Gyvunai.Gamyklos;
import Organizmai.Gyvunai.Gyvunas;
import Organizmai.Gyvunai.MaistingumoTrukumas;
import Organizmai.Gyvunai.zoledis.Kiskis;

public class zoledziuGamykla implements Gamykla{

    public Gyvunas sukurkGyvuna() throws MaistingumoTrukumas {
        return new Kiskis(1,1);
    }
}
