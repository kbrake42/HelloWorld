
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;




public class HelloWorld {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStream res =
			    HelloWorld.class.getResourceAsStream("/test1.csv");
		
		BufferedReader reader =
		        new BufferedReader(new InputStreamReader(res));
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		        System.out.println(line);
		    }
		    reader.close();
		
		    System.out.println();
		    
		    
		    
		    
		    
		    List<login> logins = new ArrayList<>();
		    BufferedReader CSVFile = 
		        new BufferedReader(new FileReader("test1.csv"));

		  String dataRow = CSVFile.readLine(); // Read first line.
		  // The while checks to see if the data is null. If 
		  // it is, we've hit the end of the file. If not, 
		  // process the data.

		  while (dataRow != null){
		   String[] dataArray = dataRow.split(",");
		   
		   
		   login log = createLogin(dataArray);

		   logins.add(log);
		   
		   //for (String item:dataArray) { 
		   //   System.out.print(item + "\t"); 
		   //}
		   //System.out.println(); // Print the data line.
		   
		   dataRow = CSVFile.readLine(); // Read next line of data.
		   
		  }
		  // Close the file once all data has been read.
		  CSVFile.close();

		  // End the printout with a blank line.
		  System.out.println();
		
		
		
		
		
		System.out.println("Hello World");
		
		math m = new math();
		
		int sum = m.add(1,2);
		
		login data = logins.get(1);
		String textdata = data.getColumna();
		
		System.out.println(sum);
		
		JOptionPane.showMessageDialog(null, textdata);
	}
	
	private static login createLogin(String[] excelldata)
	{
		String cola = excelldata[0];
		String colb = excelldata[1];
		String colc = excelldata[2];
		String cold = excelldata[3];
		String cole = excelldata[4];
		
		return new login(cola,colb,colc,cold,cole);
		
	}
}


class math{
	
	public int add(int x, int y) {
		return x + y;
	}
	
}
	
class login{
	
	private String columna;
	private String columnb;
	private String columnc;
	private String columnd;
	private String columne;
	
	
	public login(String cola, String colb, String colc, String cold, String cole)
	{
		this.columna = cola;
		this.columnb = colb;
		this.columnc = colc;
		this.columnd = cold;
		this.columne = cole;
	}
	
	public String getColumna() {
        return columna;
    }
	
	public String getColumnb() {
        return columnb;
    }
	
	public String getColumnc() {
        return columnc;
    }
	
	public String getColumnd() {
        return columnd;
    }
	
	public String getColumne() {
        return columne;
    }
	
}
	
	
