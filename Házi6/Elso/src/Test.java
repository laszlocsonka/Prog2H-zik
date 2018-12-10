
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
public class Test extends JFrame implements ActionListener{
    public static void main(String[] args) {
        List<Elelmiszer> li = new ArrayList<>();
        
        try {
            FileReader fr = new FileReader(new File("be.txt"));
            BufferedReader br = new BufferedReader(fr);
            String sor;

            while ((sor = br.readLine()) != null) {
                String[] tmp = sor.split(";");
                Elelmiszer sima = new Elelmiszer(tmp[0],tmp[1],tmp[2],Float.parseFloat(tmp[3]),Integer.parseInt(tmp[4]),Integer.parseInt(tmp[5]));
                Elelmiszer tartos = new Elelmiszer(tmp[0],tmp[1],tmp[2],Float.parseFloat(tmp[3]),Integer.parseInt(tmp[4]));
                li.add(sima);
                li.add(tartos);
            }
                
            
            
            br.close();

        } catch (IOException e) {
            System.out.println("Fájl hiba");

        }
        
        Collections.sort(li);
        
        
        try {
            FileWriter fw = new FileWriter(new File("ki.txt"));
            BufferedWriter bw = new BufferedWriter(fw);

            List<Elelmiszer> l2 = new ArrayList();
            for (int i = 0; i < li.size() - 1; i++) {
                l2.add(li.get(i));
                for (int j = i + 1; j < li.size(); j++) {
                    if (li.get(i).equals(li.get(j))) {
                        li.remove(j);
                        li.get(i).mennyiseg+=1;
                    }
                }
           
 
            }
     l2.add(li.get(li.size()-1));
            for (Elelmiszer i : l2) {

                bw.write(i.toString());
                bw.newLine(); 
            }

            bw.close();

        } catch (IOException e) {

        }
        
        
        
        
        
        Test folyamat= new Test();
       
    }
    
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
   JButton gomb;
    JLabel lvevő, üzenet;
    JTextField termékkérés;
    JPanel pvevő,gombhely, üzenethely;
    
    public Test() throws HeadlessException {
  
    super("Üzlet");
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
 
    GridLayout gr= new GridLayout(4,1);
    setLayout(gr);
    
    
  
    lvevő= new JLabel("Vevő kérése");
    
    üzenet = new JLabel();
    termékkérés= new JTextField(20);
    
    
   gomb= new JButton("Lebonyolít");
   gomb.addActionListener(this);
   
 
   pvevő= new JPanel();
   pvevő.add(lvevő);
   pvevő.add(termékkérés);
   
  
   
   
   gombhely= new JPanel();
   gombhely.add(gomb);
   
   üzenethely= new JPanel();
   üzenethely.add(üzenet);
   
    
   this.add(pvevő);
   this.add(gombhely);
   this.add(üzenethely);
   pack();
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
