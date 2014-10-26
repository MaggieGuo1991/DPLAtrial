package willkara.dplajavawrapper;

import java.io.IOException;
import java.net.URL;

public class Main {
	public static void main(String[] args) throws IOException{
		DplaItem[] itemResults;
		SearchQuery query; 
		int itemNum;
		
		// get keywords from command line arguments parsing
		String keywords = args[0];
		query = new SearchQuery(keywords, null);
		query.setAPIKEY("606d14833afd79665413f72a981fe811");
		
		itemResults = query.search();
		itemNum =itemResults.length;
		
		URL forPrint;
		for (int k = 0; k < itemNum; k++){
			forPrint = itemResults[k].getItemURL();
			System.out.println(forPrint.toString());
		}
	}
	
}
