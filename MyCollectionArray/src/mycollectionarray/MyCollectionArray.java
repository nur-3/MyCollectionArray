/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mycollectionarray;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author BM
 */
public class MyCollectionArray {

    private int boyut;
    private int[] kuyrukDizi;
    private int bas;
    private int son;
    private int elemanSayisi;
    
    public MyCollectionArray(int s){
     
        boyut=s;
        kuyrukDizi=new int[boyut];
        bas=0;
        son=-1;
        elemanSayisi=0;
    }
    public  void add(int j){
       if(son==boyut-1) son=-1;
       kuyrukDizi[++son]=j;
       elemanSayisi++;
    }
    
    public int remove(){
      int temp=kuyrukDizi[bas++];
      if(bas==boyut) bas=0;
      elemanSayisi--;
      return temp;
      
     }
    public boolean bosMu(){
     
        return (elemanSayisi==0);
    }
    
            
    public static void main(String[] args) {

      Random r=new Random();
      MyCollectionArray dizi=new MyCollectionArray(r.nextInt(10));
      dizi.add(1);
      dizi.add(4);
      dizi.add(10);
      System.out.println(dizi.remove());
      for(int i=0;i<5;i++){
        dizi.add(i);
        while(!dizi.bosMu())
              System.out.println(dizi.remove());
      }
       
     
      }
       
        
    }
    

