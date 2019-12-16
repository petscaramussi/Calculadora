package calculadora;
public class Calculadora {
    public static void main(String[] args) {
        
        //instancias
        Solicitacoes S = new Solicitacoes();
        Calculos C = new Calculos();
        
        //variaveis
        int cond;
        double resultado;
        double num1,num2;
        
        //receber o primeiro numero
        num1 = S.receberNumero("Digite o primeiro numero: ");
        
        //receber o tipo da operação
        cond = S.receberOpcao();
        
        //receber o segundo numero
        num2 = S.receberNumero("Digite o segundo numero: ");
        
        
        //resultado
        resultado = C.CondicaoParaCalculo(cond, num1, num2);
        
        /*mostrar o resultado final, ou uma mensagem de erro
        caso o usuario tente fazer uma divisão por zero
        */
        S.mostrarResultado(resultado,cond,num2);
        
        
    }
    
}
