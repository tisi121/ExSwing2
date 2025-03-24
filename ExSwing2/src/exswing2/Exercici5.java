/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exswing2;

/**
 *
 * @author thejo
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercici5 {
    public static void main(String[] args) {
        JFrame finestra = new JFrame("Formulari de calculs");
        finestra.setSize(800, 800);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(null);
        
        JLabel lblNum1 = new JLabel("Numero 1:");
        lblNum1.setBounds(10,10,100,40);
        JTextField txtNum1 = new JTextField();
        txtNum1.setBounds(100,10,100,40);
        
        JLabel lblNum2 = new JLabel("Numero 2:");
        lblNum2.setBounds(400,10,100,40);
        JTextField txtNum2 = new JTextField();
        txtNum2.setBounds(500,10,100,40);
        
        JRadioButton buttonSumar= new JRadioButton("Sumar");
        buttonSumar.setBounds(10,60,100,40);
        
        JRadioButton buttonRestar= new JRadioButton("Restar");
        buttonRestar.setBounds(10,100,100,40);
        
        JRadioButton buttonMultiplicar= new JRadioButton("Multiplicar");
        buttonMultiplicar.setBounds(10,140,100,40);
        
        JRadioButton buttonDividir= new JRadioButton("Dividir");
        buttonDividir.setBounds(10,180,100,40);
        
        ButtonGroup mates = new ButtonGroup();
        mates.add(buttonSumar);
        mates.add(buttonRestar);
        mates.add(buttonMultiplicar);
        mates.add(buttonDividir);
        
        JButton boto = new JButton("A calcular!!");
        boto.setBounds(10, 240, 120, 30);

        // Acció del botó
        boto.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String textNum1 = txtNum1.getText();
                String textNum2 = txtNum2.getText();
                
                Integer num1= Integer.valueOf(textNum1);
                Integer num2= Integer.valueOf(textNum2);
                
                
                if (buttonSumar.isSelected()) {
                   double resultatSuma=num1+num2;
                    JOptionPane.showMessageDialog(finestra, "Resultat: "+resultatSuma);
                } else if (buttonRestar.isSelected()) {
                    double resultatResta=num1-num2;
                    JOptionPane.showMessageDialog(finestra, "Resultat: "+resultatResta);
                } else if (buttonMultiplicar.isSelected()) {
                    double resultatMultiplicacio=num1*num2;
                    JOptionPane.showMessageDialog(finestra, "Resultat: "+resultatMultiplicacio);
                }else if (buttonDividir.isSelected()) {
                    double resultatDivisio=num1/num2;
                    JOptionPane.showMessageDialog(finestra, "Resultat: "+resultatDivisio);
                }else{
                    JOptionPane.showMessageDialog(finestra,"Has de sel·leccionar una opció");
                }
            }
        });        
         finestra.add(lblNum1);
         finestra.add(txtNum1);
         finestra.add(lblNum2);
         finestra.add(txtNum2);
         finestra.add(buttonSumar);
         finestra.add(buttonRestar);
         finestra.add(buttonMultiplicar);
         finestra.add(buttonDividir);
         finestra.add(boto);
         
         finestra.setVisible(true);
    }
}
