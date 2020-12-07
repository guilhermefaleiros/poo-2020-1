import java.util.Calendar;

public class TestaLocacao {

    public static void main(String[] args) {
        Motorista m1 = new Motorista("Ze", "1");
        Motorista m2 = new Motorista("Jorge", "2");

        Carro c1 = new Carro("ZAZ 9999");
        Carro c2 = new Carro("ABC 1213");

        Locacao l1 = new Locacao();
        Locacao l2 = new Locacao();

        Calendar c = Calendar.getInstance();

        c.set(2004, 4, 1);
        l1.setDataInicial(c.getTime());
        c.set(2004, 4, 5);
        l1.setDataFinal(c.getTime());
        l1.setKmInicial(150);
        l1.setKmFinal(490);
        l1.setPrecoDia(32);
        l1.setPrecoKm(1.2F);
        l1.setCarro(c1);
        l1.setMotorista(m1);

        System.out.println(l1);

        c.set(2020, 4, 1);
        l2.setDataInicial(c.getTime());
        c.set(2020, 4, 5);
        l2.setDataFinal(c.getTime());
        l2.setKmInicial(121);
        l2.setKmFinal(321);
        l2.setPrecoDia(21);
        l2.setPrecoKm(1.2F);
        l2.setCarro(c2);
        l2.setMotorista(m2);

        System.out.println(m2);
    }
}