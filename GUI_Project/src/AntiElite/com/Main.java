package AntiElite.com;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello "+ name);

        String language = JOptionPane.showInputDialog("What is your favourite language to speak?");
        JOptionPane.showMessageDialog(null,"My good sir "+ name + " your favorite language to speak is " + language);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,name +" You are "+ age + " years old");

        double height= Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,name +" You are "+ age + " years old" + " and  " + height + " cm tall ");


    }
}
