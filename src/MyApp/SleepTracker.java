package MyApp;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Molina
 */
public class SleepTracker extends javax.swing.JFrame {

    /**
     * Creates new form SleepTracker
     */
    private int min;
    private int hr;
    private Timer timer;
    public SleepTracker() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private WorkoutTimer workoutTimerInstance = null;
    private SleepTracker sleepTrackerInstance = null;
    private SleepTimer sleepTimerInstance = null;
    private BMICalc bmiCalcInstance = null;
    private MentalHealthInfoAppGUI infoSecInstance = null;
    private Main mainInstance= null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        timePanel = new javax.swing.JPanel();
        hrLabel = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        sleepMenu = new javax.swing.JMenu();
        timerItem = new javax.swing.JMenuItem();
        trackerItem = new javax.swing.JMenuItem();
        bmiMenu = new javax.swing.JMenu();
        workoutMenu = new javax.swing.JMenu();
        infoSecMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setText("Sleep Tracker");

        hrLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        hrLabel.setText("00");

        minLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        minLabel.setText("00");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setText(":");

        javax.swing.GroupLayout timePanelLayout = new javax.swing.GroupLayout(timePanel);
        timePanel.setLayout(timePanelLayout);
        timePanelLayout.setHorizontalGroup(
            timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(hrLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minLabel)
                .addGap(30, 30, 30))
        );
        timePanelLayout.setVerticalGroup(
            timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hrLabel)
                    .addComponent(minLabel)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        startButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        stopButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        stopButton.setText("Stop");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        homeMenu.setText("Home");
        homeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(homeMenu);

        sleepMenu.setText("Sleep Timer");

        timerItem.setText("Sleep Timer");
        timerItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerItemActionPerformed(evt);
            }
        });
        sleepMenu.add(timerItem);

        trackerItem.setText("Sleep Tracker");
        trackerItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackerItemActionPerformed(evt);
            }
        });
        sleepMenu.add(trackerItem);

        jMenuBar1.add(sleepMenu);

        bmiMenu.setText("BMI Calculator");
        bmiMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bmiMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(bmiMenu);

        workoutMenu.setText("Workout Timer");
        workoutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workoutMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(workoutMenu);

        infoSecMenu.setText("Information Section");
        infoSecMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoSecMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(infoSecMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(timePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(startButton)
                .addGap(38, 38, 38)
                .addComponent(stopButton)
                .addGap(213, 213, 213))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(stopButton))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        if(timer == null){
                    
        if(hr < 10){
            hrLabel.setText("0" + hr);
        }
        else{
            hrLabel.setText(""+hr);

        }
        if(min<10){
            minLabel.setText("0"+min);
        }
        else{
            minLabel.setText(""+min);
        }

        timer = new Timer(60000, new ActionListener(){

            public void actionPerformed(ActionEvent e){

                if (min >= 0){
                    min++;
                
                if(min == 60){
                    hr ++;
                    min = 0;
                }
                }

                if(hr < 10){
                    hrLabel.setText("0" + hr);
                }
                else{
                    hrLabel.setText(""+hr);

                }
                if(min<10){
                    minLabel.setText("0"+min);
                }
                else{
                    minLabel.setText(""+min);
                }

              

            }

        });
        }
        timer.start();
    }//GEN-LAST:event_startButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        // TODO add your handling code here:
        if(timer!= null && timer.isRunning()){
            timer.stop();
            
            JOptionPane.showMessageDialog(null , "You slept for " + hr + " hours and " + min + " minutes","Stopped",0);
            min = 0;
            hr=0;
            if(hr < 10){
                hrLabel.setText("0" + hr);
            }
            else{
                hrLabel.setText(""+hr);

            }
            if(min<10){
                minLabel.setText("0"+min);
            }
            else{
                minLabel.setText(""+min);
            }
        }
    }//GEN-LAST:event_stopButtonActionPerformed

    private void homeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMenuMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_homeMenuMouseClicked

    private void timerItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerItemActionPerformed
        // TODO add your handling code here:
        if(sleepTimerInstance == null){
            sleepTimerInstance = new SleepTimer();
            sleepTimerInstance.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            sleepTimerInstance.setVisible(true);

            sleepTimerInstance.addWindowListener(new java.awt.event.WindowAdapter() {

                public void windowClosed(java.awt.event.WindowEvent e){
                    sleepTimerInstance = null;
                }

            });
        }

    }//GEN-LAST:event_timerItemActionPerformed

    private void trackerItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackerItemActionPerformed
        // TODO add your handling code here:
        if(sleepTrackerInstance == null){
            sleepTrackerInstance = new SleepTracker();
            sleepTrackerInstance.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            sleepTrackerInstance.setVisible(true);

            sleepTrackerInstance.addWindowListener(new java.awt.event.WindowAdapter() {

                public void windowClosed(java.awt.event.WindowEvent e){
                    sleepTrackerInstance = null;
                }

            });
        }

    }//GEN-LAST:event_trackerItemActionPerformed

    private void bmiMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bmiMenuMouseClicked
        // TODO add your handling code here:
        if(bmiCalcInstance == null){
            bmiCalcInstance = new BMICalc();
            bmiCalcInstance.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            bmiCalcInstance.setVisible(true);
            bmiCalcInstance.addWindowListener(new java.awt.event.WindowAdapter() {

                public void windowClosed(java.awt.event.WindowEvent e){
                    bmiCalcInstance = null;
                }

            });
        }
    }//GEN-LAST:event_bmiMenuMouseClicked

    private void workoutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutMenuMouseClicked
        // TODO add your handling code here:
        if(workoutTimerInstance == null){
            workoutTimerInstance = new WorkoutTimer();
            workoutTimerInstance.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            workoutTimerInstance.setVisible(true);

            workoutTimerInstance.addWindowListener(new java.awt.event.WindowAdapter() {

                public void windowClosed(java.awt.event.WindowEvent e){
                    workoutTimerInstance = null;
                }

            });
        }
    }//GEN-LAST:event_workoutMenuMouseClicked

    private void infoSecMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoSecMenuMouseClicked
        // TODO add your handling code here:
        if(infoSecInstance == null){
            infoSecInstance = new MentalHealthInfoAppGUI();
            infoSecInstance.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            infoSecInstance.setVisible(true);

            infoSecInstance.addWindowListener(new java.awt.event.WindowAdapter() {

                public void windowClosed(java.awt.event.WindowEvent e){
                    sleepTimerInstance = null;
                }

            });
        }

    }//GEN-LAST:event_infoSecMenuMouseClicked

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
            java.util.logging.Logger.getLogger(SleepTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SleepTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SleepTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SleepTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SleepTracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu bmiMenu;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JLabel hrLabel;
    private javax.swing.JMenu infoSecMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel minLabel;
    private javax.swing.JMenu sleepMenu;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JPanel timePanel;
    private javax.swing.JMenuItem timerItem;
    private javax.swing.JMenuItem trackerItem;
    private javax.swing.JMenu workoutMenu;
    // End of variables declaration//GEN-END:variables
}
