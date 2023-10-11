import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        List<Passeio> listaPasseio = new ArrayList<>();
        List<Carga> listaCarga = new ArrayList<>();

        Passeio passeio0 = new Passeio(5);
        passeio0.setMarca("Nissan");
        passeio0.setModelo("March");
        passeio0.setPlaca("ABC 1234");
        passeio0.setVelocMax(200);
        passeio0.getMotor().setPotencia(70);
        passeio0.getMotor().setQtdPist(3);
        listaPasseio.add(passeio0);

        Passeio passeio1 = new Passeio(5);
        passeio1.setMarca("Hyundai");
        passeio1.setModelo("HB20");
        passeio1.setPlaca("ABC 1234");
        passeio1.setVelocMax(170);
        passeio1.getMotor().setPotencia(70);
        passeio1.getMotor().setQtdPist(3);
        listaPasseio.add(passeio1);

        Passeio passeio2 = new Passeio(5);
        passeio2.setMarca("Chevrolet");
        passeio2.setModelo("Onix");
        passeio2.setPlaca("ABC 1234");
        passeio2.setVelocMax(190);
        passeio2.getMotor().setPotencia(70);
        passeio2.getMotor().setQtdPist(3);
        listaPasseio.add(passeio2);

        Passeio passeio3 = new Passeio(5);
        passeio3.setMarca("Volkswagen");
        passeio3.setModelo("T-Cross");
        passeio3.setPlaca("ABC 1234");
        passeio3.setVelocMax(210);
        passeio3.getMotor().setPotencia(70);
        passeio3.getMotor().setQtdPist(3);
        listaPasseio.add(passeio3);

        Passeio passeio4 = new Passeio(5);
        passeio4.setMarca("Fiat");
        passeio4.setModelo("Mobi");
        passeio4.setPlaca("ABC 1234");
        passeio4.setVelocMax(150);
        passeio4.getMotor().setPotencia(70);
        passeio4.getMotor().setQtdPist(3);

        Carga carga0 = new Carga(505, 1084);
        carga0.setMarca("Fiat");
        carga0.setModelo("Strada");
        carga0.setPlaca("BBB 3333");
        carga0.setVelocMax(164);
        carga0.getMotor().setPotencia(88);
        carga0.getMotor().setQtdPist(7);
        listaCarga.add(carga0);

        Carga carga1 = new Carga(505, 1084);
        carga1.setMarca("Toyota");
        carga1.setModelo("Hylux");
        carga1.setPlaca("BBB 3333");
        carga1.setVelocMax(164);
        carga1.getMotor().setPotencia(88);
        carga1.getMotor().setQtdPist(7);
        listaCarga.add(carga1);

        Carga carga2 = new Carga(505, 1084);
        carga2.setMarca("Ford");
        carga2.setModelo("Ranger");
        carga2.setPlaca("BBB 3333");
        carga2.setVelocMax(164);
        carga2.getMotor().setPotencia(88);
        carga2.getMotor().setQtdPist(7);
        listaCarga.add(carga2);

        Carga carga3 = new Carga(505, 1084);
        carga3.setMarca("Fiat");
        carga3.setModelo("Fiorino");
        carga3.setPlaca("BBB 3333");
        carga3.setVelocMax(164);
        carga3.getMotor().setPotencia(88);
        carga3.getMotor().setQtdPist(7);
        listaCarga.add(carga3);

        Carga carga4 = new Carga(505, 1084);
        carga4.setMarca("Ford");
        carga4.setModelo("Pampa");
        carga4.setPlaca("BBB 3333");
        carga4.setVelocMax(164);
        carga4.getMotor().setPotencia(88);
        carga4.getMotor().setQtdPist(7);
        listaCarga.add(carga4);

        for (Passeio veiculoPasseio : listaPasseio) {
            System.out.println("============= VEICULO PASSEIO =============");
            System.out.println("Marca := " + veiculoPasseio.getMarca());
            System.out.println("Modelo := " + veiculoPasseio.getModelo());
            System.out.println("Placa := " + veiculoPasseio.getPlaca());
            System.out.printf("Velocidade maxima := %.3f %n", veiculoPasseio.calcVel(veiculoPasseio.getVelocMax()));
            System.out.println("Quantidade Passageiros := " + veiculoPasseio.getQtdPassageiros());
            System.out.println("Potencia Motor := " + veiculoPasseio.getMotor().getPotencia());
            System.out.println("Qtde Pistoes Motor := " + veiculoPasseio.getMotor().getQtdPist());
            System.out.println("===========================================\n");
        }

        for (Carga veiculoCarga : listaCarga) {
            System.out.println("============== VEICULO CARGA ==============");
            System.out.println("Marca := " + veiculoCarga.getMarca());
            System.out.println("Modelo := " + veiculoCarga.getModelo());
            System.out.println("Placa := " + veiculoCarga.getPlaca());
            System.out.printf("Velocidade maxima := %.3f %n", veiculoCarga.calcVel(veiculoCarga.getVelocMax()));
            System.out.println("Tara := " + veiculoCarga.getTara());
            System.out.println("Potencia Motor := " + veiculoCarga.getMotor().getPotencia());
            System.out.println("Qtde Pistoes Motor := " + veiculoCarga.getMotor().getQtdPist());
            System.out.println("===========================================\n");
        }
    }
}
