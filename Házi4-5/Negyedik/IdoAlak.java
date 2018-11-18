
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class IdoAlak extends JFrame implements ActionListener{
    JButton gomb;
    JLabel sznap1, sznap2, szora1, szora2, szperc1, szperc2, szsec1, szsec2, sznaposz,szoraosz, szpercosz, szsecosz;
    JTextField nap1, nap2, naposz, ora1, ora2, oraosz, perc1, perc2, percosz, sec1, secosz, sec2;
    JPanel j1, j2, j3, j4;

    public IdoAlak() throws HeadlessException {
        super("IdoAtalakito");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridLayout gr = new GridLayout(4, 1);
        setLayout(gr);
        setSize(1000,400);
        String o="óra", p="perc", m="másodperc", n="nap";
        
        j1 = new JPanel();
        sznap1 = new JLabel(n);
        szora1 = new JLabel(o);
        szperc1 = new JLabel(p);
        szsec1 = new JLabel(m);
        nap1 = new JTextField(5);
        ora1 = new JTextField(5);
        perc1 = new JTextField(5);
        sec1 = new JTextField(5);
        j1.add(nap1);
        j1.add(sznap1);
        j1.add(ora1);
        j1.add(szora1);
        j1.add(perc1);
        j1.add(szperc1);
        j1.add(sec1);
        j1.add(szsec1);
        
        
        j2= new JPanel();
        sznap2 = new JLabel(n);
        szora2 = new JLabel(o);
        szperc2 = new JLabel(p);
        szsec2 = new JLabel(m);
        
        nap2 = new JTextField(5);
        ora2 = new JTextField(5);
        perc2 = new JTextField(5);
        sec2 = new JTextField(5);
        
        j2.add(nap2);
        j2.add(sznap2);
        j2.add(ora2);
        j2.add(szora2);
        j2.add(perc2);
        j2.add(szperc2);
        j2.add(sec2);
        j2.add(szsec2);
  
        
        j3 = new JPanel();
        sznaposz = new JLabel(n);
        szoraosz = new JLabel(o);
        szpercosz = new JLabel(p);
        szsecosz = new JLabel(m);

        naposz = new JTextField(5);
        oraosz = new JTextField(5); 
        percosz = new JTextField(5);
        secosz = new JTextField(5);
        
        j3.add(naposz);
        j3.add(sznaposz);
        j3.add(oraosz);
        j3.add(szoraosz);
        j3.add(percosz);
        j3.add(szpercosz);
        j3.add(secosz);
        j3.add(szsecosz);
        
        j4 =new JPanel();
        gomb= new JButton("Számol");
        gomb.addActionListener(this);
        
        j4.add(gomb);
        this.add(j1);
        this.add(j2);
        this.add(j4);
        this.add(j3);
        pack();//ráméretezi az ablakot az adatokra

    }

    public static void main(String[] args) {
        IdoAlak negyedik = new IdoAlak();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       int napo, perco, seco, orao; 
       String s;
        if(e.getSource()==gomb){
            napo=(int) (Float.valueOf(nap1.getText())+Float.valueOf(nap2.getText()));
            perco=(int) (Float.valueOf(perc1.getText())+Float.valueOf(perc2.getText()));
            seco=(int) (Float.valueOf(sec1.getText())+Float.valueOf(sec2.getText()));
            orao=(int) (Float.valueOf(ora1.getText())+Float.valueOf(ora2.getText()));
            if(seco/60>0){
                perco=perco+(seco/60);
                seco=seco%60;
            }
            if(perco/60>0){
                orao=orao+(perco/60);
                perco=perco%60;
            }
            if(orao/24>0){
                napo=napo+(orao/24);
                orao=orao%24;
            }
            
            naposz.setText(Integer.toString(napo));
            oraosz.setText(Integer.toString(orao));
            percosz.setText(Integer.toString(perco));
            secosz.setText(Integer.toString(seco));
        }
            
    }
}
