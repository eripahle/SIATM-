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
import view.ATMMachine;

/**
 *
 * @author Aprilio Pajri
 */
public class WithdrawalController {
    
    ATMMachine atms;
    public WithdrawalController(ATMMachine atms) {
        this.atms = atms;
        showWithdrawalScreen();
        addButtonsSetting();
    }
    
    /**
     * set visibility true to withdrawal screen and false to others
     */
    private void showWithdrawalScreen(){
        //TODO show withdrawal screeh
    }
    
    /**
     * add action to all button used in withdrawal session 
     */
    private void addButtonsSetting(){
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
