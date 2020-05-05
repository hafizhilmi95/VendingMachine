/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.text.DecimalFormat;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import vending.Coiner;
import vending.Drinks;

/**
 *
 * @author imakit
 */
public class VendingUI extends javax.swing.JFrame {
    double amount;
    double totalAmt;
    double price;
    int drinkChoice;
    double change;
    Drinks drinks = new Drinks();
    Coiner coins = new Coiner();
    DecimalFormat df = new DecimalFormat("0.00");
    
    
    /**
     * Creates new form VendingUI
     */
    public VendingUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        btn_group = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        amt_txt = new javax.swing.JTextField();
        addTenCents = new javax.swing.JButton();
        addTwentyCents = new javax.swing.JButton();
        addFiftyCents = new javax.swing.JButton();
        addOneRinggit = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        option_one = new javax.swing.JRadioButton();
        option_two = new javax.swing.JRadioButton();
        option_three = new javax.swing.JRadioButton();
        option_four = new javax.swing.JRadioButton();
        option_five = new javax.swing.JRadioButton();
        select_drink = new javax.swing.JButton();
        selectedDrink = new javax.swing.JLabel();
        changeText = new javax.swing.JLabel();
        buyDrink_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        warningText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        dispensed_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VENDING MACHINE UI");
        setBackground(new java.awt.Color(204, 204, 204));
        setName("VENDING MACHINE"); // NOI18N

        jLabel1.setText("AMOUNT");

