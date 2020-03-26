package Internet;
import java.io.*;


import java.net.URL;
public class Jsoup {
	

	

	    private String url;

	    public Jsoup(String url) {
	        this.url = url;
	    }

	    public String read() throws Exception {
	        StringBuilder sb = new StringBuilder();
	        URL u = new URL(this.url);
	        InputStreamReader in = new InputStreamReader(u.openStream());
	        BufferedReader buf = new BufferedReader(in);
	        String line;
	        while ((line = buf.readLine()) != null) {
	            sb.append(line);
	        }
	        return sb.toString();
	    }

	    public static void main(String[] args) throws Exception {
	    	Jsoup rd = new Jsoup("https://www.sudoku-it.com/");
	        System.out.println(rd.read());
	    }
	}


