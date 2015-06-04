/*
 * Copyright (C) 2015 Aprilio Pajri
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package controller;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URLConnection;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import view.ATMScreen;
import view.HomePanel;

/**
 *
 * @author Aprilio Pajri
 */
public class HomeController {
    ATMScreen atms;
    //HomeScreen homeScreen;
    
    JPanel homeScreen;
        
    /**
     * 
     * @param atms  : ATMScreen
     */
    public HomeController(ATMScreen atms) {
        this.atms = atms;
        showHomeScreen();
        buttonsActionSetting();
    }
    
    private void showHomeScreen(){
       
    }
    
    private void buttonsActionSetting(){
        atms.getBtnR3().addActionListener( new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO action for pilihan bahasa 1
            }
        });
        
        atms.getBtnR4().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO action for pilihan bahasa 2
            }
        });
        
        
    }
}