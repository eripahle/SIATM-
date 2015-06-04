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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ATMScreen;
import view.LoginPanel;

/**
 *
 * @author Aprilio Pajri
 */
public class LoginController {
    
    LoginPanel loginScreen;
    ATMScreen atms;
    
    public LoginController(ATMScreen atms) {
        this.atms = atms;
        showLoginPanel();
    }
    
    private void showLoginPanel(){
        //TODO showLoginPanel
    }
    
    private void buttonsActionSetting(){
        atms.getBtn0().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO action for button 0
            }
        });
        
        atms.getBtn1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO action for button 1
            }
        } );
        
        atms.getBtn2().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO action for button 2
            }
        } );
        
        atms.getBtn3().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO action for button 3
            }
        });
        
        atms.getBtn4().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO action for button 4
            }
        });
        
        atms.getBtn5().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO action for button 5
            }
        });
        
        atms.getBtn6().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO action for button 6
            }
        });
        
        atms.getBtn7().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO action for button 6
            }
        });
        
        atms.getBtn8().addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO action for button 8
            }
        });
        
        atms.getBtn9().addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO action for button 9
            }
        });
        
        atms.getBtnClear().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO action for button clear
            }
        });
        
        atms.getBtnCancel().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO actionf or button clear
            }
        });
     
    }
    
}
