/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderTable;

import static com.sun.org.apache.bcel.internal.util.SecuritySupport.getResourceAsStream;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 *
 * @author Vageesha
 */
public class CallBackground {
    
    public static BackgroundPanel call(){
         BufferedImage img = null;
        try {
             img = ImageIO.read(getResourceAsStream("Images/blueBack.jpg"));
        } catch (Exception e) {
            System.out.println("Cannot read file: " + e);
        }
         
        BackgroundPanel background = new BackgroundPanel(img, BackgroundPanel.TILED, 0.50f, 0.5f);
         
        return background;
    }
}
