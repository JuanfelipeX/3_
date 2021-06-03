/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_example.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mundo.ContenedorLideresAsesinados;
import mundo.LiderAsesinado;

/**
 *
 * @author 10
 */
public class Ventana extends JFrame implements ActionListener{
    
    private static final Dimension TAMANIO = new Dimension(600, 450);
    private static final String TITULO = "Lideres Asesinados";
    
    private static final String CMD_SIGUIENTE = ">>";
    private static final String CMD_ANTERIOR = "<<";
    
    private final ContenedorLideresAsesinados contenedor;
    
    private JButton botonSiguiente;    
    private JButton botonAnterior;
    private PanelInformacion panelInformacion;
    
    public Ventana() {
        contenedor =  new ContenedorLideresAsesinados();
        
        inicializarVentana();        
        agregarBotones();        
        agregarPanelInformacion();
        
        setVisible(true);
    }

    private void inicializarVentana() {
        setSize(TAMANIO);
        setTitle(TITULO);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }    

    private void agregarBotones() {
        botonSiguiente = new JButton(CMD_SIGUIENTE);
        botonSiguiente.setActionCommand(CMD_SIGUIENTE);
        botonSiguiente.addActionListener(this);
        add(botonSiguiente, BorderLayout.EAST);
    
        botonAnterior = new JButton(CMD_ANTERIOR);
        botonAnterior.setActionCommand(CMD_ANTERIOR);
        botonAnterior.addActionListener(this);
        add(botonAnterior, BorderLayout.WEST);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case CMD_SIGUIENTE:
                mostrarSiguinte();
                break;
            case CMD_ANTERIOR:
                mostrarAnterior();
                break;
        }
    }
    
    private void mostrarSiguinte() {
        try {
            LiderAsesinado liderAsesinado = contenedor.darSiguienteLiderAsesinado();
            panelInformacion.cambiarLider(liderAsesinado);
        } catch (IndexOutOfBoundsException aiobe) {
            JOptionPane.showMessageDialog(this, "No hay más datos de líderes asesinados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mostrarAnterior() {
        try {
            LiderAsesinado liderAsesinado = contenedor.darAnteriorLiderAsesinado();
            panelInformacion.cambiarLider(liderAsesinado);
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            JOptionPane.showMessageDialog(this, "Este es el primer elemento de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void agregarPanelInformacion() {
        panelInformacion = new PanelInformacion();
        LiderAsesinado liderAsesinado = contenedor.darPrimerLiderAsesinado();
        panelInformacion.cambiarLider(liderAsesinado);
        add(panelInformacion, BorderLayout.CENTER);
    }
}