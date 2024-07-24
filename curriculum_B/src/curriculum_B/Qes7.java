package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

        System.out.print("生徒の人数を入力してください（2以上）: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // 改行読み取り

        int[][] scores = new int[numStudents][4];  // 4つの教科の点数を保持する2次元配列

        for (int i = 0; i < numStudents; i++) {
            

            System.out.print((i + 1) + "人目の『英語』の点数を入力してください: ");
            scores[i][0] = scanner.nextInt();
            scanner.nextLine(); // 改行読み取り

            System.out.print((i + 1) + "人目の『数学』の点数を入力してください: ");
            scores[i][1] = scanner.nextInt();
            scanner.nextLine(); // 改行読み取り

            System.out.print((i + 1) + "人目の『理科』の点数を入力してください: ");
            scores[i][2] = scanner.nextInt();
            scanner.nextLine(); // 改行読み取り

            System.out.print((i + 1) + "人目の『社会』の点数を入力してください: ");
            scores[i][3] = scanner.nextInt();
            scanner.nextLine(); // 改行読み取り
        }

        // 平均点計算
        double[] subjectAverages = new double[4];
        double totalAverage = 0;

        for (int j = 0; j < 4; j++) {
            double sum = 0;
            for (int i = 0; i < numStudents; i++) {
                sum += scores[i][j];
            }
            subjectAverages[j] = sum / numStudents;
            totalAverage += subjectAverages[j];
        }
        totalAverage /= 4;

        // 結果出力
        for (int i = 0; i < numStudents; i++) {
            double studentAverage = (double) (scores[i][0] + scores[i][1] + scores[i][2] + scores[i][3]) / 4;
            System.out.printf("生徒%dの平均点は%.2f点です。\n", i + 1, studentAverage);
        }

        for (int i = 0; i < 4; i++) {
            System.out.printf("%sの平均点は%.2f点です。\n", getSubjectName(i), subjectAverages[i]);
        }

        System.out.printf("全体の平均点は%.2f点です。\n", totalAverage);
    }

    // 教科名取得メソッド
    public static String getSubjectName(int index) {
        switch (index) {
            case 0:
                return "英語";
            case 1:
                return "数学";
            case 2:
                return "理科";
            case 3:
                return "社会";
            default:
                return "";
        }
    }

}

	


