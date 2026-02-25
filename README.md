# BuscaCep

## Descrição do Projeto

O projeto **BuscaCep** é uma aplicação Java simples desenvolvida para consultar informações de endereços a partir de um CEP (Código de Endereçamento Postal) utilizando a API pública [ViaCEP](https://viacep.com.br/). Após a consulta, os dados do endereço são exibidos no console e salvos em um arquivo JSON localmente.

## Funcionalidades

*   **Consulta de CEP**: Permite ao usuário inserir um CEP para buscar informações de endereço.
*   **Integração com ViaCEP**: Utiliza a API ViaCEP para obter dados de logradouro, complemento, bairro, localidade e UF.
*   **Exibição de Dados**: Apresenta os dados do endereço consultado diretamente no console.
*   **Geração de Arquivo JSON**: Salva os detalhes do endereço em um arquivo JSON formatado, nomeado com o próprio CEP consultado.
*   **Tratamento de Erros**: Inclui tratamento básico para CEPs inválidos ou problemas de conexão com a API.

## Tecnologias Utilizadas

*   **Java 24**: Linguagem de programação.
*   **Maven**: Ferramenta de automação de build e gerenciamento de dependências.
*   **Gson**: Biblioteca Java para serialização/desserialização de objetos Java para/de JSON.
*   **HttpClient (Java 11+)**: Para realizar requisições HTTP à API ViaCEP.

## Pré-requisitos

Para executar este projeto, você precisará ter instalado:

*   **Java Development Kit (JDK)** versão 24 ou superior.
*   **Apache Maven**.

## Como Usar

Siga os passos abaixo para clonar o repositório, compilar e executar a aplicação:

1.  **Clone o repositório:**

    ```bash
    git clone https://github.com/eduuardo1st/BuscaCep.git
    cd BuscaCep
    ```

2.  **Compile o projeto com Maven:**

    ```bash
    mvn clean install
    ```

3.  **Execute a aplicação:**

    ```bash
    mvn exec:java -Dexec.mainClass="Principal"
    ```

    A aplicação solicitará que você digite um CEP. Após inserir, ela exibirá o endereço e criará um arquivo JSON no diretório raiz do projeto (ex: `01001-000.json`).

## Estrutura do Projeto

```
BuscaCep/
├── pom.xml
├── src/
│   └── main/
│       └── java/
│           ├── ConsultaCep.java
│           ├── Endereco.java
│           ├── GeradorDeArquivo.java
│           └── Principal.java
└── 01001-000.json (exemplo de arquivo gerado)
```

*   `pom.xml`: Arquivo de configuração do Maven, define as dependências e o build do projeto.
*   `Principal.java`: Ponto de entrada da aplicação, lida com a interação do usuário e coordena as chamadas para `ConsultaCep` e `GeradorDeArquivo`.
*   `ConsultaCep.java`: Responsável por fazer a requisição HTTP à API ViaCEP e converter a resposta JSON em um objeto `Endereco`.
*   `Endereco.java`: Um `record` Java que representa a estrutura dos dados de endereço retornados pela API ViaCEP.
*   `GeradorDeArquivo.java`: Contém a lógica para salvar o objeto `Endereco` em um arquivo JSON formatado.

## API Utilizada

Este projeto utiliza a API pública e gratuita [ViaCEP](https://viacep.com.br/) para consulta de endereços. A ViaCEP oferece um serviço simples e eficiente para obter dados de CEPs brasileiros.

## Exemplo de Uso

Ao executar a aplicação, você verá uma saída similar a esta no console:

```
Digite um CEP para consulta:
01001-000
Endereco[cep=01001-000, logradouro=Praça da Sé, complemento=lado ímpar, localidade=São Paulo, uf=SP]
```

E um arquivo `01001-000.json` será criado com o seguinte conteúdo:

```json
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "localidade": "São Paulo",
  "uf": "SP"
}
```

## Contribuição

Contribuições são bem-vindas! Se você tiver sugestões de melhoria, novas funcionalidades ou encontrar algum bug, sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes. (Assumindo licença MIT, caso contrário, ajustar.)

---

**Desenvolvido por:** Eduardo Gonçalves de Mesquita