        amt_txt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        addTenCents.setText("INSERT RM 0.10");
        addTenCents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTenCentsActionPerformed(evt);
            }
        });

        addTwentyCents.setText("INSERT RM 0.20");
        addTwentyCents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTwentyCentsActionPerformed(evt);
            }
        });

        addFiftyCents.setText("INSERT RM 0.50");
        addFiftyCents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFiftyCentsActionPerformed(evt);
            }
        });

        addOneRinggit.setText("INSERT RM 1");
        addOneRinggit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOneRinggitActionPerformed(evt);
            }
        });

        jInternalFrame1.setTitle("SELECT A DRINK");
        jInternalFrame1.setToolTipText("");
        jInternalFrame1.setVisible(true);

        btn_group.add(option_one);
        option_one.setText("Pepsi RM 2.00");
        option_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option_oneActionPerformed(evt);
            }
        });

        btn_group.add(option_two);
        option_two.setText("Coffee RM 1.50");
        option_two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option_twoActionPerformed(evt);
            }
        });

        btn_group.add(option_three);
        option_three.setText("Milk RM 1.00");

        btn_group.add(option_four);
        option_four.setText("Teh Tarik RM 2.50");

        btn_group.add(option_five);
        option_five.setText("Juice RM 1.20");

        select_drink.setText("SELECT");
        select_drink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_drinkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(option_one)
                    .addComponent(option_three)
                    .addComponent(option_two))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(option_four)
                        .addComponent(option_five))
                    .addComponent(select_drink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option_one)
                    .addComponent(option_four))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option_two)
                    .addComponent(option_five))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(option_three))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(select_drink)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        selectedDrink.setBackground(new java.awt.Color(153, 153, 153));
        selectedDrink.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        selectedDrink.setForeground(new java.awt.Color(0, 51, 51));
        selectedDrink.setText("DRINK : ---");

        changeText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        changeText.setForeground(new java.awt.Color(204, 0, 51));
        changeText.setText("CHANGE : ---");

        buyDrink_btn.setText("BUY DRINK");
        buyDrink_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyDrink_btnActionPerformed(evt);
            }
        });

        cancel_btn.setText("CANCEL");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        warningText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        warningText.setForeground(new java.awt.Color(255, 0, 51));
        warningText.setText("*");

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        refresh.setText("↻");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        dispensed_txt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dispensed_txt.setForeground(new java.awt.Color(153, 0, 0));
        dispensed_txt.setText("DISPENSE : ---");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(amt_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(warningText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(dispensed_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(changeText))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addTwentyCents, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addTenCents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addFiftyCents, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(45, 45, 45)
                                    .addComponent(addOneRinggit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(buyDrink_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(refresh))
                            .addComponent(selectedDrink, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(56, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addTenCents, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(addTwentyCents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFiftyCents, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addOneRinggit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(warningText)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(amt_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(selectedDrink)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dispensed_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(changeText)
                        .addGap(11, 11, 11)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buyDrink_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addTenCentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTenCentsActionPerformed
        amount = coins.getCOIN1();
                
        if (amt_txt.getText().equals("")){
           amt_txt.setText(Double.toString(amount));
        }
        else{
           totalAmt = Double.parseDouble(amt_txt.getText())+amount;
           amt_txt.setText(df.format(totalAmt));
        }
    }//GEN-LAST:event_addTenCentsActionPerformed

    private void addTwentyCentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTwentyCentsActionPerformed
        amount = coins.getCOIN2();
                
        if (amt_txt.getText().equals("")){
           amt_txt.setText(Double.toString(amount));
        }
        else{
           totalAmt = Double.parseDouble(amt_txt.getText())+amount;
           amt_txt.setText(df.format(totalAmt));
        }
    }//GEN-LAST:event_addTwentyCentsActionPerformed

    private void addFiftyCentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFiftyCentsActionPerformed
        amount = coins.getCOIN3();
                
        if (amt_txt.getText().equals("")){
           amt_txt.setText(Double.toString(amount));
        }
        else{
           totalAmt = Double.parseDouble(amt_txt.getText())+amount;
           amt_txt.setText(df.format(totalAmt));
        }
    }//GEN-LAST:event_addFiftyCentsActionPerformed

    private void addOneRinggitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOneRinggitActionPerformed
        amount = coins.getNOTE();
                
        if (amt_txt.getText().equals("")){
           amt_txt.setText(Double.toString(amount));
        }
        else{
           totalAmt = Double.parseDouble(amt_txt.getText())+amount;
           amt_txt.setText(df.format(totalAmt));
        }
    }//GEN-LAST:event_addOneRinggitActionPerformed

    private void buyDrink_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyDrink_btnActionPerformed
        //set the values for the radio buttons.
        option_one.setActionCommand(drinks.getDrink1());
        option_two.setActionCommand(drinks.getDrink2());
        option_three.setActionCommand(drinks.getDrink3());
        option_four.setActionCommand(drinks.getDrink4());
        option_five.setActionCommand(drinks.getDrink5());
        
        String x = btn_group.getSelection().getActionCommand();
        
        //Identify which radio button was selected.
        if (x.equals(drinks.getDrink1())){
            amount = Double.parseDouble(amt_txt.getText());
            //compare coin amount to price and get change.
            if (amount < drinks.getPrice1()){
                changeText.setText("CHANGE : ----");
                selectedDrink.setText("SELECTED DRINK : -----");
                warningText.setText("Insufficient Amount for this drink");              
            }
            else if (amount == drinks.getPrice1()){
                    changeText.setText("CHANGE : RM0");
                    selectedDrink.setText("SELECTED DRINK : "+btn_group.getSelection().getActionCommand());
                    warningText.setText("✔");
                    dispensed_txt.setText("1 "+drinks.getDrink1()+" DISPENSED");
            }
            else{
                change = amount - drinks.getPrice1();
                changeText.setText("CHANGE RM: "+df.format(change));
                warningText.setText("✔");
                selectedDrink.setText("SELECTED DRINK : "+btn_group.getSelection().getActionCommand());
                dispensed_txt.setText("1 "+drinks.getDrink1()+" DISPENSED");
            }
        }
        else if (x.equals(drinks.getDrink2())){
            amount = Double.parseDouble(amt_txt.getText());
            if (amount < drinks.getPrice2()){
                changeText.setText("CHANGE : ----");
                selectedDrink.setText("SELECTED DRINK : -----");
                warningText.setText("Insufficient Amount for this drink");
            }
            else if (amount == drinks.getPrice2()){
                    warningText.setText("✔");
                    changeText.setText("CHANGE RM: 0");
                    dispensed_txt.setText("1 "+drinks.getDrink2()+" DISPENSED");
                    selectedDrink.setText("SELECTED DRINK : "+btn_group.getSelection().getActionCommand());
            }
            else{
                change = amount - drinks.getPrice2();                
                warningText.setText("✔");
                changeText.setText("CHANGE RM: "+df.format(change));
                dispensed_txt.setText("1 "+drinks.getDrink2()+" DISPENSED");
                selectedDrink.setText("SELECTED DRINK : "+btn_group.getSelection().getActionCommand());
            }
        }
        else if (x.equals(drinks.getDrink3())){
            amount = Double.parseDouble(amt_txt.getText());
            if (amount < drinks.getPrice3()){
                changeText.setText("CHANGE : ----");
                selectedDrink.setText("SELECTED DRINK : -----");
                warningText.setText("Insufficient Amount for this drink");
            }
            else if (amount == drinks.getPrice3()){
                    warningText.setText("✔");
                    changeText.setText("CHANGE : RM0");
                    dispensed_txt.setText("1 "+drinks.getDrink3()+" DISPENSED");
                    selectedDrink.setText("SELECTED DRINK : "+btn_group.getSelection().getActionCommand());
            }
            else{
                change = amount - drinks.getPrice3();
                warningText.setText("✔");
                changeText.setText("CHANGE RM: "+df.format(change));
                dispensed_txt.setText("1 "+drinks.getDrink3()+" DISPENSED");
                selectedDrink.setText("SELECTED DRINK : "+btn_group.getSelection().getActionCommand());
            }
        }
        else if (x.equals(drinks.getDrink4())){
            amount = Double.parseDouble(amt_txt.getText());
            if (amount < drinks.getPrice4()){
                changeText.setText("CHANGE : ----");
                selectedDrink.setText("SELECTED DRINK : -----");
                warningText.setText("Insufficient Amount for this drink");
            }
            else if (amount == drinks.getPrice4()){
                    warningText.setText("✔");
                    changeText.setText("CHANGE : RM0");
                    dispensed_txt.setText("1 "+drinks.getDrink4()+" DISPENSED");
                    selectedDrink.setText("SELECTED DRINK : "+btn_group.getSelection().getActionCommand());
            }
            else{
                change = amount - drinks.getPrice4();
                warningText.setText("✔");
                changeText.setText("CHANGE RM: "+df.format(change));
                dispensed_txt.setText("1 "+drinks.getDrink4()+" DISPENSED");
                selectedDrink.setText("SELECTED DRINK : "+btn_group.getSelection().getActionCommand());
            }
        }
        else {
            amount = Double.parseDouble(amt_txt.getText());
            if (amount < drinks.getPrice5()){
                changeText.setText("CHANGE : ----");
                selectedDrink.setText("SELECTED DRINK : -----");
                warningText.setText("Insufficient Amount for this drink");
            }
            else if (amount == drinks.getPrice5()){
                    warningText.setText("✔");
                    changeText.setText("CHANGE : RM0");
                    dispensed_txt.setText("1 "+drinks.getDrink5()+" DISPENSED");
                    selectedDrink.setText("SELECTED DRINK : "+btn_group.getSelection().getActionCommand());
            }
            else{
                change = amount - drinks.getPrice5();
                Math.round(change);
                warningText.setText("✔");
                changeText.setText("CHANGE RM: "+df.format(change));
                dispensed_txt.setText("1 "+drinks.getDrink5()+" DISPENSED");
                selectedDrink.setText("SELECTED DRINK : "+btn_group.getSelection().getActionCommand());
            }
        }
    }//GEN-LAST:event_buyDrink_btnActionPerformed

    private void option_oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option_oneActionPerformed
      
    }//GEN-LAST:event_option_oneActionPerformed

    private void option_twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option_twoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option_twoActionPerformed

    private void select_drinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_drinkActionPerformed

        option_one.setActionCommand(drinks.getDrink1());
        option_two.setActionCommand(drinks.getDrink2());
        option_three.setActionCommand(drinks.getDrink3());
        option_four.setActionCommand(drinks.getDrink4());
        option_five.setActionCommand(drinks.getDrink5());
        
        String x = btn_group.getSelection().getActionCommand();  
        
        changeText.setText("CHANGE : ");
        selectedDrink.setText("SELECTED DRINK : ");
        
        //setting the values.
        if (amt_txt.getText().equals("")){
            warningText.setText("** Insert Coins");
        }
        else{
            if (x.equals(drinks.getDrink1())){
            price = drinks.getPrice1();
            amount = Double.parseDouble(amt_txt.getText());
            
            if (amount < price){
                warningText.setText("** Insufficient Amount for this drink");
            }
            else{
                warningText.setText("✔");
                selectedDrink.setText("SELECTED DRINK : "+btn_group.getSelection().getActionCommand());
            }
        }
        else if (x.equals(drinks.getDrink2())){
            price = drinks.getPrice2();
            amount = Double.parseDouble(amt_txt.getText());
            
            if (amount < price){
                warningText.setText("** Insufficient Amount for this drink");
            }
            else{
                warningText.setText("✔");
                selectedDrink.setText("SELECTED DRINK : "+btn_group.getSelection().getActionCommand());
            }
        }
        else if (x.equals(drinks.getDrink3())){
            price = drinks.getPrice3();
            amount = Double.parseDouble(amt_txt.getText());
            
            if (amount < price){
                warningText.setText("** Insufficient Amount for this drink");
            }
            else{
                warningText.setText("✔");
                selectedDrink.setText("SELECTED DRINK : "+btn_group.getSelection().getActionCommand());
            }
        }
        else if (x.equals(drinks.getDrink4())){
            price = drinks.getPrice4();
            amount = Double.parseDouble(amt_txt.getText());
            
            if (amount < price){
                warningText.setText("** Insufficient Amount for this drink");
            }
            else{
                warningText.setText("✔");
                selectedDrink.setText("SELECTED DRINK : "+btn_group.getSelection().getActionCommand());
            }
        }
        else {
            price = drinks.getPrice5();
            amount = Double.parseDouble(amt_txt.getText());
            
            if (amount < price){
                warningText.setText("** Insufficient Amount for this drink");
            }
            else{
                warningText.setText("✔");
                selectedDrink.setText("SELECTED DRINK : "+btn_group.getSelection().getActionCommand());
                //print the values 
            }
        }
        }
    }//GEN-LAST:event_select_drinkActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        amount = Double.parseDouble(amt_txt.getText());
        warningText.setText("*");       
        selectedDrink.setText("DRINK : ");
        btn_group.clearSelection();       
        
        if (amt_txt.getText().equals("")){
            changeText.setText("CHANGE : ");
            amt_txt.setText("");
        }
        else{
            changeText.setText("CHANGE : "+amount);
            amt_txt.setText("");
        }
        
        
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed

        warningText.setText("*");    
        amt_txt.setText("");
        selectedDrink.setText("DRINK : ");
        changeText.setText("CHANGE : ");      
        btn_group.clearSelection();  
        dispensed_txt.setText("DISPENSED : ");
        
    }//GEN-LAST:event_refreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VendingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendingUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFiftyCents;
    private javax.swing.JButton addOneRinggit;
    private javax.swing.JButton addTenCents;
    private javax.swing.JButton addTwentyCents;
    private javax.swing.JTextField amt_txt;
    private javax.swing.ButtonGroup btn_group;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JButton buyDrink_btn;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JLabel changeText;
    private javax.swing.JLabel dispensed_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton option_five;
    private javax.swing.JRadioButton option_four;
    private javax.swing.JRadioButton option_one;
    private javax.swing.JRadioButton option_three;
    private javax.swing.JRadioButton option_two;
    private javax.swing.JButton refresh;
    private javax.swing.JButton select_drink;
    private javax.swing.JLabel selectedDrink;
    private javax.swing.JLabel warningText;
    // End of variables declaration//GEN-END:variables
}