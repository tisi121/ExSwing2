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

public class Exercici3 {
    public static void main(String[] args) {
        JFrame finestra = new JFrame("Formulari de Registre");
        finestra.setSize(400, 400);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(null);
        
        JLabel lblNum1 = new JLabel("Amplada:");
        lblNum1.setBounds(10,15,100,40);
        JTextField txtNum1 = new JTextField();
        txtNum1.setBounds(100,15,100,40);
        
        JLabel lblNum2 = new JLabel("Llargada:");
        lblNum2.setBounds(10,150,100,40);
        JTextField txtNum2 = new JTextField();
        txtNum2.setBounds(100,150,100,40);
        
        JButton boto = new JButton("Redimensionar la finestra");
        boto.setBounds(400, 270, 120, 30);

        // Acció del botó
        boto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textNum1 = txtNum1.getText();
                String textNum2 = txtNum2.getText();
                
                Integer num1= Integer.valueOf(textNum1);
                Integer num2= Integer.valueOf(textNum2);
                
                finestra.setSize(num1,num2);
            }
        });
        
         finestra.add(lblNum1);
         finestra.add(txtNum1);
         finestra.add(lblNum2);
         finestra.add(txtNum2);
         finestra.add(boto);
         
         finestra.setVisible(true);
    }
}
