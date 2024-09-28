# Web Crawler BFS


Este projeto implementa um web crawler básico em Java que utiliza o algoritmo de **Busca em Largura (BFS)** para descobrir e listar websites a partir de um URL raiz. O crawler lê o conteúdo da página fornecida e procura por URLs dentro da página, adicionando novos websites encontrados à lista e continuando a busca de forma iterativa.

## Requisitos

- Java 8 ou superior.

## Instalação e Execução

1. Clone o repositório:

```bash
git clone https://github.com/RobsonTrasel/webcrawler.git
cd webcrawler
```

2. Compile o código:

Use o seguinte comando no terminal para compilar os arquivos .java:

```bash
javac -d bin src/com/robsonf/*.java
```
3. Execute o programa:

Após a compilação, execute o seguinte comando:

```bash
java -cp bin com.robsonf.App
```

O crawler começará a buscar e listar websites a partir do URL definido na classe **App**. O exemplo atual utiliza **https://www.bbc.com** como URL raiz.

## Como funciona

- O programa utiliza o algoritmo BFS para explorar websites a partir de uma URL fornecida.
- Ele usa expressões regulares para identificar URLs válidos dentro do HTML da página e os adiciona a uma fila de busca.
- O processo continua até que a fila de URLs a serem visitados esteja vazia.

## Estrutura de Código

- **BFS.java:** Implementa a lógica principal do algoritmo de busca. Ele mantém uma fila (queue) de URLs a serem visitados e uma lista (discoveredWebsiteList) de websites já descobertos.
  - **discoverWeb(String root):** Função principal que inicia a busca em largura a partir da URL raiz.
  - **readUrl(String v):** Função auxiliar que lê o conteúdo HTML de uma URL.
- **App.java:** Ponto de entrada do programa. Cria uma instância de BFS e chama o método discoverWeb() com o URL de início.

## Exemplo de Saída

Quando o programa é executado, ele exibe no console os websites encontrados, como:

```
Website found: https://www.bbc.com
Website found: https://www.example.com
```

## Observações

- Este é um exemplo básico e não lida com grandes volumes de URLs, problemas de timeout ou restrições de robots.txt.
- Para fins didáticos, o crawler só captura URLs no formato https://.

