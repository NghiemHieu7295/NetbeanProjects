package java2_lab8;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegis = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblBirth = new javax.swing.JLabel();
        txtBirth = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail1 = new javax.swing.JLabel();
        radioMail = new javax.swing.JRadioButton();
        radioFemail = new javax.swing.JRadioButton();
        lblProvince = new javax.swing.JLabel();
        cboxProvince = new javax.swing.JComboBox<>();
        panelOperation = new javax.swing.JPanel();
        btnRegis = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 350));
        setResizable(false);

        panelRegis.setBorder(javax.swing.BorderFactory.createTitledBorder("Register Information"));
        panelRegis.setName(""); // NOI18N

        lblName.setText("   Name");
        lblName.setName(""); // NOI18N

        lblBirth.setText("   Date of Birth");
        lblBirth.setName(""); // NOI18N

        lblEmail.setText("   Email");
        lblEmail.setName(""); // NOI18N

        lblEmail1.setText("   Sex");
        lblEmail1.setName(""); // NOI18N

        radioMail.setText("Mail");

        radioFemail.setText("Femail");

        lblProvince.setText("   Province");
        lblProvince.setName(""); // NOI18N

        cboxProvince.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ha Noi", "Hai Phong", "Hai Duong", "Thai Binh", "Nam Dinh", "Thanh Hoa", "Nghe An", "Ha Tinh" }));

        javax.swing.GroupLayout panelRegisLayout = new javax.swing.GroupLayout(panelRegis);
        panelRegis.setLayout(panelRegisLayout);
        panelRegisLayout.setHorizontalGroup(
            panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisLayout.createSequentialGroup()
                        .addGroup(panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegisLayout.createSequentialGroup()
                                .addComponent(radioMail)
                                .addGap(39, 39, 39)
                                .addComponent(radioFemail))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisLayout.createSequentialGroup()
                        .addComponent(lblBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisLayout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        panelRegisLayout.setVerticalGroup(
            panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioMail)
                    .addComponent(radioFemail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelOperation.setBorder(javax.swing.BorderFactory.createTitledBorder("Operations"));

        btnRegis.setText("Register");
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOperationLayout = new javax.swing.GroupLayout(panelOperation);
        panelOperation.setLayout(panelOperationLayout);
        panelOperationLayout.setHorizontalGroup(
            panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperationLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOperationLayout.setVerticalGroup(
            panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOperationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRegis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelRegis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtName.setText("");
        txtBirth.setText("");
        txtEmail.setText("");
        cboxProvince.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
        
        String name = txtName.getText();
        String birth = txtBirth.getText();
        String email = txtEmail.getText();
        String sex = "", content = "";
        
        if(name.matches("[a-zA-Z ]{1,}") == false){
            JOptionPane.showMessageDialog(null, "Bạn phải nhập họ tên.");
            return;
        }
        
        if(birth.matches("(\\d){2}-(\\d){2}-(\\d){4}") == false){
            JOptionPane.showMessageDialog(null, "Bạn phải nhập vào ngày sinh dạng dd-mm-yyyy");
            return;
        }
        
        if((email.contains("@") == false) || (email.contains(".") == false)){
            JOptionPane.showMessageDialog(null, "Bạn phải nhập email có @ và .");
            return;
        }
        
        if((radioMail.isSelected() == false) && (radioFemail.isSelected() == false)){
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn giới tính.");
            return;
        }
        
        if(radioMail.isSelected()){
           sex = "Nam";
           radioFemail.setSelected(false);
        }
        
        if(radioFemail.isSelected()){
           sex = "Nu";
           radioMail.setSelected(false);
        }
        
        Person p = new Person();
        p.setName(name);
        p.setDateOfBirth(birth);
        p.setEmail(email);
        p.setSex(sex);
        p.setProvince(cboxProvince.getSelectedItem().toString());
        
        File file = new File("test/dulieu.txt");
        if(file.exists()){}
        else{
            try{
                file.createNewFile();
                JOptionPane.showMessageDialog(null, "Đã tạo file dulieu.txt");
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        
        try{
            FileInputStream fis = new FileInputStream(file);
            int c = fis.read();
            while(c != -1){
                content += String.valueOf((char) c);
                //System.out.print((char) c);
                c = fis.read();
            }
            
            FileOutputStream fos = new FileOutputStream(file);
            content = content + p.toString();
            fos.write(content.getBytes());
            JOptionPane.showMessageDialog(null, "Đã ghi dữ liệu xong.");
            fos.close();
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null, "Ghi dữ liệu thất bại.");
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null, "Ghi dữ liệu thất bại.");
        }
    }//GEN-LAST:event_btnRegisActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegis;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cboxProvince;
    private javax.swing.JLabel lblBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProvince;
    private javax.swing.JPanel panelOperation;
    private javax.swing.JPanel panelRegis;
    private javax.swing.JRadioButton radioFemail;
    private javax.swing.JRadioButton radioMail;
    private javax.swing.JTextField txtBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
