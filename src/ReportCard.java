import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {
		System.out.println("REPORT CARD");
		Scanner sc=new Scanner(System.in);
		System.out.println("NAME: ");
		String name=sc.nextLine();
		System.out.println("Enter no of subjects: ");
		int no=sc.nextInt();
		int total = 0;
		int [] marks = new int[no];
		for(int i=0; i<marks.length; i++)
		{			
			System.out.println("Enter marks for Subject "+(i+1)+":"+marks[i]);	
			marks[i]=sc.nextInt();
		}
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("\t\t\tREPORT CARD");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("NAME: "+name);
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("SUBJECT \t\t\t\t MARKS");
		System.out.println("----------------------------------------------------------------------------------");
		for(int i=0; i<marks.length; i++)
		{			
			System.out.println("Subject "+(i+1)+":\t\t\t\t "+marks[i]);	
			total+=marks[i];
		}
		float average =(float)total/no;
		System.out.println("----------------------------------------------------------------------------------");
		System.out.printf("TOTAL %d \t\t\t AVERAGE: %.2f",total,average);

	}
	
}
