/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exswing2;

/**
 *
 * @author thejo
 */
//Importacions de llibreries externes
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExSwing2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f1 = new JFrame("Cambiar el color del botó");
        f1.setSize(800, 600);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);

        // Crear un JComboBox amb els numeros des del 0 al 255
        Integer[] numeros = new Integer[256];  // Array de 256 elementos
        for (int i = 0; i <= 255; i++) {
            numeros[i] = i; // Ompla l'array amb els valors 0-255
        }
        
        
        //Box per introduïr els numeros dels colors
        JComboBox<Integer> vermellBox = new JComboBox<>(numeros);
        vermellBox.setBounds(150, 20, 100, 30);
        
        JComboBox<Integer> verdBox = new JComboBox<>(numeros);
        verdBox.setBounds(150, 60, 100, 30);
        
        JComboBox<Integer> blauBox = new JComboBox<>(numeros);
        blauBox.setBounds(150, 100, 100, 30);

        
        //Etiquetes per poder classificar els ComboBox
        
        JLabel etiquetaVermell = new JLabel("Vermell");
        etiquetaVermell.setBounds(10,10,50,30);
        JLabel etiquetaVerd = new JLabel("Verd");
        etiquetaVerd.setBounds(10,50,50,30);
        JLabel etiquetaBlau = new JLabel("Blau");
        etiquetaBlau.setBounds(10,90,50,30);
        
        
        
        // Botó per obtindre el número seleccionat
        JButton botoCanviant = new JButton("Seleccionar");
        botoCanviant.setBounds(10, 150, 120, 30);
        
        
         // Accions dels botons
        botoCanviant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numVermell = (int) vermellBox.getSelectedItem();
                int numVerd = (int) verdBox.getSelectedItem();
                int numBlau = (int) blauBox.getSelectedItem();
                
                botoCanviant.setBackground(new Color(numVermell,numVerd,numBlau));
            }
        });
        

        // Agregar componentes a la ventana
        f1.add(vermellBox);
        f1.add(verdBox);
        f1.add(blauBox);
        f1.add(botoCanviant);
        f1.add(etiquetaVermell);
        f1.add(etiquetaVerd);
        f1.add(etiquetaBlau);

        // Mostrar ventana
        f1.setVisible(true);
    }
    
}
