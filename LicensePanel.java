package vehicle.licensing.authority;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/*
 * @author Christiaan Bouwer VVF6HCS19
 */
class LicensePanel extends JPanel implements ActionListener {

    //Create all of the objects for the panel
    private final JButton genBtn = new JButton("Generate");
    private final JTextArea licenseTA = new JTextArea(20, 35);
    private final JScrollPane scrollPane = new JScrollPane(licenseTA);
    private final JLabel caLbl = new JLabel("Western Cape:");
    private final JTextField caTF = new JTextField(20);
    private final JLabel znLbl = new JLabel("KwaZulu-Natal:");
    private final JTextField znTF = new JTextField(20);
    private final JLabel mpLbl = new JLabel("Mpumalanga:");
    private final JTextField mpTF = new JTextField(20);
    private final JLabel ecLbl = new JLabel("Eastern Cape:");
    private final JTextField ecTF = new JTextField(20);
    private final JLabel lLbl = new JLabel("Limpopo:");
    private final JTextField lTF = new JTextField(20);
    private final JLabel gpLbl = new JLabel("Gauteng:");
    private final JTextField gpTF = new JTextField(20);
    private final JLabel ncLbl = new JLabel("Northern Cape:");
    private final JTextField ncTF = new JTextField(20);
    private final JLabel fsLbl = new JLabel("Free State:");
    private final JTextField fsTF = new JTextField(20);
    private final JLabel nwLbl = new JLabel("North West:");
    private final JTextField nwTF = new JTextField(20);

    //constructor to set the defaults and add all of the components
    public LicensePanel() {
        super();
        
        JPanel topPanel = new JPanel(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        topPanel.add(genBtn, BorderLayout.NORTH);
        topPanel.add(scrollPane);
        genBtn.addActionListener(this);
        
        JPanel botPanel = new JPanel(new BorderLayout());
        add(botPanel, BorderLayout.SOUTH);
        //Create gridlayout for lables and textfields
        GridLayout panelLayout = new GridLayout(4, 4);
        botPanel.setAlignmentX(BOTTOM_ALIGNMENT);
        botPanel.setLayout(panelLayout);

        botPanel.add(gpLbl);
        botPanel.add(gpTF);
        botPanel.add(znLbl);
        botPanel.add(znTF);
        botPanel.add(mpLbl);
        botPanel.add(mpTF);
        botPanel.add(ecLbl);
        botPanel.add(ecTF);
        botPanel.add(lLbl);
        botPanel.add(lTF);
        botPanel.add(ncLbl);
        botPanel.add(ncTF);
        botPanel.add(fsLbl);
        botPanel.add(fsTF);
        botPanel.add(nwLbl);
        botPanel.add(nwTF);
        botPanel.add(caLbl);
        botPanel.add(caTF);
    }

    //Method run when Generate button is pressed
    //Forloop to run 1million times generating each numberplate by calling relevant methods
    //Setting the textfields and textarea according to what has been created
    @Override
    public void actionPerformed(ActionEvent e) {
        LicensePlate plate = new LicensePlate();
        for (int i = 0; i < 1000000; i++) {
            licenseTA.append(plate.getVehicleReg(plate.getLetter(), LicensePlate.getNumbers(), plate.getCode() + "\n"));
        }
        gpTF.setText(plate.GP + "");
        znTF.setText(plate.ZN + "");
        mpTF.setText(plate.MP + "");
        ecTF.setText(plate.EC + "");
        lTF.setText(plate.L + "");
        ncTF.setText(plate.NC + "");
        fsTF.setText(plate.FS + "");
        nwTF.setText(plate.NW + "");
        caTF.setText(plate.CA + "");
    }
}
