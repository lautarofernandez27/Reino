/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;

/**
 *
 * @author Facu
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        this.initComponents();
        setLocationRelativeTo(null);
        setLocation(250,100);
        setResizable(false);
        setTitle("EL REINO DE LA MIEL")
        panelCaja.setVisible(false);
        panelProductos.setVisible(false);
        panelPersonas.setVisible(false);
        panelRankings.setVisible(false);
        pestañaNuevoProd.setVisible(false);
        idProd=0;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonProducto = new javax.swing.JButton();
        botonCaja = new javax.swing.JButton();
        botonPersonas = new javax.swing.JButton();
        botonRankings = new javax.swing.JButton();
        panelCaja = new javax.swing.JPanel();
        botonVenta = new javax.swing.JButton();
        botonConsignacion = new javax.swing.JButton();
        botonResumen = new javax.swing.JButton();
        botonDevolucion = new javax.swing.JButton();
        botonMovimientos = new javax.swing.JButton();
        panelProductos = new javax.swing.JPanel();
        botonVerListado = new javax.swing.JButton();
        botonNuevoProducto = new javax.swing.JButton();
        botonBorrarProducto = new javax.swing.JButton();
        botonStock = new javax.swing.JButton();
        panelPersonas = new javax.swing.JPanel();
        botonListado = new javax.swing.JButton();
        botonNuevaFicha = new javax.swing.JButton();
        botonModificarFicha = new javax.swing.JButton();
        botonBorrarFicha = new javax.swing.JButton();
        panelRankings = new javax.swing.JPanel();
        botonListado1 = new javax.swing.JButton();
        botonListado2 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        pestañaNuevoProd = new javax.swing.JPanel();
        labelIdProd = new javax.swing.JLabel();
        LabelPrecio = new javax.swing.JLabel();
        LabelLinea = new javax.swing.JLabel();
        tituloNuevoProd = new javax.swing.JLabel();
        LabelNombreProd = new javax.swing.JLabel();
        LabelTipo = new javax.swing.JLabel();
        botonGuardarNP = new javax.swing.JButton();
        botonCancelarNP = new javax.swing.JButton();
        ingresaTipo = new javax.swing.JTextField();
        ingresaProd = new javax.swing.JTextField();
        ingresaNombreProd = new javax.swing.JTextField();
        ingresaLinea = new javax.swing.JTextField();
        ingresaPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(766, 380));
        setMinimumSize(new java.awt.Dimension(766, 380));
        setPreferredSize(new java.awt.Dimension(766, 380));
        getContentPane().setLayout(null);

        botonProducto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        botonProducto.setText("PRODUCTOS");
        botonProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonProductoMouseEntered(evt);
            }
        });
        botonProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProductoActionPerformed(evt);
            }
        });
        getContentPane().add(botonProducto);
        botonProducto.setBounds(190, 0, 190, 70);

        botonCaja.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        botonCaja.setText("CAJA");
        botonCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCajaMouseEntered(evt);
            }
        });
        botonCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCajaActionPerformed(evt);
            }
        });
        getContentPane().add(botonCaja);
        botonCaja.setBounds(0, 0, 190, 70);

        botonPersonas.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        botonPersonas.setText("PERSONAS");
        botonPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonPersonasMouseEntered(evt);
            }
        });
        botonPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPersonasActionPerformed(evt);
            }
        });
        getContentPane().add(botonPersonas);
        botonPersonas.setBounds(380, 0, 190, 70);

        botonRankings.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        botonRankings.setText("RANKINGS");
        botonRankings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRankingsMouseEntered(evt);
            }
        });
        botonRankings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRankingsActionPerformed(evt);
            }
        });
        getContentPane().add(botonRankings);
        botonRankings.setBounds(570, 0, 190, 70);

        panelCaja.setLayout(null);

        botonVenta.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botonVenta.setText("VENTA");
        panelCaja.add(botonVenta);
        botonVenta.setBounds(0, 0, 190, 50);

        botonConsignacion.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botonConsignacion.setText("CONSIGNACION");
        panelCaja.add(botonConsignacion);
        botonConsignacion.setBounds(0, 50, 190, 50);

        botonResumen.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botonResumen.setText("RESUMEN");
        panelCaja.add(botonResumen);
        botonResumen.setBounds(0, 200, 190, 50);

        botonDevolucion.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botonDevolucion.setText("DEVOLUCION");
        panelCaja.add(botonDevolucion);
        botonDevolucion.setBounds(0, 100, 190, 50);

        botonMovimientos.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botonMovimientos.setText("ULT. MOVIMIENTOS");
        panelCaja.add(botonMovimientos);
        botonMovimientos.setBounds(0, 150, 190, 50);

        getContentPane().add(panelCaja);
        panelCaja.setBounds(0, 70, 190, 250);

        panelProductos.setLayout(null);

        botonVerListado.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botonVerListado.setText("VER LISTADO");
        panelProductos.add(botonVerListado);
        botonVerListado.setBounds(0, 100, 190, 50);

        botonNuevoProducto.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botonNuevoProducto.setText("NUEVO PRODUCTO");
        botonNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoProductoActionPerformed(evt);
            }
        });
        panelProductos.add(botonNuevoProducto);
        botonNuevoProducto.setBounds(0, 0, 190, 50);

        botonBorrarProducto.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botonBorrarProducto.setText("BORRAR PRODUCTO");
        panelProductos.add(botonBorrarProducto);
        botonBorrarProducto.setBounds(0, 50, 190, 50);

        botonStock.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botonStock.setText("STOCK");
        panelProductos.add(botonStock);
        botonStock.setBounds(0, 150, 190, 50);

        getContentPane().add(panelProductos);
        panelProductos.setBounds(190, 70, 190, 200);

        panelPersonas.setLayout(null);

        botonListado.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botonListado.setText("LISTADO");
        panelPersonas.add(botonListado);
        botonListado.setBounds(0, 150, 190, 50);

        botonNuevaFicha.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botonNuevaFicha.setText("NUEVA FICHA");
        panelPersonas.add(botonNuevaFicha);
        botonNuevaFicha.setBounds(0, 0, 190, 50);

        botonModificarFicha.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botonModificarFicha.setText("MODIFICAR FICHA");
        panelPersonas.add(botonModificarFicha);
        botonModificarFicha.setBounds(0, 50, 190, 50);

        botonBorrarFicha.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botonBorrarFicha.setText("BORRAR FICHA");
        panelPersonas.add(botonBorrarFicha);
        botonBorrarFicha.setBounds(0, 100, 190, 50);

        getContentPane().add(panelPersonas);
        panelPersonas.setBounds(380, 70, 190, 200);

        panelRankings.setLayout(null);

        botonListado1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botonListado1.setText("RANKING LIDERES");
        panelRankings.add(botonListado1);
        botonListado1.setBounds(0, 0, 190, 50);

        botonListado2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botonListado2.setText("RANKING EXPERTAS");
        panelRankings.add(botonListado2);
        botonListado2.setBounds(0, 50, 190, 50);

        getContentPane().add(panelRankings);
        panelRankings.setBounds(570, 70, 190, 100);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reinofondo.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(-10, 60, 780, 290);

        pestañaNuevoProd.setMaximumSize(new java.awt.Dimension(760, 280));
        pestañaNuevoProd.setPreferredSize(new java.awt.Dimension(760, 280));
        pestañaNuevoProd.setLayout(null);

        labelIdProd.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        labelIdProd.setText("ID Producto");
        pestañaNuevoProd.add(labelIdProd);
        labelIdProd.setBounds(20, 60, 120, 23);

        LabelPrecio.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        LabelPrecio.setText("Precio");
        pestañaNuevoProd.add(LabelPrecio);
        LabelPrecio.setBounds(20, 180, 60, 26);

        LabelLinea.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        LabelLinea.setText("Linea");
        pestañaNuevoProd.add(LabelLinea);
        LabelLinea.setBounds(20, 140, 50, 26);

        tituloNuevoProd.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        tituloNuevoProd.setText("AGREGAR NUEVO PRODUCTO");
        pestañaNuevoProd.add(tituloNuevoProd);
        tituloNuevoProd.setBounds(200, 10, 360, 30);

        LabelNombreProd.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        LabelNombreProd.setText("Nombre Producto");
        pestañaNuevoProd.add(LabelNombreProd);
        LabelNombreProd.setBounds(20, 100, 150, 23);

        LabelTipo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        LabelTipo.setText("Tipo");
        pestañaNuevoProd.add(LabelTipo);
        LabelTipo.setBounds(20, 220, 50, 30);

        botonGuardarNP.setText("Guardar");
        botonGuardarNP.setEnabled(false);
        botonGuardarNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarNPActionPerformed(evt);
            }
        });
        botonGuardarNP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                botonGuardarNPKeyReleased(evt);
            }
        });
        pestañaNuevoProd.add(botonGuardarNP);
        botonGuardarNP.setBounds(510, 190, 133, 30);

        botonCancelarNP.setText("Cancelar");
        botonCancelarNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarNPActionPerformed(evt);
            }
        });
        pestañaNuevoProd.add(botonCancelarNP);
        botonCancelarNP.setBounds(510, 230, 133, 30);

        ingresaTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ingresaTipoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresaTipoKeyTyped(evt);
            }
        });
        pestañaNuevoProd.add(ingresaTipo);
        ingresaTipo.setBounds(190, 220, 200, 30);

        ingresaProd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresaProd.setEnabled(false);
        pestañaNuevoProd.add(ingresaProd);
        ingresaProd.setBounds(190, 60, 200, 30);

        ingresaNombreProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresaNombreProdActionPerformed(evt);
            }
        });
        ingresaNombreProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ingresaNombreProdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresaNombreProdKeyTyped(evt);
            }
        });
        pestañaNuevoProd.add(ingresaNombreProd);
        ingresaNombreProd.setBounds(190, 100, 200, 30);

        ingresaLinea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ingresaLineaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresaLineaKeyTyped(evt);
            }
        });
        pestañaNuevoProd.add(ingresaLinea);
        ingresaLinea.setBounds(190, 140, 200, 30);

        ingresaPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ingresaPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresaPrecioKeyTyped(evt);
            }
        });
        pestañaNuevoProd.add(ingresaPrecio);
        ingresaPrecio.setBounds(190, 180, 200, 30);

        getContentPane().add(pestañaNuevoProd);
        pestañaNuevoProd.setBounds(0, 70, 760, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean hayPestañasAbiertas(){
        if((panelCaja.isVisible())||(panelProductos.isVisible())||(panelPersonas.isVisible())||(panelRankings.isVisible()))
            return true;
        else
            return false;
    }
    
    private void cerrarPestañas(){
        panelCaja.setVisible(false);
        panelProductos.setVisible(false);
        panelPersonas.setVisible(false);
        panelRankings.setVisible(false);
    }
    
    private boolean camposProductoCompletos(){
        if ((ingresaLinea.getText().length()!=0)&&(ingresaNombreProd.getText().length()!=0)&&(ingresaPrecio.getText().length()!=0)&&(ingresaTipo.getText().length()!=0))
            return true;
        else 
            return false;
    }

    
    private void botonProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProductoActionPerformed
        if (!hayPestañasAbiertas()){
            panelProductos.setVisible(true);
        }
        else
            cerrarPestañas();
    }//GEN-LAST:event_botonProductoActionPerformed

    private void botonPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPersonasActionPerformed
        if (!hayPestañasAbiertas()){
            panelPersonas.setVisible(true);
        }
        else
            cerrarPestañas();
    }//GEN-LAST:event_botonPersonasActionPerformed

    private void botonCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCajaActionPerformed
        if (!hayPestañasAbiertas()){
            panelCaja.setVisible(true);
        }
        else
            cerrarPestañas();
    }//GEN-LAST:event_botonCajaActionPerformed

    private void botonRankingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRankingsActionPerformed
        if (!hayPestañasAbiertas()){
            panelRankings.setVisible(true);
        }
        else
            cerrarPestañas();     
    }//GEN-LAST:event_botonRankingsActionPerformed

    private void botonCajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCajaMouseEntered
        if(hayPestañasAbiertas()){
            cerrarPestañas();
            panelCaja.setVisible(true);
        }
    }//GEN-LAST:event_botonCajaMouseEntered

    private void botonProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProductoMouseEntered
        if(hayPestañasAbiertas()){
            cerrarPestañas();
            panelProductos.setVisible(true);
        }
    }//GEN-LAST:event_botonProductoMouseEntered

    private void botonPersonasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPersonasMouseEntered
        if(hayPestañasAbiertas()){        
            cerrarPestañas();
            panelPersonas.setVisible(true);
        }
    }//GEN-LAST:event_botonPersonasMouseEntered

    private void botonRankingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRankingsMouseEntered
        if(hayPestañasAbiertas()){
            cerrarPestañas();
            panelRankings.setVisible(true);
        }
    }//GEN-LAST:event_botonRankingsMouseEntered

    private void botonNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoProductoActionPerformed
       // nuevoProd np = new nuevoProd();
       panelProductos.setVisible(false);
       fondo.setVisible(false);
       pestañaNuevoProd.setVisible(true);
       ingresaProd.setText(String.valueOf(idProd));
    }//GEN-LAST:event_botonNuevoProductoActionPerformed

    private void botonGuardarNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarNPActionPerformed
        idProd++;
        pestañaNuevoProd.setVisible(false);
        fondo.setVisible(true);
        ingresaLinea.setText("");
        ingresaPrecio.setText("");
        ingresaNombreProd.setText("");
        ingresaTipo.setText("");
        botonGuardarNP.setEnabled(false);
    }//GEN-LAST:event_botonGuardarNPActionPerformed

    private void botonCancelarNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarNPActionPerformed
        pestañaNuevoProd.setVisible(false);
        fondo.setVisible(true);
        ingresaLinea.setText("");
        ingresaPrecio.setText("");
        ingresaNombreProd.setText("");
        ingresaTipo.setText("");
        botonGuardarNP.setEnabled(false);
    }//GEN-LAST:event_botonCancelarNPActionPerformed

    private void ingresaNombreProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaNombreProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresaNombreProdActionPerformed

    private void botonGuardarNPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonGuardarNPKeyReleased

    }//GEN-LAST:event_botonGuardarNPKeyReleased

    private void ingresaTipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresaTipoKeyReleased
        if(camposProductoCompletos())
            botonGuardarNP.setEnabled(true);
        else
            botonGuardarNP.setEnabled(false);
    }//GEN-LAST:event_ingresaTipoKeyReleased

    private void ingresaPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresaPrecioKeyReleased
        if(camposProductoCompletos())
            botonGuardarNP.setEnabled(true);
        else
            botonGuardarNP.setEnabled(false);
    }//GEN-LAST:event_ingresaPrecioKeyReleased

    private void ingresaLineaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresaLineaKeyReleased
        if(camposProductoCompletos())
            botonGuardarNP.setEnabled(true);
        else
            botonGuardarNP.setEnabled(false);
    }//GEN-LAST:event_ingresaLineaKeyReleased

    private void ingresaNombreProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresaNombreProdKeyReleased
        if(camposProductoCompletos())
            botonGuardarNP.setEnabled(true);
        else
            botonGuardarNP.setEnabled(false);
    }//GEN-LAST:event_ingresaNombreProdKeyReleased

    private void ingresaLineaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresaLineaKeyTyped
        
    }//GEN-LAST:event_ingresaLineaKeyTyped

    private void ingresaNombreProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresaNombreProdKeyTyped
             
    }//GEN-LAST:event_ingresaNombreProdKeyTyped

    private void ingresaPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresaPrecioKeyTyped

    }//GEN-LAST:event_ingresaPrecioKeyTyped

    private void ingresaTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresaTipoKeyTyped
    
    }//GEN-LAST:event_ingresaTipoKeyTyped

    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelLinea;
    private javax.swing.JLabel LabelNombreProd;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JLabel LabelTipo;
    private javax.swing.JButton botonBorrarFicha;
    private javax.swing.JButton botonBorrarProducto;
    private javax.swing.JButton botonCaja;
    private javax.swing.JButton botonCancelarNP;
    private javax.swing.JButton botonConsignacion;
    private javax.swing.JButton botonDevolucion;
    private javax.swing.JButton botonGuardarNP;
    private javax.swing.JButton botonListado;
    private javax.swing.JButton botonListado1;
    private javax.swing.JButton botonListado2;
    private javax.swing.JButton botonModificarFicha;
    private javax.swing.JButton botonMovimientos;
    private javax.swing.JButton botonNuevaFicha;
    private javax.swing.JButton botonNuevoProducto;
    private javax.swing.JButton botonPersonas;
    private javax.swing.JButton botonProducto;
    private javax.swing.JButton botonRankings;
    private javax.swing.JButton botonResumen;
    private javax.swing.JButton botonStock;
    private javax.swing.JButton botonVenta;
    private javax.swing.JButton botonVerListado;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField ingresaLinea;
    private javax.swing.JTextField ingresaNombreProd;
    private javax.swing.JTextField ingresaPrecio;
    private javax.swing.JTextField ingresaProd;
    private javax.swing.JTextField ingresaTipo;
    private javax.swing.JLabel labelIdProd;
    private javax.swing.JPanel panelCaja;
    private javax.swing.JPanel panelPersonas;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JPanel panelRankings;
    private javax.swing.JPanel pestañaNuevoProd;
    private javax.swing.JLabel tituloNuevoProd;
    // End of variables declaration//GEN-END:variables
    private int idProd;
}
