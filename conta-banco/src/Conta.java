
public class Conta {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void getToString() {
        String outputTemp = "Olá " + getNomeCliente()
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + getAgencia()
                + ", conta " + getNumero()
                + " e seu saldo " + getSaldo()
                + " já está disponível para saque";
        System.out.println(outputTemp);
    }

}
