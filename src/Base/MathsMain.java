/*
 *
 * @author Daniel Karlsson 2016
 *
 */

package Base;

import VisualElements.StartupFrame;

public class MathsMain {
    
    private static void initialize() {
        StartupFrame startupFrame = new StartupFrame();
        startupFrame.getStartupFrame();
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                initialize();
            }
        });
    }
    
}
