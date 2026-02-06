import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ConsultaCep {

    public Endereco buscaEndereco(String cep){
        URI endereco = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
    }
}
