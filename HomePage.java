
import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteLayout;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author New
 */
public class HomePage extends javax.swing.JFrame {
public static String username="";
public static int flag=0;
String rootpath="C:\\Users\\New\\Documents\\NetBeansProjects\\Digital_Library\\src\\DigitalLibraryResources\\CoverPhotos\\";
String rootpath2="C:\\Users\\New\\Documents\\NetBeansProjects\\Digital_Library\\src\\";

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        
        if(flag==0){
             JOptionPane.showMessageDialog(null, "Welcome "+username);
             flag=1;
        }
             ImageIcon img=new ImageIcon( rootpath2+"logout.png");
            //           Resize Image to filt jLabel
            Image image=img.getImage().getScaledInstance(jLabel9.getWidth(),jLabel9.getHeight(),Image.SCALE_SMOOTH);
            jLabel9.setIcon(new ImageIcon(image));
        ProfileName1.setText(username);
//        ProfileName.setText(username);
        
        
        addcoverphoto();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void addcoverphoto(){
            //Display image on jlabel
                        String arr[]={
//                1
                "Sapiens A Brief History of Humankind.jpg",
                "THE IMMORTAL LIFE OF HENRIETTA LACKS.jpg",
                "The Sixth Extinction.jpg",
                
//                2
            "1984.jpg",
            "ONE HUNDRED YEARS OF SOLITUDE.jpg",
            "Pride and Prejudice.jpg",
            
//            3
            "ALL THE LIGHT WE CANNOT SEE.jpg",
            "THE BOOK THIEF.jpg",
            "THE PILLARS of the EARTH.jpg",
            
//            4
            "Ancient India.jpg",
            "India's Struggle for Independence.jpg",
            "JAINISM THE WORLD OF CONQUERORS.jpg",
            
//            5
            "DRACULA.jpg",
            "Stephen King The Shining.jpg",
            "THE HAUNTING OF HILL HOUSE.jpeg",
            
//            6
            "GITANJALI.jpg",
            "LEAVES OF GRASS.jpg",
            "the sun and her flowers.jpg",
            
//            7
            "Playing It My Way.jpg",
            "The Story of My Experiments with Truth.jpg",
            "WINGS OF FIRE.jpg",
            
//            8
            "FOUNDATION.jpg",
            "THE LEFT HAND OF DARKNESS.jpg",
            "The Martian.jpg"
            };
            
            
//            1
            ImageIcon img=new ImageIcon(rootpath+arr[0]);
            //           Resize Image to filt jLabel
            Image image=img.getImage().getScaledInstance(jLabel6.getWidth(),jLabel6.getHeight(),Image.SCALE_SMOOTH);
            jLabel6.setIcon(new ImageIcon(image));
            
             img=new ImageIcon(rootpath+arr[1]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel7.getWidth(),jLabel7.getHeight(),Image.SCALE_SMOOTH);
            jLabel7.setIcon(new ImageIcon(image));
            
            img=new ImageIcon(rootpath+arr[2]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel8.getWidth(),jLabel8.getHeight(),Image.SCALE_SMOOTH);
            jLabel8.setIcon(new ImageIcon(image));
            
            
//            2
            img=new ImageIcon(rootpath+arr[3]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel10.getWidth(),jLabel10.getHeight(),Image.SCALE_SMOOTH);
            jLabel10.setIcon(new ImageIcon(image));
            
            img=new ImageIcon(rootpath+arr[4]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel11.getWidth(),jLabel11.getHeight(),Image.SCALE_SMOOTH);
            jLabel11.setIcon(new ImageIcon(image));
            
            img=new ImageIcon(rootpath+arr[5]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel12.getWidth(),jLabel12.getHeight(),Image.SCALE_SMOOTH);
            jLabel12.setIcon(new ImageIcon(image));

            
//            3
            img=new ImageIcon(rootpath+arr[6]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel14.getWidth(),jLabel14.getHeight(),Image.SCALE_SMOOTH);
            jLabel14.setIcon(new ImageIcon(image));
            
            img=new ImageIcon(rootpath+arr[7]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel16.getWidth(),jLabel16.getHeight(),Image.SCALE_SMOOTH);
            jLabel16.setIcon(new ImageIcon(image));
            
            img=new ImageIcon(rootpath+arr[8]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel18.getWidth(),jLabel18.getHeight(),Image.SCALE_SMOOTH);
            jLabel18.setIcon(new ImageIcon(image));
            
            
//            4
            img=new ImageIcon(rootpath+arr[9]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel20.getWidth(),jLabel20.getHeight(),Image.SCALE_SMOOTH);
            jLabel20.setIcon(new ImageIcon(image));
            
            img=new ImageIcon(rootpath+arr[10]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel22.getWidth(),jLabel22.getHeight(),Image.SCALE_SMOOTH);
            jLabel22.setIcon(new ImageIcon(image));
            
            img=new ImageIcon(rootpath+arr[11]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel24.getWidth(),jLabel24.getHeight(),Image.SCALE_SMOOTH);
            jLabel24.setIcon(new ImageIcon(image));
            
            
//            5
            img=new ImageIcon(rootpath+arr[12]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel26.getWidth(),jLabel26.getHeight(),Image.SCALE_SMOOTH);
            jLabel26.setIcon(new ImageIcon(image));
            
            img=new ImageIcon(rootpath+arr[13]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel28.getWidth(),jLabel28.getHeight(),Image.SCALE_SMOOTH);
            jLabel28.setIcon(new ImageIcon(image));
            
            img=new ImageIcon(rootpath+arr[14]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel30.getWidth(),jLabel30.getHeight(),Image.SCALE_SMOOTH);
            jLabel30.setIcon(new ImageIcon(image));
            
            
//            6
            img=new ImageIcon(rootpath+arr[15]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel32.getWidth(),jLabel32.getHeight(),Image.SCALE_SMOOTH);
            jLabel32.setIcon(new ImageIcon(image));
            
            img=new ImageIcon(rootpath+arr[16]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel34.getWidth(),jLabel34.getHeight(),Image.SCALE_SMOOTH);
            jLabel34.setIcon(new ImageIcon(image));
            
            img=new ImageIcon(rootpath+arr[17]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel36.getWidth(),jLabel36.getHeight(),Image.SCALE_SMOOTH);
            jLabel36.setIcon(new ImageIcon(image));
            
            
//            7
            img=new ImageIcon(rootpath+arr[18]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel38.getWidth(),jLabel38.getHeight(),Image.SCALE_SMOOTH);
            jLabel38.setIcon(new ImageIcon(image));
            
            img=new ImageIcon(rootpath+arr[19]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel40.getWidth(),jLabel40.getHeight(),Image.SCALE_SMOOTH);
            jLabel40.setIcon(new ImageIcon(image));
            
            img=new ImageIcon(rootpath+arr[20]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel42.getWidth(),jLabel42.getHeight(),Image.SCALE_SMOOTH);
            jLabel42.setIcon(new ImageIcon(image));
            
            
//            8
            img=new ImageIcon(rootpath+arr[21]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel44.getWidth(),jLabel44.getHeight(),Image.SCALE_SMOOTH);
            jLabel44.setIcon(new ImageIcon(image));
            
            img=new ImageIcon(rootpath+arr[22]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel46.getWidth(),jLabel46.getHeight(),Image.SCALE_SMOOTH);
            jLabel46.setIcon(new ImageIcon(image));
            
            img=new ImageIcon(rootpath+arr[23]);
            //           Resize Image to filt jLabel
             image=img.getImage().getScaledInstance(jLabel48.getWidth(),jLabel48.getHeight(),Image.SCALE_SMOOTH);
            jLabel48.setIcon(new ImageIcon(image));
            
            
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContentSlide1 = new javax.swing.JPanel();
        Categories = new javax.swing.JPanel();
        CategoryName3 = new javax.swing.JLabel();
        CategoryName1 = new javax.swing.JLabel();
        CategoryName4 = new javax.swing.JLabel();
        CategoryName5 = new javax.swing.JLabel();
        CategoryName2 = new javax.swing.JLabel();
        CategoryName6 = new javax.swing.JLabel();
        CategoryName7 = new javax.swing.JLabel();
        CategoryName8 = new javax.swing.JLabel();
        CategoryTitleName = new javax.swing.JLabel();
        Footer = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        TitleName = new javax.swing.JLabel();
        ProfileBar = new javax.swing.JPanel();
        ProfileName = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ProfileName1 = new javax.swing.JLabel();
        CategoryTitleName1 = new javax.swing.JLabel();
        CategoryTitleName2 = new javax.swing.JLabel();
        BooksDisplay = new javax.swing.JPanel();
        NonFiction = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Fiction = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        HistoricalFiction = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        History = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        Horror = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        Poetry = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        Biography = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        ScienceFiction = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page");

        ContentSlide1.setBackground(new java.awt.Color(204, 218, 255));
        ContentSlide1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Categories.setBackground(new java.awt.Color(102, 102, 102));
        Categories.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CategoryName3.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        CategoryName3.setForeground(new java.awt.Color(255, 255, 255));
        CategoryName3.setText("   Historical Fiction");
        CategoryName3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CategoryName3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryName3MouseClicked(evt);
            }
        });
        Categories.add(CategoryName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 230, 50));

        CategoryName1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        CategoryName1.setForeground(new java.awt.Color(255, 255, 255));
        CategoryName1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CategoryName1.setText("   Non-Fiction");
        CategoryName1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CategoryName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CategoryName1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CategoryName1FocusLost(evt);
            }
        });
        CategoryName1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryName1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CategoryName1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CategoryName1MouseExited(evt);
            }
        });
        Categories.add(CategoryName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 230, 50));

        CategoryName4.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        CategoryName4.setForeground(new java.awt.Color(255, 255, 255));
        CategoryName4.setText("   History");
        CategoryName4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CategoryName4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryName4MouseClicked(evt);
            }
        });
        Categories.add(CategoryName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, 50));

        CategoryName5.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        CategoryName5.setForeground(new java.awt.Color(255, 255, 255));
        CategoryName5.setText("   Horror");
        CategoryName5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CategoryName5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryName5MouseClicked(evt);
            }
        });
        Categories.add(CategoryName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 230, 50));

        CategoryName2.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        CategoryName2.setForeground(new java.awt.Color(255, 255, 255));
        CategoryName2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CategoryName2.setText("   Fiction");
        CategoryName2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CategoryName2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryName2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CategoryName2MouseEntered(evt);
            }
        });
        Categories.add(CategoryName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 230, 50));

        CategoryName6.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        CategoryName6.setForeground(new java.awt.Color(255, 255, 255));
        CategoryName6.setText("   Poetry");
        CategoryName6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CategoryName6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryName6MouseClicked(evt);
            }
        });
        Categories.add(CategoryName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 230, 50));

        CategoryName7.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        CategoryName7.setForeground(new java.awt.Color(255, 255, 255));
        CategoryName7.setText("   Biography");
        CategoryName7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CategoryName7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryName7MouseClicked(evt);
            }
        });
        Categories.add(CategoryName7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 230, 50));

        CategoryName8.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        CategoryName8.setForeground(new java.awt.Color(255, 255, 255));
        CategoryName8.setText("   Science Fiction");
        CategoryName8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CategoryName8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryName8MouseClicked(evt);
            }
        });
        Categories.add(CategoryName8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 230, 50));

        CategoryTitleName.setFont(new java.awt.Font("Baskerville Old Face", 1, 30)); // NOI18N
        CategoryTitleName.setForeground(new java.awt.Color(255, 255, 255));
        CategoryTitleName.setText(" Categories");
        Categories.add(CategoryTitleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 50));

        ContentSlide1.add(Categories, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 230, 570));

        Footer.setBackground(new java.awt.Color(102, 255, 255));
        Footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 102, 255));
        jLabel50.setText("Copyright All rights Reserverd. Designed & Developed by S. S. Upadhye.");
        Footer.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 560, 30));

        ContentSlide1.add(Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1390, 60));

        Header.setBackground(new java.awt.Color(102, 102, 102));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(102, 102, 102));
        Title.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleName.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        TitleName.setForeground(new java.awt.Color(255, 255, 255));
        TitleName.setText("Digital Library");
        Title.add(TitleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 338, 77));

        Header.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 6, 351, 89));

        ProfileBar.setBackground(new java.awt.Color(102, 102, 102));
        ProfileBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProfileName.setBackground(new java.awt.Color(102, 102, 102));
        ProfileName.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ProfileName.setForeground(new java.awt.Color(255, 255, 255));
        ProfileName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProfileName.setText("USER");
        ProfileBar.add(ProfileName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, -1));

        jLabel9.setBackground(new java.awt.Color(255, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        ProfileBar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 50, 20));

        ProfileName1.setBackground(new java.awt.Color(102, 102, 102));
        ProfileName1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ProfileName1.setForeground(new java.awt.Color(255, 255, 255));
        ProfileName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProfileName1.setText("USER");
        ProfileBar.add(ProfileName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, -1));

        Header.add(ProfileBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 320, 60));

        CategoryTitleName1.setFont(new java.awt.Font("Baskerville Old Face", 1, 30)); // NOI18N
        CategoryTitleName1.setForeground(new java.awt.Color(255, 255, 255));
        CategoryTitleName1.setText(" Category : ");
        Header.add(CategoryTitleName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, 50));

        CategoryTitleName2.setFont(new java.awt.Font("Baskerville Old Face", 1, 30)); // NOI18N
        CategoryTitleName2.setForeground(new java.awt.Color(255, 255, 255));
        CategoryTitleName2.setText("Non-Fiction");
        Header.add(CategoryTitleName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 250, 50));

        ContentSlide1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 83));

        BooksDisplay.setBackground(new java.awt.Color(255, 255, 255));
        BooksDisplay.setLayout(new java.awt.CardLayout());

        NonFiction.setBackground(new java.awt.Color(204, 218, 255));
        NonFiction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NonFiction.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 220, 250));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sapiens: A Brief History of HumanKind");
        NonFiction.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 220, 20));

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        NonFiction.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 220, 30));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NonFiction.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 220, 250));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("The Immortal Life of Henrietta Lacks");
        NonFiction.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 220, 20));

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        NonFiction.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 220, 30));

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NonFiction.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 220, 250));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("The Sixth Extinction");
        NonFiction.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 220, 20));

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        NonFiction.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 220, 30));

        BooksDisplay.add(NonFiction, "card2");

        Fiction.setBackground(new java.awt.Color(204, 218, 255));
        Fiction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Fiction.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 220, 250));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("1984");
        Fiction.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 220, 20));

        jButton4.setBackground(new java.awt.Color(51, 102, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("View");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Fiction.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 220, 30));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Fiction.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 220, 250));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("One Hundred Years of Solitude");
        Fiction.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 220, 20));

        jButton5.setBackground(new java.awt.Color(51, 102, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("View");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Fiction.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 220, 30));

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Fiction.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 220, 250));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Pride and Prejudice");
        Fiction.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 220, 20));

        jButton6.setBackground(new java.awt.Color(51, 102, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("View");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Fiction.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 220, 30));

        BooksDisplay.add(Fiction, "card2");

        HistoricalFiction.setBackground(new java.awt.Color(204, 218, 255));
        HistoricalFiction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HistoricalFiction.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 220, 250));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("All the Light We Cannot See");
        HistoricalFiction.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 220, 20));

        jButton7.setBackground(new java.awt.Color(51, 102, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("View");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        HistoricalFiction.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 220, 30));

        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HistoricalFiction.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 220, 250));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("The Book Thief");
        HistoricalFiction.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 220, 20));

        jButton8.setBackground(new java.awt.Color(51, 102, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("View");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        HistoricalFiction.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 220, 30));

        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HistoricalFiction.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 220, 250));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("The Pillars of Earth");
        HistoricalFiction.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 220, 20));

        jButton9.setBackground(new java.awt.Color(51, 102, 255));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("View");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        HistoricalFiction.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 220, 30));

        BooksDisplay.add(HistoricalFiction, "card2");

        History.setBackground(new java.awt.Color(204, 218, 255));
        History.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        History.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 220, 250));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Ancient India");
        History.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 220, 20));

        jButton10.setBackground(new java.awt.Color(51, 102, 255));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("View");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        History.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 220, 30));

        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        History.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 220, 250));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("India's Struggle for Independence");
        History.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 220, 20));

        jButton11.setBackground(new java.awt.Color(51, 102, 255));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("View");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        History.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 220, 30));

        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        History.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 220, 250));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Jainism The World Of Conquerors");
        History.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 220, 20));

        jButton12.setBackground(new java.awt.Color(51, 102, 255));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("View");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        History.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 220, 30));

        BooksDisplay.add(History, "card2");

        Horror.setBackground(new java.awt.Color(204, 218, 255));
        Horror.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Horror.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 220, 250));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Dracula");
        Horror.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 220, 20));

        jButton13.setBackground(new java.awt.Color(51, 102, 255));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("View");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        Horror.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 220, 30));

        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Horror.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 220, 250));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Stephen King The Shining");
        Horror.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 220, 20));

        jButton14.setBackground(new java.awt.Color(51, 102, 255));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("View");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        Horror.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 220, 30));

        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Horror.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 220, 250));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("The Haunting Of Hill House");
        Horror.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 220, 20));

        jButton15.setBackground(new java.awt.Color(51, 102, 255));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("View");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        Horror.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 220, 30));

        BooksDisplay.add(Horror, "card2");

        Poetry.setBackground(new java.awt.Color(204, 218, 255));
        Poetry.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Poetry.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 220, 250));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Gitanjali");
        Poetry.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 220, 20));

        jButton16.setBackground(new java.awt.Color(51, 102, 255));
        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("View");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        Poetry.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 220, 30));

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Poetry.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 220, 250));

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Leaves of Grass");
        Poetry.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 220, 20));

        jButton17.setBackground(new java.awt.Color(51, 102, 255));
        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("View");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        Poetry.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 220, 30));

        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Poetry.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 220, 250));

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("The Sun and Her Flowers");
        Poetry.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 220, 20));

        jButton18.setBackground(new java.awt.Color(51, 102, 255));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("View");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        Poetry.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 220, 30));

        BooksDisplay.add(Poetry, "card2");

        Biography.setBackground(new java.awt.Color(204, 218, 255));
        Biography.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Biography.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 220, 250));

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Playing It My Way");
        Biography.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 220, 20));

        jButton19.setBackground(new java.awt.Color(51, 102, 255));
        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("View");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        Biography.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 220, 30));

        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Biography.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 220, 250));

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("The Story of My Experiments with Truth");
        Biography.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 220, 20));

        jButton20.setBackground(new java.awt.Color(51, 102, 255));
        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("View");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        Biography.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 220, 30));

        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Biography.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 220, 250));

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Wings of Fire");
        Biography.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 220, 20));

        jButton21.setBackground(new java.awt.Color(51, 102, 255));
        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("View");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        Biography.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 220, 30));

        BooksDisplay.add(Biography, "card2");

        ScienceFiction.setBackground(new java.awt.Color(204, 218, 255));
        ScienceFiction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ScienceFiction.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 220, 250));

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Foundation");
        ScienceFiction.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 220, 20));

        jButton22.setBackground(new java.awt.Color(51, 102, 255));
        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("View");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        ScienceFiction.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 220, 30));

        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ScienceFiction.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 220, 250));

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("The Left Hand of Darkness");
        ScienceFiction.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 220, 20));

        jButton23.setBackground(new java.awt.Color(51, 102, 255));
        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("View");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        ScienceFiction.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 220, 30));

        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ScienceFiction.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 220, 250));

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("The Martian");
        ScienceFiction.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 220, 20));

        jButton24.setBackground(new java.awt.Color(51, 102, 255));
        jButton24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("View");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        ScienceFiction.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 220, 30));

        BooksDisplay.add(ScienceFiction, "card2");

        ContentSlide1.add(BooksDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 1140, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentSlide1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentSlide1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CategoryName1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CategoryName1FocusGained

    }//GEN-LAST:event_CategoryName1FocusGained

    private void CategoryName1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CategoryName1FocusLost

    }//GEN-LAST:event_CategoryName1FocusLost

  
    private void CategoryName1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryName1MouseClicked
            BooksDisplay.removeAll();
            BooksDisplay.add(NonFiction);
            BooksDisplay.repaint();
            BooksDisplay.revalidate();
           CategoryTitleName2.setText(CategoryName1.getText());
            
