import java.util.*;
public class three{
  public static void main(String a[]){
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter the end range: ");
    int n=scn.nextInt();
    int x=0;
    int y=1;
    for(int i=0;i<n;i++){
      System.out.println(x);
      int z=x+y;
      x=y;
      y=z;
    }


  }
}