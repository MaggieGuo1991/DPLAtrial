package willkara.dplajavawrapper;

import java.awt.image.RenderedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * TODO: need to fetch new data to make 10 results 
 * @author maggieguo
 *
 */

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
			forPrint = itemResults[k].getObjectURL(); // the URL of object/image
			if (forPrint != null){ 
			//System.out.println(forPrint.toString());
				 RenderedImage img = ImageIO.read(forPrint);
				 System.out.println(img);
			}
		}
	}
	
}
