import javax.swing.JOptionPane;

public class Calculator {
public static void main(String[] args) {
	
	
	String  input1 =JOptionPane.showInputDialog("Enter first number");
	
	int num1=Integer.parseInt(input1);
	String input2 = JOptionPane.showInputDialog("Enter your second number");
	int num2=Integer.parseInt(input2); 
	String input3 =JOptionPane.showInputDialog("Pick your operation,+,-,/,*");
	if(input3.equals("-")){
		int num3  = num1-num2;
		JOptionPane.showMessageDialog(null,num3);
		}
	if(input3.equals("+")){
		int num4 = num1+num2;
		JOptionPane.showMessageDialog(null,num4);}
	
    if(input3.equals("/")){
    	int num5 =num1/num2;
    	JOptionPane.showMessageDialog(null,num5);}
    
    if(input3.equals("*")){
    	int num6 = num1*num2;
    	JOptionPane.showMessageDialog(null,num6);}
    }
    
    


	
	
	
	
	
} 

}
