/* Calculadora de investimentos: Poupança, tesouro direto e fundos imobiliários. */ 
/* Utilização de switch/case e break. */

#include <iostream> //Biblioteca padrão de I/O
#include <string> //Biblioteca para o uso de strings
#include <locale.h> //Vai garantir que caracteres como “ç” e acentuação sejam exibidos normalmente em nosso programa.

using namespace std; //Retiramos a abreviação do std:: antes de cada linha do código
int main() {
	setlocale(LC_ALL, ""); //Vai garantir que caracteres como “ç” e acentuação sejam exibidos normalmente em nosso programa, utilizada pela biblioteca locale.h
	
	const float poupanca = 0.014; //Declaramos uma variável constante (apenas de leitura) do tipo que representa números fracionários e números reais (o que inclui os números inteiros)
	const float tesouro = 0.0338; //Declaramos uma variável constante (apenas de leitura) do tipo que representa números fracionários e números reais (o que inclui os números inteiros)
	const float fundos = 0.04; //Declaramos uma variável constante (apenas de leitura) do tipo que representa números fracionários e números reais (o que inclui os números inteiros)
	float valor; //Declaramos uma variável do tipo que representa números fracionários e números reais (o que inclui os números inteiros) e que podemos armazenar dados nela.
	float calc_fundos; //Declaramos uma variável do tipo que representa números fracionários e números reais (o que inclui os números inteiros) e que podemos armazenar dados nela.
	float calc_tesouro; //Declaramos uma variável do tipo que representa números fracionários e números reais (o que inclui os números inteiros) e que podemos armazenar dados nela.
	float calc_poup; //Declaramos uma variável do tipo que representa números fracionários e números reais (o que inclui os números inteiros) e que podemos armazenar dados nela.
	int escolha; //Declaramos uma variável do tipo que armazena nymeros inteiros;
	int meses; //Declaramos uma variável do tipo que armazena nymeros inteiros;
	
	
	cout << "             | Calculadora de Investimentos |" << endl; //Imprimimos na tela o texto descrito
	cout << "\n- Olá, seja bem vindo(a)! Por favor, digite o valor a investir: " << endl; //Imprimimos na tela o texto descrito
	cin >> valor; //Definimos a entrada das informações à variável já declarada
	
	cout << "\n- Certo, agora digite a quantidade de meses que será investido: " << endl; //Imprimimos na tela o texto descrito
	cin >> meses; //Definimos a entrada das informações à variável já declarada
	
	cout << "\n- Ótimo, agora escolha o tipo de cálculo que deseja fazer:" << endl; //Imprimimos na tela o texto descrito
	cout << "\nDigite:" << endl << "1 para Poupanca" << endl << "2 para Tesouro Direto" << endl << "3 para Fundos Imobiliarios" << endl; //Imprimimos na tela o texto descrito
	cin >> escolha; //Definimos a entrada das informações à variável já declarada

	switch(escolha) { //Utilizamos como um controlador de casos, para verificar as opções e valores escolhidos
		case 1: //Serve para fazer algo de acordo com o recebido, no caso a variavel de escolha
			calc_poup = (valor*poupanca)*meses; //Operação matemática utilizando as variáveis decladaras para saber o valor final
			cout << "\nSeus investimentos vão render um total de: R$ " << calc_poup << " ao ano!" << endl; //Imprimimos na tela o texto descrito
			break; //Encerra as instruções
		case 2: //Serve para fazer algo de acordo com o recebido, no caso a variavel de escolha
			calc_tesouro = (valor*tesouro)*meses; //Operação matemática utilizando as variáveis decladaras para saber o valor final
			cout << "\nSeus investimentos vão render um total de: R$ " << calc_tesouro << " ao ano!" << endl; //Imprimimos na tela o texto descrito
			break; //Encerra as instruções
		case 3: //Serve para fazer algo de acordo com o recebido, no caso a variavel de escolha
			calc_fundos = (valor*fundos)*meses; //Operação matemática utilizando as variáveis decladaras para saber o valor final
			cout << "\nSeus investimentos vão render um total de: R$ " << calc_fundos << " ao ano!" << endl; //Imprimimos na tela o texto descrito
			break; //Encerra as instruções
		default:
			cout << "\nOps, opção errada! Por favor, selecione apenas uma das opções acima.";
			break;
		}
		
	return 0;	
}
