/*
 * To chang
    @Override
    public int getWidth(ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHeight(ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImageProducer getSource() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Graphics getGraphics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getProperty(String name, ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
e this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.TimerTask;
import javax.swing.ImageIcon;

/**
 *
 * @author Daylton
 */
public class TelaLoading extends javax.swing.JFrame {

    /**
     * Creates new form TelaLoading
     */
    
    public static final long TEMPO = (1000* 1);
    int i = 0;
    TimerTask tarefa;
    
    public TelaLoading() {
        initComponents();
        
//        ImageIcon img = new ImageIcon("src/br/com/projeto/image/logo_campeonato1.png");
//        img.setImage(img.getImage().getScaledInstance(40 , 40, Image.SCALE_SMOOTH)); //Assim dá para definir o tamanho da imagem
//        this.setIconImage(img.getImage());
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        pgLoading.setBorderPainted(false);
        pgLoading.setForeground(Color.GREEN); //Cor da barra de progresso
        pgLoading.setMaximum(100);    
        pgLoading.setMinimum(0);
        
        java.util.Timer timer = null;  
        if (timer == null) {  
            timer = new java.util.Timer();  
            tarefa = new TimerTask() {  
                public void run() {  
                    try {                        
                        if(i <= 100){   
                            pgLoading.setValue(soma());    
                            pgLoading.isIndeterminate();                            
                        }else{
                            fechar();
                            tarefa.cancel();
                        }
                        
                    } catch (Exception e) {  
                        e.printStackTrace();  
                    }  
                }  
            };  
            timer.scheduleAtFixedRate(tarefa, TEMPO, TEMPO);  
        } 
        this.dispose();
    }
    
    public int soma(){
        return this.i = i + 20;        
    }
    
    public void fechar(){
        this.dispose();
        TelaInicarCampeonato form1 = new TelaInicarCampeonato();
        form1.setAlwaysOnTop(false);
        form1.setVisible(true);
        form1.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pgLoading = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/image/loagin.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pgLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(pgLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar pgLoading;
    // End of variables declaration//GEN-END:variables
}
