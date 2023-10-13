public class Main {
    public static class ContaCorrente{
        int numeroConta;
        double saldoAtual;

        public int getNumeroConta() {
            return numeroConta;
        }
        public void setNumeroConta(int numeroConta) {
            this.numeroConta = numeroConta;
        }
        public double getSaldoAtual() {
            return saldoAtual;
        }
        public void setSaldoAtual(double saldoAtual) {
            this.saldoAtual = saldoAtual;
        }

        // @Override
        public String toString(){
            return "Conta Corrente\n Numero da Conta = " + numeroConta + " \n Saldo Atual = " + saldoAtual;
        }
    }
    public static void main(String[] args){
        ContaCorrente conta1 = new ContaCorrente();
        conta1.setNumeroConta(1234);
        conta1.setSaldoAtual(100.00);

        ContaCorrente conta2 = new ContaCorrente();
        conta2.setNumeroConta(8765);
        conta2.setSaldoAtual(-98.00);

        ContaCorrente conta3 = new ContaCorrente();
        conta3.setNumeroConta(3342);
        conta3.setSaldoAtual(3445.80);

        System.out.println(conta1);
    }
}
