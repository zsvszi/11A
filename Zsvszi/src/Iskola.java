
public class Iskola {

	public static void main(String[] args) 
	{
		String line = "1;Kocsis Flóra;9A;5;4;4;5;2;4;1" ;
		String[] data = line.split(";") 			;
		int jegyek[] = new int[line.length()-3] 	;
		double atlag = 0 							;
		if (line.length()-3>=3)
		{
			for (int i = 3  ; i < data.length;i++)
			{
				int temp = Integer.parseInt(data[i])	;
				System.out.println(temp)				;
				atlag = atlag + temp 					;
			}
			atlag = atlag / (data.length-3) 			;
			System.out.printf("Tanulmányi átlag:%.2f",atlag);
		}
		else
		{
			System.out.println("Nincs elég jegy az átlag meghtározásához..");
		}
	}

}
