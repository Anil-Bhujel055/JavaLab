import java.io.*;

class Merge
{
	public static void main(String[] args) 
	{

		try{
			FileWriter fw = new FileWriter("merge1st.txt");
			fw.write("222\n333\n444\n");
			fw.close();

			FileWriter fw1 = new FileWriter("merge2nd.txt");
			fw1.write("AAA\nBBB\nCCC\n");
			fw1.close();

			FileWriter fw2 = new FileWriter("merge3rd.txt");
			

			FileReader fr = new FileReader("merge1st.txt");
			int i;
			while((i=fr.read())!=-1)
			
				
				fw2.write((char)i);
				fr.close();
				

			FileReader fr1 = new FileReader("merge2nd.txt");
			int j;
			while((j=fr1.read())!=-1)
			
				
				fw2.write((char)j);
				fr1.close();


				fw2.close();


			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("\n Success....");
	}
}