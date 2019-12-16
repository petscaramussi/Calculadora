package calculadora;
import javax.swing.JOptionPane;
public class Solicitacoes {
    private double num;
    private int opcao;
    
    
    public double receberNumero(String msg){
        String aux;
        aux = JOptionPane.showInputDialog(null,msg);
        num = Double.parseDouble(aux);
        return num;
    }
    
    public int receberOpcao(){
        String aux;
        aux = JOptionPane.showInputDialog(null,"Digite: 1 = soma | 2 = subtração | 3 = multiplicação | 4 = divisão ");
        opcao = Integer.parseInt(aux);
        return opcao;
    }
    
    public void mostrarResultado(double resultado,int cond,double num2){
        if(cond == 4 && num2 == 0){
        JOptionPane.showMessageDialog(null,"Não é possivel fazer uma divisão por zero..." );
        }else{
        JOptionPane.showMessageDialog(null,"O resultado da operação é: " + resultado );
        }
    }
}