//try{
//            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/digitallibrary?"
//            +"user=root&password=suraj123");
//             PreparedStatement stmt=conn.prepareStatement("select bookname,authorname,category from digitallibrary.bookinfo where bookcategory=?");
//            stmt.setString(1, "Non-Fiction");
//        }
//        catch(Exception e){
//            
////        }
//        JPanel p1=new JPanel();
//        p1.setBounds(10, 10, 300, 350);
//        p1.setLayout(new AbsoluteLayout());
////        p1.setBackground(Color.red);
//        JLabel Coverphoto=new JLabel("hello");
//        Border border=BorderFactory.createLineBorder(Color.BLACK,1);
//        Coverphoto.setBorder( border);
//        Coverphoto.setBounds(10,10,220,250);
//        
//        p1.add(Coverphoto);
//        ImageIcon image=new ImageIcon();
//       BooksDisplay.add(p1);

    }//GEN-LAST:event_CategoryName1MouseClicked

    private void CategoryName1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryName1MouseEntered
        CategoryName1.setBackground(Color.red);
    }//GEN-LAST:event_CategoryName1MouseEntered

    private void CategoryName1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryName1MouseExited
        this.setBackground(Color.green);
    }//GEN-LAST:event_CategoryName1MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
        JOptionPane.showMessageDialog(null, "Logout Successful..!!");
    }//GEN-LAST:event_jLabel9MouseClicked

    private void CategoryName2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryName2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryName2MouseEntered

    private void CategoryName2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryName2MouseClicked
       BooksDisplay.removeAll();
            BooksDisplay.add(Fiction);
            BooksDisplay.repaint();
            BooksDisplay.revalidate();
              CategoryTitleName2.setText(CategoryName2.getText());
    }//GEN-LAST:event_CategoryName2MouseClicked

    private void CategoryName3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryName3MouseClicked
     BooksDisplay.removeAll();
            BooksDisplay.add(HistoricalFiction);
            BooksDisplay.repaint();
            BooksDisplay.revalidate();
              CategoryTitleName2.setText(CategoryName3.getText());
    }//GEN-LAST:event_CategoryName3MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         displaybookinfo(5);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void CategoryName4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryName4MouseClicked
       BooksDisplay.removeAll();
            BooksDisplay.add(History);
            BooksDisplay.repaint();
            BooksDisplay.revalidate();
              CategoryTitleName2.setText(CategoryName4.getText());
    }//GEN-LAST:event_CategoryName4MouseClicked

    private void CategoryName5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryName5MouseClicked
      BooksDisplay.removeAll();
            BooksDisplay.add(Horror);
            BooksDisplay.repaint();
            BooksDisplay.revalidate();
              CategoryTitleName2.setText(CategoryName5.getText());
    }//GEN-LAST:event_CategoryName5MouseClicked

    private void CategoryName6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryName6MouseClicked
      BooksDisplay.removeAll();
            BooksDisplay.add(Poetry);
            BooksDisplay.repaint();
            BooksDisplay.revalidate();
              CategoryTitleName2.setText(CategoryName6.getText());
    }//GEN-LAST:event_CategoryName6MouseClicked

    private void CategoryName7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryName7MouseClicked
        BooksDisplay.removeAll();
            BooksDisplay.add(Biography);
            BooksDisplay.repaint();
            BooksDisplay.revalidate();
              CategoryTitleName2.setText(CategoryName7.getText());
    }//GEN-LAST:event_CategoryName7MouseClicked

    private void CategoryName8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryName8MouseClicked
       BooksDisplay.removeAll();
            BooksDisplay.add(ScienceFiction);
            BooksDisplay.repaint();
            BooksDisplay.revalidate();
              CategoryTitleName2.setText(CategoryName8.getText());
    }//GEN-LAST:event_CategoryName8MouseClicked

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
          displaybookinfo(22);
    }//GEN-LAST:event_jButton22ActionPerformed

    public void displaybookinfo(int id){
     BookInfoPage.flag=id;
     dispose();
     BookInfoPage bi=new BookInfoPage();
     bi.setVisible(true);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     displaybookinfo(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      displaybookinfo(2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        displaybookinfo(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        displaybookinfo(4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         displaybookinfo(6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         displaybookinfo(7);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         displaybookinfo(8);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       displaybookinfo(9);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         displaybookinfo(10);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
          displaybookinfo(11);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        displaybookinfo(12);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        displaybookinfo(13);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
          displaybookinfo(14);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
         displaybookinfo(15);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        displaybookinfo(16);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
          displaybookinfo(17);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
         displaybookinfo(18);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        displaybookinfo(19);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        displaybookinfo(20);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
      displaybookinfo(21);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
         displaybookinfo(23);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
       displaybookinfo(24);
    }//GEN-LAST:event_jButton24ActionPerformed
   
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Biography;
    private javax.swing.JPanel BooksDisplay;
    private javax.swing.JPanel Categories;
    private javax.swing.JLabel CategoryName1;
    private javax.swing.JLabel CategoryName2;
    private javax.swing.JLabel CategoryName3;
    private javax.swing.JLabel CategoryName4;
    private javax.swing.JLabel CategoryName5;
    private javax.swing.JLabel CategoryName6;
    private javax.swing.JLabel CategoryName7;
    private javax.swing.JLabel CategoryName8;
    private javax.swing.JLabel CategoryTitleName;
    private javax.swing.JLabel CategoryTitleName1;
    private javax.swing.JLabel CategoryTitleName2;
    private javax.swing.JPanel ContentSlide1;
    private javax.swing.JPanel Fiction;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel HistoricalFiction;
    private javax.swing.JPanel History;
    private javax.swing.JPanel Horror;
    private javax.swing.JPanel NonFiction;
    private javax.swing.JPanel Poetry;
    private javax.swing.JPanel ProfileBar;
    private javax.swing.JLabel ProfileName;
    private javax.swing.JLabel ProfileName1;
    private javax.swing.JPanel ScienceFiction;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel TitleName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
