package week2.day1;

public class WordStartsWithT {
public static void main(String[] args) {

	
	String text = "Testleaf is suitated in twin towers teynampet";
	String[] split = text.split(" ");
	
	for (int i=0; i<split.length; i++)
	{
		if(split[i].startsWith("t")||split[i].startsWith("T")) 
				{
			System.out.println(split[i]);	
		}
		
	}
}
}
