package ciclosfor;


public class tablasMultiplicar {
	
	public static void main(String args[]){
		for(int tabla_del = 1; tabla_del <= 10; tabla_del++)
		{
			for(int por = 1; por <= 10; por++)
			{
				System.out.print( tabla_del * por + "\t" );
			}
			System.out.println();
		}
		
	}
	
}
