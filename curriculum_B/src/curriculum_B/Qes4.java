package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//iが1から9まで順番に変化
		 for (int i = 1; i <= 9; i++) {
			//ｊが1から9まで順番に変化
	            for (int j = 1; j <= 9; j++) {
	                int multiplication = i * j;
	                //9未満の場合は、九九の計算式を%02d⋆%02d＝%02d ||の形式でフォーマットして表示
	                if (j < 9) {
	                    System.out.printf("%02d⋆%02d＝%02d || ", i, j, multiplication);
	                } 
	                //9の場合は、最後の列の計算式を%02d⋆%02d＝%02dの形式でフォーマットして表示
	                else {
	                    System.out.printf("%02d⋆%02d＝%02d", i, j, multiplication);
	                }
	            }
	            System.out.println();
	            if (i == 7 || i == 8 || i == 9) {
	                printHorizontalLine(9 * (5 * 7) + 1); // 一本の線を追加
	                System.out.println(); // 一本線の後にスペースを入れる
	            }
	            else if (i < 9) {
	                System.out.println(); // 各行の間にスペースを入れる
	            }
	        }
	    }
	//水平線を引く
	    public static void printHorizontalLine(int length) {
	        for (int i = 0; i < length; i++) {
	            System.out.print("―");
	        }
   }
}
