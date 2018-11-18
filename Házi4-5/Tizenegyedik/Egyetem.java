/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tizenegyedik;

import java.util.List;

/**
 *
 * @author LacGep
 */
public class Egyetem {
    public List<Hallgato>diak;
    public List<Oktato>tanar;
    public Egyetem(List<Hallgato> diak, List<Oktato> tanar) {
        this.diak = diak;
        this.tanar = tanar;
    }
    public List<Hallgato> getDiak() {
        return diak;
    }
    public void setDiak(List<Hallgato> diak) {
        this.diak = diak;
    }
    public List<Oktato> getTanar() {
        return tanar;
    }
    public void setTanar(List<Oktato> tanar) {
        this.tanar = tanar;
    }
    public void haromfiatal(List<Hallgato> halg)
    {Hallgato tmp;
        if(halg.size()>3)
        {
            for(int i=0;i<halg.size();++i)
            {
                for(int j=0;j<halg.size();++j)
                    if(halg.get(i).eletkor>halg.get(j).eletkor)
                    {
                        tmp=halg.get(i);
                        halg.set(i, halg.get(j));
                        halg.set(j, tmp);
                    
                    }
                    
            }
            for(int i=0;i<3;++i)
                System.out.println(halg.toString());
        }
        else System.out.println(halg.toString());
    }
    public void noiIT(List<Oktato>okt)
    {
        for(int i=0;i<okt.size();++i)
        {
            if(okt.get(i).Tanszek.equals("IT"))
                okt.get(i).Tanszek.concat("!");
        }
    }
}
