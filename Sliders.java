
package sliders;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Sliders extends JFrame {
    
    public Sliders()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Suwaki");
        this.setBounds(300, 300, 300, 200);
        
        suwak.setMajorTickSpacing(5);
        suwak.setMinorTickSpacing(1);
        suwak.setPaintTicks(true);
        suwak.setPaintLabels(true);
        suwak.setSnapToTicks(true);
        
        suwak.addChangeListener(new ChangeListener() {
            
            public void stateChanged(ChangeEvent ce) {
                
                wartoscSuwaka.setText(""+((JSlider)ce.getSource()).getValue());
                
                tekst.setFont(new Font(tekst.getFont().getFontName(), tekst.getFont().getStyle(), ((JSlider)ce.getSource()).getValue()));
            }
            
        });
        
        this.getContentPane().add(suwak, BorderLayout.NORTH);
        this.getContentPane().add(tekst, BorderLayout.CENTER);
        this.getContentPane().add(wartoscSuwaka, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    JSlider suwak = new JSlider(JSlider.HORIZONTAL, 0, 30, 5);
    JTextField wartoscSuwaka = new JTextField("" + suwak.getValue());
    JLabel tekst = new JLabel("Hello");
    
    public static void main(String[] args) {
        new Sliders().setVisible(true);
    }
    
}
