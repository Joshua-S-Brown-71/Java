import java.util.*;
import java.io.*;

public class Buddy 
{
    char name='A';
    int size;
    HashMap<Integer,Integer> sZLB=new HashMap<>(); 
    HashMap<Character,Integer> nMSZ=new HashMap<>(); 
    ArrayList<BudS>[] pArrList;

    public static void main(String args[]) throws IOException
    {
        int memorySize=1024;
        Buddy bud=new Buddy(memorySize);
        bud.print();
        File f=new File("input.txt");
        Scanner iF=new Scanner(f);

        while(iF.hasNext())
        {
            String instr=iF.next();

            if(instr.equals("Request"))
            {
                bud.allocate(iF.nextInt());
            }
            else if(instr.equals("Release"))
            {
                bud.deallocate(iF.next().charAt(0));
            }
            iF.nextLine();
        }
        iF.close();
    }

    public Buddy(int inSize)
    {    
        size=inSize;
        int ceil=(int)Math.ceil(Math.log(inSize)/Math.log(2));
        pArrList=new ArrayList[ceil+1];

        for(int i=0; i<=ceil; i++)
        {
            pArrList[i]=new ArrayList<>();
        }

        pArrList[ceil].add(new BudS(0,(size-1)));
    }

    public class BudS 
    {     
        int lowB; 
        int upB;

        BudS(int inLowB, int inUpB)
        {
            lowB=inLowB;
            upB=inUpB;
        }
    }  

    public void allocate(int inSize)
    {
        int n;
        BudS tBudS=null;
        int ceil=(int)Math.ceil(Math.log(inSize)/Math.log(2));

        if(pArrList[ceil].size()>0) 
        {
            tBudS=(BudS)pArrList[ceil].remove(0);
            System.out.println("Request "+inSize);
            sZLB.put((tBudS.upB-tBudS.lowB)+1, tBudS.lowB);
            nMSZ.put(name, (tBudS.upB-tBudS.lowB)+1);
            name++;
            print();
            return;
        }
 
        for(n=(ceil+1); n<pArrList.length; n++) 
        {
            if(pArrList[n].size()==0)
            {
                continue;
            }
            break;
        }
 
        if(n==pArrList.length) 
        {     
            System.out.println("ERROR: Request Failed");
            System.exit(0);
        }
 
        tBudS=(BudS)pArrList[n].remove(0); 
        n--;
 
        while(n>=ceil) 
        {
            BudS tBudS2=new BudS(tBudS.lowB, (tBudS.lowB+((tBudS.upB-tBudS.lowB)/2)));
            BudS tBudS3=new BudS((tBudS.lowB+((tBudS.upB-tBudS.lowB+1)/2)), tBudS.upB);
            pArrList[n].add(tBudS2);
            pArrList[n].add(tBudS3);
            tBudS=(BudS)pArrList[n].remove(0);
            n--;
        }
 
        System.out.println("Request "+inSize);
        sZLB.put(((tBudS.upB-tBudS.lowB)+1), tBudS.lowB);
        nMSZ.put(name, ((tBudS.upB-tBudS.lowB)+1));
        name++;
        print();
    }

    public void deallocate(char inName)
    {
        if(!(nMSZ.containsKey(inName))) 
        {
            System.out.println("ERROR: Release Failed");
            System.exit(0);
        }

        int deSize=nMSZ.get(inName);
        int deLowB=sZLB.get(deSize);
        int ceil2=(int)Math.ceil(Math.log(deSize)/Math.log(2));
        int pairNum=(deLowB/deSize);
        int pairAddress;
        pArrList[ceil2].add(new BudS(deLowB, deLowB+(int)Math.pow(2,ceil2)-1));
        System.out.println("Release "+inName);
      
        if(pairNum%2!=0) 
        {
            pairAddress=deLowB-(int)Math.pow(2,ceil2);
        }
        else 
        {
            pairAddress=deLowB+(int)Math.pow(2,ceil2);
        }
         
        for(int i=0; i<pArrList[ceil2].size(); i++) 
        {     
            if(pArrList[ceil2].get(i).lowB==pairAddress) 
            {     
                if(pairNum%2==0) 
                {     
                    pArrList[ceil2+1].add(new BudS(deLowB, deLowB+2*((int)Math.pow(2,ceil2))-1));
                }
                else 
                {
                    pArrList[ceil2+1].add(new BudS(pairAddress, pairAddress+2*((int)Math.pow(2,ceil2))-1));
                }
 
                pArrList[ceil2].remove(i);
                pArrList[ceil2].remove(pArrList[ceil2].size()-1);
                break;
            }
        }
        sZLB.remove(deSize);
        nMSZ.remove(inName);

        if(sZLB.isEmpty()&&nMSZ.isEmpty())
        {
            while(deSize<=size)
            {
                deLowB=0;
                ceil2=(int)Math.ceil(Math.log(deSize)/Math.log(2));
                pairNum=(deLowB/deSize);
         
                if(pairNum%2!=0) 
                {
                    pairAddress=deLowB-(int)Math.pow(2,ceil2);
                }
                else 
                {
                    pairAddress=deLowB+(int)Math.pow(2,ceil2);
                }
                 
                for(int i=0; i<pArrList[ceil2].size(); i++) 
                {     
                    if(pArrList[ceil2].get(i).lowB==pairAddress) 
                    {     
                        if(pairNum%2==0) 
                        {     
                            pArrList[ceil2+1].add(new BudS(deLowB, deLowB+2*((int)Math.pow(2,ceil2))-1));
                        }
                        else 
                        {
                            pArrList[ceil2+1].add(new BudS(pairAddress, pairAddress+2*((int)Math.pow(2,ceil2))-1));
                        }
         
                        pArrList[ceil2].remove(i);
                        pArrList[ceil2].remove(pArrList[ceil2].size()-1);
                    }
                }
                deSize*=2;
            }
        }
        print();
    }

    public void print()
    { 
        System.out.println(" ");
        System.out.print(nMSZ+" ");  

        for(int l=0; l<pArrList.length; l++)
        {
            for(int m=0; m<pArrList[l].size(); m++) 
            {   
                System.out.print((pArrList[l].get(m).upB-pArrList[l].get(m).lowB)+1+" ");       
            }               
        }
        System.out.println("\n");
    }
}