/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_amano;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Ingenieria
 */
public class GUI {
    JPanel izquierdo, derecho, inferior;
    
    public void panelIzquierdo(){
        izquierdo = new JPanel();
        izquierdo.setBackground(Color.green);
        JButton boton2 = new JButton("Opción Crear");
        JButton boton3 = new JButton("Opción Salir");
        izquierdo.setLayout(new BoxLayout(izquierdo, BoxLayout.Y_AXIS));
        izquierdo.add(boton2);
        izquierdo.add(boton3);
    }
    
    public void panelDerecho(){
        derecho = new JPanel();
        derecho.setBackground(Color.yellow);
        JButton boton1 = new JButton("No hacer nada");
        JButton boton2 = new JButton("Tampoco");
        derecho.setLayout(new BoxLayout(derecho, BoxLayout.Y_AXIS));
        derecho.add(boton1);
        derecho.add(boton2);               
    }
    
    public void panelInferior(){
        inferior = new JPanel();
        inferior.setBackground(Color.red);
        JButton boton1 = new JButton("Aceptar");
        JButton boton2 = new JButton("Cancelar");
        boton2.setBackground(Color.blue);
        inferior.setLayout(new FlowLayout());
        inferior.add(boton1);
        inferior.add(boton2);
                
    }
    
    public void crearVentana(){
        JFrame ventana = new JFrame("Aplicación F");
        ventana.setLayout(new BorderLayout(200, 50));
        panelIzquierdo();
        panelDerecho();
        panelInferior();
        
        JTextField titulo = new JTextField("Aplicación Fantabulosa");
        JTextArea cuadro = new JTextArea(10, 50);
        ventana.add(inferior,BorderLayout.SOUTH);
        ventana.add(izquierdo,BorderLayout.WEST);
        ventana.add(derecho,BorderLayout.EAST);        
        ventana.add(titulo,BorderLayout.NORTH);
        ventana.add(cuadro,BorderLayout.CENTER);
        ventana.setVisible(true);
        ventana.pack();                
    }
    
}
