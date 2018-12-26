/*
 * #%L
 * dev-eth0.de
 * %%
 * Copyright (C) 2016 dev-eth0.de
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package de.dev.eth0.netbeans.plugins.regex.ui;

import java.awt.Color;
import java.util.regex.Pattern;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.NbBundle;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

import de.dev.eth0.netbeans.plugins.regex.RegexEvaluator;
import de.dev.eth0.netbeans.plugins.regex.RegexEvaluator.MatcherGroup;

/**
 * Top component which displays something.
 *
 * @author deveth0
 */
@ConvertAsProperties(
        dtd = "-//de.dev.eth0.netbeans.plugins.regex.ui//Ui//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "UiTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE",
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "output", openAtStartup = false)
@ActionID(category = "Window", id = "de.dev.eth0.netbeans.plugins.regex.ui.UiTopComponent")
@ActionReference(path = "Menu/Window", position = 1275)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_UiAction",
        preferredID = "UiTopComponent"
)
@Messages({
  "CTL_UiAction=Regex Tester",
  "CTL_UiTopComponent=Regex Tester",
  "HINT_UiTopComponent=TODO Add some text"
})
public final class UiTopComponent extends TopComponent {

  private final  Color TXF_DEFAULT;
  private final Color TXF_ERROR;
  private final RegexEvaluator evaluator;

