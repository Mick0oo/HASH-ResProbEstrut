# Atividade do RA3 - HASHING
# Resolução de Problemas Estruturados em Computação
## Escopo do projeto:
Trabalho envolvendo tabelas hash e seus diferentes algoritmos de hashing.
São criadas tabelas hash com 3 tamanhos (1.000, 10.000 ou 100.000 elementos) para 3 diferentes algoritmos de hashing diferentes, resultando em 9 tabelas diferentes. Todas usando o mesmo conjunto de dados criado por meio de seed.

Os algoritmos escolhidos para o hashing das tabelas foram: Multiplicação, Resto de Divisão e Dobramento.
O código se encontra na pasta src. Contém classes para cada HashMap diferente, uma classe Registro (auxiliar) e a classe Main (main, testes).

## Análise:
O algoritmo de hashing por Dobramento teve o tempo mais rápido de inserção para todos os cenários.

Os algoritmos de hashing por Multiplicação e Resto de Divisão tiveram uma quantidade de colisões similar para todos os cenários. Já o algoritmo de Dobramento, ao aumentar o volume, foram ocorridas muito mais colisões que os outros, chegando a ter 355% mais colisões que o algoritmo de Resto de Divisão no caso dos 100.000 elementos.

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
