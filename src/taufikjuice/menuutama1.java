/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taufikjuice;

import java.awt.Color;
import static java.awt.Color.white;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import static javafx.scene.paint.Color.color;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;

/**
 *
 * @author ASUS
 */
public class menuutama1 extends javax.swing.JFrame {

    /**
     * Creates new form menuutama
     */
    public menuutama1() {
        initComponents();
        //menampilkan form ditengah layar
        this.setLocationRelativeTo(null);
        jPanel62.setVisible(false);
        jPanel62.setEnabled(false);
        getjam();
    }
    
    public void tampilUser(String user){
        lbluser.setText(user);
    }
    
    public void getbackgroundcolor(){
        Color c = JColorChooser.showDialog(null, "Background Color", jDesktopPane1.getBackground());
        jDesktopPane1.setBackground(c);
    }
    
    public void getjam(){
        ActionListener taskPerformer = new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                SimpleDateFormat tgl = new SimpleDateFormat("EEEE-dd-MMM-YYYY");
                String no1_jam = "";
                String no1_menit = "";
                String no1_detik = "";
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                if (nilai_jam<=9) {
                    no1_jam = "0";
                }
                if (nilai_menit<=9){
                    no1_menit = "0";
                }
                if (nilai_detik<=9){
                    no1_detik = "0";
                }
                String jam = no1_jam + Integer.toString(nilai_jam);
                String menit = no1_menit + Integer.toString(nilai_menit);
                String detik = no1_detik + Integer.toString(nilai_detik);
                lbl_jam.setText("   "+jam+ " : " +menit+ " : " +detik+ "   ");
                lbl_tgl.setText(tgl.format(dt));
            }
        };
        new javax.swing.Timer(1000, taskPerformer).start();
    }

    /**
     * This method is called from within the constructor to initialize the form
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Laporan_juice = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        Dashboard = new javax.swing.JLabel();
        jPanel76 = new javax.swing.JPanel();
        Transaksi = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbluser = new javax.swing.JLabel();
        lbl_tgl = new javax.swing.JLabel();
        Jam = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Background = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        About = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Logout = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        keluar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_jam = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(102, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Laporan_juice.setBackground(new java.awt.Color(102, 255, 255));
        Laporan_juice.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        Laporan_juice.setForeground(new java.awt.Color(0, 0, 0));
        Laporan_juice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconmenu/add-graph-report.png"))); // NOI18N
        Laporan_juice.setText(" Laporan Juice");
        jPanel4.add(Laporan_juice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 280, 50));

        jPanel12.setBackground(new java.awt.Color(102, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel12MouseExited(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dashboard.setBackground(new java.awt.Color(102, 255, 255));
        Dashboard.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        Dashboard.setForeground(new java.awt.Color(0, 0, 0));
        Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconmenu/speed.png"))); // NOI18N
        Dashboard.setText("Dashboard");
        jPanel12.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 50));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 280, 50));

        jPanel76.setBackground(new java.awt.Color(102, 255, 255));
        jPanel76.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel76MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel76MouseExited(evt);
            }
        });
        jPanel76.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Transaksi.setBackground(new java.awt.Color(102, 255, 255));
        Transaksi.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        Transaksi.setForeground(new java.awt.Color(0, 0, 0));
        Transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconmenu/cash-in-hand.png"))); // NOI18N
        Transaksi.setText(" Transaksi");
        jPanel76.add(Transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        jPanel1.add(jPanel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 280, 50));

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        lbluser.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbluser.setForeground(new java.awt.Color(0, 0, 153));
        lbluser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconmenu/user-male-circle.png"))); // NOI18N
        lbluser.setText("Sebagai");

        lbl_tgl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_tgl.setForeground(new java.awt.Color(0, 0, 153));
        lbl_tgl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconmenu/calendar.png"))); // NOI18N
        lbl_tgl.setText("Tanggal");

        Jam.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Jam.setForeground(new java.awt.Color(0, 0, 153));
        Jam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconmenu/clock.png"))); // NOI18N
        Jam.setText("Jam");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbluser)
                    .addComponent(lbl_tgl)
                    .addComponent(Jam))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(lbluser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_tgl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jam)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 270, 150));

        jPanel62.setBackground(new java.awt.Color(102, 255, 255));
        jPanel62.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel62.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(102, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        Background.setForeground(new java.awt.Color(0, 0, 0));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconmenu1/user-male.png"))); // NOI18N
        Background.setText("Background");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(Background)
                .addGap(0, 73, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(Background)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel62.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, -1));

        jPanel8.setBackground(new java.awt.Color(102, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });

        About.setForeground(new java.awt.Color(0, 0, 0));
        About.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconmenu1/high-importance.png"))); // NOI18N
        About.setText("About");
        About.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(About)
                .addGap(0, 109, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(About)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel62.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jPanel7.setBackground(new java.awt.Color(102, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });

        Logout.setForeground(new java.awt.Color(0, 0, 0));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconmenu1/logout-rounded-left.png"))); // NOI18N
        Logout.setText("Logout");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(Logout)
                .addGap(0, 103, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(Logout)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel62.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jPanel6.setBackground(new java.awt.Color(102, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });

        keluar.setForeground(new java.awt.Color(0, 0, 0));
        keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconmenu1/high-importance.png"))); // NOI18N
        keluar.setText("Keluar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(keluar)
                .addGap(0, 105, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(keluar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel62.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 190, -1));

        jPanel1.add(jPanel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconcrud/pbd1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel10.setBackground(new java.awt.Color(102, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconmenu/menu.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconmenu/menu.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, -10, 100, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 740));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        lbl_jam.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        lbl_jam.setText("Jam");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(813, Short.MAX_VALUE)
                .addComponent(lbl_jam)
                .addGap(103, 103, 103))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl_jam)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 990, 90));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDesktopPane1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 980, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        keluar.setForeground(Color.white);
        jPanel6.setBackground(new Color (0,102,102));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        keluar.setForeground(Color.BLACK);
        jPanel6.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        System.exit(0);
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        Logout.setForeground(Color.white);
        jPanel7.setBackground(new Color (0,102,102));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        Logout.setForeground(Color.BLACK);
        jPanel7.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        About.setForeground(Color.white);
        jPanel8.setBackground(new Color (0,102,102));
    }//GEN-LAST:event_jPanel8MouseEntered

    private void AboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutMouseExited

    }//GEN-LAST:event_AboutMouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        Background.setForeground(Color.white);
        jPanel5.setBackground(new Color (0,102,102));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        Background.setForeground(Color.BLACK);
        jPanel5.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        About.setForeground(Color.BLACK);
        jPanel8.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jPanel10.setBackground(new Color (102,255,255));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jPanel10.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        ImageIcon AS = new ImageIcon (getClass().getResource("/iconmenu/long-arrow-up.png"));
        jLabel2.setIcon(AS);
        jLabel2.setVisible(true);
        jLabel2.setEnabled(true);
        jLabel4.setVisible(false);
        jLabel4.setEnabled(false);
        jPanel62.setVisible(true);
        jPanel62.setEnabled(true);
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        jLabel2.setVisible(false);
        jLabel2.setEnabled(false);
        jLabel4.setVisible(true);
        jLabel4.setEnabled(true);
        jPanel62.setVisible(false);
        jPanel62.setEnabled(false);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseEntered
        Dashboard.setForeground(Color.white);
        jPanel12.setBackground(new Color (0,102,102));
    }//GEN-LAST:event_jPanel12MouseEntered

    private void jPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseExited
        Dashboard.setForeground(Color.BLACK);
        jPanel12.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jPanel12MouseExited

    private void jPanel76MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel76MouseEntered
        Transaksi.setForeground(Color.white);
        jPanel76.setBackground(new Color (0,102,102));
    }//GEN-LAST:event_jPanel76MouseEntered

    private void jPanel76MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel76MouseExited
        Transaksi.setForeground(Color.BLACK);
        jPanel76.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jPanel76MouseExited

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        Laporan_juice.setForeground(Color.white);
        jPanel4.setBackground(new Color (0,102,102));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        Laporan_juice.setForeground(Color.BLACK);
        jPanel4.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        getbackgroundcolor();
    }//GEN-LAST:event_jPanel5MousePressed

    private void jDesktopPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesktopPane1MousePressed
        
    }//GEN-LAST:event_jDesktopPane1MousePressed

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        this.setVisible(false);
        Loading ld = new Loading();
        ld.setVisible(true);
    }//GEN-LAST:event_jPanel7MousePressed

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
            java.util.logging.Logger.getLogger(menuutama1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuutama1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuutama1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuutama1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuutama1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel About;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Jam;
    private javax.swing.JLabel Laporan_juice;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Transaksi;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel keluar;
    private javax.swing.JLabel lbl_jam;
    private javax.swing.JLabel lbl_tgl;
    private javax.swing.JLabel lbluser;
    // End of variables declaration//GEN-END:variables
}

