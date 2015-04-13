
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter; 
import java.util.Scanner;
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kieran Bingham
 */
public class fileGUI extends javax.swing.JFrame {

    /**
     * Creates new form fileGUI
     */
    public fileGUI() {
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

        actionButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        fullNamesTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        initalsArea = new javax.swing.JTextArea();
        loadProgress = new javax.swing.JProgressBar();
        initalsTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fullNamesArea = new javax.swing.JTextArea();
        loadButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        createProgress = new javax.swing.JProgressBar();
        authorNote = new javax.swing.JLabel();
        saveLabel = new javax.swing.JLabel();
        saveProgress = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("File interaction assignment - Kieran Bingham");
        setResizable(false);

        actionButton.setText("Save initals file");
        actionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        fullNamesTitle.setText("<html>\n<b>Full names</b>");

        initalsArea.setEditable(false);
        initalsArea.setColumns(20);
        initalsArea.setLineWrap(true);
        initalsArea.setRows(5);
        initalsArea.setText("Created initals file will display here. ");
        initalsArea.setWrapStyleWord(true);
        initalsArea.setMaximumSize(new java.awt.Dimension(150, 22));
        initalsArea.setMinimumSize(new java.awt.Dimension(150, 22));
        jScrollPane1.setViewportView(initalsArea);

        loadProgress.setStringPainted(true);

        initalsTitle.setText("<html>\n<b>Initals</b>");

        fullNamesArea.setEditable(false);
        fullNamesArea.setColumns(20);
        fullNamesArea.setLineWrap(true);
        fullNamesArea.setRows(5);
        fullNamesArea.setText("Loaded file will display here.");
        fullNamesArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(fullNamesArea);

        loadButton.setText("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        createButton.setText("Generate inital file");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        createProgress.setStringPainted(true);

        authorNote.setForeground(new java.awt.Color(102, 102, 102));
        authorNote.setText("Created by Kieran Bingham");

        saveLabel.setForeground(new java.awt.Color(255, 0, 0));

        saveProgress.setToolTipText("");
        saveProgress.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        saveProgress.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loadButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loadProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fullNamesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(actionButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(closeButton))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(createButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(createProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(initalsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 21, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(saveLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(authorNote))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fullNamesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(initalsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createButton)
                    .addComponent(loadButton)
                    .addComponent(loadProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(actionButton)
                    .addComponent(saveProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorNote)
                    .addComponent(saveLabel)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void actionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButtonActionPerformed
        try {
            save();
        } catch (IOException e) {
            System.out.println("Save error - " + e);
        }
    }//GEN-LAST:event_actionButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        try {
            load();
        } catch (IOException e) {
            System.out.println("Load error - " + e);
        }
    }//GEN-LAST:event_loadButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        try {
            create();
        } catch (IOException e) {
            System.out.println("Create error - " + e);
        }
    }//GEN-LAST:event_createButtonActionPerformed
   
    void load() throws IOException {
        String fileSeparator = System.getProperty("file.separator");
        String relativePath = "generatedFiles" + fileSeparator + "fullNames.txt";
        updateBar("load", 25); 

        File fullNames = new File(relativePath);
        //fullNames.deleteOnExit();
        if (fullNames.createNewFile()) {
            System.out.println(relativePath + " File created in project generated files folder");
        } else {
            System.out.println("File " + relativePath + " already exists in project generated files folder");
        }
        updateBar("load", 50); 
        
        String fileString = readFile(fullNames); 
        fileString = fileString.replaceAll("[ \\t]+", " ");
        fileString = fileString.replaceAll("^[ \\t]+|[ \\t]+$|[\\r\\n](?=[\\r\\n])", "");
        try (PrintWriter writer = new PrintWriter(fullNames, "UTF-8")) {
            writer.print(readString(fileString));
        } 
        updateBar("load", 75); 
        
        if (isValid(fullNames)){
//            fullNamesArea.setText(readFile(fullNames));
            fullNamesArea.setText(readFile(fullNames)); 
        } else {
            fullNamesArea.setText("Validation error: Make sure you only use letters, and enter between 2-3 names, "
                    + "with the last name full, not just inital."); 
        }
        updateBar("load", 100);   
    }
    
    void create() throws IOException {
        String fileSeparator = System.getProperty("file.separator");
        
        String relativePath = "generatedFiles" + fileSeparator + "fullNames.txt";
        File fullNames = new File(relativePath);
        updateBar("create", 25); 
        
        relativePath = "generatedFiles" + fileSeparator + "initalsTemp.txt";
        File initalsTemp = new File(relativePath);
        initalsTemp.deleteOnExit();
        if (initalsTemp.createNewFile()) {
            System.out.println(relativePath + " File created in project generated files folder");
        } else {
            System.out.println("File " + relativePath + " already exists in project generated files folder");
        }
        updateBar("create", 50); 
        
        String fileString = readFile(fullNames); 
        fileString = fileString.replaceAll("[ \\t]+", " ");
        fileString = fileString.replaceAll("^[ \\t]+|[ \\t]+$|[\\r\\n](?=[\\r\\n])", "");
        try (PrintWriter writer = new PrintWriter(fullNames, "UTF-8")) {
            writer.print(readString(fileString));
        } 
        updateBar("create", 75); 
        
        try (PrintWriter writerInitals = new PrintWriter(initalsTemp, "UTF-8")) {
            writerInitals.print(formatInitals(fullNames));
        } 
        initalsArea.setText(readFile(initalsTemp)); 
        updateBar("create", 100); 
    }
    
    void save() throws IOException{
        String fileSeparator = System.getProperty("file.separator");
        
        String relativePath = "generatedFiles" + fileSeparator + "initalsTemp.txt";
        File initalsTemp = new File(relativePath);
        if (initalsTemp.exists()) {
            updateBar("save", 25); 
            String relativePathNew = "generatedFiles" + fileSeparator + "initals.txt";
            File initals = new File(relativePathNew);
            if (initals.createNewFile()) {
                updateBar("save", 50); 
                try (PrintWriter writer = new PrintWriter(initals, "UTF-8")) {
                    writer.print(readFile(initalsTemp));
                }
                updateBar("save", 75); 
                System.out.println(relativePathNew + " - File saved!");
                saveLabel.setText("File saved at - " + relativePathNew);
                updateBar("save", 100); 
            } else {
                updateBar("save", 50); 
                try (PrintWriter writer = new PrintWriter(initals, "UTF-8")) {
                    writer.print(readFile(initalsTemp));
                }
                updateBar("save", 75); 
                System.out.println(relativePathNew + " - File saved over old file!");
                saveLabel.setText("Overwrote file at - " + relativePathNew);
                updateBar("save", 100); 
            }
        } else {
            System.out.println("Nothing to save at - " + relativePath);
            saveLabel.setText("Nothing to save at - " + relativePath);
        } 
    }
    
    private String readFile(File file) throws IOException {
        //File file = new File(pathname);
        StringBuilder fileContents = new StringBuilder((int) file.length());
        Scanner scanner = new Scanner(file);
        String lineSeparator = System.getProperty("line.separator");

        try {
            while (scanner.hasNextLine()) {
                fileContents.append(scanner.nextLine() + lineSeparator);
            }
            return fileContents.toString();
        } finally {
            scanner.close();
        }
    }
    
    private String readString(String file) throws IOException {
        //File file = new File(pathname);
        StringBuilder fileContents = new StringBuilder((int) file.length());
        Scanner scanner = new Scanner(file);
        String lineSeparator = System.getProperty("line.separator");
        String line;

        try {
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String split[] = line.split("\\s");
                line = "";
                for (String word : split) {
                    line = (line + word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ");
                }
                fileContents.append(line + lineSeparator);
            }
            return fileContents.toString();
        } finally {
            scanner.close();
        }
    }
    
    private String formatInitals(File file) throws IOException {
        //File file = new File(pathname);
        StringBuilder fileContents = new StringBuilder((int) file.length());
        Scanner scanner = new Scanner(file);
        String lineSeparator = System.getProperty("line.separator");
        String line; 

        try {
            while (scanner.hasNextLine()) {
                line = scanner.nextLine(); 
                String split[] = line.split("\\s");
                line = "";
                for (int i=0;i<split.length;i++){
                    line = (line + split[i].substring(0,1).toUpperCase() + ".");
                }
                fileContents.append(line + lineSeparator);
            }
            return fileContents.toString();
        } finally {
            scanner.close();
        }
    }
    
    public boolean isValid(File file) throws IOException{
//        return name.matches("[a-zA-Z]+|\\s+");
        Scanner scanner = new Scanner(file);
        boolean valid = true; 

        try {
            while (scanner.hasNextLine()) { 
                String split[] = scanner.nextLine().split("\\s");
                for (int i=0;i<split.length;i++){
                    if (!split[i].trim().matches("[a-zA-Z]+")){
                        System.out.println(split[i].trim().matches("[a-zA-Z]+"));
                        valid = false; 
                        return valid;
                    }
                    if (split.length > 3 || split.length < 2){
                        valid = false; 
                        return valid;
                    }
                    if (!split[split.length - 1].trim().substring(1).matches("[a-zA-Z]+")){
                        valid = false; 
                        return valid;
                    }
                }
            }
        } finally {
            scanner.close();
        }
        return valid;
    }
    
    public void updateBar(String bar, int newValue) {
        switch (bar){
        case "load" :
            loadProgress.setValue(newValue);
            saveProgress.setValue(0);
            createProgress.setValue(0);
            break;
        case "create" :
            createProgress.setValue(newValue);
            saveProgress.setValue(0);
            loadProgress.setValue(0);
            break;
        case "save" : 
            saveProgress.setValue(newValue);
            createProgress.setValue(0);
            loadProgress.setValue(0);
            break; 
        }      
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(fileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fileGUI().setVisible(true);
            }
        });
        

//        JProgressBar progressBar = new JProgressBar(0, readFile.getLengthOfTask());
//        progressBar.setValue(0);
//        progressBar.setStringPainted(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionButton;
    private javax.swing.JLabel authorNote;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton createButton;
    private javax.swing.JProgressBar createProgress;
    private javax.swing.JTextArea fullNamesArea;
    private javax.swing.JLabel fullNamesTitle;
    private javax.swing.JTextArea initalsArea;
    private javax.swing.JLabel initalsTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loadButton;
    private javax.swing.JProgressBar loadProgress;
    private javax.swing.JLabel saveLabel;
    private javax.swing.JProgressBar saveProgress;
    // End of variables declaration//GEN-END:variables
}
