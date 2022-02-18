
package ec.edu.espe.GPS.controller;

import ec.edu.espe.GPS.view.FrmSecurity;
import javax.swing.JFrame;

public class FormsSecurity {
    public static void goToMainScreen(JFrame jFrameToClose){
        FrmSecurity frmSecurity = new FrmSecurity();
        jFrameToClose.setVisible(false);
        frmSecurity.setVisible(true);
    }
}
