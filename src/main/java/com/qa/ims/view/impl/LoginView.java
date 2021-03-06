/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.ims.view.impl;

import com.alee.extended.image.WebImage;
import com.alee.extended.transition.TransitionListener;
import com.alee.extended.transition.effects.TransitionEffect;
import com.alee.extended.transition.effects.fade.FadeTransitionEffect;
import com.alee.laf.button.WebButton;
import com.alee.laf.label.WebLabel;
import com.alee.managers.notification.NotificationIcon;
import com.alee.managers.notification.NotificationListener;
import com.alee.managers.notification.NotificationManager;
import com.alee.managers.notification.NotificationOption;
import com.alee.managers.notification.WebNotificationPopup;
import com.qa.ims.util.Resources;
import com.qa.ims.view.View;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;

/**
 *
 * @author Admin
 */
public class LoginView extends View {

    /**
     * Creates new form LoginView
     */
    public LoginView() {
        super("login");
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

        loginPanel = new javax.swing.JPanel();
        loginFormPanel = new javax.swing.JPanel();
        usernameField = new com.alee.laf.text.WebTextField();
        passwordField = new com.alee.laf.text.WebPasswordField();
        loginButtonTransition = new com.alee.extended.transition.ComponentTransition();
        lostUsernameLabel = new javax.swing.JLabel();
        lostPasswordLabel = new javax.swing.JLabel();
        rememberMeCheckBox = new javax.swing.JCheckBox();
        logoTransition = new com.alee.extended.transition.ComponentTransition();

        setLayout(new java.awt.GridBagLayout());

        loginPanel.setPreferredSize(new java.awt.Dimension(250, 300));

        usernameField.setMargin(new java.awt.Insets(0, 2, 0, 0));
        usernameField.setLeadingComponent(new WebImage(Resources.getImage("username.png")));
        usernameField.setInputPrompt ( "Enter Username..." );
        usernameField.setInputPromptFont ( usernameField.getFont ().deriveFont ( Font.ITALIC ) );

        passwordField.setLeadingComponent(new WebImage(Resources.getImage("key.png")));
        passwordField.setInputPrompt ( "Enter Password..." );
        passwordField.setInputPromptFont ( passwordField.getFont ().deriveFont ( Font.ITALIC ) );
        passwordField.setMargin(new java.awt.Insets(0, 2, 0, 0));

        lostUsernameLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lostUsernameLabel.setText("Lost username?");

        lostPasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lostPasswordLabel.setText("Lost password?");

        rememberMeCheckBox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rememberMeCheckBox.setText("Remember me?");
        rememberMeCheckBox.setFocusable(false);

        javax.swing.GroupLayout loginFormPanelLayout = new javax.swing.GroupLayout(loginFormPanel);
        loginFormPanel.setLayout(loginFormPanelLayout);
        loginFormPanelLayout.setHorizontalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanelLayout.createSequentialGroup()
                        .addComponent(rememberMeCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(lostPasswordLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lostUsernameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginButtonTransition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        loginFormPanelLayout.setVerticalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lostUsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lostPasswordLabel)
                    .addComponent(rememberMeCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButtonTransition, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(loginFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoTransition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoTransition, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(loginPanel, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private TransitionEffect createLogoEffect() {
        FadeTransitionEffect effect = new FadeTransitionEffect();
        effect.setMinimumSpeed(0.03f);
        effect.setSpeed(0.1f);
        return effect;
    }

    @Override
    public void initialize() {
        logoImage = new WebImage(Resources.getImage("logo.png"));
        logoTransition.setTransitionEffect(createLogoEffect());

        loginButton = new WebButton("Login", (Resources.getImage("arrow_right.png")));
        loader = new WebLabel(Resources.getImage("loader.gif"));
        
        loader.setHorizontalAlignment(SwingConstants.RIGHT);
        loader.setPreferredSize(new Dimension(48, 48));
        loader.setOpaque(true);
        loginButtonTransition.addTransitionEffect(new FadeTransitionEffect());
        loginButtonTransition.setContent(loginButton);

        loginButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                loginButtonTransition.performTransition(loader);
            }

        });

        loginButtonTransition.addTransitionListener(new TransitionListener() {
            
            @Override
            public void transitionStarted() {
                usernameField.setEnabled(false);
                passwordField.setEnabled(false);
                rememberMeCheckBox.setEnabled(false);
            }

            @Override
            public void transitionFinished() {
                if (loginButtonTransition.getContent() == loader) {
                    WebNotificationPopup msg = NotificationManager.showNotification("Invalid username & password combination.", NotificationIcon.error.getIcon());
                    msg.setMaximumSize(new Dimension(300, 300));
                    msg.setDisplayTime(1500);
                    msg.addNotificationListener(new NotificationListener() {

                        @Override
                        public void optionSelected(NotificationOption no) {
                        }

                        @Override
                        public void accepted() {
                        }

                        @Override
                        public void closed() {
                            loginButtonTransition.performTransition(loginButton);
                            usernameField.setEnabled(true);
                            passwordField.setEnabled(true);
                            rememberMeCheckBox.setEnabled(true);
                            usernameField.requestFocus();
                        }

                    });

                }
            }
        });
        super.initialize();
    }

    @Override
    public void postSwitch() {
        logoTransition.performTransition(logoImage);
    }

    private WebLabel loader;
    private WebButton loginButton;
    private WebImage logoImage;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.extended.transition.ComponentTransition loginButtonTransition;
    private javax.swing.JPanel loginFormPanel;
    private javax.swing.JPanel loginPanel;
    private com.alee.extended.transition.ComponentTransition logoTransition;
    private javax.swing.JLabel lostPasswordLabel;
    private javax.swing.JLabel lostUsernameLabel;
    private com.alee.laf.text.WebPasswordField passwordField;
    private javax.swing.JCheckBox rememberMeCheckBox;
    private com.alee.laf.text.WebTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
