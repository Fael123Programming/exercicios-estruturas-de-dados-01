package aula;
import javax.swing.JOptionPane;
public class Calculator {
    double op1;
    double op2;
    double res;
    
    public Calculator(double op1,double op2){
        this.op1=op1;
        this.op2=op2;
    }
    
    public Calculator(){}
    
    public void getValues(){
        this.op1=Double.parseDouble(JOptionPane.showInputDialog("Number 1"));
        this.op2=Double.parseDouble(JOptionPane.showInputDialog("Number 2"));
    }
    
    public double sum(){
        return (this.op1+this.op2);
    }
    
    public double subt(){
        return (this.op1-this.op2);
    }
    
    public double mult(){
        return (this.op1*this.op2);
    }
    
    public double div(){
        return (this.op2!=0?this.op1/this.op2:-1);
    }
    
    public void calculate(String operation){
        switch(operation){
            case "sum":
                JOptionPane.showMessageDialog(null,"Sum: "+this.sum());
                break;
            case "subt":
                JOptionPane.showMessageDialog(null,"Subt: "+this.subt());
                break;
            case "mult":
                JOptionPane.showMessageDialog(null,"Mult: "+this.mult());
                break;
            case "div":
                JOptionPane.showMessageDialog(null,"Div: "+this.div());
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error");
                break;
        }
    }
}
