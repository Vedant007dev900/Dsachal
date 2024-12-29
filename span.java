import java.util.Scanner;
public class span{
  public static void main(String a[]){
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter the length: ");
      int l=scn.nextInt();
      int []arr = new int[l];
      for(int i=0;i<l;i++){
        arr[i]=scn.nextInt();
      }
      int big=0;
      int small=0;

      for(int i=0;i<l;i++){
          big=arr[0];
          small=arr[0];
          if(arr[i]>big){
            big=arr[i];
            System.out.println("big is "+big);
          }
            
          if(arr[i]<small){
            small=arr[i];  
            System.out.println("small is "+small);
          }  
          }
        
        System.out.println("Span is: "+(big-small));
      }
  }
