
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.sql.*;
import Project.ConnectionProvider;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
public class NewStudent extends javax.swing.JFrame implements ComponentListener, ActionListener, KeyListener {
    public void clear()
    {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jComboBox1.removeAllItems();
        roomNumber();
    }
    public void roomNumber()
    {
        int i=0;
        try
        {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from room where activate='Yes' and roomStatus='Not Booked'");
            while(rs.next())
            {
                i=1;
                jComboBox1.addItem(rs.getString(1));
            }
            if(i==0)
            {
                jButton2.setVisible(false);
                JOptionPane.showMessageDialog(null,"All Rooms are already Booked");
                setVisible(false);
            }
        }
        catch(Exception e)
        {
            
        }
    }
    /**
     * Creates new form NewStudent
     */
    public NewStudent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(480, 200));
        setUndecorated(true);
        addComponentListener(this);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 102, 57, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel3.setText("Father's Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 142, 125, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel4.setText("Mother's Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 182, 134, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel5.setText("Email -Id");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 222, 87, -1));

        jLabel6.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 262, 74, -1));

        jLabel7.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel7.setText("Collage Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 302, 119, -1));

        jLabel8.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel8.setText("Adhar Number");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 342, 134, -1));

        jLabel9.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel9.setText("Room Number");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 382, 134, -1));

        jTextField1.addKeyListener(this);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 62, 500, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 102, 500, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 142, 500, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 182, 500, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 222, 500, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 262, 500, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 302, 500, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 342, 500, -1));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 382, 500, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close all jframe.png"))); // NOI18N
        jButton1.addActionListener(this);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel1.setText("Mobile Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 62, 140, -1));

        jButton2.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(this);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 427, -1, -1));

        jButton3.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear.png"))); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(this);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 427, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backgroundmanage.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == jButton1) {
            NewStudent.this.jButton1ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton2) {
            NewStudent.this.jButton2ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton3) {
            NewStudent.this.jButton3ActionPerformed(evt);
        }
    }

    public void componentHidden(java.awt.event.ComponentEvent evt) {
    }

    public void componentMoved(java.awt.event.ComponentEvent evt) {
    }

    public void componentResized(java.awt.event.ComponentEvent evt) {
    }

    public void componentShown(java.awt.event.ComponentEvent evt) {
        if (evt.getSource() == NewStudent.this) {
            NewStudent.this.formComponentShown(evt);
        }
    }

    public void keyPressed(java.awt.event.KeyEvent evt) {
    }

    public void keyReleased(java.awt.event.KeyEvent evt) {
    }

    public void keyTyped(java.awt.event.KeyEvent evt) {
        if (evt.getSource() == jTextField1) {
            NewStudent.this.jTextField1KeyTyped(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        roomNumber();
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("") || jTextField8.getText().equals("") || jComboBox1.getSelectedItem().equals("")){
        JOptionPane.showMessageDialog(rootPane, "Please fill the form correctly");
        }
        else{
        String mobilenumber=jTextField1.getText();
        String name=jTextField2.getText();
        String fathername=jTextField3.getText();
        String mothername=jTextField4.getText();
        String email=jTextField5.getText();
        String address=jTextField6.getText();
        String college=jTextField7.getText();
        String aadhaar=jTextField8.getText();
        String roomnumber=(String)jComboBox1.getSelectedItem();
        String status="living";
        try
        {
            Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,mobilenumber);
            ps.setString(2,name);
            ps.setString(3,fathername);
            ps.setString(4,mothername);
            ps.setString(5,email);
            ps.setString(6,address);
            ps.setString(7,college);
            ps.setString(8,aadhaar);
            ps.setString(9,roomnumber);
            ps.setString(10,status);
            ps.executeUpdate();
            
            PreparedStatement psl=con.prepareStatement("update room set roomStatus='Booked' where number=?");
            psl.setString(1,roomnumber);
            psl.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Updated");
            clear();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
   
    }//GEN-LAST:event_jTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
