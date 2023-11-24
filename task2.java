import java.util.Scanner;
class task2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of subjects:");
int n=sc.nextInt();
int totalMarks=0;
for(int i=1; i<=n; i++)
{
System.out.println("Enter marks(out of 100)for each subjects:"+i);
int subm=sc.nextInt();
totalMarks+=subm;
}
float avgPercentage=(float) totalMarks/n;
System.out.println("\nResults");
System.out.println("\nTotal marks:" +totalMarks);
System.out.println("avgPercentage:" +avgPercentage);
char grade;
if(avgPercentage>=90)
{
grade='A';
}
else if(avgPercentage>=80)
{
grade='B';
}
else if(avgPercentage>=70)
{
grade='C';
}
else if(avgPercentage>=60)
{
grade='D';
}
else 
{
grade='F';
}
System.out.println("grade:" +grade);
sc.close();
}
}
