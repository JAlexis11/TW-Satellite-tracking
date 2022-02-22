/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.GPS.controller;

import ec.edu.espe.GPS.view.FrmVehicleControl;
import javax.swing.JFrame;
/**
 *
 * @author Sebastian PC
 */
public class FormsVehicleControl {
    public static void goToMainScreen(JFrame jFrameToClose){
        FrmVehicleControl frmVehicleControl = new FrmVehicleControl();
        jFrameToClose.setVisible(false);
        frmVehicleControl.setVisible(true);
    }
}
