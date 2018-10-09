/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
//        1.FELADAT TESZTELÉSE
//        
//        Circle circle = new Circle(1.0);
//        System.out.println("A circle " + circle.toString());
//        System.out.println("The radius is " + circle.getRadius());
//        System.out.println("The area is " + circle.getArea());
//        System.out.println("The diameter is " + circle.getDiameter());
//
//        Rectangle rectangle = new Rectangle(2.0, 4.0);
//        System.out.println(System.getProperty("line.separator") + "A rectangle " +
//        rectangle.toString());
//        System.out.println("The area is " + rectangle.getArea());
//        System.out.println("The perimeter is " + rectangle.getPerimeter());



//        2.FELADAT TESZTELÉSE
//
//        Triangle obj1=new Triangle(1,1.5,1);
//        System.out.println(obj1.toString());
//        System.out.println("Terület: "+obj1.getArea());
//        System.out.println("Kerület: "+obj1.getPerimeter());
//        obj1.setColor("yellow");
//        obj1.setFilled(true);
//        System.out.println("Színe: "+obj1.getColor());
//        System.out.println("Ki van e töltve: "+obj1.isFilled());


//        3.FELADAT TESZTELÉSE
//
//        VendéglátóipariEgység []v= new VendéglátóipariEgység[10];
//        v[0]=new Étterem(new String []{"Húsleves","Sült csirke","Sült burgonya"},"Kiss étterem",50,false);
//        v[1]=new Étterem(new String []{"Meggyleves","Halpaprikás"},"Nagy étterem",80,false);
//        v[2]=new Étterem(new String []{"Körtekrémleves","Finomfőzelék","Bukta"},"Piros falatozó",30,false);
//        v[3]=new Étterem(new String []{"Gulyásleves","Citromos hal","Burgonyapüré"},"Tengerész egerész",40,false);
//        v[4]=new Étterem(new String []{"Eperkrémleves","Spaghetti bolognese"},"Fél Itália",45,false);
//        v[5]=new Kocsma(new String []{"Duvel","Maes","Moinette Bio"},"Belgák",32,false);
//        v[6]=new Kocsma(new String []{"Arany Ászok","Kőbányai","Duvel","Soproni"},"Magyaros",60,false);
//        v[7]=new Kocsma(new String []{"CRABBIES","Shepherd Neame"},"Englishman",54,false);
//        v[8]=new Kocsma(new String []{"BECK'S","Oettinger","Krombacher"},"Deutsches Bier",39,true);
//        v[9]=new Kocsma(new String []{"PARDUBICKY PORTER","LOBKOWICZ","KONRAD"},"CsakCseh",68,true);
//            
//        Kocsma[] k=adottItaltKínálóKocsmák(v,"Duvel");
//        for(Kocsma i:k){
//            System.out.println(i);
//        
//       }




//        4.FELADAT TESZTELÉSE
//
//        Autó k[]=new Autó[10];
//        k[0]=new Autó("QWE-012",150);
//        k[1]=new Autó("RTZ-345",200);
//        k[2]=new Autó("UIO-678",160);
//        k[3]=new Autó("PAS-900",190);
//        k[4]=new Autó("DFG-232",155);
//        k[5]=new Teherautó(5000,"HJK-343",188);
//        k[6]=new Teherautó(8000,"LYX-746",250);
//        k[7]=new Teherautó(2000,"CVB-918",201);
//        k[8]=new Teherautó(1000,"NME-111",176);
//        k[9]=new Teherautó(9000,"HZN-754",171);
//            
//            
//        Teherautó t[]=new Teherautó[10];
//        t[0]=new Teherautó(11000,"HJK-343",111);
//        t[1]=new Teherautó(21000,"HJK-343",123);
//        t[2]=new Teherautó(32000,"HJK-343",136);
//        t[3]=new Teherautó(3000,"HJK-343",149);
//        t[4]=new Teherautó(16000,"HJK-343",173);
//        t[5]=new Teherautó(18000,"HJK-343",120);
//        t[6]=new Teherautó(25000,"HJK-343",199);
//        t[7]=new Teherautó(35000,"HJK-343",177);
//        t[8]=new Teherautó(18500,"HJK-343",166);
//        t[9]=new Teherautó(13000,"HJK-343",144); 
//            
//            
//        rendezMaxSzallithatoTeherCsokkenoleg(t);
//        System.out.println(keresMaxMotorTeljesitmeny(k)); 
            




//        5.FELADAT TESZTELÉSE

//        Random rnd = new Random();
//        int[] t = new int[30];
//        for (int i = 0; i < t.length; i++)  
//        {
//        t[i] = rnd.nextInt(10);
//        }
//        printArray(t);
//        long timeStart = System.currentTimeMillis();
//        insertionSort(t);
//        long timeEnd = System.currentTimeMillis();
//        printArray(t);
//        System.out.println(timeEnd - timeStart);
//    }
//        static void printArray(int[] a) 
//        {
//        for (int i = 0; i < a.length; i++) 
//        {
//        System.out.print(a[i] + " ");
//        }
//        System.out.println();
//        }
//       static void insertionSort(int[] a) {
//       {            
//       for (int i=0; i<a.length; i++)
//       {
//            int tmp = a[i];
//            int j = i-1;    
//            while (j>=0 && a[j] > tmp)
//            {
//                a[j+1] = a[j];
//                j = j-1;
//            }
//            a[j+1] = tmp;
//            }
//                     
//        }


