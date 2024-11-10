import java.util.*;
public class two{

  public static void main(String a[]){

    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the start number: ");
    int t1=scn.nextInt();
    System.out.println("Enter the end number: ");
    int t2=scn.nextInt();
    for(int i=t1;i<=t2;i++){
      int count=0;
      for(int div = 2;div*div<=i;div++){
        if(i%div==0){
          count++;
          break;
        }
      } 

      if(count==0){
        System.out.println(i);
      }
    }
  }
}