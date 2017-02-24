/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BikeRunning;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *프로그램 실행 화면.
 * 
 * @author Sungrae
 * Final Version
 */
public class BikeMain extends javax.swing.JFrame {
    Container contentPane;  //Container클래스의 객체인 contentPane 생성. 
    
    public BikeMain() {
        initComponents();
        ImageIcon main = new ImageIcon("./img/main.png");  //프로그램 초기화면의 이미지를 main 객체에 선언
        
        JLabel bikemain = new JLabel(main); //bikemain 객체에 초기 화면 이미지를 저장.
        
        contentPane = getContentPane(); //contentPane 객체를 얻음.
        contentPane.setLayout(new BorderLayout()); //Layout을 BorderLayout()으로 선언함.
        
        bikemain.setLocation(0,0); //초기 화면 이미지가 들어갈 좌표값
        
        contentPane.add(bikemain); //초기 화면 이미지를 contentPane 객체에 추가.
        
        setSize(398,290); //BikeMain 프레임의 크기 선언.
        // show the GUI window
        setVisible(true);
        setResizable(false); //프레임 크기 조정 x
        setLocationRelativeTo(null); //프레임을 중앙으로
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jGo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("우리동네 한바퀴");
        setPreferredSize(new java.awt.Dimension(398, 290));

        jLabel1.setFont(new java.awt.Font("중간안상수체", 1, 36)); // NOI18N
        jLabel1.setText("우리동네 한바퀴");

        jGo.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jGo.setText("Go");
        jGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jGo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jGo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGoActionPerformed
        // TODO add your handling code here:
        new MainView(); //구/군 화면 실행
    }//GEN-LAST:event_jGoActionPerformed

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
            java.util.logging.Logger.getLogger(BikeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BikeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BikeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BikeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BikeMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jGo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
