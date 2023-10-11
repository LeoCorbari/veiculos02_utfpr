final public class Passeio extends Veiculo {

    private int qtdPassageiros;

    public Passeio() {
        this.qtdPassageiros = 0;
    }

    public Passeio(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
    float calcVel(float velocMax) {
        // TODO Auto-generated method stub
        return velocMax * 1000;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    final public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

}
