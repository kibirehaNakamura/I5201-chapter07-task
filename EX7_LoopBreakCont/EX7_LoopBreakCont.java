import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX7_LoopBreakCont {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("数字入力>");
			int num = Integer.parseInt(br.readLine());
			if(num == 1) {
				break;
			} else if(num == 2) {
				System.out.println("CONTINUE ループ");
			} else {
				System.out.println("ループ");
			}
		}
		System.out.println("--- プログラム終了 ---");
	}
}