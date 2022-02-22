/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.GPS.controller;

import ec.edu.espe.GPS.view.FrmLogIn;
import javax.swing.JFrame;

/**
 *
 * @author Sebastian PC
 */
public class FormsControl {
    public static void goToMainScreen(JFrame jFrameToClose){
        FrmLogIn frmLogIn = new FrmLogIn();
        jFrameToClose.setVisible(false);
        frmLogIn.setVisible(true);
    }
}

