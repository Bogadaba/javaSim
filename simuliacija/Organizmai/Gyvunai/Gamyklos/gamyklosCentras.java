package Organizmai.Gyvunai.Gamyklos;

import Organizmai.Gyvunai.Gyvunas;
import Organizmai.Gyvunai.MaistingumoTrukumas;

public class gamyklosCentras {
    private Gyvunas pGyvunas;

    public gamyklosCentras(Gamykla factory) throws MaistingumoTrukumas {
        pGyvunas = factory.sukurkGyvuna();
    }

    public Gyvunas getAnimal() {
        return pGyvunas;
    }
}
