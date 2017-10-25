import javax.swing.JOptionPane;

public class Calculator2 {
	public static void main(String[] args) {

		String input1 = JOptionPane.showInputDialog("Enter your first number");
		int num1 = Integer.parseInt(input1);
		String input2 = JOptionPane.showInputDialog("Enter your second Number");
		int num2 = Integer.parseInt(input2);
		String input3 = JOptionPane.showInputDialog("Enter your operation please,+,-,*,/ ");

		if (input3.equals("+")) {
			int num3 = num1 + num2;
			JOptionPane.showMessageDialog(null, num3);
		}

		if (input3.equals("-")) {
			int num4 = num1 - num2;
			JOptionPane.showMessageDialog(null, num4);
		}

		if (input3.equals("*"))
		{
			int num5 = num1 * num2;
			JOptionPane.showMessageDialog(null, num5);
		}

		if (input3.equals("/"))
		{
			int num6 = num1 / num2;
			JOptionPane.showMessageDialog(null, num6);
		}
	}

}
