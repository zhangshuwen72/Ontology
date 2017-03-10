package com.zsw.iass;


import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javafx.scene.control.ComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zsw
 */
public class CloudServer extends javax.swing.JFrame {

    /**
     * Creates new form CloudServer
     */
    public CloudServer() {
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

        jOsTypeSelect = new javax.swing.JComboBox<>();
        oslabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRamCapacitySeclect = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jRamTypeSelect = new javax.swing.JComboBox<>();
        DiskTypelabel = new javax.swing.JLabel();
        jDiskTypeSelect = new javax.swing.JComboBox<>();
        DiskCapacityLabel = new javax.swing.JLabel();
        jDiskCapacitySelect = new javax.swing.JComboBox<>();
        jcpuType = new javax.swing.JLabel();
        jcpuTypeSelect = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jCpuFreSelect = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jOsVersion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jDiskVersion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jRamVersion = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jCpuVersion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jOsTypeSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Windows", "Linux" }));
        jOsTypeSelect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jOsTypeSelectItemStateChanged(evt);
            }
        });
        jOsTypeSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOsTypeSelectActionPerformed(evt);
            }
        });
        jOsTypeSelect.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jOsTypeSelectPropertyChange(evt);
            }
        });

        oslabel.setText("操作系统类型");

        jLabel2.setText("内存容量");

        jRamCapacitySeclect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "1GB", "2GB", "3GB", "4GB", "6GB", "8GB", "16GB", "32GB" }));
        jRamCapacitySeclect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRamCapacitySeclectActionPerformed(evt);
            }
        });

        jLabel3.setText("内存类型");

        jRamTypeSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "DDR3", "DDR4" }));
        jRamTypeSelect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRamTypeSelectItemStateChanged(evt);
            }
        });
        jRamTypeSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRamTypeSelectActionPerformed(evt);
            }
        });

        DiskTypelabel.setText("硬盘类型");

        jDiskTypeSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "SSD", "MHD" }));
        jDiskTypeSelect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jDiskTypeSelectItemStateChanged(evt);
            }
        });
        jDiskTypeSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDiskTypeSelectActionPerformed(evt);
            }
        });

        DiskCapacityLabel.setText("硬盘容量");

        jDiskCapacitySelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "100GB", "200GB", "320GB", "500GB" }));
        jDiskCapacitySelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDiskCapacitySelectActionPerformed(evt);
            }
        });

        jcpuType.setText("处理器类型");

        jcpuTypeSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "AMDCPU", "IntelCPU" }));
        jcpuTypeSelect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcpuTypeSelectItemStateChanged(evt);
            }
        });
        jcpuTypeSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcpuTypeSelectActionPerformed(evt);
            }
        });

        jLabel7.setText("处理器频率");

        jCpuFreSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "2GHz", "3GHz" }));
        jCpuFreSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCpuFreSelectActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel9.setText("云服务搜索");

        jButton1.setText("提交");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("重置");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel1.setText("操作系统版本");

        jOsVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOsVersionActionPerformed(evt);
            }
        });

        jLabel4.setText("硬盘型号");

        jDiskVersion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));

        jLabel5.setText("内存型号");

        jRamVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRamVersionActionPerformed(evt);
            }
        });

        jLabel6.setText("处理器型号");

        jCpuVersion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));
        jCpuVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCpuVersionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(oslabel)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jcpuType)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcpuTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jRamTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DiskTypelabel)
                        .addGap(18, 18, 18)
                        .addComponent(jDiskTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDiskVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DiskCapacityLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2))
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCpuVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, 0)
                                        .addComponent(jDiskCapacitySelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jCpuFreSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(196, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jRamVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jRamCapacitySeclect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jOsTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jOsVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcpuType)
                    .addComponent(jcpuTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jCpuFreSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jCpuVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRamTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jRamCapacitySeclect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jRamVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiskTypelabel)
                    .addComponent(jDiskTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiskCapacityLabel)
                    .addComponent(jDiskCapacitySelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jDiskVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oslabel)
                    .addComponent(jOsTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOsVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jOsTypeSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOsTypeSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOsTypeSelectActionPerformed

    private void jRamCapacitySeclectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRamCapacitySeclectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRamCapacitySeclectActionPerformed

    private void jRamTypeSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRamTypeSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRamTypeSelectActionPerformed

    private void jDiskCapacitySelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDiskCapacitySelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDiskCapacitySelectActionPerformed

    private void jDiskTypeSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDiskTypeSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDiskTypeSelectActionPerformed

    private void jCpuFreSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCpuFreSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCpuFreSelectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcpuTypeSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcpuTypeSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcpuTypeSelectActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:  
        Map <String,String> requestMap=new HashMap<String, String>();
        requestMap.put("CpuType",jcpuTypeSelect.getSelectedItem().toString());
        requestMap.put("CpuVersion", jCpuVersion.getSelectedItem().toString());
        requestMap.put("CpuCapacity",jCpuFreSelect.getSelectedItem().toString());
        requestMap.put("DiskType",jDiskTypeSelect.getSelectedItem().toString());
        requestMap.put("DiskVersion",jDiskVersion.getSelectedItem().toString());
        requestMap.put("DiskCapacity",jDiskCapacitySelect.getSelectedItem().toString());
        requestMap.put("RamType",jRamTypeSelect.getSelectedItem().toString());
        requestMap.put("RamVersion", jRamVersion.getSelectedItem().toString());
        requestMap.put("RamCapacity",jRamCapacitySeclect.getSelectedItem().toString());
        requestMap.put("OSType",jOsTypeSelect.getSelectedItem().toString());
        requestMap.put("OSVersion", jOsVersion.getSelectedItem().toString());        
        
        System.out.println(requestMap);    
    }//GEN-LAST:event_jButton1MouseClicked

    private void jOsTypeSelectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jOsTypeSelectItemStateChanged

        if (jOsTypeSelect.getSelectedItem()=="Windows") {
            jOsVersion.removeAllItems();
            jOsVersion.addItem("");
            jOsVersion.addItem("windows7家庭普通版");
            jOsVersion.addItem("windows7旗舰版");
            jOsVersion.addItem("windows10");
            jOsVersion.setSelectedIndex(0);
           }
        else if (jOsTypeSelect.getSelectedItem()=="Linux") {
             jOsVersion.removeAllItems();
            jOsVersion.addItem("");
            jOsVersion.addItem("Ubuntu 16.0");
            jOsVersion.addItem("OpenSUSE13.1");
            jOsVersion.addItem("CentOS7.2");
            jOsVersion.addItem("Debian8.6");
            jOsVersion.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jOsTypeSelectItemStateChanged

    private void jOsTypeSelectPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jOsTypeSelectPropertyChange
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jOsTypeSelectPropertyChange

    private void jOsVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOsVersionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOsVersionActionPerformed

    private void jRamVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRamVersionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRamVersionActionPerformed

    private void jDiskTypeSelectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jDiskTypeSelectItemStateChanged
        if (jDiskTypeSelect.getSelectedItem()=="SSD") {
            jDiskVersion.removeAllItems();
            jDiskVersion.addItem("");
            jDiskVersion.addItem("Intel 540");
            jDiskVersion.addItem("Samsung_Mz750");
            jDiskVersion.addItem("KingstonSUV400");
            jDiskVersion.addItem("Netak_N3");
            jDiskVersion.addItem("SanDisk_z400");
            jDiskVersion.setSelectedIndex(0);  
        }
        else if(jDiskTypeSelect.getSelectedItem()=="MHD"){
            jDiskVersion.removeAllItems();
            jDiskVersion.addItem("");
            jDiskVersion.addItem("WD10EZEX");
            jDiskVersion.addItem("Seagate_ST3000");
           jDiskVersion.addItem("Toshiba_HDWD130");
            jDiskVersion.addItem("HTS721010");
            jDiskVersion.addItem("HP_507127-B21 ");
            jDiskVersion.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jDiskTypeSelectItemStateChanged

    private void jRamTypeSelectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRamTypeSelectItemStateChanged
        // TODO add your handling code here:
        if (jRamTypeSelect.getSelectedItem()=="DDR3") {
            jRamVersion.removeAllItems();
            jRamVersion.addItem("");
            jRamVersion.addItem("三星PC3-10600S ");
            jRamVersion.addItem("联想DDR3-1333");
            jRamVersion.addItem("联想DDR3 1066");
            jRamVersion.addItem("影驰 DDR3 1600");
            jRamVersion.addItem("海盗船2133");
            jRamVersion.setSelectedIndex(0);
            }
        else if (jRamTypeSelect.getSelectedItem()=="DDR4") {
             jRamVersion.removeAllItems();
            jRamVersion.addItem("");
            jRamVersion.addItem("影驰 DDR4 2400 ");
            jRamVersion.addItem("金士顿 DDR4 2133");
            jRamVersion.addItem("海盗船3000");
            jRamVersion.addItem("影驰 3600");
            jRamVersion.setSelectedIndex(0);
        }     
        
    }//GEN-LAST:event_jRamTypeSelectItemStateChanged

    private void jcpuTypeSelectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcpuTypeSelectItemStateChanged
        // TODO add your handling code here:
        if (jcpuTypeSelect.getSelectedItem()=="AMDCPU") {
            jCpuVersion.removeAllItems();
            jCpuVersion.addItem("");
            jCpuVersion.addItem("1");
            jCpuVersion.addItem("2");
            jCpuVersion.addItem("3");
            jCpuVersion.addItem("4");
            jCpuVersion.addItem("5");
            jCpuVersion.setSelectedIndex(0);
        }
            else if (jcpuTypeSelect.getSelectedItem()=="IntelCPU") {
            jCpuVersion.removeAllItems();
            jCpuVersion.addItem("");
            jCpuVersion.addItem("6");
            jCpuVersion.addItem("7");
            jCpuVersion.addItem("8");
            jCpuVersion.addItem("9");
            jCpuVersion.addItem("10");
            jCpuVersion.setSelectedIndex(0);
            
        }
    }//GEN-LAST:event_jcpuTypeSelectItemStateChanged

    private void jCpuVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCpuVersionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCpuVersionActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(CloudServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CloudServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CloudServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CloudServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CloudServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DiskCapacityLabel;
    private javax.swing.JLabel DiskTypelabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCpuFreSelect;
    private javax.swing.JComboBox<String> jCpuVersion;
    private javax.swing.JComboBox<String> jDiskCapacitySelect;
    private javax.swing.JComboBox<String> jDiskTypeSelect;
    private javax.swing.JComboBox<String> jDiskVersion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jOsTypeSelect;
    private javax.swing.JComboBox<String> jOsVersion;
    private javax.swing.JComboBox<String> jRamCapacitySeclect;
    private javax.swing.JComboBox<String> jRamTypeSelect;
    private javax.swing.JComboBox<String> jRamVersion;
    private javax.swing.JLabel jcpuType;
    private javax.swing.JComboBox<String> jcpuTypeSelect;
    private javax.swing.JLabel oslabel;
    // End of variables declaration//GEN-END:variables
}
