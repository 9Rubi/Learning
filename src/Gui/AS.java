/*
 * Created by JFormDesigner on Sun Sep 30 14:16:58 CST 2018
 */

package Gui;

import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.theme.SubstanceTerracottaTheme;

import javax.swing.*;
import java.awt.*;

/**
 * @author unknown
 */
public class AS extends JFrame {
    public AS() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        comboBox1 = new JComboBox();
        textField1 = new JTextField();
        textField2 = new JTextField();
        button1 = new JButton();
        radioButton1 = new JRadioButton();
        comboBox2 = new JComboBox();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.add(comboBox1);
        comboBox1.setBounds(5, 430, 190, 35);
        contentPane.add(textField1);
        textField1.setBounds(0, 0, 400, 300);
        contentPane.add(textField2);
        textField2.setBounds(660, 0, 400, 295);

        //---- button1 ----
        button1.setText("text");
        contentPane.add(button1);
        button1.setBounds(750, 420, 185, 30);

        //---- radioButton1 ----
        radioButton1.setText("text");
        contentPane.add(radioButton1);
        radioButton1.setBounds(165, 355, 205, radioButton1.getPreferredSize().height);
        contentPane.add(comboBox2);
        comboBox2.setBounds(505, 320, 160, comboBox2.getPreferredSize().height);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JComboBox comboBox1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JRadioButton radioButton1;
    private JComboBox comboBox2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {

        try {
            /**
             * SubstanceAutumnLookAndFeel.class
             *
             * SubstanceBusinessBlackSteelLookAndFeel.class
             *
             * SubstanceBusinessBlueSteelLookAndFeel.class
             *
             * SubstanceBusinessLookAndFeel.class
             *
             * SubstanceChallengerDeepLookAndFeel.class
             *
             * SubstanceCremeLookAndFeel.class
             *
             * SubstanceEmeraldDuskLookAndFeel.class
             *
             * SubstanceFieldOfWheatLookAndFeel.class
             *
             * SubstanceGreenMagicLookAndFeel.class
             *
             * SubstanceMagmaLookAndFeel.class
             *
             * SubstanceMangoLookAndFeel.class
             *
             * SubstanceMistAquaLookAndFeel.class
             *
             * SubstanceMistSilverLookAndFeel.class
             *
             * SubstanceModerateLookAndFeel.class
             *
             * SubstanceNebulaBrickWallLookAndFeel.class
             *
             * SubstanceNebulaLookAndFeel.class
             *
             * SubstanceOfficeBlue2007LookAndFeel.class
             *
             * SubstanceOfficeSilver2007LookAndFeel.class
             *
             * SubstanceRavenGraphiteGlassLookAndFeel.class
             *
             * SubstanceRavenGraphiteLookAndFeel.class
             *
             * SubstanceRavenLookAndFeel.class
             *
             * SubstanceSaharaLookAndFeel.class
             */
            UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceRavenGraphiteLookAndFeel");
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
           // SubstanceLookAndFeel.setCurrentTheme(new SubstanceTerracottaTheme());
            SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceBlendBiTheme");
//          SubstanceLookAndFeel.setSkin(new EmeraldDuskSkin());
//          SubstanceLookAndFeel.setCurrentButtonShaper(new ClassicButtonShaper());
//          SubstanceLookAndFeel.setCurrentWatermark(new SubstanceBubblesWatermark());
//          SubstanceLookAndFeel.setCurrentBorderPainter(new StandardBorderPainter());
//            SubstanceLookAndFeel.setCurrentGradientPainter(new StandardGradientPainter());
//            SubstanceLookAndFeel.setCurrentTitlePainter(new FlatTitePainter());
            /**
             * SubstanceAquaTheme.class
             *
             * SubstanceBarbyPinkTheme.class
             *
             * SubstanceBlendBiTheme.class
             *
             * SubstanceBottleGreenTheme.class
             *
             * SubstanceBrownTheme.class
             *
             * SubstanceCharcoalTheme.class
             *
             * SubstanceColorBlindTheme.class
             *
             * SubstanceComplexTheme.class
             *
             * SubstanceCremeTheme.class
             *
             * SubstanceDarkVioletTheme.class
             *
             * SubstanceDesertSandTheme.class
             *
             * SubstanceDeuteranopiaTheme.class
             *
             * SubstanceEbonyTheme.class
             *
             * SubstanceHueShiftTheme.class
             *
             * SubstanceInvertedTheme.class
             *
             * SubstanceJadeForestTheme.class
             *
             * SubstanceLightAquaTheme.class
             *
             * SubstanceLimeGreenTheme.class
             *
             * SubstanceMixBiTheme.class
             *
             * SubstanceMixTheme.class
             *
             * SubstanceNegatedTheme.class
             *
             * SubstanceOliveTheme.class
             *
             * SubstanceOrangeTheme.class
             *
             * SubstanceProtanopiaTheme.class
             *
             * SubstancePurpleTheme.class
             *
             * SubstanceRaspberryTheme.class
             *
             * SubstanceSaturatedTheme.class
             *
             * SubstanceSepiaTheme.class
             *
             * SubstanceShadeTheme.class
             *
             * SubstanceSteelBlueTheme.class
             *
             * SubstanceSunGlareTheme.class
             *
             * SubstanceSunsetTheme.class
             *
             * SubstanceTerracottaTheme.class
             *
             * SubstanceTheme$1$1.class
             *
             * SubstanceTheme$1.class
             *
             * SubstanceTheme$10.class
             *
             * SubstanceTheme$11.class
             *
             * SubstanceTheme$12.class
             *
             * SubstanceTheme$13.class
             *
             * SubstanceTheme$14.class
             *
             * SubstanceTheme$15.class
             *
             * SubstanceTheme$16.class
             *
             * SubstanceTheme$17.class
             *
             * SubstanceTheme$18.class
             *
             * SubstanceTheme$19.class
             *
             * SubstanceTheme$2.class
             *
             * SubstanceTheme$20.class
             *
             * SubstanceTheme$21.class
             *
             * SubstanceTheme$22.class
             *
             * SubstanceTheme$23.class
             *
             * SubstanceTheme$24.class
             *
             * SubstanceTheme$25.class
             *
             * SubstanceTheme$26.class
             *
             * SubstanceTheme$27.class
             *
             * SubstanceTheme$28.class
             *
             * SubstanceTheme$3.class
             *
             * SubstanceTheme$4.class
             *
             * SubstanceTheme$5.class
             *
             * SubstanceTheme$6.class
             *
             * SubstanceTheme$7.class
             *
             * SubstanceTheme$8.class
             *
             * SubstanceTheme$9.class
             *
             * SubstanceTheme$ThemeKind.class
             *
             * SubstanceTheme.class
             *
             * SubstanceTintTheme.class
             *
             * SubstanceToneTheme.class
             *
             * SubstanceTritanopiaTheme.class
             *
             * SubstanceUltramarineTheme.class
             *
             * SubstanceWrapperTheme.class
             */
        } catch (Exception e) {
            System.err.println("Something went wrong!");
        }
        java.awt.EventQueue.invokeLater(
            () -> {
                new AS().setVisible(true);
            }

        );

    }
}
