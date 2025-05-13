package Organizmai.Gyvunai;

public class MaistingumoTrukumas extends GyvunoSutrikimai {

    private int lygis;

    public MaistingumoTrukumas(String message, int lygis) {
        super(message);
        this.lygis = lygis;
    }

    public int nutriLygis() {
        return lygis;
    }
}
