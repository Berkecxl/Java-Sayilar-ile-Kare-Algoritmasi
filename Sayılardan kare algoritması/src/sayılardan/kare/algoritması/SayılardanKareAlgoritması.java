
package sayılardan.kare.algoritması;

import java.util.Scanner;


public class SayılardanKareAlgoritması {

    
    public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  int x = 6;
  x = s.nextInt();
  int sayac = x;
  int y = sayac+(sayac-1);
  int sahtesayac;
  
  while(y!=0){
   System.out.print(sayac+" ");
   y--;
 }
  sahtesayac = sayac;
  sayac--;
  y = sayac+(sayac-1);
  System.out.println();
 // üst kısım
   
  while(sayac!=1){
      sahtesayac = x;
     while(sahtesayac!=sayac){
      System.out.print(sahtesayac+" ");
      sahtesayac--;
      }
     y = sahtesayac+(sahtesayac-1);
      while(y!=0){
          System.out.print(sayac+" ");
          y--;
      }
      while(sahtesayac!=x){
      System.out.print(sahtesayac+1+" ");
      sahtesayac++;
      }
     sayac--;
      System.out.println();
    }
  //orta üst kısım
   
  while(sayac!=x){
      sahtesayac = x;
     while(sahtesayac!=sayac){
      System.out.print(sahtesayac+" ");
      sahtesayac--;
      }
     y = sahtesayac+(sahtesayac-1);
      while(y!=0){
          System.out.print(sayac+" ");
          y--;
      }
      while(sahtesayac!=x){
      System.out.print(sahtesayac+1+" ");
      sahtesayac++;
      }
     sayac++;
      System.out.println();
    }
 //orta alt kısım
 
 y = x+(x-1);
 while(y!=0){
   System.out.print(sayac+" ");
   y--;
 }
 //en alt kısım   
    }
    
}
