package week2.day1;

public class LearnString {
	public static void main(String[] args) {
	//String - "testleaf" - Print the number of e in the string e=2
		
		String text = "Testleaf";
		int x=0;
		for(int i=0; i<text.length(); i++)
		{
			if(text.charAt(i)=='e')
			{
				x++;
				i++;
			}
		}
		System.out.println("Number of e in the string: "+x);
	}

		
		
	}	


