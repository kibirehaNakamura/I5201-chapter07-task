import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX7_Suidou2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("区分(0で終了)>");
			int category = Integer.parseInt(br.readLine());
			if(category == 0) {
				break;
			}
			
			System.out.print("使用量>");
			int usage = Integer.parseInt(br.readLine());
			
			int charge = 0;
			String str = "";
			switch(category) {
			case 1:
				if(usage <= 50) {
					charge = 1000 + (80 * usage);
				} else {
					charge = 1000 + (80 * 50) + (120 * (usage - 50));
				}
				str = "一般";
				break;
				
			case 2:
				charge = 1300 + (150 * usage);
				str = "営業";
				break;
				
			case 3:
				charge = 2300 + (240 * usage);
				str = "臨時";
				break;
				
			default:
				break;
			}
			
			if(str.isEmpty()) {
				System.out.println("指定された区分が見つかりません");
			} else {
				System.out.println(str + "----料金 = " + charge);
			}
			System.out.println();
		}
	}
}