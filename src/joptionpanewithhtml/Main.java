package joptionpanewithhtml;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int s = 1;
        for(int c=33;c>13;c-=2, s++) System.out.println(s);
        System.out.println(0%3);
        int number, sum = 0, odds = 0, evens = 0, counter = 0, greaterThan100 = 0;
        //It is allowed to use html tags with JOptionPane class!
        do{
            number = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Type an integer number below <br/><em>(0 to end)</em></html> ","Getting values", JOptionPane.INFORMATION_MESSAGE));
            if(number != 0){
                if(number % 2 == 0) evens++;
                else odds++;
                if(number > 100) greaterThan100++;
                counter++;
                sum += number;
            }
        }while(number != 0);
        if(counter > 0) JOptionPane.showMessageDialog(null,"<html>Your data<hr>Typed numbers: "+counter+"<br/>Odds: "+odds+"<br/>Evens: "+evens+"<br/>Greater than 100: "+greaterThan100+"<br/>Sum of all values: "+sum+"<br/>Mean of all values: "+(sum/counter)+"<br/></html>");
    }
}
