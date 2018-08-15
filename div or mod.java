import java.util.*;
public class div {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
            int option=s.nextInt();
            int data1=s.nextInt();
            int data2=s.nextInt();
            switch(option)
            {
            case 1:
            	System.out.println(data1/data2);
            	break;
            case 2:
            	System.out.println(data1%data2);
            	break;
             default:
            	System.out.println("Enter valid number");
            }
		s.close();	
	}
}
