package vehicle.licensing.authority;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/*
 * @author Christiaan Bouwer VVF6HCS19
 */
class LicenseFrame extends JFrame {

    //default constructor to set the frame details
    //set the name, location and visible
    //instantiate the panel, add the panel to the frame
    LicenseFrame() {
        super("Vehicle Registration Number Generator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LicensePanel panel = new LicensePanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        setVisible(true);
        pack();
    }
}
