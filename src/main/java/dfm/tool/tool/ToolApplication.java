package dfm.tool.tool;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ToolApplication {

	public static void main(String[] args) {
		String region = "jp1";
		String apiUrl = "http://ddragon.leagueoflegends.com/cdn/8.23.1/data/ja_JP/item.json";

		try {

			//ここが分かってない
			URL url = new URL(apiUrl);

			String newLine = "";        //新しい行をここに取得しておく
			String currentText = "";    //取得した行を全部ここに付け足していく

			//この2つも分かってない
			InputStreamReader isReader = new InputStreamReader(url.openStream());
			BufferedReader bReader = new BufferedReader(isReader);

			//取得した行がnullになるまで付け足していく
			while((newLine = bReader.readLine()) != null){
				currentText = currentText + newLine;
			}




		} catch (Exception e) {
			e.printStackTrace();
		}

		ObjectMapper mapper = new ObjectMapper();

	}


}

