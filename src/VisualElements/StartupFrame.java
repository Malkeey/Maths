/*
 *
 * @author Daniel Karlsson 2016
 *
 */

package VisualElements;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class StartupFrame {
    
    private JFrame mainFrame = new JFrame("Maths");
    private JPanel mainPanel = new JPanel();
    private GridLayout grid = new GridLayout(0,2);
    
    public StartupFrame() {
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        mainFrame.setSize(800, 600);
        mainFrame.setLocation(dim.width/2 - mainFrame.getSize().width/2, dim.height/2 - mainFrame.getSize().height/2);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
        
        mainFrame.add(mainPanel);
        mainPanel.setLayout(grid);
        
        ImageIcon calculatorButtonIcon = new ImageIcon("./Maths/assets/TempCalculate.gif");
        ImageIcon converterButtonIcon = new ImageIcon("./Maths/assets/TempConvert.gif");
        ImageIcon geometryButtonIcon = new ImageIcon("./Maths/assets/TempGeometry");
        ImageIcon equationButtonIcon = new ImageIcon("./Maths/assets/TempEquation");
        
        JButton calculatorButton = new JButton("Calculate", calculatorButtonIcon);
        calculatorButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        calculatorButton.setHorizontalTextPosition(SwingConstants.CENTER);
        calculatorButton.setMnemonic(KeyEvent.VK_C);
        
        JButton converterButton = new JButton("Convert", converterButtonIcon);
        converterButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        converterButton.setHorizontalTextPosition(SwingConstants.CENTER);
        converterButton.setMnemonic(KeyEvent.VK_O);
        
        JButton geometryButton = new JButton("Geometry", geometryButtonIcon);
        geometryButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        geometryButton.setHorizontalTextPosition(SwingConstants.CENTER);
        geometryButton.setMnemonic(KeyEvent.VK_G);
        
        JButton equationButton = new JButton("Equations", equationButtonIcon);
        equationButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        equationButton.setHorizontalTextPosition(SwingConstants.CENTER);
        equationButton.setMnemonic(KeyEvent.VK_E);
        
        mainPanel.add(calculatorButton);
        mainPanel.add(converterButton);
        mainPanel.add(geometryButton);
        mainPanel.add(equationButton);
        
    }
    
    public JFrame getStartupFrame() {
        return mainFrame;
    }

}