## Solução do Desafio Controle de Fluxo - Java

**Introdução**

Este repositório apresenta a solução completa para o Desafio Controle de Fluxo da trilha Java Básico da [Trilha Java Básico](https://www.dio.me/) Digital Innovation One (DIO). A solução implementa as classes `Contador.java` e `ParametrosInvalidosException.java` com as funcionalidades descritas no desafio.

**Criação do Projeto**

1. Crie um diretório para o projeto, por exemplo, `DesafioControleFluxo`.
2. Dentro do diretório, crie dois arquivos Java:
    * `Contador.java`
    * `ParametrosInvalidosException.java`

**Explicação do Código**

* **Classe `Contador`:**
    * O método `main` recebe os parâmetros do usuário e chama o método `contar`.
    * O método `lerInteiro` valida a entrada do usuário, garantindo que seja um número inteiro.
    * O método `contar` valida se o primeiro parâmetro é maior que o segundo, lançando a exceção `ParametrosInvalidosException` caso isso ocorra.
    * Se a validação for bem-sucedida, o método realiza a contagem e imprime os números de 1 até a diferença entre os parâmetros.
* **Classe `ParametrosInvalidosException`:**
    * Esta classe estende a classe `Exception` para representar a exceção personalizada `ParametrosInvalidosException`.

**Execução do Desafio**

1. Compile os arquivos Java utilizando o comando `javac Contador.java ParametrosInvalidosException.java`.
2. Execute o programa utilizando o comando `java Contador`.
3. Digite dois números inteiros, sendo o segundo maior que o primeiro.
4. O programa imprimirá os números de 1 até a diferença entre os parâmetros informados.

**Aprimoramentos Possíveis**

* Implementar validações adicionais para garantir que os valores dos parâmetros estejam dentro de um intervalo permitido.
* Criar uma interface gráfica para facilitar a interação do usuário.
* Implementar funcionalidades para registrar as operações realizadas em um arquivo de log.

**Conclusão**

Esta solução completa para o Desafio Controle de Fluxo demonstra a aplicação dos conceitos de controle de fluxo, tratamento de exceções e criação de classes em Java.

