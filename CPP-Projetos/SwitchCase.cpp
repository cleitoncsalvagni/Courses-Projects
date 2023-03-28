/* Calculadora de investimentos: Poupan�a, tesouro direto e fundos imobili�rios. */ 
/* Utiliza��o de switch/case e break. */

#include <iostream> //Biblioteca padr�o de I/O
#include <string> //Biblioteca para o uso de strings
#include <locale.h> //Vai garantir que caracteres como �� e acentua��o sejam exibidos normalmente em nosso programa.

using namespace std; //Retiramos a abrevia��o do std:: antes de cada linha do c�digo
int main() {
	setlocale(LC_ALL, ""); //Vai garantir que caracteres como �� e acentua��o sejam exibidos normalmente em nosso programa, utilizada pela biblioteca locale.h
	
	const float poupanca = 0.014; //Declaramos uma vari�vel constante (apenas de leitura) do tipo que representa n�meros fracion�rios e n�meros reais (o que inclui os n�meros inteiros)
	const float tesouro = 0.0338; //Declaramos uma vari�vel constante (apenas de leitura) do tipo que representa n�meros fracion�rios e n�meros reais (o que inclui os n�meros inteiros)
	const float fundos = 0.04; //Declaramos uma vari�vel constante (apenas de leitura) do tipo que representa n�meros fracion�rios e n�meros reais (o que inclui os n�meros inteiros)
	float valor; //Declaramos uma vari�vel do tipo que representa n�meros fracion�rios e n�meros reais (o que inclui os n�meros inteiros) e que podemos armazenar dados nela.
	float calc_fundos; //Declaramos uma vari�vel do tipo que representa n�meros fracion�rios e n�meros reais (o que inclui os n�meros inteiros) e que podemos armazenar dados nela.
	float calc_tesouro; //Declaramos uma vari�vel do tipo que representa n�meros fracion�rios e n�meros reais (o que inclui os n�meros inteiros) e que podemos armazenar dados nela.
	float calc_poup; //Declaramos uma vari�vel do tipo que representa n�meros fracion�rios e n�meros reais (o que inclui os n�meros inteiros) e que podemos armazenar dados nela.
	int escolha; //Declaramos uma vari�vel do tipo que armazena nymeros inteiros;
	int meses; //Declaramos uma vari�vel do tipo que armazena nymeros inteiros;
	
	
	cout << "             | Calculadora de Investimentos |" << endl; //Imprimimos na tela o texto descrito
	cout << "\n- Ol�, seja bem vindo(a)! Por favor, digite o valor a investir: " << endl; //Imprimimos na tela o texto descrito
	cin >> valor; //Definimos a entrada das informa��es � vari�vel j� declarada
	
	cout << "\n- Certo, agora digite a quantidade de meses que ser� investido: " << endl; //Imprimimos na tela o texto descrito
	cin >> meses; //Definimos a entrada das informa��es � vari�vel j� declarada
	
	cout << "\n- �timo, agora escolha o tipo de c�lculo que deseja fazer:" << endl; //Imprimimos na tela o texto descrito
	cout << "\nDigite:" << endl << "1 para Poupanca" << endl << "2 para Tesouro Direto" << endl << "3 para Fundos Imobiliarios" << endl; //Imprimimos na tela o texto descrito
	cin >> escolha; //Definimos a entrada das informa��es � vari�vel j� declarada

	switch(escolha) { //Utilizamos como um controlador de casos, para verificar as op��es e valores escolhidos
		case 1: //Serve para fazer algo de acordo com o recebido, no caso a variavel de escolha
			calc_poup = (valor*poupanca)*meses; //Opera��o matem�tica utilizando as vari�veis decladaras para saber o valor final
			cout << "\nSeus investimentos v�o render um total de: R$ " << calc_poup << " ao ano!" << endl; //Imprimimos na tela o texto descrito
			break; //Encerra as instru��es
		case 2: //Serve para fazer algo de acordo com o recebido, no caso a variavel de escolha
			calc_tesouro = (valor*tesouro)*meses; //Opera��o matem�tica utilizando as vari�veis decladaras para saber o valor final
			cout << "\nSeus investimentos v�o render um total de: R$ " << calc_tesouro << " ao ano!" << endl; //Imprimimos na tela o texto descrito
			break; //Encerra as instru��es
		case 3: //Serve para fazer algo de acordo com o recebido, no caso a variavel de escolha
			calc_fundos = (valor*fundos)*meses; //Opera��o matem�tica utilizando as vari�veis decladaras para saber o valor final
			cout << "\nSeus investimentos v�o render um total de: R$ " << calc_fundos << " ao ano!" << endl; //Imprimimos na tela o texto descrito
			break; //Encerra as instru��es
		default:
			cout << "\nOps, op��o errada! Por favor, selecione apenas uma das op��es acima.";
			break;
		}
		
	return 0;	
}
