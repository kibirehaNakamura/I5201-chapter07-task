import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX7_Suidou1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("使用量(-1で終了)>");
			int usage = Integer.parseInt(br.readLine());
			if(usage == -1) {
				break;
			}
			
			int charge = 0;
			if(usage <= 50) {
				charge = 1000 + (80 * usage);
			} else {
				charge = 1000 + (80 * 50) + (120 * (usage - 50));
			}
			System.out.println("一般料金 = " + charge);
			System.out.println();
		}
	}
}