/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 10
 */
public class PanelTextos extends JPanel{
    private JTextField[] camposDeTexto = new JTextField[4];
    
    public PanelTextos() {
        setLayout(new GridLayout(4, 1));
        
        for (int i = 0; i < camposDeTexto.length; i++) {
            camposDeTexto[i] = new JTextField();
            if (i > 0)
                camposDeTexto[i].setEnabled(false);
            add(camposDeTexto[i]);
        }
    }
}
