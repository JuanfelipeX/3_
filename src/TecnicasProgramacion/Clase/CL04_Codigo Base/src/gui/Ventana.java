/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author 10
 */
public class Ventana extends JFrame {
    
    private PanelTextos panelTextos;
    
    public Ventana() {
        inicializarVentana();
        
        panelTextos = new PanelTextos();
        add(panelTextos, BorderLayout.CENTER);
        
        setVisible(true);
    }

    private void inicializarVentana() {
        setTitle("LaTeX++");
        setSize(250, 500);
        setLayout(new BorderLayout());
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }    
}