/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magnecom;

import java.sql.Connection;
import java.util.logging.Logger;

/**
 *
 * @author mena4
 */
public class Principal extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
 Connection con;
 
  
    /**
     * Creates new form Principal
     */
    public Principal() {
     initComponents();
     setLocation(-10 ,0);
     setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        registrodecli = new javax.swing.JMenuItem();
        Listdecli = new javax.swing.JMenuItem();
        Actualizar = new javax.swing.JMenuItem();
        cotizar = new javax.swing.JMenu();
        cotizacion = new javax.swing.JMenuItem();
        listcot = new javax.swing.JMenuItem();
        factura = new javax.swing.JMenu();
        NuevaFactura = new javax.swing.JMenuItem();
        ListaFact = new javax.swing.JMenuItem();
        factura1 = new javax.swing.JMenu();
        Servicio = new javax.swing.JMenuItem();
        Listserv = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(java.awt.Color.lightGray);

        jMenuBar1.setName(""); // NOI18N

        jMenu1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu1.setText("Clientes");
        jMenu1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(200, 50));

        registrodecli.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registrodecli.setText("Registrar");
        registrodecli.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrodecli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrodecliActionPerformed(evt);
            }
        });
        jMenu1.add(registrodecli);

        Listdecli.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Listdecli.setText("Lista de clientes");
        Listdecli.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Listdecli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListdecliActionPerformed(evt);
            }
        });
        jMenu1.add(Listdecli);

        Actualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jMenu1.add(Actualizar);

        jMenuBar1.add(jMenu1);

        cotizar.setBorder(new javax.swing.border.MatteBorder(null));
        cotizar.setText("Cotizacion");
        cotizar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        cotizar.setPreferredSize(new java.awt.Dimension(200, 50));

        cotizacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cotizacion.setText("Cotizar");
        cotizacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotizacionActionPerformed(evt);
            }
        });
        cotizar.add(cotizacion);

        listcot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listcot.setText("Lista de cotizaciones");
        listcot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listcot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listcotActionPerformed(evt);
            }
        });
        cotizar.add(listcot);

        jMenuBar1.add(cotizar);

        factura.setBorder(new javax.swing.border.MatteBorder(null));
        factura.setText("Facturación");
        factura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        factura.setPreferredSize(new java.awt.Dimension(200, 50));

        NuevaFactura.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NuevaFactura.setText("Nueva Factura");
        NuevaFactura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaFacturaActionPerformed(evt);
            }
        });
        factura.add(NuevaFactura);

        ListaFact.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ListaFact.setText("Lista de Facturas");
        ListaFact.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ListaFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaFactActionPerformed(evt);
            }
        });
        factura.add(ListaFact);

        jMenuBar1.add(factura);

        factura1.setBorder(new javax.swing.border.MatteBorder(null));
        factura1.setText("Servicio");
        factura1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        factura1.setPreferredSize(new java.awt.Dimension(200, 50));

        Servicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Servicio.setText("Nuevo servicio");
        Servicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicioActionPerformed(evt);
            }
        });
        factura1.add(Servicio);

        Listserv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Listserv.setText("Lista de servicios");
        Listserv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Listserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListservActionPerformed(evt);
            }
        });
        factura1.add(Listserv);

        jMenuBar1.add(factura1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1405, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrodecliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrodecliActionPerformed
 Cliente C= new Cliente();
            jDesktopPane1.add(C);
        C.show(); 
    }//GEN-LAST:event_registrodecliActionPerformed

    private void NuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaFacturaActionPerformed
     
            factura Fact= new factura();
            jDesktopPane1.add(Fact); 
            Fact.show();

             
        
    }//GEN-LAST:event_NuevaFacturaActionPerformed

    private void cotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotizacionActionPerformed
cotizacion COT2= new cotizacion();
           jDesktopPane1.add(COT2);
        COT2.show(); 
                     
    }//GEN-LAST:event_cotizacionActionPerformed

    private void listcotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listcotActionPerformed
       listacotizacion lc= new listacotizacion();
           jDesktopPane1.add(lc);
        lc.show(); 
    }//GEN-LAST:event_listcotActionPerformed

    private void ListaFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaFactActionPerformed
        // TODO add your handling code here:
        listafactura lf= new listafactura();
           jDesktopPane1.add(lf);
        lf.show(); 
    }//GEN-LAST:event_ListaFactActionPerformed

    private void ServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicioActionPerformed
        // TODO add your handling code here:
         RegistroServicio  RV= new RegistroServicio ();
           jDesktopPane1.add(RV);
        RV.show();
    }//GEN-LAST:event_ServicioActionPerformed

    private void ListdecliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListdecliActionPerformed
        // TODO add your handling code here:
        listaclientes  lc= new listaclientes ();
           jDesktopPane1.add(lc);
        lc.show(); 
    }//GEN-LAST:event_ListdecliActionPerformed

    private void ListservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListservActionPerformed
        // TODO add your handling code here:
        listaservicio  ls= new listaservicio ();
         jDesktopPane1.add(ls);
        ls.show();
    }//GEN-LAST:event_ListservActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        // TODO add your handling code here:
        Actulizarclientes  ls= new Actulizarclientes();
         jDesktopPane1.add(ls);
        ls.show();
    }//GEN-LAST:event_ActualizarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Actualizar;
    private javax.swing.JMenuItem ListaFact;
    private javax.swing.JMenuItem Listdecli;
    private javax.swing.JMenuItem Listserv;
    private javax.swing.JMenuItem NuevaFactura;
    private javax.swing.JMenuItem Servicio;
    private javax.swing.JMenuItem cotizacion;
    private javax.swing.JMenu cotizar;
    private javax.swing.JMenu factura;
    private javax.swing.JMenu factura1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem listcot;
    private javax.swing.JMenuItem registrodecli;
    // End of variables declaration//GEN-END:variables
}
