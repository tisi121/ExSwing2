/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exswing2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author thejo
 */
public class Exercici4 {
    public static void main(String[] args) {
        JFrame finestra = new JFrame("Formulari de Registre");
        finestra.setSize(400, 400);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(null);
        
        JCheckBox checkAceptar = new JCheckBox("Acepta els termes de condicions i les polìtiques de seguretat(Contrato con el demonio)");
        checkAceptar.setBounds(30,15,550,30);
        
        
        JButton boto = new JButton("Aceptar");
        boto.setBounds(10, 80, 120, 30);

        // Acció del botó
        boto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!checkAceptar.isSelected()) {
                    JOptionPane.showMessageDialog(finestra, "Has d'aceptar els terminis!!!");
                    return;
                }
                else{
                    JOptionPane.showMessageDialog(finestra, "Ara has venut la teva ànima al diable!");
                }
            }
        });
        
         finestra.add(checkAceptar);
         finestra.add(boto);
         
         finestra.setVisible(true);
    }
}
