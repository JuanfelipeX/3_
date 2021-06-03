package vista;

import java.awt.event.ActionEvent;
import modelo.*;

public class Datos extends javax.swing.JFrame {
    
    int nominaFinal = 0;
    
    public Datos() {
        setTitle("Nomina Docentes");
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        pregunta2Label = new javax.swing.JLabel();
        jPanelPregunta1 = new javax.swing.JPanel();
        pregunta1Label = new javax.swing.JLabel();
        siRadioButton = new javax.swing.JRadioButton();
        noRadioButton = new javax.swing.JRadioButton();
        jPanelPregunta2 = new javax.swing.JPanel();
        doctoradoRadioButton = new javax.swing.JRadioButton();
        maestriaRadioButton = new javax.swing.JRadioButton();
        pregradoRadioButton = new javax.swing.JRadioButton();
        jPanelName = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        guardarButton = new javax.swing.JButton();
        listaDocenesTextArea = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tituloDocentePanel = new javax.swing.JPanel();
        DocenteLabel = new javax.swing.JLabel();
        IDpanel = new javax.swing.JPanel();
        IDlabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        hoursPanel = new javax.swing.JPanel();
        hoursLabel = new javax.swing.JLabel();
        hoursTextField = new javax.swing.JTextField();
        NominaButton = new javax.swing.JButton();
        ResultadoNominaTextField = new javax.swing.JTextField();
        lblValidacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(31, 28, 28));

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorRemoved(evt);
            }
        });
        jPanel1.setLayout(null);

        tituloLabel.setBackground(new java.awt.Color(254, 254, 254));
        tituloLabel.setFont(new java.awt.Font("Kalimati", 1, 36)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(1, 1, 1));
        tituloLabel.setText("Nomina Docentes ");
        jPanel1.add(tituloLabel);
        tituloLabel.setBounds(330, 20, 340, 50);

        pregunta2Label.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        pregunta2Label.setForeground(new java.awt.Color(1, 1, 1));
        pregunta2Label.setText("¿Cual es el nivel de su escolaridad?");
        jPanel1.add(pregunta2Label);
        pregunta2Label.setBounds(150, 410, 260, 50);

        jPanelPregunta1.setBackground(new java.awt.Color(254, 254, 254));
        jPanelPregunta1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPregunta1.setForeground(new java.awt.Color(254, 254, 254));

        pregunta1Label.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        pregunta1Label.setForeground(new java.awt.Color(1, 1, 1));
        pregunta1Label.setText("¿Trabaja los fines de semana?");

        siRadioButton.setBackground(new java.awt.Color(254, 254, 254));
        buttonGroup1.add(siRadioButton);
        siRadioButton.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        siRadioButton.setForeground(new java.awt.Color(1, 1, 1));
        siRadioButton.setText("SI");

        noRadioButton.setBackground(new java.awt.Color(254, 254, 254));
        buttonGroup1.add(noRadioButton);
        noRadioButton.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        noRadioButton.setForeground(new java.awt.Color(1, 1, 1));
        noRadioButton.setText("NO");

        javax.swing.GroupLayout jPanelPregunta1Layout = new javax.swing.GroupLayout(jPanelPregunta1);
        jPanelPregunta1.setLayout(jPanelPregunta1Layout);
        jPanelPregunta1Layout.setHorizontalGroup(
            jPanelPregunta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPregunta1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pregunta1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(siRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(noRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelPregunta1Layout.setVerticalGroup(
            jPanelPregunta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPregunta1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPregunta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pregunta1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelPregunta1);
        jPanelPregunta1.setBounds(40, 330, 450, 70);

        jPanelPregunta2.setBackground(new java.awt.Color(254, 254, 254));
        jPanelPregunta2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup2.add(doctoradoRadioButton);
        doctoradoRadioButton.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        doctoradoRadioButton.setForeground(new java.awt.Color(1, 1, 1));
        doctoradoRadioButton.setText("Doctorado");

        buttonGroup2.add(maestriaRadioButton);
        maestriaRadioButton.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        maestriaRadioButton.setForeground(new java.awt.Color(1, 1, 1));
        maestriaRadioButton.setText("Maestria");

        buttonGroup2.add(pregradoRadioButton);
        pregradoRadioButton.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        pregradoRadioButton.setForeground(new java.awt.Color(1, 1, 1));
        pregradoRadioButton.setText("Pregrado");
        pregradoRadioButton.setToolTipText("");

        javax.swing.GroupLayout jPanelPregunta2Layout = new javax.swing.GroupLayout(jPanelPregunta2);
        jPanelPregunta2.setLayout(jPanelPregunta2Layout);
        jPanelPregunta2Layout.setHorizontalGroup(
            jPanelPregunta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPregunta2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pregradoRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(maestriaRadioButton)
                .addGap(51, 51, 51)
                .addComponent(doctoradoRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanelPregunta2Layout.setVerticalGroup(
            jPanelPregunta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPregunta2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPregunta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctoradoRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(maestriaRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pregradoRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanelPregunta2);
        jPanelPregunta2.setBounds(40, 460, 450, 60);

        jPanelName.setBackground(new java.awt.Color(254, 254, 254));
        jPanelName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelName.setForeground(new java.awt.Color(1, 1, 1));

        nameLabel.setFont(new java.awt.Font("Ubuntu Light", 0, 16)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(1, 1, 1));
        nameLabel.setText("Ingrese Nombre y Apellido");

        nombreField.setBackground(new java.awt.Color(254, 254, 254));
        nombreField.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        nombreField.setForeground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout jPanelNameLayout = new javax.swing.GroupLayout(jPanelName);
        jPanelName.setLayout(jPanelNameLayout);
        jPanelNameLayout.setHorizontalGroup(
            jPanelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(nombreField, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelNameLayout.setVerticalGroup(
            jPanelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanelName);
        jPanelName.setBounds(40, 90, 450, 70);

        guardarButton.setBackground(new java.awt.Color(241, 137, 137));
        guardarButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        guardarButton.setForeground(new java.awt.Color(20, 2, 2));
        guardarButton.setText("Guardar");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(guardarButton);
        guardarButton.setBounds(510, 470, 110, 40);

        jTextArea1.setBackground(new java.awt.Color(185, 185, 185));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(1, 1, 1));
        jTextArea1.setRows(5);
        listaDocenesTextArea.setViewportView(jTextArea1);

        jPanel1.add(listaDocenesTextArea);
        listaDocenesTextArea.setBounds(560, 150, 360, 180);

        tituloDocentePanel.setBackground(new java.awt.Color(235, 138, 138));
        tituloDocentePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(135, 1, 1)));
        tituloDocentePanel.setForeground(new java.awt.Color(1, 1, 1));

        DocenteLabel.setBackground(new java.awt.Color(254, 254, 254));
        DocenteLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        DocenteLabel.setForeground(new java.awt.Color(1, 1, 1));
        DocenteLabel.setText("Docentes");

        javax.swing.GroupLayout tituloDocentePanelLayout = new javax.swing.GroupLayout(tituloDocentePanel);
        tituloDocentePanel.setLayout(tituloDocentePanelLayout);
        tituloDocentePanelLayout.setHorizontalGroup(
            tituloDocentePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloDocentePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(DocenteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        tituloDocentePanelLayout.setVerticalGroup(
            tituloDocentePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloDocentePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DocenteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(tituloDocentePanel);
        tituloDocentePanel.setBounds(660, 80, 160, 60);

        IDpanel.setBackground(new java.awt.Color(254, 254, 254));
        IDpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IDpanel.setForeground(new java.awt.Color(1, 1, 1));

        IDlabel.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        IDlabel.setForeground(new java.awt.Color(1, 1, 1));
        IDlabel.setText("Ingrese su Tarjeta de Identificacion");

        IDTextField.setBackground(new java.awt.Color(255, 250, 250));
        IDTextField.setForeground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout IDpanelLayout = new javax.swing.GroupLayout(IDpanel);
        IDpanel.setLayout(IDpanelLayout);
        IDpanelLayout.setHorizontalGroup(
            IDpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IDlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        IDpanelLayout.setVerticalGroup(
            IDpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IDpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IDpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(IDpanel);
        IDpanel.setBounds(40, 170, 450, 70);

        hoursPanel.setBackground(new java.awt.Color(254, 254, 254));
        hoursPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hoursPanel.setForeground(new java.awt.Color(1, 1, 1));

        hoursLabel.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        hoursLabel.setForeground(new java.awt.Color(1, 1, 1));
        hoursLabel.setText("¿Cuantas horas trabaja  diariamente?");

        hoursTextField.setBackground(new java.awt.Color(254, 254, 254));
        hoursTextField.setForeground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout hoursPanelLayout = new javax.swing.GroupLayout(hoursPanel);
        hoursPanel.setLayout(hoursPanelLayout);
        hoursPanelLayout.setHorizontalGroup(
            hoursPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hoursPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        hoursPanelLayout.setVerticalGroup(
            hoursPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hoursPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hoursPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hoursTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(hoursPanel);
        hoursPanel.setBounds(40, 250, 450, 70);

        NominaButton.setBackground(new java.awt.Color(250, 136, 136));
        NominaButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        NominaButton.setForeground(new java.awt.Color(1, 1, 1));
        NominaButton.setText("La Nomina Es");
        NominaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NominaButtonActionPerformed(evt);
            }
        });
        jPanel1.add(NominaButton);
        NominaButton.setBounds(560, 360, 160, 50);

        ResultadoNominaTextField.setBackground(new java.awt.Color(156, 156, 156));
        ResultadoNominaTextField.setForeground(new java.awt.Color(1, 1, 1));
        ResultadoNominaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoNominaTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(ResultadoNominaTextField);
        ResultadoNominaTextField.setBounds(760, 360, 140, 50);

        lblValidacion.setText(" ");
        jPanel1.add(lblValidacion);
        lblValidacion.setBounds(630, 480, 290, 15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1AncestorRemoved

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed

        if (nombreField.getText().length() == 0 || IDTextField.getText().length() == 0 || hoursTextField.getText().length() == 0) {
            lblValidacion.setText("Ingrese datos en los espacios blancos.");
            return;
        }
        
        Docente docente;
        
        if (pregradoRadioButton.isSelected()) {
            docente = new Pregrado(nombreField.getText(), Integer.parseInt(IDTextField.getText()), Integer.parseInt(hoursTextField.getText()));
        }else if(maestriaRadioButton.isSelected()){
            docente = new Maestria(nombreField.getText(), Integer.parseInt(IDTextField.getText()), Integer.parseInt(hoursTextField.getText()));
        }else if(doctoradoRadioButton.isSelected()){
            docente = new Doctorado(nombreField.getText(), Integer.parseInt(IDTextField.getText()), Integer.parseInt(hoursTextField.getText()));
        }else{
            lblValidacion.setText("Seleccione una opción");
            return;
        }
        
        if (siRadioButton.isSelected()) {
            nominaFinal = nominaFinal + (int) (docente.getHours()*(docente.getHOURS_VALUE() + docente.getHOURS_VALUE() * 0.20));
            jTextArea1.append("\nDocente: " + docente.getName() + " ID: " + docente.getId() + " Horas: " + docente.getHours() 
                    + "\n╚══════════►Extra: si, Total: " +  (int) (docente.getHours()*(docente.getHOURS_VALUE() + docente.getHOURS_VALUE() * 0.20)));
        }else if(noRadioButton.isSelected()){
            nominaFinal = nominaFinal + (docente.getHours()*docente.getHOURS_VALUE());
            jTextArea1.append("\nDocente: " + docente.getName() + " ID: "+ docente.getId() + " Horas: " + docente.getHours() 
                    + "\n╚══════════►Extra: no, Total: " +  (docente.getHours()*docente.getHOURS_VALUE()));
        }else{
            lblValidacion.setText("Seleccione una opción");
            return;
        }
        
        jTextArea1.setEditable(false);
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        nombreField.setText("");
        IDTextField.setText(""); 
        hoursTextField.setText("");
        lblValidacion.setText("");
        
    }//GEN-LAST:event_guardarButtonActionPerformed

    private void NominaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NominaButtonActionPerformed
        ResultadoNominaTextField.setText("" + nominaFinal);
        ResultadoNominaTextField.setEditable(false);
    }//GEN-LAST:event_NominaButtonActionPerformed

    private void ResultadoNominaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoNominaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadoNominaTextFieldActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DocenteLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JLabel IDlabel;
    private javax.swing.JPanel IDpanel;
    private javax.swing.JButton NominaButton;
    private javax.swing.JTextField ResultadoNominaTextField;
    public static javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton doctoradoRadioButton;
    private javax.swing.JButton guardarButton;
    private javax.swing.JLabel hoursLabel;
    private javax.swing.JPanel hoursPanel;
    private javax.swing.JTextField hoursTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelName;
    private javax.swing.JPanel jPanelPregunta1;
    private javax.swing.JPanel jPanelPregunta2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblValidacion;
    private javax.swing.JScrollPane listaDocenesTextArea;
    private javax.swing.JRadioButton maestriaRadioButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton noRadioButton;
    private javax.swing.JTextField nombreField;
    private javax.swing.JRadioButton pregradoRadioButton;
    private javax.swing.JLabel pregunta1Label;
    private javax.swing.JLabel pregunta2Label;
    private javax.swing.JRadioButton siRadioButton;
    private javax.swing.JPanel tituloDocentePanel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
