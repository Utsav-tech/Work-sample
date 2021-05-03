import java.util.Arrays;
import java.util.Comparator;

public class Alphabetizer {

	
	
	public String operation(String str)
	{
		str = str.replaceAll(
		          "[^a-zA-Z]", "");
		Character tempArray[] = new Character[str.length()];
        	for (int i = 0; i < str.length(); i++) {
			tempArray[i] = str.charAt(i);
		}
		Arrays.sort(tempArray, new Comparator<Character>(){

			@Override
			public int compare(Character c1, Character c2)
			{
			
				return Character.compare(Character.toLowerCase(c1),
										Character.toLowerCase(c2));
			}
		});
		
		
		StringBuilder sb = new StringBuilder(tempArray.length);
		for (Character c : tempArray)
			sb.append(c.charValue());

		return sb.toString();
	}
	
	public static void main(String args[])
	{
		Alphabetizer p=new Alphabetizer();
	
		System.out.println("Result="+p.operation("3 Blind Mice"));
	}
	
}
