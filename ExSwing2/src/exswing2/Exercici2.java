/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exswing2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercici2 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("JTextArea con Botón");
        ventana.setSize(1200, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        // JTextArea
        JTextArea areaText1 = new JTextArea();
        areaText1.setBounds(50, 50, 300, 100);
        JScrollPane scrollText1 = new JScrollPane(areaText1);
        scrollText1.setBounds(50, 50, 300, 100);
        
        JTextArea areaText2 = new JTextArea();
        areaText2.setBounds(600, 50, 300, 100);
        JScrollPane scrollText2 = new JScrollPane(areaText2);
        scrollText2.setBounds(600, 50, 300, 100);

        // Botón para obtener el texto
        JButton boton = new JButton("Mostrar Texto");
        boton.setBounds(400, 170, 120, 30);

        // Acción del botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = areaText1.getText(); // Obtener texto del JTextArea
                String text2 = areaText2.getText(); // Obtener texto del JTextArea
                
                if(text1.equals(text2)){
                    JOptionPane.showMessageDialog(ventana, "El text es el mateix");
                }
                else{
                    JOptionPane.showMessageDialog(ventana, "El text es diferent");
                }
            }
        });

        ventana.add(scrollText1);
        ventana.add(scrollText2);
        ventana.add(boton);
        ventana.setVisible(true);
    }
}
