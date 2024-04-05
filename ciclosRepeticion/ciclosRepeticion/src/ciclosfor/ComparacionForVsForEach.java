package ciclosfor;


public class ComparacionForVsForEach {

	public static void main(String[] args) {

		String[] nombres = new String[] {"Ricardo", "Adair", "Raul", "Omar", "Santiago"};
		for ( String nombre : nombres )  
		{ 
			System.out.println( nombre );
		} 
		for( int j = 0; j < nombres.length; j++ )
		{
			System.out.println( nombres[j] );
		}

	}
	
}