//        6.FELADAT
//        int t[]={1,1,1,2,3,4,4,4,4,5};
//        if(isConsecutiveFour(t)){
//            System.out.println("Van négy azonos szám egymást követően!");
//        }else
//        {
//            System.out.println("Nincs négy azonos szám egymást követően!");
//        }
//
//
//    }
    
    
//        8-as feladat
//        String ollo="ollo";
//        String papir="papír";
//        String ko="kő";
//        String vege="vége";
//        int k=1, random = 0;
//        Scanner sc= new Scanner(System.in);
//
//        while(k==1){
//            System.out.println("Kérem a stringet!");
//            String felhasz=sc.nextLine();
//            Random rnd= new Random();
//            random =rnd.nextInt(3);
//            
//            if(felhasz.equalsIgnoreCase("ollo")){
//                switch(random)
//                {
//                    case 0:
//                    {
//                       System.out.println("olló");
//                       System.out.println("Döntetlen");
//                       break;
//                    }
//                     case 1:
//                    {
//                       System.out.println("papir");
//                       System.out.println("Vesztettél :D");
//                       break;
//                    }
//                     case 2:
//                    {
//                       System.out.println("kő");
//                       System.out.println("Nyertél :(");
//                       break;
//                    } 
//                }}
//                
//            else
//                if(felhasz.equalsIgnoreCase("papir")){
//                switch(random)
//                {
//                    case 0:
//                    {
//                       System.out.println("olló");
//                       System.out.println("Vesztettél :D");
//                       break;
//                    }
//                     case 1:
//                    {
//                       System.out.println("papir");
//                       System.out.println("Döntetlen");
//                       break;
//                    }
//                     case 2:
//                    {
//                       System.out.println("kő");
//                       System.out.println("Nyertél :(");
//                       break;
//                    } 
//                    }}
//                    else
//                        if(felhasz.equalsIgnoreCase("ko"))
//                            {
//                        switch(random)
//                        {
//                        case 0:
//                        {
//                            System.out.println("olló");
//                            System.out.println("Nyertél :(");
//                            break;
//                        }
//                        case 1:
//                        {
//                            System.out.println("papir");
//                            System.out.println("Vesztettél :D");
//                            break;
//                        }
//                        case 2:
//                        {
//                            System.out.println("kő");
//                            System.out.println("Döntetlen");
//                            break;
//                         } 
//                        }}
//                            else
//                                if(felhasz.equalsIgnoreCase("vége"))
//                                {System.out.println("vége");
//                                    k=0;}
//        }
       
    
    
    
    }   
    
    
    
    
    
    
    //FELADATOK METÓDUSAI
    
    
    
//   3.FELADAT METÓDUSA
//       public static Kocsma [] adottItaltKínálóKocsmák(VendéglátóipariEgység [] t,String ital){    
//       int count=0;
//        for(int i=0;i<t.length;i++){
//         if(t[i] instanceof Kocsma){
//             Kocsma p=(Kocsma) t[i];
//             for(int j=0;j<p.getSörlap().length;j++){
//                 if(p.getSörlap()[j].equals(ital)){
//                     count++; 
//                 }
//             }
//         }                
//        }
//       
//    Kocsma[] kocsma=new Kocsma[count]; 
//     int k=0;
//     for(int i=0;i<t.length;i++){
//         if(t[i] instanceof Kocsma){
//             Kocsma p=(Kocsma) t[i];
//             for(int j=0;j<p.getSörlap().length;j++){
//                 if(p.getSörlap()[j].equals(ital)){
//                     kocsma[k]=p;
//                     k++;
//                 }
//             }
//         }
//                 
//        }
//     return kocsma;
//    }


    
    
    
//   4-es feladat metódusai
//    
//    public static void rendezMaxSzallithatoTeherCsokkenoleg(Teherautó []teher){
//       
//        Teherautó tmp;
//        for(int i=0;i<teher.length-1;i++){
//            for(int j=i+1;j<teher.length;j++){
//            if(teher[i].getMaxSzallithatoTeher()<teher[j].getMaxSzallithatoTeher()){
//                tmp=teher[i];
//                teher[i]=teher[j];
//                teher[j]=tmp;
//            }
//            }  
//        }
//                for(Teherautó x:teher){
//            System.out.println(x);
//        }
//        
//       
//    }
//    
//
//    
//    public static Autó keresMaxMotorTeljesitmeny(Autó []auto){
//        Autó max=new Autó("NUL-000",000);
//       for(Autó i:auto){
//           if(i instanceof Autó){
//               if(i.getMotorTeljesitmeny()>max.getMotorTeljesitmeny()){
//                   max=i;
//               }
//           }
//       }
//       if(max.getMotorTeljesitmeny()>0){
//            return max;
//        }else{
//            return null;
//        }
//    
//       
//    }
    

    
    
    
//    6-os feladat metódusa
    
    
//    public static boolean isConsecutiveFour(int[] values){
//        int i,tmp=values[0],db=1;
//        boolean megoldas=false;
//        for(i=1;i<values.length;i++){
//            if(db==4)
//            {
//                megoldas=true;
//                break;
//            }
//            if(values[i]==tmp)
//            {
//                    db++;
//            }
//            else
//            {
//            db=1;
//            tmp=values[i];      
//            }               
//        }
//        return megoldas;
//        
//    }
    
       
}
