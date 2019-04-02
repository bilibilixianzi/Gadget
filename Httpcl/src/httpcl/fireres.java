package httpcl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fireres {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader bf= new BufferedReader(new FileReader("G:\\out\\Exploit.txt"));
        File f=new File("G:\\out\\result.txt");
        FileWriter fw = null;
        fw = new FileWriter(f, true);
        String s = null;
        int h=0;
        try {
			while((s = bf.readLine())!=null){
				PrintWriter pw = new PrintWriter(fw);
			    String reg="¡¾.*?¡¿";
			    Pattern p = Pattern.compile(reg);
			    Matcher m = p.matcher(s);
			    while(m.find()) {
			    	String a=m.group();
			    	if(a.length()>=8) {
			    		pw.print(a);
			    		pw.print("    ");
			    		h++;
			    		if(h==8) {
			    			pw.println();
			    			h=0;
			    		}
			    	}
			    }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        fw.close();
        System.out.println("OK!");
	}
}
