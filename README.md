Atividades concluídas em java no 2° semestre de Lógica de Programação em 2022, IFB - TSI noturno.


<strong> Exercício: Par ou Ímpar </strong>
Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.

Entrada	Saída
36	PAR E POSITIVO
-12	PAR E NEGATIVO
13	ÍMPAR E POSITIVO
-7	ÍMPAR E NEGATIVO
Observe o caractere de fim de linha ao final de cada saída.

<strong>Exercício: Maior do Conjunto</strong>
Faça um algoritmo que determine o maior entre N números. A condição de parada é a entrada de um valor 0, ou seja, o algoritmo deve ficar calculando o maior até que a entrada seja igual a 0 (ZERO).

Entrada	Saída
5, 10, 3, 20
0	maior = 20
-30,-20,-40,-5
0	maior = -5
0	maior = 0
Observe o espaço antes e depois do símbolo de igualdade (' = ') e também o caractere de fim de linha ao final de cada saída.

<strong> Exercício: Múltiplo de 10 </strong>
Faça um algoritmo que conte de 1 a 100 e a cada múltiplo de 10 emita uma mensagem: Multiplo de 10.

Entrada	Saída
Não há entrada para este exercício.	Multiplo de 10
Multiplo de 10
...
Observe que deve ter um caractere de fim de linha ao final de cada saída. O símbolo '...' deve ser substituído pela quantidade correta de ocorrências do texto 'Múltiplo de 10"

<strong> Exercício: Horas Extras </strong>
Elabore um programa que leia o código e o número de horas trabalhadas por um operário, e calcule o seu salário, sabendo que ele ganha R$ 10,00 por hora trabalhada. Quando o número de horas exceder a 50, calcule o montante a receber relativo a pagamento de horas extras, sabendo que a hora extra de trabalho vale R$ 20,00. No final do processamento, imprima o código do operário, o salário relativo a horas extras e o salário total, conforme exemplos a seguir.

Entrada	Saída
1, 70,	codigo = 1
salarioExcedente = 400
salarioTotal = 900
2
30	codigo = 2
salarioExcedente = 0
salarioTotal = 300
3
50	codigo = 3
salarioExcedente = 0
salarioTotal = 500
Observe o espaço antes e depois do símbolo de igualdade (' = ') e também o caractere de fim de linha ao final de cada saída.

<strong> Exercício: Fatorial </strong>
Faça um algoritmo para calcular o fatorial de um número inteiro qualquer entre 0 e 25 (inclusive).

Entrada	Saída
0	1
5	120
Não esqueça de incluir o caractere de fim de linha ao final de cada saída.

<strong> Exercício: A Pescaria </strong>
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior do que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos), deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que receba como entrada um valor inteiro que representa o peso dos peixes pescados, e imprima o excesso de peso e o valor da multa que João deverá pagar, conforme exemplos abaixo.

Entrada	Saída
70	excedente = 20
multa = 80
50	excedente = 0
multa = 0
30	excedente = 0
multa = 0
Na saída, observe o espaço antes e depois do símbolo de igualdade (' = ') e também o fim de linha ao imprimir tanto o valor excedente como o valor da multa.

Neste exercício, vamos implementar um modelo bem simples de Veículo!

Clique aqui para baixar os anexos deste exercício.

No arquivo de anexos você vai encontrar o (1) diagrama de classes, (2) o javadocs da solução e (3) classes de teste.

(1) O arquivo 'Veiculo_diagrama_classes.svg' fornece uma visão geral da solução.

(2) As especificações detalhadas das classes que você precisará implementar estão disponíveis em 'javadocs/index.html'. Nessa documentação você encontrará todos os construtores, atributos e métodos de cada classe do projeto, incluindo comentários que explicam o propósito e o funcionamento de cada elemento.

(3) Além do Javadoc das classes, também estão disponíveis as classes de teste 'AutomovelTest.java', 'VeiculoTest.java', 'MotoTest.java', 'CarroTest.java' e 'BicicletaTest.java', que você deve utilizar para testar seu código. Essas classes de teste foram escritas com o framework JUnit, que configuraremos a seguir no seu projeto.

Para começar, crie um novo 'Java Project' no Eclipse (File -> New -> Java Project). Digite um nome para o projeto e clique em 'Next'. Em seguida, vá até a aba 'Libraries' e verifique se a biblioteca 'JavaSE-1.8' está presente. Se não estiver, você terá que instalar o JDK 1.8 primeiro e fazer referência a ele na primeira tela de criação do 'Java Project', ok? Mas se estiver tudo certo até aqui, clique em 'Add Library...', escolha 'JUnit', clique em 'Next', escolha 'JUnit 4', clique em 'Finish', e depois em 'Finish' novamente.

Pronto! Seu novo projeto Java foi criado e está pronto para executar classes de teste escritas com o framework JUnit. Agora coloque os arquivos de teste dentro do diretório 'src' do seu novo projeto. Dica: você pode fazer isso arrastando e soltando o arquivo no diretório 'src' dentro do próprio Eclipse, e confirmando com a opção 'Copy File(s)'.

Muito bem! Se você abrir essa classe de teste no Eclipse, verá que ela ainda não compila e apresenta vários 'x' vermelhos próximos aos números de linha (lado esquerdo do editor). Isso acontece porque as classes de teste dependem das classes que você ainda vai implementar (Veiculo, Automovel, Carro, Moto e Bicicleta).

A maneira mais fácil de começar a implementar essas classes é clicando em cada 'x' vermelho e acionando uma dessas 3 opções: 'Create class', 'Create constructor' ou 'Create method'. Dica: não escolha outras opções além dessas, ok? Senão você pode acabar alterando a classe de testes indevidamente!

Executar essas opções irá criar algumas classes, construtores e métodos que faltam no projeto, fazendo desaparecer os erros de compilação. Mas depois disso, você ainda deverá recorrer ao Javadoc das classes para corrigir o que não está aderente à especificação. 

Quando todas as classes estiverem compilando sem erros, você poderá executar os testes clicando com o botão direito sobre cada uma das classes de teste e selecionando a opção 'Run As -> JUnit Test'. Em seguida, avalie os erros (execuções em vermelho) e corrija o que for necessário até que todos os testes executem com sucesso (execuções verdes).

É muito importante que você leia atentamente os comentários no Javadoc e também no código da classe de teste, porque ambas as referências trazem informações essenciais para seu sucesso no exercício! O Javadoc define os atributos e métodos a serem implementados nas classes, enquanto a classe de teste apresenta cenários reais de uso desses elementos. Portanto, são informações que se complementam.

Quando você conseguir resolver o exercício, o código de cada classe deverá ser colado nos respectivos campos abaixo. Observe que os nomes das classes já estão pré-definidos e que elas devem estar todas no pacote default (nenhum pacote Java específico).

Depois de clicar no botão 'Enviar', sua aplicação será validada automaticamente através de testes automáticos que irão executar seu código em alguns cenários de uso.
