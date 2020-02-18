import java.io.*;

class FRFWBRBW
{
	public static void main(String[] args) 
	{
		try{
			FileWriter fw = new FileWriter("test.txt");
			fw.write("222\n333\n444");
			fw.close();

			FileWriter f = new FileWriter ("Practice.txt");
			BufferedWriter bw = new BufferedWriter(f);
			bw.write("\nAAA\nBBB\nCCC");
			bw.close();

			FileReader fr = new FileReader("test.txt");
			int i;
			while((i=fr.read())!=-1)
			
				System.out.print((char)i);
				fr.close();

			FileReader f1 = new FileReader("Practice.txt");
			BufferedReader br = new BufferedReader(f1);
			int j;
			while((j=br.read())!=-1)
				System.out.print((char)j);
				br.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("\n Success....");
	}
}