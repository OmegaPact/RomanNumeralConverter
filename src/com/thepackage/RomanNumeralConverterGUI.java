package com.thepackage;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RomanNumeralConverterGUI {


    private JPanel MainJPanel;
    private JTextField txtInput;
    private JButton btnConvert;
    private JLabel lblOutput;


    public RomanNumeralConverterGUI()
    {


        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    //get the input
                    int input = Integer.parseInt(txtInput.getText());

                    //convert from number to roman numeral and output it to label
                    lblOutput.setText(ConvertToRomanNumeral(input));


                }
                catch(Exception ex)
                {
                    //if error occurs display error message
                    JOptionPane.showMessageDialog(new JFrame(), "Please enter number", "Retry", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private String ConvertToRomanNumeral(int input)
    {
        // M = 1000
        // D = 500
        // C = 100
        // L = 50
        // X = 10
        // V = 5
        // I = 1
        String Answer = "";

        while(input != 0)
        {
            if(input >= 1000)
            {

                input -= 1000;
                Answer += "M";
            }
            else if( input >= 900)
            {

                input -= 900;
                Answer += "CM";
            }
            else if(input >= 500)
            {

                input -= 500;
                Answer += "D";
            }
            else if(input >= 400)
            {
                input -= 400;
                Answer += "CD";
            }
            else if(input >= 100)
            {

                input-= 100;
                Answer += "C";
            }
            else if(input >= 90)
            {
                input -= 90;
                Answer += "XC";
            }
            else if(input >= 50)
            {

                input-= 50;
                Answer += "L";
            }
            else if(input >= 40)
            {
                input -= 40;
                Answer += "XL";
            }
            else if(input >= 10)
            {

                input-= 10;
                Answer += "X";
            }
            else if(input >= 9)
            {
                input -= 9;
                Answer += "IX";
            }
            else if( input >= 5)
            {

                input-= 5;
                Answer += "V";
            }
            else if(input >= 4)
            {
                input -= 4;
                Answer += "IV";
            }
            else if( input >= 1)
            {
                input--;
                Answer += "I";
            }
        }

        return Answer;
    }

    public static void main(String[] args)
    {
        JFrame TheApplication = new JFrame("Number To Roman Numeral Converter");
        TheApplication.setContentPane(new RomanNumeralConverterGUI().MainJPanel);
        TheApplication.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        TheApplication.setResizable(false);
        TheApplication.pack();
        TheApplication.setVisible(true);
    }
}
