/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author WELLINGTON
 */
public class Icone {
   
      public void InserirImage(JFrame jrc){
          jrc.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Img/imgicon.png"));
   }
}

