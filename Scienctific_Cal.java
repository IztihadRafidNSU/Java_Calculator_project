package Scientific_Calculate;

//import java.awt.Container;
import java.awt.event.KeyEvent;
import static java.lang.Math.asin;
//import javafx.scene.paint.Color;

/**
 *
 * @author Iztihad Rafid
 */
public class Scienctific_Cal extends javax.swing.JFrame {
//inheritance
    double firstnum;
    double secondnum;
    double result;
    String operations;
    private Object math;

    public Scienctific_Cal() {
     initComponents();
        ButtonON.setEnabled(false);
        
    }

    public void enable() { ///For enable on button
        ButtonON.setEnabled(false);
        ButtonOFF.setEnabled(true);

        Display_output.setEnabled(true);
        Button0.setEnabled(true);
        Button1.setEnabled(true);
        Button2.setEnabled(true);
        Button3.setEnabled(true);
        Button4.setEnabled(true);
        Button5.setEnabled(true);
        Button6.setEnabled(true);
        Button7.setEnabled(true);
        button8.setEnabled(true);
        Buttion9.setEnabled(true);
        ButtonBackspace.setEnabled(true);
        ButtonBinary.setEnabled(true);
        ButtonCubicRoot.setEnabled(true);
        ButtonClear.setEnabled(true);
        ButtonCos.setEnabled(true);
        ButtonCosh.setEnabled(true);
        ButtonDivision.setEnabled(true);
        ButtonDot.setEnabled(true);
        ButtonEqual.setEnabled(true);
        ButtonHexa.setEnabled(true);
        ButtonLog.setEnabled(true);
        Fah_to_Celsius.setEnabled(true);
        ButtonMinus.setEnabled(true);
        Cel_to_Fahrenheight.setEnabled(true);
        ButtonMultiple.setEnabled(true);
        ButtonOctal.setEnabled(true);
        ButtonPi.setEnabled(true);
        ButtonPlus.setEnabled(true);
        Button_PlusMinus.setEnabled(true);
        ButtionRoot.setEnabled(true);
        Expotentail.setEnabled(true);
        ButtonRund.setEnabled(true);
        ButtonSin.setEnabled(true);
        ButtonSinh.setEnabled(true);
        ButtonTan.setEnabled(true);
        ButtonTanh.setEnabled(true);
        Button_Xpow2.setEnabled(true);
        Button_Xpow3.setEnabled(true);
        Button_XpowY.setEnabled(true);
        Buttonlnx.setEnabled(true);
        Display_output.setEnabled(true);
        Pascal_to_atm.setEnabled(true);
Atm_to_Pascal.setEnabled(true);
KPS_to_MPS.setEnabled(true);
MeterPerSec_to_KMPerHour.setEnabled(true);
Km_to_Mile.setEnabled(true);
    }

