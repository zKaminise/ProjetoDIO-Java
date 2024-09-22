public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    void dadosInseridos(){
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia
        + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque");
    }

}