  public UiTopComponent() {
    initComponents();
    setName(Bundle.CTL_UiTopComponent());
    setToolTipText(Bundle.HINT_UiTopComponent());
    evaluator = new RegexEvaluator();
    TXF_DEFAULT=regularExpressionTextField.getForeground();
    TXF_ERROR=Color.red;
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jTabbedPane3 = new javax.swing.JTabbedPane();
    jPanel1 = new javax.swing.JPanel();
    jPanel3 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    regularExpressionTextField = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    replacementTextField = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    input1TextArea = new javax.swing.JTextArea();
    jScrollPane3 = new javax.swing.JScrollPane();
    hintTextArea = new javax.swing.JTextArea();
    jPanel2 = new javax.swing.JPanel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    groupsTextArea = new javax.swing.JTextArea();
    jSeparator1 = new javax.swing.JSeparator();
    matchesLabel = new javax.swing.JLabel();
    replaceFirstLabel = new javax.swing.JLabel();
    replaceAllLabel = new javax.swing.JLabel();
    lookingAtLabel = new javax.swing.JLabel();
    findLabel = new javax.swing.JLabel();
    jPanel4 = new javax.swing.JPanel();
    jPanel5 = new javax.swing.JPanel();
    caseInsensitiveCheckBox = new javax.swing.JCheckBox();
    multilineCheckBox = new javax.swing.JCheckBox();
    dotAllCheckBox = new javax.swing.JCheckBox();
    unicodeCaseCheckBox = new javax.swing.JCheckBox();
    canonEqCheckBox = new javax.swing.JCheckBox();
    unixLinesCheckBox = new javax.swing.JCheckBox();
    literalCheckBox = new javax.swing.JCheckBox();
    commentsCheckBox = new javax.swing.JCheckBox();
    unicodeCharacterClassCheckBox = new javax.swing.JCheckBox();

    setLayout(new java.awt.BorderLayout());

    jTabbedPane3.setMinimumSize(new java.awt.Dimension(81, 340));
    jTabbedPane3.setPreferredSize(new java.awt.Dimension(1000, 340));

    jPanel1.setPreferredSize(new java.awt.Dimension(919, 340));

    jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.jLabel1.text")); // NOI18N

    org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.jLabel2.text")); // NOI18N

    org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.jLabel5.text")); // NOI18N

    input1TextArea.setColumns(20);
    input1TextArea.setRows(5);
    jScrollPane1.setViewportView(input1TextArea);

    hintTextArea.setEditable(false);
    hintTextArea.setColumns(20);
    hintTextArea.setRows(5);
    hintTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
    jScrollPane3.setViewportView(hintTextArea);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(regularExpressionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel5)
              .addComponent(jLabel2))
            .addGap(40, 40, 40)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(replacementTextField)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(regularExpressionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(replacementTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel5))
            .addGap(10, 10, 10)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel2))
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(jScrollPane3))
        .addContainerGap())
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.jLabel6.text")); // NOI18N

    org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.jLabel7.text")); // NOI18N

    org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.jLabel8.text")); // NOI18N

    org.openide.awt.Mnemonics.setLocalizedText(jLabel9, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.jLabel9.text")); // NOI18N

    org.openide.awt.Mnemonics.setLocalizedText(jLabel10, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.jLabel10.text")); // NOI18N

    org.openide.awt.Mnemonics.setLocalizedText(jLabel11, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.jLabel11.text")); // NOI18N

    groupsTextArea.setEditable(false);
    groupsTextArea.setColumns(20);
    groupsTextArea.setRows(5);
    groupsTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
    jScrollPane2.setViewportView(groupsTextArea);

    jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

    org.openide.awt.Mnemonics.setLocalizedText(matchesLabel, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.matchesLabel.text")); // NOI18N

    org.openide.awt.Mnemonics.setLocalizedText(replaceFirstLabel, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.replaceFirstLabel.text")); // NOI18N

    org.openide.awt.Mnemonics.setLocalizedText(replaceAllLabel, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.replaceAllLabel.text")); // NOI18N

    org.openide.awt.Mnemonics.setLocalizedText(lookingAtLabel, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.lookingAtLabel.text")); // NOI18N

    org.openide.awt.Mnemonics.setLocalizedText(findLabel, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.findLabel.text")); // NOI18N

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
          .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(30, 30, 30)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(replaceAllLabel)
          .addComponent(matchesLabel)
          .addComponent(lookingAtLabel)
          .addComponent(findLabel)
          .addComponent(replaceFirstLabel))
        .addGap(29, 29, 29)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(28, 28, 28)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jScrollPane2)
            .addContainerGap())))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(matchesLabel))
              .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel7)
                  .addComponent(replaceFirstLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel8)
                  .addComponent(replaceAllLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel9)
                  .addComponent(lookingAtLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel10)
                  .addComponent(findLabel))
                .addGap(0, 0, Short.MAX_VALUE))))
          .addComponent(jSeparator1))
        .addContainerGap())
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    jTabbedPane3.addTab(org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.jPanel1.TabConstraints.tabTitle"), jPanel1); // NOI18N

    jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    org.openide.awt.Mnemonics.setLocalizedText(caseInsensitiveCheckBox, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.caseInsensitiveCheckBox.text")); // NOI18N
    caseInsensitiveCheckBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        caseInsensitiveCheckBoxActionPerformed(evt);
      }
    });

    org.openide.awt.Mnemonics.setLocalizedText(multilineCheckBox, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.multilineCheckBox.text")); // NOI18N
    multilineCheckBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        multilineCheckBoxActionPerformed(evt);
      }
    });

    org.openide.awt.Mnemonics.setLocalizedText(dotAllCheckBox, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.dotAllCheckBox.text")); // NOI18N
    dotAllCheckBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        dotAllCheckBoxActionPerformed(evt);
      }
    });

    org.openide.awt.Mnemonics.setLocalizedText(unicodeCaseCheckBox, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.unicodeCaseCheckBox.text")); // NOI18N
    unicodeCaseCheckBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        unicodeCaseCheckBoxActionPerformed(evt);
      }
    });

    org.openide.awt.Mnemonics.setLocalizedText(canonEqCheckBox, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.canonEqCheckBox.text")); // NOI18N
    canonEqCheckBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        canonEqCheckBoxActionPerformed(evt);
      }
    });

    org.openide.awt.Mnemonics.setLocalizedText(unixLinesCheckBox, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.unixLinesCheckBox.text")); // NOI18N
    unixLinesCheckBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        unixLinesCheckBoxActionPerformed(evt);
      }
    });

    org.openide.awt.Mnemonics.setLocalizedText(literalCheckBox, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.literalCheckBox.text")); // NOI18N
    literalCheckBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        literalCheckBoxActionPerformed(evt);
      }
    });

    org.openide.awt.Mnemonics.setLocalizedText(commentsCheckBox, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.commentsCheckBox.text")); // NOI18N
    commentsCheckBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        commentsCheckBoxActionPerformed(evt);
      }
    });

    org.openide.awt.Mnemonics.setLocalizedText(unicodeCharacterClassCheckBox, org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.unicodeCharacterClassCheckBox.text")); // NOI18N
    unicodeCharacterClassCheckBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        unicodeCharacterClassCheckBoxActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(caseInsensitiveCheckBox)
          .addComponent(multilineCheckBox)
          .addComponent(dotAllCheckBox)
          .addComponent(unicodeCaseCheckBox)
          .addComponent(canonEqCheckBox)
          .addComponent(unixLinesCheckBox)
          .addComponent(literalCheckBox)
          .addComponent(commentsCheckBox)
          .addComponent(unicodeCharacterClassCheckBox))
        .addContainerGap(438, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addComponent(caseInsensitiveCheckBox)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(multilineCheckBox)
        .addGap(3, 3, 3)
        .addComponent(dotAllCheckBox)
        .addGap(3, 3, 3)
        .addComponent(unicodeCaseCheckBox)
        .addGap(3, 3, 3)
        .addComponent(canonEqCheckBox)
        .addGap(3, 3, 3)
        .addComponent(unixLinesCheckBox)
        .addGap(3, 3, 3)
        .addComponent(literalCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(commentsCheckBox)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(unicodeCharacterClassCheckBox)
        .addContainerGap(48, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    jTabbedPane3.addTab(org.openide.util.NbBundle.getMessage(UiTopComponent.class, "UiTopComponent.jPanel4.TabConstraints.tabTitle"), jPanel4); // NOI18N

    add(jTabbedPane3, java.awt.BorderLayout.CENTER);
  }// </editor-fold>//GEN-END:initComponents

  private void caseInsensitiveCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseInsensitiveCheckBoxActionPerformed
    updateRegexp();
  }//GEN-LAST:event_caseInsensitiveCheckBoxActionPerformed

  private void multilineCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multilineCheckBoxActionPerformed
    updateRegexp();
  }//GEN-LAST:event_multilineCheckBoxActionPerformed

  private void dotAllCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotAllCheckBoxActionPerformed
    updateRegexp();
  }//GEN-LAST:event_dotAllCheckBoxActionPerformed

  private void unicodeCaseCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unicodeCaseCheckBoxActionPerformed
    updateRegexp();
  }//GEN-LAST:event_unicodeCaseCheckBoxActionPerformed

  private void canonEqCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canonEqCheckBoxActionPerformed
    updateRegexp();
  }//GEN-LAST:event_canonEqCheckBoxActionPerformed

  private void unixLinesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unixLinesCheckBoxActionPerformed
    updateRegexp();
  }//GEN-LAST:event_unixLinesCheckBoxActionPerformed

  private void literalCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_literalCheckBoxActionPerformed
    updateRegexp();
  }//GEN-LAST:event_literalCheckBoxActionPerformed

  private void commentsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentsCheckBoxActionPerformed
    updateRegexp();
  }//GEN-LAST:event_commentsCheckBoxActionPerformed

  private void unicodeCharacterClassCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unicodeCharacterClassCheckBoxActionPerformed
    updateRegexp();
  }//GEN-LAST:event_unicodeCharacterClassCheckBoxActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JCheckBox canonEqCheckBox;
  private javax.swing.JCheckBox caseInsensitiveCheckBox;
  private javax.swing.JCheckBox commentsCheckBox;
  private javax.swing.JCheckBox dotAllCheckBox;
  private javax.swing.JLabel findLabel;
  private javax.swing.JTextArea groupsTextArea;
  private javax.swing.JTextArea hintTextArea;
  private javax.swing.JTextArea input1TextArea;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JTabbedPane jTabbedPane3;
  private javax.swing.JCheckBox literalCheckBox;
  private javax.swing.JLabel lookingAtLabel;
  private javax.swing.JLabel matchesLabel;
  private javax.swing.JCheckBox multilineCheckBox;
  private javax.swing.JTextField regularExpressionTextField;
  private javax.swing.JLabel replaceAllLabel;
  private javax.swing.JLabel replaceFirstLabel;
  private javax.swing.JTextField replacementTextField;
  private javax.swing.JCheckBox unicodeCaseCheckBox;
  private javax.swing.JCheckBox unicodeCharacterClassCheckBox;
  private javax.swing.JCheckBox unixLinesCheckBox;
  // End of variables declaration//GEN-END:variables
  @Override
  public void componentOpened() {
    DocumentListener dl = new DocumentListener() {
      @Override
      public void insertUpdate(DocumentEvent e) {
        updateRegexp();
      }

      @Override
      public void removeUpdate(DocumentEvent e) {
        updateRegexp();
      }

      @Override
      public void changedUpdate(DocumentEvent e) {
        updateRegexp();
      }
    };
    regularExpressionTextField.getDocument().addDocumentListener(dl);
    replacementTextField.getDocument().addDocumentListener(dl);
    input1TextArea.getDocument().addDocumentListener(dl);
  }

  @Override
  public void componentClosed() {
    // TODO add custom code on component closing
  }

  private void updateRegexp() {
    String regex = regularExpressionTextField.getText();
    String replacement = replacementTextField.getText();
    String input = input1TextArea.getText();
    evaluator.update(regex, getFlags(), replacement, input);

    if (evaluator.valid) {
      regularExpressionTextField.setForeground(TXF_DEFAULT);
      hintTextArea.setText("");
    }
    else {
      regularExpressionTextField.setForeground(TXF_ERROR);
      hintTextArea.setText(evaluator.invalidReason);
    }
    matchesLabel.setText(NbBundle.getMessage(UiTopComponent.class, evaluator.matches ? "UiTopComponent.true" : "UiTopComponent.false"));
    replaceFirstLabel.setText(evaluator.replaceFirst);
    replaceAllLabel.setText(evaluator.replaceAll);
    lookingAtLabel.setText(NbBundle.getMessage(UiTopComponent.class, evaluator.lookingAt ? "UiTopComponent.true" : "UiTopComponent.false"));
    findLabel.setText(NbBundle.getMessage(UiTopComponent.class, evaluator.find ? "UiTopComponent.true" : "UiTopComponent.false"));
    groupsTextArea.setText("");
    for (int i = 0; i < evaluator.groups.length; i++) {
      MatcherGroup group = evaluator.groups[i];
      groupsTextArea.append(String.format("%d: [%d,%d] %s", i, group.start, group.end, group.group));
      if (i + 1 < evaluator.groups.length) {
        groupsTextArea.append("\n");
      }
    }
    updateUI();
  }

  private int getFlags() {
    int flags = 0;
    if (caseInsensitiveCheckBox.isSelected()) {
      flags |= Pattern.CASE_INSENSITIVE;
    }
    if (multilineCheckBox.isSelected()) {
      flags |= Pattern.MULTILINE;
    }
    if (dotAllCheckBox.isSelected()) {
      flags |= Pattern.DOTALL;
    }
    if (unicodeCaseCheckBox.isSelected()) {
      flags |= Pattern.UNICODE_CASE;
    }
    if (canonEqCheckBox.isSelected()) {
      flags |= Pattern.CANON_EQ;
    }
    if (unixLinesCheckBox.isSelected()) {
      flags |= Pattern.UNIX_LINES;
    }
    if (literalCheckBox.isSelected()) {
      flags |= Pattern.LITERAL;
    }
    if (commentsCheckBox.isSelected()) {
      flags |= Pattern.COMMENTS;
    }
    if (unicodeCharacterClassCheckBox.isSelected()) {
      flags |= Pattern.UNICODE_CHARACTER_CLASS;
    }
    return flags;
  }

  void writeProperties(java.util.Properties p) {
    // better to version settings since initial version as advocated at
    // http://wiki.apidesign.org/wiki/PropertyFiles
    p.setProperty("version", "1.0");
    // TODO store your settings
  }

  void readProperties(java.util.Properties p) {
    String version = p.getProperty("version");
    // TODO read your settings according to their version
  }
}
