package calculadora;
public class Calculos {
    
    private double result;
    private String errorMessage;
    
    public double CondicaoParaCalculo(int numDaCondicao,double num1, double num2){
        switch(numDaCondicao){
            case 1:
               result = num1 + num2;
            break;
            case 2:
               result = num1 - num2;
            break;
            case 3:
                result = num1 * num2;
            break;
            case 4:
                result = num1 / num2;
                
            break;
                
        }
        return result;
    }
    

    
}
