package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Table();
    }

    public static void Table() {
    	//iが1から9まで順番に変化
    	for (int i = 1; i <= 9; i++) {
    		//jが1から20まで順番に変化
            for (int j = 1; j <= 20; j++) {
                int multiplication = j * i;
                //001⋆001＝001 ||この形に設定
                System.out.printf("%03d⋆%03d＝%03d || ", j, i, multiplication);
            }
            System.out.println();

            if (i % 2 != 0) {
                Line(20 * (11 * 12) + 1); // 奇数行の下に水平線を引く
            }
        }
    }
    //水平線を引く
    public static void Line(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("―");
        }
        System.out.println();
	}

}


