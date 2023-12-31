final public class Carga extends Veiculo {

    private int cargaMax;
    private int tara;

    public Carga() {
        this.cargaMax = 0;
        this.tara = 0;
    }

    public Carga(int cargaMax, int tara) {
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    @Override
    float calcVel(float velocMax) {
        // TODO Auto-generated method stub
        return velocMax * 100000;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    final public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    final public void setTara(int tara) {
        this.tara = tara;
    }

}
