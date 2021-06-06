package filmapplication;

import static filmapplication.FilmProjet.xmlToTable;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Nouha
 */
public class FilmProjet extends javax.swing.JFrame {

    /**
     * Creates new form FilmProjet
     */
    
    ArrayList<FilmClass> Film = new ArrayList<FilmClass>();
    File F = new File("");
    
    static DefaultTableModel model;
    String titre = "";
    String genre = "";
    String pays = "";
    String annee = "";
    String mes = "";
    String resume = "";
    
    public static String chaine ="";
    static String affiche(Document file){
        try{
            XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
            sortie.output(file, System.out);
            chaine = sortie.outputString(file);
        }
            catch(java.io.IOException e){}
		return chaine;  
    }
    
//   static String[][] xmlToTable(File file) {
	   static void xmlToTable(File file) throws ParserConfigurationException {
	
        
		
		    try {
		    	   DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				org.w3c.dom.Document doc = dBuilder.parse(file);
			    doc.getDocumentElement().normalize();

			    System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			    
			    
			    
			    
			    NodeList nList = doc.getElementsByTagName("FILM");
			    NodeList nList2 = doc.getElementsByTagName("MES");
			    
			    System.out.println(nList);
			    
			    for (int i=0;i<10;i++) {
			    	 System.out.println("---------------------------------------------------------------");

			    }

			    System.out.println("---------------------------------------------------------------");

			    for (int temp = 0; temp < nList.getLength(); temp++) {

			        Node nNode = nList.item(temp);
			        Node nNode2 = nList2.item(temp);  

			       // System.out.println("\nCurrent Element :" + nNode.getNodeName());
			       // System.out.println("\nCurrent Element :" + nNode.getChildNodes());

			         

			            Node eElement =  nNode;
			            Node eElement2 = nNode2;
			            /*
			             * System.out.println("Annee : " + ((org.w3c.dom.Element) eElement).getAttribute("Annee"));
			            System.out.println("TITRE : " + ((org.w3c.dom.Element) eElement).getElementsByTagName("TITRE").item(0).getTextContent());
			            System.out.println("GENRE : " + ((org.w3c.dom.Element) eElement).getElementsByTagName("GENRE").item(0).getTextContent());
			            System.out.println("PAYS: " + ((org.w3c.dom.Element) eElement).getElementsByTagName("PAYS").item(0).getTextContent());
			            System.out.println("MES: " + ((org.w3c.dom.Element) eElement2).getAttribute("idref"));
			            */
			            jTable1.setValueAt(((org.w3c.dom.Element) eElement).getElementsByTagName("TITRE").item(0).getTextContent(), temp, 0);
			            jTable1.setValueAt(((org.w3c.dom.Element) eElement).getElementsByTagName("GENRE").item(0).getTextContent(), temp, 1);
			            jTable1.setValueAt(((org.w3c.dom.Element) eElement).getElementsByTagName("PAYS").item(0).getTextContent(), temp, 2);
			            jTable1.setValueAt(((org.w3c.dom.Element) eElement).getAttribute("Annee"), temp, 3);
			            jTable1.setValueAt(((org.w3c.dom.Element) eElement2).getAttribute("idref"), temp, 4);
			            jTable1.setValueAt(((org.w3c.dom.Element) eElement).getElementsByTagName("RESUME").item(0).getTextContent(), temp, 5);
			        System.out.println("---------------------------------------------------------------");
			    }
			    } catch (Exception e) {
			    e.printStackTrace();
			    }


    }
    Element root;
    public FilmProjet() {
        initComponents();
        root = null;
        this.setTitle("Liste des films");
        this.setSize(840, 490);
        this.setResizable(false);
        model = (DefaultTableModel) jTable1.getModel();
        //jTextArea1.setText("");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tab1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tab2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tab3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tab4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jp1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jp2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jp3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AppFilm");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 72, 120, -1));

        tab1.setBackground(new java.awt.Color(54, 33, 89));
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });
        tab1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home");
        tab1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nouha\\NetBeansProjects\\FilmApplication6\\FilmApplication\\icon\\icons8-home-32.png")); // NOI18N
        tab1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jPanel1.add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 230, 50));

        tab2.setBackground(new java.awt.Color(54, 33, 89));
        tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab2MouseClicked(evt);
            }
        });
        tab2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ShowXml");
        tab2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nouha\\NetBeansProjects\\FilmApplication6\\FilmApplication\\icon\\icons8-fichier-xml-24.png")); // NOI18N
        tab2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 30, 30));

        jPanel1.add(tab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 230, 50));

        tab3.setBackground(new java.awt.Color(54, 33, 89));
        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
        });
        tab3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(54, 33, 89));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ViewFilm");
        tab3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 13, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nouha\\NetBeansProjects\\FilmApplication6\\FilmApplication\\icon\\icons8-table-24.png")); // NOI18N
        tab3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        jPanel1.add(tab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, 50));

        tab4.setBackground(new java.awt.Color(54, 33, 89));
        tab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab4MouseClicked(evt);
            }
        });
        tab4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(54, 33, 89));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Exit");
        tab4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 13, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nouha\\NetBeansProjects\\FilmApplication6\\FilmApplication\\icon\\icons8-sortie-26.png")); // NOI18N
        tab4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        jPanel1.add(tab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 230, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 230, 450));

        jPanel2.setLayout(new javax.swing.OverlayLayout(jPanel2));

        jp1.setBackground(new java.awt.Color(255, 255, 255));
        jp1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel5.setText("Welcome!");
        jp1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jPanel6.setBackground(new java.awt.Color(122, 79, 221));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jp1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 690, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nouha\\NetBeansProjects\\FilmApplication6\\FilmApplication\\icon\\imagHome.png")); // NOI18N
        jp1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 210, 190));

        jPanel2.add(jp1);

        jp2.setBackground(new java.awt.Color(255, 255, 255));
        jp2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jp2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 520, 280));

        jButton1.setText("Show XML");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jp2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jPanel3.setBackground(new java.awt.Color(122, 79, 221));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jp2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 590, 80));

        jPanel2.add(jp2);

        jp3.setBackground(new java.awt.Color(255, 255, 255));
        jp3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Titre", "Genre", "Pays", "Annee", "Mes", "Resume"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jp3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 620, 230));

        jButton3.setText("Ajouter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jp3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        jPanel7.setBackground(new java.awt.Color(122, 79, 221));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jp3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 620, 80));

        jButton4.setText("Sauvegarder");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jp3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        jPanel2.add(jp3);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 590, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseClicked
        // TODO add your handling code here:
        jp2.setVisible(true);
        jp1.setVisible(false);
        jp3.setVisible(false);
    }//GEN-LAST:event_tab2MouseClicked

    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
        // TODO add your handling code here:
        jp3.setVisible(true);
        jp1.setVisible(false);
        jp2.setVisible(false);
    }//GEN-LAST:event_tab3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        AjouteFilm();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser(".");
        int res = chooser.showOpenDialog(this);
        if(res != JFileChooser.APPROVE_OPTION) return;
        File f = chooser.getSelectedFile();
        try {
            //  String[][] donnes = xmlToTable(f);
            xmlToTable(f);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(FilmProjet.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] titres = new String []{
            "Titre", "Genre", "Pays",  "Année", "Mes", "Resume"
        };
        // jTable1.setModel(new DefaultTableModel(donnes,titres));
        SAXBuilder builder = new SAXBuilder();
        Document document = null;
        try{
            document = builder.build(f);
            //here
            affiche(document);
            jTextArea1.setText(chaine);
        }catch (JDOMException ex){
            Logger.getLogger(FilmProjet.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
            Logger.getLogger(FilmProjet.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Element root = document.getRootElement();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
        // TODO add your handling code here:
        jp1.setVisible(true);
        jp2.setVisible(false);
        jp3.setVisible(false);
    }//GEN-LAST:event_tab1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        FilmApplication.save("Films2.xml"); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tab4MouseClicked

    private void AjouteFilm(){
   
        String[] items= {"1","2","3"};
        JTextField titre = new JTextField("");
        JTextField genre = new JTextField("");
        JTextField pays = new JTextField("");
        JTextField annee = new JTextField("");
        JComboBox mes = new JComboBox(items);
        JTextField resume = new JTextField("");
        JPanel panel;
        panel = new JPanel(new GridLayout(0,1));
        panel.add(new JLabel("Titre"));
        panel.add(titre);
        panel.add(new JLabel("Genre"));
        panel.add(genre);
        panel.add(new JLabel("Pays"));
        panel.add(pays);
        panel.add(new JLabel("Annee"));
        panel.add(annee);
        panel.add(new JLabel("Mes"));
        panel.add(mes);
        panel.add(new JLabel("Resume"));
        panel.add(resume);
        
        int result = JOptionPane.showConfirmDialog(null, panel, "Test",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("Ajouter Film"
                + " " + titre.getText()
                + " " + genre.getText()
                + " " + pays.getText()
                + " " + annee.getText()
                + " " + mes.getSelectedItem()
                + " " + resume.getText()    
            );
            String[] nvFilm = {
                titre.getText(),
                genre.getText(),
                pays.getText(),
                annee.getText(),
                //mes.getSelectedItem(),
               resume.getText(),  
            };
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(nvFilm);
            
        } else {
            System.out.println("call");
        }
    }
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
            java.util.logging.Logger.getLogger(FilmProjet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilmProjet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilmProjet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilmProjet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        SAXBuilder builder  = new SAXBuilder();
        Document xml= null ;
        try {
            xml = builder.build(new File("Film.xml")) ;
            //xml = builder.build(new File("Film2.xml")) ;
        }catch (IOException e) {
            
        } catch (JDOMException ex) {
            Logger.getLogger(FilmApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        org.jdom2.Element root= xml.getRootElement();
        System.out.println("La racine"+root.getName());
        // afficher le fichier fil.sml
        chaine = affiche(xml);
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilmProjet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JPanel jp3;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JPanel tab4;
    // End of variables declaration//GEN-END:variables
}
