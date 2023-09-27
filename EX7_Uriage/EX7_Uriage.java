import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX7_Uriage {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		while(true) {
			System.out.print("数量(0以下で終了)>");
			int num = Integer.parseInt(br.readLine());
			if(num <= 0) {
				break;
			}
			System.out.print("単価>");
			int price = Integer.parseInt(br.readLine());
			System.out.println("売上 = " + (num * price));
			System.out.println();
			sum += num * price;
		}
		System.out.println();
		System.out.println("合計 = " + sum);
	}
}