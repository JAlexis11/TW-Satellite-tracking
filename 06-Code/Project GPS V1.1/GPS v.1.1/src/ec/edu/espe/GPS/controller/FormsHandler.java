/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.GPS.controller;

import javax.swing.JFrame;
import ec.edu.espe.GPS.view.FrmGPS;
/**
 *
 * @author Sebastian PC
 */
public class FormsHandler {
     public static void goToMainScreen(JFrame jFrameToClose){
        FrmGPS frmGPS = new FrmGPS();
        jFrameToClose.setVisible(false);
        frmGPS.setVisible(true);
     }  
}
