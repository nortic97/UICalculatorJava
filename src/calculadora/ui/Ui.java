package calculadora.ui;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ui extends javax.swing.JFrame {

    int xx;
    int xy;
    
    public Ui() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        bordes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_operacion = new javax.swing.JLabel();
        txt_resultado = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_divide = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_percent = new javax.swing.JButton();
        btn_number_seven = new javax.swing.JButton();
        btn_number_eight = new javax.swing.JButton();
        btn_number_nine = new javax.swing.JButton();
        btn_mult = new javax.swing.JButton();
        btn_number_fourth = new javax.swing.JButton();
        btn_number_five = new javax.swing.JButton();
        btn_number_six = new javax.swing.JButton();
        btn_minus = new javax.swing.JButton();
        btn_number_one = new javax.swing.JButton();
        btn_number_two = new javax.swing.JButton();
        btn_number_three = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        btn_number_zero = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();
        btn_equals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(247, 125, 97));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_operacion.setFont(RobotoFont("Roboto-Black",Font.BOLD, 18)
        );
        txt_operacion.setForeground(new java.awt.Color(247, 254, 255));
        txt_operacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txt_operacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, 32));

        txt_resultado.setFont(RobotoFont("Roboto-Black",Font.BOLD, 48)
        );
        txt_resultado.setForeground(new java.awt.Color(247, 254, 255));
        txt_resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txt_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 260, 46));

        jPanel3.setBackground(new java.awt.Color(7, 21, 48));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 10)
        );
        jButton2.setForeground(new java.awt.Color(247, 254, 255));
        jButton2.setText("X");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 40, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_divide.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        btn_divide.setForeground(new java.awt.Color(52, 52, 52));
        btn_divide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_divide.setText("/");
        btn_divide.setBorder(null);
        btn_divide.setBorderPainted(false);
        btn_divide.setContentAreaFilled(false);
        btn_divide.setFocusPainted(false);
        btn_divide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_divide.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_divide.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divideActionPerformed(evt);
            }
        });
        jPanel2.add(btn_divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 50, 50));

        btn_clear.setFont(RobotoFont("Roboto-Light", Font.BOLD, 24)
        );
        btn_clear.setForeground(new java.awt.Color(238, 111, 97));
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_clear.setText("C");
        btn_clear.setBorder(null);
        btn_clear.setBorderPainted(false);
        btn_clear.setContentAreaFilled(false);
        btn_clear.setFocusPainted(false);
        btn_clear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_clear.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_clear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel2.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jButton3.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        jButton3.setForeground(new java.awt.Color(52, 52, 52));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        jButton3.setText("<-");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 50));

        btn_percent.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        btn_percent.setForeground(new java.awt.Color(52, 52, 52));
        btn_percent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_percent.setText("%");
        btn_percent.setBorder(null);
        btn_percent.setBorderPainted(false);
        btn_percent.setContentAreaFilled(false);
        btn_percent.setFocusPainted(false);
        btn_percent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_percent.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_percent.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_percentActionPerformed(evt);
            }
        });
        jPanel2.add(btn_percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 50, 50));

        btn_number_seven.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        btn_number_seven.setForeground(new java.awt.Color(52, 52, 52));
        btn_number_seven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_seven.setText("7");
        btn_number_seven.setBorder(null);
        btn_number_seven.setBorderPainted(false);
        btn_number_seven.setContentAreaFilled(false);
        btn_number_seven.setFocusPainted(false);
        btn_number_seven.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_number_seven.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_seven.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_number_seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_number_sevenActionPerformed(evt);
            }
        });
        jPanel2.add(btn_number_seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 50, 50));

        btn_number_eight.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        btn_number_eight.setForeground(new java.awt.Color(52, 52, 52));
        btn_number_eight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_eight.setText("8");
        btn_number_eight.setBorder(null);
        btn_number_eight.setBorderPainted(false);
        btn_number_eight.setContentAreaFilled(false);
        btn_number_eight.setFocusPainted(false);
        btn_number_eight.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_number_eight.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_eight.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_number_eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_number_eightActionPerformed(evt);
            }
        });
        jPanel2.add(btn_number_eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 50, 50));

        btn_number_nine.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        btn_number_nine.setForeground(new java.awt.Color(52, 52, 52));
        btn_number_nine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_nine.setText("9");
        btn_number_nine.setBorder(null);
        btn_number_nine.setBorderPainted(false);
        btn_number_nine.setContentAreaFilled(false);
        btn_number_nine.setFocusPainted(false);
        btn_number_nine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_number_nine.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_nine.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_number_nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_number_nineActionPerformed(evt);
            }
        });
        jPanel2.add(btn_number_nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 50, 50));

        btn_mult.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        btn_mult.setForeground(new java.awt.Color(52, 52, 52));
        btn_mult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_mult.setText("*");
        btn_mult.setBorder(null);
        btn_mult.setBorderPainted(false);
        btn_mult.setContentAreaFilled(false);
        btn_mult.setFocusPainted(false);
        btn_mult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mult.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_mult.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mult, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 50, 50));

        btn_number_fourth.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        btn_number_fourth.setForeground(new java.awt.Color(52, 52, 52));
        btn_number_fourth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_fourth.setText("4");
        btn_number_fourth.setBorder(null);
        btn_number_fourth.setBorderPainted(false);
        btn_number_fourth.setContentAreaFilled(false);
        btn_number_fourth.setFocusPainted(false);
        btn_number_fourth.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_number_fourth.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_fourth.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_number_fourth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_number_fourthActionPerformed(evt);
            }
        });
        jPanel2.add(btn_number_fourth, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, 50));

        btn_number_five.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        btn_number_five.setForeground(new java.awt.Color(52, 52, 52));
        btn_number_five.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_five.setText("5");
        btn_number_five.setBorder(null);
        btn_number_five.setBorderPainted(false);
        btn_number_five.setContentAreaFilled(false);
        btn_number_five.setFocusPainted(false);
        btn_number_five.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_number_five.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_five.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_number_five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_number_fiveActionPerformed(evt);
            }
        });
        jPanel2.add(btn_number_five, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 50, 50));

        btn_number_six.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        btn_number_six.setForeground(new java.awt.Color(52, 52, 52));
        btn_number_six.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_six.setText("6");
        btn_number_six.setBorder(null);
        btn_number_six.setBorderPainted(false);
        btn_number_six.setContentAreaFilled(false);
        btn_number_six.setFocusPainted(false);
        btn_number_six.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_number_six.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_six.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_number_six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_number_sixActionPerformed(evt);
            }
        });
        jPanel2.add(btn_number_six, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 50, 50));

        btn_minus.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        btn_minus.setForeground(new java.awt.Color(52, 52, 52));
        btn_minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_minus.setText("-");
        btn_minus.setBorder(null);
        btn_minus.setBorderPainted(false);
        btn_minus.setContentAreaFilled(false);
        btn_minus.setFocusPainted(false);
        btn_minus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_minus.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_minus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minusActionPerformed(evt);
            }
        });
        jPanel2.add(btn_minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 50, 50));

        btn_number_one.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        btn_number_one.setForeground(new java.awt.Color(52, 52, 52));
        btn_number_one.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_one.setText("1");
        btn_number_one.setBorder(null);
        btn_number_one.setBorderPainted(false);
        btn_number_one.setContentAreaFilled(false);
        btn_number_one.setFocusPainted(false);
        btn_number_one.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_number_one.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_one.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_number_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_number_oneActionPerformed(evt);
            }
        });
        jPanel2.add(btn_number_one, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 50, 50));

        btn_number_two.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        btn_number_two.setForeground(new java.awt.Color(52, 52, 52));
        btn_number_two.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_two.setText("2");
        btn_number_two.setBorder(null);
        btn_number_two.setBorderPainted(false);
        btn_number_two.setContentAreaFilled(false);
        btn_number_two.setFocusPainted(false);
        btn_number_two.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_number_two.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_two.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_number_two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_number_twoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_number_two, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 50, 50));

        btn_number_three.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        btn_number_three.setForeground(new java.awt.Color(52, 52, 52));
        btn_number_three.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_three.setText("3");
        btn_number_three.setBorder(null);
        btn_number_three.setBorderPainted(false);
        btn_number_three.setContentAreaFilled(false);
        btn_number_three.setFocusPainted(false);
        btn_number_three.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_number_three.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_three.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_number_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_number_threeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_number_three, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 50, 50));

        btn_add.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        btn_add.setForeground(new java.awt.Color(52, 52, 52));
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_add.setText("+");
        btn_add.setBorder(null);
        btn_add.setBorderPainted(false);
        btn_add.setContentAreaFilled(false);
        btn_add.setFocusPainted(false);
        btn_add.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_add.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_add.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel2.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 50, 50));

        jButton17.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        jButton17.setForeground(new java.awt.Color(52, 52, 52));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        jButton17.setText("+/-");
        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setFocusPainted(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        jButton17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 50, 50));

        btn_number_zero.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        btn_number_zero.setForeground(new java.awt.Color(52, 52, 52));
        btn_number_zero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_zero.setText("0");
        btn_number_zero.setBorder(null);
        btn_number_zero.setBorderPainted(false);
        btn_number_zero.setContentAreaFilled(false);
        btn_number_zero.setFocusPainted(false);
        btn_number_zero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_number_zero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_number_zero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_number_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_number_zeroActionPerformed(evt);
            }
        });
        jPanel2.add(btn_number_zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 50, 50));

        btn_dot.setFont(RobotoFont("Roboto-Light", Font.PLAIN, 24)
        );
        btn_dot.setForeground(new java.awt.Color(52, 52, 52));
        btn_dot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_dot.setText(".");
        btn_dot.setBorder(null);
        btn_dot.setBorderPainted(false);
        btn_dot.setContentAreaFilled(false);
        btn_dot.setFocusPainted(false);
        btn_dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dot.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_dot.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });
        jPanel2.add(btn_dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 50, 50));

        btn_equals.setFont(RobotoFont("Roboto-Light", Font.BOLD, 24)
        );
        btn_equals.setForeground(new java.awt.Color(238, 111, 97));
        btn_equals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_equals.setText("=");
        btn_equals.setBorder(null);
        btn_equals.setBorderPainted(false);
        btn_equals.setContentAreaFilled(false);
        btn_equals.setFocusPainted(false);
        btn_equals.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equals.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_normal.png"))); // NOI18N
        btn_equals.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ui/assets/boton_1_roll.png"))); // NOI18N
        btn_equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_equals, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 280, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_number_sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_number_sixActionPerformed
        addNumber("6");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_number_sixActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed

        txt_resultado.setText("");
        txt_operacion.setText("");

    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_number_oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_number_oneActionPerformed

        addNumber("1");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_number_oneActionPerformed

    private void btn_number_twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_number_twoActionPerformed
        addNumber("2");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_number_twoActionPerformed

    private void btn_number_threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_number_threeActionPerformed
        addNumber("3");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_number_threeActionPerformed

    private void btn_number_fourthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_number_fourthActionPerformed
        addNumber("4");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_number_fourthActionPerformed

    private void btn_number_fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_number_fiveActionPerformed
        addNumber("5");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_number_fiveActionPerformed

    private void btn_number_sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_number_sevenActionPerformed
        addNumber("7");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_number_sevenActionPerformed

    private void btn_number_eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_number_eightActionPerformed
        addNumber("8");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_number_eightActionPerformed

    private void btn_number_nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_number_nineActionPerformed
        addNumber("9");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_number_nineActionPerformed

    private void btn_number_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_number_zeroActionPerformed
        addNumber("0");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_number_zeroActionPerformed

    private void btn_percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_percentActionPerformed
        addNumber("%");
    }//GEN-LAST:event_btn_percentActionPerformed

    private void btn_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divideActionPerformed
        addNumber("/");
    }//GEN-LAST:event_btn_divideActionPerformed

    private void btn_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multActionPerformed
        addNumber("*");
    }//GEN-LAST:event_btn_multActionPerformed

    private void btn_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minusActionPerformed
        addNumber("-");
    }//GEN-LAST:event_btn_minusActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        addNumber("+");
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
        addNumber(".");
    }//GEN-LAST:event_btn_dotActionPerformed

    private void btn_equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalsActionPerformed
        String op = txt_operacion.getText();

        txt_resultado.setText(op);
    }//GEN-LAST:event_btn_equalsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (txt_operacion.getText().length() > 0) {
            String text = txt_operacion.getText().substring(0, txt_operacion.getText().length() - 1);
            txt_operacion.setText(text);
            btn_equals.doClick();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
       xx = evt.getX();
       xy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation( x - xx, y - xy);
    }//GEN-LAST:event_jPanel3MouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_divide;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_equals;
    private javax.swing.JButton btn_minus;
    private javax.swing.JButton btn_mult;
    private javax.swing.JButton btn_number_eight;
    private javax.swing.JButton btn_number_five;
    private javax.swing.JButton btn_number_fourth;
    private javax.swing.JButton btn_number_nine;
    private javax.swing.JButton btn_number_one;
    private javax.swing.JButton btn_number_seven;
    private javax.swing.JButton btn_number_six;
    private javax.swing.JButton btn_number_three;
    private javax.swing.JButton btn_number_two;
    private javax.swing.JButton btn_number_zero;
    private javax.swing.JButton btn_percent;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txt_operacion;
    private javax.swing.JLabel txt_resultado;
    // End of variables declaration//GEN-END:variables

    public Font RobotoFont(String fuente, int style, int size) {

        try {

            Font robotoFlex = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Fonts/" + fuente + ".ttf")).deriveFont(style, size);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(robotoFlex);
            return robotoFlex;

        } catch (FontFormatException | IOException ex) {

            Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
            Font Arial = new Font("Arial", Font.BOLD, 12);
            return Arial;

        }
    }

    public void addNumber(String value) {
        txt_operacion.setText(txt_operacion.getText() + value);
    }
    
    public void bordes(){
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27 , 27);
        this.setShape(forma);
    }

}
