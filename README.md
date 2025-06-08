# Atividade do RA3 - HASHING
# Resolução de Problemas Estruturados em Computação
## Escopo do projeto:
Trabalho envolvendo tabelas hash e seus diferentes algoritmos de hashing.
São criadas tabelas hash com 3 tamanhos (1.000, 10.000 ou 100.000 elementos) para 3 diferentes algoritmos de hashing diferentes, resultando em 9 tabelas diferentes. Todas usando o mesmo conjunto de dados criado por meio de seed.

Os algoritmos escolhidos para o hashing das tabelas foram: Multiplicação, Resto de Divisão e Dobramento.
O código se encontra na pasta src. Contém classes para cada HashMap diferente, uma classe Registro (auxiliar) e a classe Main (main, testes).

## Análise:
Para tempo de inserção o algoritmo de hashing por Dobramento fora o mais rápido em todos os cenários.

As quantidades de colisões dos algoritmos de hashing por Multiplicação e Resto de Divisão foram similar para todos os cenários. Já o algoritmo de Dobramento, ao aumentar o volume, ocorreram muito mais colisões que os outros, chegando a ter 355% mais colisões que o algoritmo de Resto de Divisão no caso de 100.000 elementos.

Nas buscas o algoritmo de Dobramento começa sendo o mais rápido, mas acaba escalando horrívelmente ao aumentar o volume de dados. Nos cenários com grandes volumes de dados o algoritmo mais veloz foi o de Resto de Divisão. Para todos os cenários o algoritmo de Dobramento teve maior méda de comparações.


Final:
O algoritmo de Multiplicação é o mais mediano entre os algoritmos testados. Não houveram resultados notáveis.
O algoritmo de Resto de Divisão é o melhor algoritmo para busca com grandes volumes de dados. Ele também tem um bom tempo de inserção para cenários de menores volumes de dados, mas não é muito mais notável além disso.
O algoritmo de Dobramento é muito rápido com as inserções, mas não escala muito bem para colisões e busca.

Conclusão:
Entre os algoritmos de hashing testados, o algoritmo de Resto de Divisão teve o maior desempenho geral. 

### Referência para a análise:
_Dados oriundos dos testes realizados no main._

#### Tabela de resultados para 1.000 elementos:

Tipo de Hashing | Tempo de inserção | Colisões | Tempo médio de busca | Média de comparações na busca
:--- | :---: | :---: | :---: | :---: 
Multiplicação | 27 ms | 205 | 3920 ns | 1
Resto de Divisão | 2 ms | 204 | 3820 ns | 1
Dobramento | 1 ms | 241 | 2160 ns | 26

#### Tabela de resultados para 10.000 elementos:

Tipo de Hashing | Tempo de inserção | Colisões | Tempo médio de busca | Média de comparações na busca
:--- | :---: | :---: | :---: | :---:
Multiplicação | 24 ms | 2123 | 740 ns | 1  
Resto de Divisão | 11 ms | 2101 | 600 ns | 1  
Dobramento | 8 ms | 7786 | 1480 ns | 4  

#### Tabela de resultados para 100.000 elementos:

Tipo de Hashing | Tempo de inserção | Colisões | Tempo médio de busca | Média de comparações na busca
:--- | :---: | :---: | :---: | :---: 
Multiplicação | 208 ms | 21357 | 3580 ns | 1
Resto de Divisão | 154 ms | 21375 | 760 ns | 1
Dobramento | 82 ms | 97244 | 13100 ns | 26
