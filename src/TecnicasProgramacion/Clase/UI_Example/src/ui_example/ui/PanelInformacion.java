/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_example.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import mundo.LiderAsesinado;

/**
 *
 * @author 10
 */
public class PanelInformacion extends JPanel {

    private static final String LBL_FECHA = "Fecha asesinato:";
    
    private JLabel lblImagen;    
    private JLabel lblNombre;
    private JLabel lblFecha;
    private JTextField txtFecha;
    
    public PanelInformacion () {
        inicializarPanel();
    }
    
    private void inicializarPanel() {
        setLayout(new BorderLayout());
        
        lblImagen = new JLabel();
        add(lblImagen, BorderLayout.CENTER);
        
        agregarPanelInferior();
    }
    
    private void agregarPanelInferior() {
        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new GridLayout(2, 1));
        
        lblNombre = new JLabel();
        lblNombre.setHorizontalAlignment(JLabel.CENTER);
        panelInferior.add(lblNombre);
        
        JPanel panelFecha = new JPanel();
        panelFecha.setLayout(new GridLayout(1, 2));
        
        lblFecha = new JLabel(LBL_FECHA);
        lblFecha.setHorizontalAlignment(JLabel.RIGHT);
        panelFecha.add(lblFecha);
        
        txtFecha = new JTextField();
        txtFecha.setEditable(false);
        panelFecha.add(txtFecha);
        panelInferior.add(panelFecha);
        add(panelInferior, BorderLayout.SOUTH);
    }
    
    public void cambiarLider(LiderAsesinado liderAsesinado) {
        cambiarIcono(liderAsesinado.darRutaImagen());
        lblNombre.setText(liderAsesinado.darNombre());        
        cambiarFecha(liderAsesinado.darFechaAsesinato());
        repaint();        
    }

    private void cambiarIcono(String rutaImagen) {
        ImageIcon image = new ImageIcon(rutaImagen);
        lblImagen.setIcon(image);
        lblImagen.setBorder(BorderFactory.createLineBorder(Color.black));
        lblImagen.setHorizontalAlignment(JLabel.CENTER);
        lblImagen.setVerticalAlignment(JLabel.CENTER);
    }

    private void cambiarFecha(Calendar fechaAsesinato) {
        Date date = fechaAsesinato.getTime();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String strFecha = format.format(date);
        txtFecha.setText(strFecha);
    }
}