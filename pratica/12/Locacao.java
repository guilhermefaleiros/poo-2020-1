import java.util.Date;

public class Locacao {
    private Date dataInicial;
    private Date dataFinal;
    private int kmInicial;
    private int kmFinal;
    private float precoKm;
    private float precoDia;
    private Motorista motorista;
    private Carro carro;

    public double obtemCusto() {
        long nDias = dataFinal.getTime() - dataInicial.getTime();
        nDias = nDias / (1000 * 60 * 60 * 24);

        return (kmFinal - kmInicial) * precoKm + nDias * precoDia;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public float getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(float precoDia) {
        this.precoDia = precoDia;
    }

    public float getPrecoKm() {
        return precoKm;
    }

    public void setPrecoKm(float precoKm) {
        this.precoKm = precoKm;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String toString() {
        String saida = "Motorista: ";
        saida += getMotorista().toString() + "\n";
        saida += "Carro: " + getCarro().toString() + "\n";
        saida += "Quilometragem inicial: " + getKmInicial();
        saida += " final: " + getKmFinal() + "\n";
        saida += "Data locacao: " + getDataInicial().toString();
        saida += " entrega: " + getDataFinal().toString() + "\n";
        saida += "R$/km: " + getPrecoKm() + " R$/dia: " + getPrecoDia();
        saida += "\nCusto da locacao: " + obtemCusto();

        return saida;
    }
}