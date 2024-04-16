package newpackage;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int i=1;
while(i<=10)
{
	System.out.println("Hello");
	i++;
} */
		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i + "Even");
			}
			else
			{
				System.out.println(i + "odd");
			}
			i++;
		}
	}

}
