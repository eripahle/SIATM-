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

/**
 *
 * @author Aprilio Pajri
 */
public class TransactionController {
    ATMScreen atms;

    public TransactionController(ATMScreen atms) {
        this.atms = atms;
        showTransactionScreen();
    }
    
    /**
     * set visibility true for transaction screen and false for others
     */
    private void showTransactionScreen(){
        //TODO show transaction screen
    }
    
    /**
     * add action to all button used in transaction session
     */
    private void addButtonsSetting(){
        
       /*
        Set up button left
        */ 
       atms.getBtnL1().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               //TODO action for button left 1
           }
       });
       
       atms.getBtnL2().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               //TODO action for button left 2
           }
       });
       
       atms.getBtnL3().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               //TODO action for button left 3
           }
       });
       
       atms.getBtnL4().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               //TODO action for button left 4
           }
       });
       
       
       /*
        Set up button right
        */ 
       atms.getBtnR1().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               //TODO action for button right 1
           }
       });
       
       atms.getBtnR2().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               //TODO action for button right 2
           }
       });
       
       atms.getBtnR3().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               //TODO action for button right 3
           }
       });
       
       atms.getBtnR4().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               //TODO action for button right 4
           }
       });
    }
    
}
