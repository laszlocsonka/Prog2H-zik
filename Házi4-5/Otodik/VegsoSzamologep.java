
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
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
public class VegsoSzamologep extends JFrame implements ActionListener {
    
    JButton back, ce, c, mc, mr, ms, mplus, sqr, szazalek, osztas, szorzas, 
            kivonas, osszeadas, egy, keto, harom, negy, ot, hat, het, nyolc, kilenc, 
            nulla, negpo, pont, egyperx, egyenlo,semmi; 
    JTextField text,textures;
    JPanel j1,j2,j3,j4,j5,j6,j7;
    float oszeg=0;
    float a = 0, b = 0, result = 0;
    int operator = 0;
    public VegsoSzamologep() throws HeadlessException{
       
        super("Számológép");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        GridLayout gr= new GridLayout(3,1);
//        GridLayout gb= new GridLayout(4,6);
//        GridLayout j2nek= new GridLayout(1,3);
//        GridLayout j1nek = new GridLayout(1,1);
//        setSize(400,400);
//        setLayout(gr);

        j1=new JPanel();
        j2=new JPanel();
        j3=new JPanel();
        j4=new JPanel();
        j5=new JPanel();
        j6=new JPanel();
        j7=new JPanel();

        GridLayout gro=new GridLayout(6,1);  
        GridLayout gr1= new GridLayout(1,6);
        GridLayout gr2=new GridLayout(1,4);
        GridLayout gr3= new GridLayout(1,6);
        GridLayout gr4= new GridLayout(1,6);
        GridLayout gr5= new GridLayout(1,6);
        GridLayout gr6= new GridLayout(1,6);
        
        setLayout(gro);
        
       
        j1.setLayout(gr1);
        text= new JTextField(40);
        j1.add(text);
        
        
       
        j2.setLayout(gr2);
        semmi= new JButton("<html><body><font color=#FF0000></font></body></html>");
        back= new JButton("<html><body><font color=#FF0000>Backspace</font></body></html>");
        back.addActionListener(this);
        ce= new JButton("<html><body><font color=#FF0000>CE</font></body></html>");
        ce.addActionListener(this);
        c= new JButton("<html><body><font color=#FF0000>C</font></body></html>");
        c.addActionListener(this);
        
        j2.add(semmi);
        j2.add(back);
        j2.add(ce);
        j2.add(c);
        
        
        
        j3.setLayout(gr3);
        
        mc= new JButton("<html><body><font color=#FF0000>MC</font></body></html>");
        mc.addActionListener(this);
        
        het= new JButton("7");
        het.addActionListener(this);
        
        nyolc = new JButton("8");
        nyolc.addActionListener(this);
        
        kilenc=new JButton("9");
        kilenc.addActionListener(this);
        
        osztas = new JButton("<html><body><font color=#FF0000>/</font></body></html>");
        osztas.addActionListener(this);
        
        sqr= new JButton("sqrt");
        sqr.addActionListener(this);
       
        j3.add(mc);
        j3.add(het);
        j3.add(nyolc);
        j3.add(kilenc);
        j3.add(osztas);
        j3.add(sqr);
        
        
        j4.setLayout(gr4);
        mr= new JButton("<html><body><font color=#FF0000>MR</font></body></html>");
        mr.addActionListener(this);
        j4.add(mr);
        negy = new JButton("4");
        negy.addActionListener(this);
        ot= new JButton("5");
        ot.addActionListener(this);
        hat= new JButton("6");
        hat.addActionListener(this);
        szorzas= new JButton("<html><body><font color=#FF0000>*</font></body></html>");
        szorzas.addActionListener(this);
        szazalek = new JButton("%");
        szazalek.addActionListener(this);
        j4.add(mr);
        j4.add(negy);
        j4.add(ot);
        j4.add(hat);
        j4.add(szorzas);
        j4.add(szazalek);
        
        j5.setLayout(gr5);
        ms= new JButton("<html><body><font color=#FF0000>MS</font></body></html>");
        ms.addActionListener(this);
        egy = new JButton("1");
        egy.addActionListener(this);
        keto = new JButton("2");
        keto.addActionListener(this);
        harom = new JButton("3");
        harom.addActionListener(this);
        kivonas = new JButton("<html><body><font color=#FF0000>-</font></body></html>");
        kivonas.addActionListener(this);
        egyperx = new JButton("1/x");
        egyperx.addActionListener(this);
        
        j5.add(ms);
        j5.add(egy);
        j5.add(keto);
        j5.add(harom);
        j5.add(kivonas);
        j5.add(egyperx);
        
        j6.setLayout(gr6);
        mplus = new JButton("<html><body><font color=#FF0000>M+</font></body></html>");
        mplus.addActionListener(this);
        nulla= new JButton("0");
        nulla.addActionListener(this);
        negpo = new JButton("+/-");
        negpo.addActionListener(this);
        pont = new JButton(".");
        pont.addActionListener(this);
        osszeadas = new JButton("<html><body><font color=#FF0000>+</font></body></html>");
        osszeadas.addActionListener(this);
        egyenlo = new JButton("<html><body><font color=#FF0000>=</font></body></html>");
        egyenlo.addActionListener(this);
        
        j6.add(mplus);
        j6.add(nulla);
        j6.add(negpo);
        j6.add(pont);
        j6.add(osszeadas);
        j6.add(egyenlo);
        
        this.add(j1);
        this.add(j2);
        this.add(j3);
        this.add(j4);
        this.add(j5);
        this.add(j6);
    
                
    
        pack();
       
    }
    
    
    
