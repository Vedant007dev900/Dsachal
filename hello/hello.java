package hello;
import java.util.*;

public class hello{

	public static void main(String a[]) {
				Scanner scn = new Scanner(System.in);
				

				System.out.println("Enter the number: ");
				int t=scn.nextInt();
        
				int count=0;
				for(int div=2;div<=t;div++){
					if(t%div==0){
						count++;
					}
				}
				if(count==1){
					System.out.println("prime");

				}else{
					System.out.println("not prime");
				}
}

}
