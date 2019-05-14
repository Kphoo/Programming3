import javax.swing.*;

public class AscendingAndDescending {
    public static void main(String[] args) {
        int num1,num2,num3;
        String str ,output;
        str = JOptionPane.showInputDialog(null,"Enter an integer");
        num1 = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null,"Enter an integer");
        num2 = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null,"Enter an integer");
        num3 = Integer.parseInt(str);
        {
            if(num1 > num2 && num1> num3 )
                output ="Number one is the largest integer" +num1;
            else
                if(num2>num1 && num2>num3)
                    output="Number two is the largest integer" + num2;

                else
                    output="Number three is the largest integar" + num3;
            JOptionPane.showMessageDialog(null,output);
        }
    }
}

