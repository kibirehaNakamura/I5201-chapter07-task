import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX7_Suidou3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in,"Shift_JIS"));
		
		while(true) {
			System.out.print("区分(一般/営業/臨時)(未入力で終了)>");
			String category = br.readLine();
			if(category.length() == 0) {
				break;
			}
			
			System.out.print("使用量>");
			int usage = Integer.parseInt(br.readLine());
			
			int charge = 0;
			System.out.println("test print before switch : " + category);
			switch(category) {
			case "一般":
				if(usage <= 50) {
					charge = 1000 + (80 * usage);
				} else {
					charge = 1000 + (80 * 50) + (120 * (usage - 50));
				}
				break;
				
			case "営業":
				charge = 1300 + (150 * usage);
				break;
				
			case "臨時":
				charge = 2300 + (240 * usage);
				break;
				
			default:
				category = "区分が見つかりません";
				break;
			}
			
			System.out.println("test print after switch : " + category);
			
			if(category.equals("一般") || category.equals("営業") || category.equals("臨時")) {
				System.out.println(category + "----料金 = " + charge);
			} else {
				System.out.println(category);
			}
			System.out.println();
		}
		System.out.println("--- プログラム終了 ---");
	}
}