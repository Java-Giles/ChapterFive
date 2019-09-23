package debugging;

import javax.swing.*;

public class debugging5_4 {

    public static void main (String args[])
    {
        int one;
        int two;
        int three;
        int four;
        String str;
        String output;

        str = JOptionPane.showInputDialog(null,"Enter an integer ");
        one = Integer.parseInt(str);

        str = JOptionPane.showInputDialog(null,"Enter an integer ");
        two = Integer.parseInt(str);

        str = JOptionPane.showInputDialog(null,"Enter an integer ");
        three = Integer.parseInt(str);

        str = JOptionPane.showInputDialog(null,"Enter an integer ");
        four = Integer.parseInt(str);

        if(one > two && one > three && one > four) {
            output = "Highest is " + one;
            JOptionPane.showMessageDialog(null, output);
        }
        else if(two > one && two > three && two > four) {
            output = "Highest is " + two;
            JOptionPane.showMessageDialog(null, output);
        }
        else if(three > one && three > two && three > four) {
            output = "Highest is " + three;
            JOptionPane.showMessageDialog(null, output);
        }
        else
            output = "Highest is " + four;
        JOptionPane.showMessageDialog(null, output);
    }
}
