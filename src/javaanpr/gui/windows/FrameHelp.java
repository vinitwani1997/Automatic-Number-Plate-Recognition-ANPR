
package javaanpr.gui.windows;

import javaanpr.intelligence.Intelligence;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

public class FrameHelp extends javax.swing.JFrame {
    static final long serialVersionUID = 0;
    
    public static int SHOW_HELP = 0;
    public static int SHOW_ABOUT = 1;
    public int mode;
    
    /** Creates new form FrameHelp */
    public FrameHelp(int mode) {
        initComponents();
        this.mode = mode;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = this.getWidth();
        int height = this.getHeight();
        this.setLocation((screenSize.width - width)/2,(screenSize.height - height)/2);
        try {
            if (mode == FrameHelp.SHOW_ABOUT) this.editorPane.setPage(new File(Intelligence.configurator.getPathProperty("help_file_about")).toURL());
            else this.editorPane.setPage(new File(Intelligence.configurator.getPathProperty("help_file_help")).toURL());
        } catch (Exception e) {
            this.dispose();
        }
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        editorPane = new javax.swing.JEditorPane();
        helpWindowClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JavaANPR");
        setResizable(false);
        jScrollPane1.setViewportView(editorPane);

        helpWindowClose.setFont(new java.awt.Font("Arial", 0, 11));
        helpWindowClose.setText("Close");
        helpWindowClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpWindowCloseActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, helpWindowClose)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(helpWindowClose)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void helpWindowCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpWindowCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_helpWindowCloseActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane editorPane;
    private javax.swing.JButton helpWindowClose;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
