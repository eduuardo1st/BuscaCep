public class Principal {
    public static void main(String[] args) {

        ConsultaCep consultaCep = new ConsultaCep();
        Endereco endereco = consultaCep.buscaEndereco("01001");
        System.out.println(endereco);
    }
}
