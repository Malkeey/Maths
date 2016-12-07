/**
 *
 * @author Daniel Karlsson 2016
 *
 */

package TestVisualElements;

import org.junit.Test;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class TestStartupFrame {
    
    private StartupFrame startupFrame;
    
    @Test
    public void testConstructorWithoutArgs() {
        startupFrame = new StartupFrame();
    }
    
}