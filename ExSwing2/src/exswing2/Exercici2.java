/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exswing2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author thejo
 */
public class Exercici2 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Comparar dos textos");
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        // JTextArea
        JTextArea areaText1 = new JTextArea();
        areaText1.setBounds(50, 30, 300, 100);
        JScrollPane scrollText1 = new JScrollPane(areaText1);
        scrollText1.setBounds(50, 30, 300, 100);
        
        
        JTextArea areaText2 = new JTextArea();
        areaText2.setBounds(400, 30, 300, 100);
        JScrollPane scrollText2 = new JScrollPane(areaText2);
        scrollText2.setBounds(400, 30, 300, 100);

        // Botón para obtener el texto
        JButton boton = new JButton("Mostrar Texto");
        boton.setBounds(150, 170, 120, 30);

        // Acción del botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Obtindre els dos textos
                String text1 = areaText1.getText(); 
                String text2 = areaText2.getText(); 
            }
        });

        ventana.add(scrollText1);
        ventana.add(scrollText2);
        ventana.add(boton);
        ventana.setVisible(true);
    }
}
