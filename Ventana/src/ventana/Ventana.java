/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author YANETH
 */
public class Ventana extends JFrame{

    
    public Ventana(){
        setSize(400, 400);
        setTitle("Ventana YMR");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(200,200));
        this.setMaximumSize(new Dimension(800,800));
        this.getContentPane().setBackground(Color.white);
        this.setLayout(null);
        iniciarComponentes();
    }
    
    private void colocarPaneles(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(0, 0, 400, 400);
        this.getContentPane().add(panel);
        
        JLabel etiqueta = new JLabel("Esta es un mensaje informativo para el usuario", SwingConstants.CENTER);
//        etiqueta.setText("Esta es un mensaje informativo para el usuario");
        etiqueta.setBounds(10, 10, 400, 100);
        etiqueta.setForeground(Color.BLACK);
//        etiqueta.setBackground(Color.red);
        etiqueta.setOpaque(true);
        panel.add(etiqueta);
    }
    
    private void iniciarComponentes(){
        colocarPaneles();
    }
    
//    private void iniciarComponentes(){
//        addWindowListener(new java.awt.event.WindowAdapter() {
//            @Override
//            public void windowClosing(java.awt.event.WindowEvent evento){
//                System.exit(0);
//            }
//        });
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ventana v = new Ventana();
        v.setVisible(true);
    }
}
