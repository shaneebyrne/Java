import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.io.LineNumberReader;
import java.io.FileReader;


public final class JButtonDemo {
    private static DisabledJButton disabledBtnOne;
    private static DisabledJButton disabledBtnTwo;

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                createAndShowGUI();             
            }
        });
    }

    private static void createAndShowGUI(){
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        final JPanel disabledBtnPanel = new JPanel();
        disabledBtnOne = new DisabledJButton();
        disabledBtnTwo = new DisabledJButton();
        disabledBtnPanel.add(disabledBtnOne);
        disabledBtnPanel.add(disabledBtnTwo);
        panel.add(disabledBtnPanel);

        final JPanel enablerBtnPanel = new JPanel();
        enablerBtnPanel.add(new EnablerJButton("Button 1"));
        enablerBtnPanel.add(new EnablerJButton("Button 2"));
        enablerBtnPanel.add(new EnablerJButton("Button 3"));
        panel.add(enablerBtnPanel);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    private static final class DisabledJButton extends JButton{
        public DisabledJButton(){
            super("Disabled");
            setEnabled(false);
        }
    }

    private static final class EnablerJButton extends JButton{
        public EnablerJButton(final String s){
            super(s);
            addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(!disabledBtnOne.isEnabled()){
                        disabledBtnOne.setEnabled(true);
                        disabledBtnOne.setText("Enabled");
                    }

                    if(!disabledBtnTwo.isEnabled()){
                        disabledBtnTwo.setEnabled(true);
                        disabledBtnTwo.setText("Enabled");
                    }
                }
            });
        }
    }
}
