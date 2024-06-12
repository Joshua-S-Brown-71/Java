import java.util.*;
import java.io.*;

public class Buddy2 
{
    char name='A';
    int size;
    ArrayList<Pair> pArrList[];
    HashMap<Character,Pair> nmPr;

    @SuppressWarnings("unchecked")
    Buddy2(int inSize)
    {    
        size=inSize;
        int ceil=(int)Math.ceil(Math.log(inSize)/Math.log(2));
        pArrList=new ArrayList[ceil+1];

        nmPr=new HashMap<>(); 

        
        for(int i=0; i<=ceil; i++)
        {
            pArrList[i]=new ArrayList<>();
        }

        pArrList[ceil].add(new Pair(0,(size - 1)));
    }

    class Pair 
    {     
        int lowB; 
        int upB;

        Pair(int inLowB, int inUpB)
        {
            lowB=inLowB;
            upB=inUpB;
        }
    }  

    void allocate(int inSize)
    {
        int n;
        Pair tPair=null;
        int ceil=(int)Math.ceil(Math.log(inSize)/Math.log(2));

        if (pArrList[ceil].size()>0) 
        {
            tPair=(Pair)pArrList[ceil].remove(0);

            System.out.println("Request "+inSize);

            nmPr.put(name, tPair);

            name++;
            print();
            return;
        }
 
        for (n=(ceil+1); n<pArrList.length; n++) 
        {
            if(pArrList[n].size() == 0)
            {
                continue;
            }

            break;
        }
 
        if (n==pArrList.length) 
        {     
            System.out.println("Failed to request");
            return;
        }
 
        tPair=(Pair)pArrList[n].remove(0); 
        n--;
 
        while(n>=ceil) 
        {
            Pair newPair=new Pair(tPair.lowB, (tPair.lowB+((tPair.upB-tPair.lowB)/2)));
            Pair newPair2=new Pair((tPair.lowB+((tPair.upB-tPair.lowB+1)/2)), tPair.upB);
 
            pArrList[n].add(newPair);
            pArrList[n].add(newPair2);
 
            tPair=(Pair)pArrList[n].remove(0);
            n--;
        }
 
        System.out.println("Request "+ inSize);

        nmPr.put(name, tPair);

        name++;
        print();
    }

    void deallocate(char inName)
    {
        if (!nmPr.containsKey(inName)) 
        {
            System.out.println("Invalid release");
            return;
        }

        int dLowB=(nmPr.get(inName)).lowB;
        int dUpB=(nmPr.get(inName)).upB;
        int dSize=((dUpB-dLowB)+1);
        int ceil2=(int)Math.ceil(Math.log(dSize)/Math.log(2));
        int pairAddress;
        int pairNum=(dLowB/dSize);
 
        pArrList[ceil2].add(new Pair(dLowB, dLowB+(int)Math.pow(2,ceil2)-1));
        System.out.println("Release "+inName);
      
        if (pairNum%2!=0) 
        {
            pairAddress=dLowB-(int)Math.pow(2,ceil2);
        }
        else 
        {
            pairAddress=dLowB+(int)Math.pow(2,ceil2);
        }
         
        for (int i=0; i<pArrList[ceil2].size(); i++) 
        {     
            if (pArrList[ceil2].get(i).lowB == pairAddress) 
            {     
                if (pairNum%2==0) 
                {     
                    pArrList[ceil2+1].add(new Pair(dLowB, dLowB+2*((int)Math.pow(2,ceil2))-1));
                }
                else 
                {
                    pArrList[ceil2+1].add(new Pair(pairAddress, pairAddress+2*((int)Math.pow(2,ceil2))-1));
                }
 
                pArrList[ceil2].remove(i);
                pArrList[ceil2].remove(pArrList[ceil2].size()-1);
                break;
            }
        }

        
        nmPr.remove(inName);

        

      /*  if(sZLB.isEmpty() && nMSZ.isEmpty())
        {
            System.out.println("Empty");
            for(int l=0;l<pArrList.length;l++)
            {
                for (int m = 0; m < pArrList[l].size();m++) 
                {   
                    pArrList[l].remove(m);      
                    pArrList[l].remove(pArrList[l].size() - 1); 
                }               
            }
        }*/
print();
        
    }

     
    public static void main(String args[]) throws IOException
    {
        int initialMemory =1024;
        Buddy2 obj = new Buddy2(initialMemory);

        obj.print();

        obj.allocate(100);
        obj.allocate(240);
        obj.allocate(64);
        
        obj.deallocate('C');
        obj.deallocate('A');
        obj.deallocate('B');
    }

    void print()
    { 
        System.out.println(" ");
        System.out.print(nmPr +" ");  
        //System.out.println(Arrays.toString(pArrList));
        for(int l=0;l<pArrList.length;l++)
        {
            for (int m = 0; m < pArrList[l].size();m++) 
            {   
                System.out.print((pArrList[l].get(m).upB-pArrList[l].get(m).lowB)+1+" ");       
            }               
        }
        System.out.println("\n");
    }

}