    public void disable() {  // FOR OFF 
        ButtonON.setEnabled(true);
        ButtonOFF.setEnabled(false);
        Display_output.setEnabled(false);
        Button0.setEnabled(false);
        Fah_to_Celsius.setEnabled(false);
        Cel_to_Fahrenheight.setEnabled(false);
        Button1.setEnabled(false);
        Button2.setEnabled(false);
        Button3.setEnabled(false);
        Button4.setEnabled(false);
        Button5.setEnabled(false);
        Button6.setEnabled(false);
        Button7.setEnabled(false);
        button8.setEnabled(false);
        Expotentail.setEnabled(false);
        Buttion9.setEnabled(false);
        ButtonBackspace.setEnabled(false);
        ButtonBinary.setEnabled(false);
        ButtonCubicRoot.setEnabled(false);
        ButtonClear.setEnabled(false);
        ButtonCos.setEnabled(false);
        ButtonCosh.setEnabled(false);
        ButtonDivision.setEnabled(false);
        ButtonDot.setEnabled(false);
        ButtonEqual.setEnabled(false);
        ButtonHexa.setEnabled(false);
        ButtonLog.setEnabled(false);
        ButtonMinus.setEnabled(false);

        ButtonMultiple.setEnabled(false);
        ButtonOctal.setEnabled(false);
        ButtonPi.setEnabled(false);
        ButtonPlus.setEnabled(false);
        Button_PlusMinus.setEnabled(false);
        ButtionRoot.setEnabled(false);
        ButtonRund.setEnabled(false);
        ButtonSin.setEnabled(false);
        ButtonSinh.setEnabled(false);
        ButtonTan.setEnabled(false);
        ButtonTanh.setEnabled(false);
        Button_Xpow2.setEnabled(false);
        Button_Xpow3.setEnabled(false);
        Button_XpowY.setEnabled(false);
        Buttonlnx.setEnabled(false);
        Display_output.setEnabled(false);
        Pascal_to_atm.setEnabled(false);
Atm_to_Pascal.setEnabled(false);
KPS_to_MPS.setEnabled(false);
MeterPerSec_to_KMPerHour.setEnabled(false);
Km_to_Mile.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Display_output = new javax.swing.JTextField();
        ButtonMinus = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        Buttion9 = new javax.swing.JButton();
        ButtonMultiple = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        ButtonDivision = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        ButtonEqual = new javax.swing.JButton();
        Button_PlusMinus = new javax.swing.JButton();
        ButtonDot = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        ButtonBackspace = new javax.swing.JButton();
        ButtonClear = new javax.swing.JButton();
        ButtionRoot = new javax.swing.JButton();
        ButtonPlus = new javax.swing.JButton();
        ButtonLog = new javax.swing.JButton();
        ButtonSin = new javax.swing.JButton();
        ButtonSinh = new javax.swing.JButton();
        ButtonPi = new javax.swing.JButton();
        ButtonCos = new javax.swing.JButton();
        ButtonCosh = new javax.swing.JButton();
        Button_XpowY = new javax.swing.JButton();
        ButtonTan = new javax.swing.JButton();
        ButtonTanh = new javax.swing.JButton();
        Button_Xpow2 = new javax.swing.JButton();
        ButtonCubicRoot = new javax.swing.JButton();
        ButtonRund = new javax.swing.JButton();
        Button_Xpow3 = new javax.swing.JButton();
        ButtonBinary = new javax.swing.JButton();
        ButtonHexa = new javax.swing.JButton();
        Buttonlnx = new javax.swing.JButton();
        ButtonOctal = new javax.swing.JButton();
        ButtonON = new javax.swing.JRadioButton();
        ButtonOFF = new javax.swing.JRadioButton();
        Fah_to_Celsius = new javax.swing.JButton();
        Cel_to_Fahrenheight = new javax.swing.JButton();
        KPS_to_MPS = new javax.swing.JButton();
        MeterPerSec_to_KMPerHour = new javax.swing.JButton();
        Expotentail = new javax.swing.JButton();
        Pascal_to_atm = new javax.swing.JButton();
        Atm_to_Pascal = new javax.swing.JButton();
        Km_to_Mile = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jButton1.setText("jButton1");

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Display_output.setBackground(new java.awt.Color(0, 0, 0));
        Display_output.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Display_output.setForeground(new java.awt.Color(255, 0, 0));
        Display_output.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Display_output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Display_outputActionPerformed(evt);
            }
        });
        Display_output.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Display_outputKeyTyped(evt);
            }
        });

        ButtonMinus.setBackground(new java.awt.Color(0, 0, 0));
        ButtonMinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonMinus.setForeground(new java.awt.Color(255, 0, 0));
        ButtonMinus.setText("-");
        ButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMinusActionPerformed(evt);
            }
        });

        Button7.setBackground(new java.awt.Color(0, 0, 0));
        Button7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button7.setForeground(new java.awt.Color(255, 0, 0));
        Button7.setText("7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        button8.setBackground(new java.awt.Color(0, 0, 0));
        button8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        button8.setForeground(new java.awt.Color(255, 0, 0));
        button8.setText("8");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        Buttion9.setBackground(new java.awt.Color(0, 0, 0));
        Buttion9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Buttion9.setForeground(new java.awt.Color(255, 0, 0));
        Buttion9.setText("9");
        Buttion9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buttion9ActionPerformed(evt);
            }
        });

        ButtonMultiple.setBackground(new java.awt.Color(0, 0, 0));
        ButtonMultiple.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonMultiple.setForeground(new java.awt.Color(255, 0, 0));
        ButtonMultiple.setText("*");
        ButtonMultiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMultipleActionPerformed(evt);
            }
        });

        Button6.setBackground(new java.awt.Color(0, 0, 0));
        Button6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button6.setForeground(new java.awt.Color(255, 0, 0));
        Button6.setText("6");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button5.setBackground(new java.awt.Color(0, 0, 0));
        Button5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button5.setForeground(new java.awt.Color(255, 0, 0));
        Button5.setText("5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button4.setBackground(new java.awt.Color(0, 0, 0));
        Button4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button4.setForeground(new java.awt.Color(255, 0, 0));
        Button4.setText("4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        ButtonDivision.setBackground(new java.awt.Color(0, 0, 0));
        ButtonDivision.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonDivision.setForeground(new java.awt.Color(255, 0, 0));
        ButtonDivision.setText("/");
        ButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDivisionActionPerformed(evt);
            }
        });

        Button3.setBackground(new java.awt.Color(0, 0, 0));
        Button3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button3.setForeground(new java.awt.Color(255, 0, 0));
        Button3.setText("3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button2.setBackground(new java.awt.Color(0, 0, 0));
        Button2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button2.setForeground(new java.awt.Color(255, 0, 0));
        Button2.setText("2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button1.setBackground(new java.awt.Color(0, 0, 0));
        Button1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button1.setForeground(new java.awt.Color(255, 0, 0));
        Button1.setText("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        ButtonEqual.setBackground(new java.awt.Color(0, 0, 0));
        ButtonEqual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonEqual.setForeground(new java.awt.Color(255, 0, 0));
        ButtonEqual.setText("=");
        ButtonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEqualActionPerformed(evt);
            }
        });

        Button_PlusMinus.setBackground(new java.awt.Color(0, 0, 0));
        Button_PlusMinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button_PlusMinus.setForeground(new java.awt.Color(255, 0, 0));
        Button_PlusMinus.setText("±");
        Button_PlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PlusMinusActionPerformed(evt);
            }
        });

        ButtonDot.setBackground(new java.awt.Color(0, 0, 0));
        ButtonDot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonDot.setForeground(new java.awt.Color(255, 0, 0));
        ButtonDot.setText(".");
        ButtonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDotActionPerformed(evt);
            }
        });

        Button0.setBackground(new java.awt.Color(0, 0, 0));
        Button0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button0.setForeground(new java.awt.Color(255, 0, 0));
        Button0.setText("0");
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });

        ButtonBackspace.setBackground(new java.awt.Color(199, 0, 0));
        ButtonBackspace.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonBackspace.setForeground(new java.awt.Color(0, 0, 0));
        ButtonBackspace.setText("←");
        ButtonBackspace.setToolTipText("");
        ButtonBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackspaceActionPerformed(evt);
            }
        });

        ButtonClear.setBackground(new java.awt.Color(199, 0, 0));
        ButtonClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonClear.setForeground(new java.awt.Color(0, 0, 0));
        ButtonClear.setText("C");
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });

        ButtionRoot.setBackground(new java.awt.Color(0, 0, 0));
        ButtionRoot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtionRoot.setForeground(new java.awt.Color(255, 0, 0));
        ButtionRoot.setText("√");
        ButtionRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtionRootActionPerformed(evt);
            }
        });

        ButtonPlus.setBackground(new java.awt.Color(0, 0, 0));
        ButtonPlus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonPlus.setForeground(new java.awt.Color(255, 0, 0));
        ButtonPlus.setText("+");
        ButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPlusActionPerformed(evt);
            }
        });

        ButtonLog.setBackground(new java.awt.Color(255, 62, 0));
        ButtonLog.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonLog.setForeground(new java.awt.Color(0, 0, 0));
        ButtonLog.setText("lnx");
        ButtonLog.setToolTipText("");
        ButtonLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogActionPerformed(evt);
            }
        });

        ButtonSin.setBackground(new java.awt.Color(255, 62, 0));
        ButtonSin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonSin.setForeground(new java.awt.Color(0, 0, 0));
        ButtonSin.setText("Sin");
        ButtonSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSinActionPerformed(evt);
            }
        });

        ButtonSinh.setBackground(new java.awt.Color(255, 62, 0));
        ButtonSinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonSinh.setForeground(new java.awt.Color(0, 0, 0));
        ButtonSinh.setText("Sinh");
        ButtonSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSinhActionPerformed(evt);
            }
        });

        ButtonPi.setBackground(new java.awt.Color(255, 62, 0));
        ButtonPi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonPi.setForeground(new java.awt.Color(0, 0, 0));
        ButtonPi.setText("π");
        ButtonPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPiActionPerformed(evt);
            }
        });

        ButtonCos.setBackground(new java.awt.Color(255, 62, 0));
        ButtonCos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonCos.setForeground(new java.awt.Color(0, 0, 0));
        ButtonCos.setText("Cos");
        ButtonCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCosActionPerformed(evt);
            }
        });

        ButtonCosh.setBackground(new java.awt.Color(255, 62, 0));
        ButtonCosh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonCosh.setForeground(new java.awt.Color(0, 0, 0));
        ButtonCosh.setText("Cosh");
        ButtonCosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCoshActionPerformed(evt);
            }
        });

        Button_XpowY.setBackground(new java.awt.Color(153, 0, 153));
        Button_XpowY.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button_XpowY.setForeground(new java.awt.Color(255, 255, 102));
        Button_XpowY.setText("x^y");
        Button_XpowY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_XpowYActionPerformed(evt);
            }
        });

        ButtonTan.setBackground(new java.awt.Color(255, 62, 0));
        ButtonTan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonTan.setForeground(new java.awt.Color(0, 0, 0));
        ButtonTan.setText("Tan");
        ButtonTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTanActionPerformed(evt);
            }
        });

        ButtonTanh.setBackground(new java.awt.Color(255, 62, 0));
        ButtonTanh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonTanh.setForeground(new java.awt.Color(0, 0, 0));
        ButtonTanh.setText("Tanh");
        ButtonTanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTanhActionPerformed(evt);
            }
        });

        Button_Xpow2.setBackground(new java.awt.Color(153, 0, 153));
        Button_Xpow2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button_Xpow2.setForeground(new java.awt.Color(255, 255, 102));
        Button_Xpow2.setText("x^2");
        Button_Xpow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Xpow2ActionPerformed(evt);
            }
        });

        ButtonCubicRoot.setBackground(new java.awt.Color(153, 0, 153));
        ButtonCubicRoot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonCubicRoot.setForeground(new java.awt.Color(255, 255, 102));
        ButtonCubicRoot.setText("Cbr");
        ButtonCubicRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCubicRootActionPerformed(evt);
            }
        });

        ButtonRund.setBackground(new java.awt.Color(153, 0, 153));
        ButtonRund.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonRund.setForeground(new java.awt.Color(255, 255, 102));
        ButtonRund.setText("Rund");
        ButtonRund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRundActionPerformed(evt);
            }
        });

        Button_Xpow3.setBackground(new java.awt.Color(153, 0, 153));
        Button_Xpow3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button_Xpow3.setForeground(new java.awt.Color(255, 255, 102));
        Button_Xpow3.setText("x^3");
        Button_Xpow3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Xpow3ActionPerformed(evt);
            }
        });

        ButtonBinary.setBackground(new java.awt.Color(102, 153, 255));
        ButtonBinary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonBinary.setForeground(new java.awt.Color(0, 0, 0));
        ButtonBinary.setText("Bin");
        ButtonBinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBinaryActionPerformed(evt);
            }
        });

        ButtonHexa.setBackground(new java.awt.Color(102, 153, 255));
        ButtonHexa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonHexa.setForeground(new java.awt.Color(0, 0, 0));
        ButtonHexa.setText("Hex");
        ButtonHexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHexaActionPerformed(evt);
            }
        });

        Buttonlnx.setBackground(new java.awt.Color(255, 62, 0));
        Buttonlnx.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Buttonlnx.setForeground(new java.awt.Color(0, 0, 0));
        Buttonlnx.setText("log");
        Buttonlnx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonlnxActionPerformed(evt);
            }
        });

        ButtonOctal.setBackground(new java.awt.Color(102, 153, 255));
        ButtonOctal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonOctal.setForeground(new java.awt.Color(0, 0, 0));
        ButtonOctal.setText("Oct");
        ButtonOctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOctalActionPerformed(evt);
            }
        });

        buttonGroup1.add(ButtonON);
        ButtonON.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonON.setText("ON");
        ButtonON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonONActionPerformed(evt);
            }
        });

        buttonGroup1.add(ButtonOFF);
        ButtonOFF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonOFF.setText("OFF");
        ButtonOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOFFActionPerformed(evt);
            }
        });

        Fah_to_Celsius.setBackground(new java.awt.Color(0, 0, 204));
        Fah_to_Celsius.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Fah_to_Celsius.setForeground(new java.awt.Color(153, 255, 51));
        Fah_to_Celsius.setText("Cels");
        Fah_to_Celsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fah_to_CelsiusActionPerformed(evt);
            }
        });

        Cel_to_Fahrenheight.setBackground(new java.awt.Color(0, 0, 204));
        Cel_to_Fahrenheight.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cel_to_Fahrenheight.setForeground(new java.awt.Color(153, 255, 51));
        Cel_to_Fahrenheight.setText("Fah");
        Cel_to_Fahrenheight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cel_to_FahrenheightActionPerformed(evt);
            }
        });

        KPS_to_MPS.setBackground(new java.awt.Color(0, 153, 0));
        KPS_to_MPS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        KPS_to_MPS.setForeground(new java.awt.Color(0, 51, 255));
        KPS_to_MPS.setText("M/s");
        KPS_to_MPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KPS_to_MPSActionPerformed(evt);
            }
        });

        MeterPerSec_to_KMPerHour.setBackground(new java.awt.Color(0, 153, 0));
        MeterPerSec_to_KMPerHour.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        MeterPerSec_to_KMPerHour.setForeground(new java.awt.Color(0, 51, 255));
        MeterPerSec_to_KMPerHour.setText("Km/h");
        MeterPerSec_to_KMPerHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeterPerSec_to_KMPerHourActionPerformed(evt);
            }
        });

        Expotentail.setBackground(new java.awt.Color(0, 0, 204));
        Expotentail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Expotentail.setForeground(new java.awt.Color(153, 255, 51));
        Expotentail.setText("Exp");
        Expotentail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpotentailActionPerformed(evt);
            }
        });

        Pascal_to_atm.setBackground(new java.awt.Color(0, 153, 0));
        Pascal_to_atm.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Pascal_to_atm.setForeground(new java.awt.Color(0, 51, 255));
        Pascal_to_atm.setText("Atm");
        Pascal_to_atm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pascal_to_atmActionPerformed(evt);
            }
        });

        Atm_to_Pascal.setBackground(new java.awt.Color(0, 153, 0));
        Atm_to_Pascal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Atm_to_Pascal.setForeground(new java.awt.Color(0, 51, 255));
        Atm_to_Pascal.setText("Pa");
        Atm_to_Pascal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atm_to_PascalActionPerformed(evt);
            }
        });

        Km_to_Mile.setBackground(new java.awt.Color(0, 153, 0));
        Km_to_Mile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Km_to_Mile.setForeground(new java.awt.Color(0, 51, 255));
        Km_to_Mile.setText("K-M");
        Km_to_Mile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Km_to_MileActionPerformed(evt);
            }
        });

        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Standard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Scientific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Display_output)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtionRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button_PlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonMultiple, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Buttion9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Button_Xpow2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonCubicRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonRund, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button_Xpow3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonBinary, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonHexa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button_XpowY, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonTan, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonTanh, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonLog, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonON, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonOFF, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButtonSin, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonPi, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonCos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonCosh, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cel_to_Fahrenheight, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(Expotentail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Pascal_to_atm, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Atm_to_Pascal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonOctal, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(Buttonlnx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fah_to_Celsius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MeterPerSec_to_KMPerHour, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(KPS_to_MPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Km_to_Mile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Display_output, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtionRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonLog, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonSin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buttion9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonPi, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonCos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonCosh, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fah_to_Celsius, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(KPS_to_MPS, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonMultiple, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_XpowY, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Xpow2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_PlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonON, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonOFF, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Buttonlnx, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MeterPerSec_to_KMPerHour, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pascal_to_atm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Cel_to_Fahrenheight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ButtonTan, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonTanh, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ButtonOctal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonHexa, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonBinary, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_Xpow3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Km_to_Mile, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ButtonCubicRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonRund, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Expotentail, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Atm_to_Pascal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setResizable(true);
        this.setSize(850, 510);// Scientific resulation
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(true);
        this.setSize(388, 510);//Standard resulation
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setResizable(true);
        this.setSize(388, 510);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        Display_output.setSize(688, 50);//Display Resulation
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        String Num = Display_output.getText() + Button7.getText();
        Display_output.setText(Num);
    }//GEN-LAST:event_Button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        String Num = Display_output.getText() + button8.getText();
        Display_output.setText(Num);
    }//GEN-LAST:event_button8ActionPerformed

    private void Buttion9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buttion9ActionPerformed
        String Num = Display_output.getText() + Buttion9.getText();
        Display_output.setText(Num);
    }//GEN-LAST:event_Buttion9ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        String Num = Display_output.getText() + Button4.getText();
        Display_output.setText(Num);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        String Num = Display_output.getText() + Button5.getText();
        Display_output.setText(Num);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        String Num = Display_output.getText() + Button6.getText();
        Display_output.setText(Num);
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        String Num = Display_output.getText() + Button1.getText();
        Display_output.setText(Num);
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        String Num = Display_output.getText() + Button2.getText();
        Display_output.setText(Num);
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        String Num = Display_output.getText() + Button3.getText();
        Display_output.setText(Num);
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        String Num = Display_output.getText() + Button0.getText();
        Display_output.setText(Num);
    }//GEN-LAST:event_Button0ActionPerformed

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        Display_output.setText("");
    }//GEN-LAST:event_ButtonClearActionPerformed

    private void ButtonBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackspaceActionPerformed
        String bsp = null;
        if (Display_output.getText().length() > 0) {
            StringBuilder strB = new StringBuilder(Display_output.getText());
            strB.deleteCharAt(Display_output.getText().length() - 1);
            bsp = strB.toString();
            Display_output.setText(bsp);
        }
    }//GEN-LAST:event_ButtonBackspaceActionPerformed

    private void ButtonDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDotActionPerformed
        if (!Display_output.getText().contains(".")) {
            Display_output.setText(Display_output.getText() + ButtonDot.getText());
        }
    }//GEN-LAST:event_ButtonDotActionPerformed

    private void Button_PlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PlusMinusActionPerformed
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = Answer * (-1);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_Button_PlusMinusActionPerformed

    private void ButtionRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtionRootActionPerformed

        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = Math.sqrt(Answer);
        Display_output.setText(String.valueOf(Answer));
        /* */
    }//GEN-LAST:event_ButtionRootActionPerformed

    private void ButtonLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogActionPerformed
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = Math.log(Answer);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_ButtonLogActionPerformed

    private void ButtonSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSinActionPerformed
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = Math.sin((3.1416 / 180) * Answer);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_ButtonSinActionPerformed

    private void ButtonSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSinhActionPerformed
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = Math.toDegrees(asin((180 * Answer) / 3.1416));
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_ButtonSinhActionPerformed

    private void ButtonCoshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCoshActionPerformed
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = Math.cosh((3.1416 / 180) * Answer);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_ButtonCoshActionPerformed

    private void ButtonCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCosActionPerformed
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = Math.cos((3.1416 / 180) * Answer);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_ButtonCosActionPerformed

    private void ButtonTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTanActionPerformed
        
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = Math.tan((3.1416 / 180) * Answer);
        
        
           Display_output.setText(String.valueOf(Answer)); 
        
       
    }//GEN-LAST:event_ButtonTanActionPerformed

    private void ButtonTanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTanhActionPerformed
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = Math.tanh((3.1416 / 180) * Answer);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_ButtonTanhActionPerformed

    private void ButtonCubicRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCubicRootActionPerformed
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = Math.cbrt(Answer);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_ButtonCubicRootActionPerformed

    private void ButtonRundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRundActionPerformed
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = Math.round(Answer);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_ButtonRundActionPerformed

    private void ButtonPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPiActionPerformed
        double Answer;
        Answer = 3.14159265358;
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_ButtonPiActionPerformed

    private void Button_XpowYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_XpowYActionPerformed
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = Math.pow(Answer, Answer);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_Button_XpowYActionPerformed

    private void Button_Xpow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Xpow2ActionPerformed
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = (Answer * Answer);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_Button_Xpow2ActionPerformed

    private void Button_Xpow3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Xpow3ActionPerformed
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = (Answer * Answer * Answer);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_Button_Xpow3ActionPerformed

    private void ButtonBinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBinaryActionPerformed
        int a = Integer.parseInt(Display_output.getText());
        Display_output.setText(Integer.toString(a, 2));//Binary
    }//GEN-LAST:event_ButtonBinaryActionPerformed

    private void ButtonHexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHexaActionPerformed
        int a = Integer.parseInt(Display_output.getText()); //Hexadecimal
        Display_output.setText(Integer.toString(a, 16));
    }//GEN-LAST:event_ButtonHexaActionPerformed

    private void Display_outputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Display_outputKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)
                || c == KeyEvent.VK_DELETE) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_Display_outputKeyTyped

    private void ButtonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEqualActionPerformed
        String answer;
        secondnum = Double.parseDouble(Display_output.getText());
        if (operations == "+") {
            result = firstnum + secondnum;   //Addition
            answer = String.format("%.3f", result);
            Display_output.setText(answer);
        } else if (operations == "-") {           //Substractions
            result = firstnum - secondnum;
            answer = String.format("%.3f", result);
            Display_output.setText(answer);
        } else if (operations == "*") {           //Multiplication
            result = firstnum * secondnum;
            answer = String.format("%.3f", result);
            Display_output.setText(answer);
        } else if (operations == "/") {   //Division
            result = firstnum / secondnum;
            answer = String.format("%.3f", result);
            Display_output.setText(answer);
        } else if (operations == "%") {
            result = firstnum % secondnum;
            answer = String.format("%.3f", result);
            Display_output.setText(answer);
        }

    }//GEN-LAST:event_ButtonEqualActionPerformed

    private void ButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPlusActionPerformed
        firstnum = Double.parseDouble(Display_output.getText());
        Display_output.setText(null);
        operations = "+";
    }//GEN-LAST:event_ButtonPlusActionPerformed

    private void ButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMinusActionPerformed
        firstnum = Double.parseDouble(Display_output.getText());
        Display_output.setText(null);
        operations = "-";
    }//GEN-LAST:event_ButtonMinusActionPerformed

    private void ButtonMultipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMultipleActionPerformed
        firstnum = Double.parseDouble(Display_output.getText());
        Display_output.setText(null);
        operations = "*";
    }//GEN-LAST:event_ButtonMultipleActionPerformed

    private void ButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDivisionActionPerformed
        firstnum = Double.parseDouble(Display_output.getText());
        Display_output.setText(null);
        operations = "/";
    }//GEN-LAST:event_ButtonDivisionActionPerformed

    private void ButtonlnxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonlnxActionPerformed
        double ops = Double.parseDouble(String.valueOf(Display_output.getText()));
        ops = Math.log10(ops);
        Display_output.setText(String.valueOf(ops));
    }//GEN-LAST:event_ButtonlnxActionPerformed

    private void ButtonOctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOctalActionPerformed
        int a = Integer.parseInt(Display_output.getText());
        Display_output.setText(Integer.toString(a, 8));
    }//GEN-LAST:event_ButtonOctalActionPerformed

    private void Display_outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Display_outputActionPerformed

    }//GEN-LAST:event_Display_outputActionPerformed
  
    private void ButtonOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOFFActionPerformed
        disable();
    }//GEN-LAST:event_ButtonOFFActionPerformed

    private void ButtonONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonONActionPerformed
        enable();
    }//GEN-LAST:event_ButtonONActionPerformed

    private void Fah_to_CelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fah_to_CelsiusActionPerformed
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = ((Answer - 32) * 5) / 9;
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_Fah_to_CelsiusActionPerformed

    private void Cel_to_FahrenheightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cel_to_FahrenheightActionPerformed
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = ((Answer * 9) / 5) + 32;
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_Cel_to_FahrenheightActionPerformed

    private void ExpotentailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpotentailActionPerformed
       double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = Math.exp(Answer);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_ExpotentailActionPerformed

    private void MeterPerSec_to_KMPerHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeterPerSec_to_KMPerHourActionPerformed
       double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = (Answer *  3.6);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_MeterPerSec_to_KMPerHourActionPerformed

    private void KPS_to_MPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KPS_to_MPSActionPerformed
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = (Answer *  0.27778);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_KPS_to_MPSActionPerformed

    private void Pascal_to_atmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pascal_to_atmActionPerformed
     double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = (Answer /  101325);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_Pascal_to_atmActionPerformed

    private void Atm_to_PascalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atm_to_PascalActionPerformed
       double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = (Answer *  101325);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_Atm_to_PascalActionPerformed

    private void Km_to_MileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Km_to_MileActionPerformed
        double Answer = Double.parseDouble(String.valueOf(Display_output.getText()));
        Answer = (Answer * 0.621371);
        Display_output.setText(String.valueOf(Answer));
    }//GEN-LAST:event_Km_to_MileActionPerformed

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
            java.util.logging.Logger.getLogger(Scienctific_Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scienctific_Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scienctific_Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scienctific_Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scienctific_Cal().setVisible(true);//For visible the Jframe
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atm_to_Pascal;
    private javax.swing.JButton Buttion9;
    private javax.swing.JButton ButtionRoot;
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton ButtonBackspace;
    private javax.swing.JButton ButtonBinary;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JButton ButtonCos;
    private javax.swing.JButton ButtonCosh;
    private javax.swing.JButton ButtonCubicRoot;
    private javax.swing.JButton ButtonDivision;
    private javax.swing.JButton ButtonDot;
    private javax.swing.JButton ButtonEqual;
    private javax.swing.JButton ButtonHexa;
    private javax.swing.JButton ButtonLog;
    private javax.swing.JButton ButtonMinus;
    private javax.swing.JButton ButtonMultiple;
    private javax.swing.JRadioButton ButtonOFF;
    private javax.swing.JRadioButton ButtonON;
    private javax.swing.JButton ButtonOctal;
    private javax.swing.JButton ButtonPi;
    private javax.swing.JButton ButtonPlus;
    private javax.swing.JButton ButtonRund;
    private javax.swing.JButton ButtonSin;
    private javax.swing.JButton ButtonSinh;
    private javax.swing.JButton ButtonTan;
    private javax.swing.JButton ButtonTanh;
    private javax.swing.JButton Button_PlusMinus;
    private javax.swing.JButton Button_Xpow2;
    private javax.swing.JButton Button_Xpow3;
    private javax.swing.JButton Button_XpowY;
    private javax.swing.JButton Buttonlnx;
    private javax.swing.JButton Cel_to_Fahrenheight;
    private javax.swing.JTextField Display_output;
    private javax.swing.JButton Expotentail;
    private javax.swing.JButton Fah_to_Celsius;
    private javax.swing.JButton KPS_to_MPS;
    private javax.swing.JButton Km_to_Mile;
    private javax.swing.JButton MeterPerSec_to_KMPerHour;
    private javax.swing.JButton Pascal_to_atm;
    private javax.swing.JButton button8;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
