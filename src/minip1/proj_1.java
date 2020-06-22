package minip1;
import java.util.*;
public class proj_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[][] str=new String[7][8];
		str[0]=new String[] {"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"};
		str[1]=new String[] {"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"};
		str[2]=new String[] {"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"};
		str[3]=new String[] {"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"};
		str[4]=new String[] {"1005","Ranjan","16/07/2015","m","Engg","50000","20000","20000"};
		str[5]=new String[] {"1006","Suman","1/1/200","e","Manfacturing","23000","9000","4400"};
		str[6]=new String[] {"1007","Tanmay","12/6/2000","c","PM","29000","12000","10000"};
		int n=sc.nextInt();
		int DA;
		int count=0;
		for(int i=0;i<7;i++)
		{
			int x=Integer.parseInt(str[i][0]);
			int basic=Integer.parseInt(str[i][5]);
			int HRA=Integer.parseInt(str[i][6]);
			int it=Integer.parseInt(str[i][7]);
			int salary;
			if(x==n)
			{
				System.out.println("EmpId"+" "+"EmpName"+" "+"Department"+" "+"Designation"+" "+"Salary");
				System.out.print(str[i][0]+"   "+str[i][1]+"     "+str[i][4]+"    ");
				char ch=str[i][3].charAt(0);
				switch(ch)
				{
				case 'e':
					DA=20000;
				    salary=basic+HRA+DA-it;
				    System.out.print("Engineer"+"     "+salary);
					break;
				case 'c':
					DA=32000;
					salary=basic+HRA+DA-it; 
				    System.out.print("Consultant"+"     "+salary);
					break;
				case 'k':
					DA=12000;
					salary=basic+HRA+DA-it;
					System.out.print("clerk"+"     "+salary);
					break;
				case 'r':
					DA=15000;
					salary=basic+HRA+DA-it;
					System.out.print("Receptionist"+"     "+salary);
					break;
				case 'm':
					DA=40000;
					salary=basic+HRA+DA-it;
					System.out.print("Manager"+"     "+salary);
					break;
					
				}
				
			}
			else
			{
				count++;
			}
		}
		if(count==7)
			System.out.println("There is no Employee With EmpId: "+n);
		
	}

}