    public static void main(String[] args) {
        VegsoSzamologep het= new VegsoSzamologep();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==nulla)
       {
           text.setText(text.getText()+"0");
  

       }
       if(e.getSource()==egy)
       {
           text.setText(text.getText()+"1");

       }
       if(e.getSource()==keto)
       {
           text.setText(text.getText()+"2");

       }
       if(e.getSource()==harom)
       {
           text.setText(text.getText()+"3");

       }
       if(e.getSource()==negy)
       {
           text.setText(text.getText()+"4");

       }
       if(e.getSource()==ot)
       {
           text.setText(text.getText()+"5");

       }
       if(e.getSource()==hat)
       {
           text.setText(text.getText()+"6");

       }
       if(e.getSource()==het)
       {
           text.setText(text.getText()+"7");

       }
       if(e.getSource()==nyolc)
       {
           text.setText(text.getText()+"8");

       }if(e.getSource()==kilenc)
       {
           text.setText(text.getText()+"9");

       }
       
     
       
            if (e.getSource() == osszeadas) {
                a = (float) Double.parseDouble(text.getText());
                operator = 1;
                text.setText("");
                }
            if (e.getSource() == kivonas) {
                a = (float) Double.parseDouble(text.getText());
                operator = 2;
                text.setText("");
                }
            if (e.getSource() == szorzas) {
                a = (float) Double.parseDouble(text.getText());
                operator = 3;
                text.setText("");
                }
            if (e.getSource() == osztas) {
                a = (float) Double.parseDouble(text.getText());
                operator = 4;
                text.setText("");
                }
            if (e.getSource() == szazalek) {
                a = (float) Double.parseDouble(text.getText());
                operator = 5;
                text.setText("");
                }
            if (e.getSource() == egyenlo) {
                b = (float) Double.parseDouble(text.getText());
            switch (operator) {
            case 1:
            result = a + b;
            break;
            case 2:
            result = a - b;
            break;
            case 3:
            result = a * b;
            break;
            case 4:
            result = a / b;
            break;
            case 5:
            result = a * b / 100;
            break;
            default:
            result = 0;
        }
        text.setText("" + (int)result);
   }
        if (e.getSource() == c) {
            text.setText("");
   }
       
       
       
    }
}
