/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
public class Tea implements Rendezheto<Tea> {
    
    
    public String nev;
    public int ár;
    public Tea(String s,int j) {
    nev=s;
    ár=j;
    
    }

    @Override
    public boolean egyenlo(Tea o) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(this.ár==o.ár){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean nagyobbMint(Tea o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(this.ár>o.ár){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean kisebbMint(Tea o) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(this.ár<o.ár){
           return true;
       }else{
           return false;
       }
    }

}
