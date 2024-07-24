package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scanner = new Scanner(System.in);
		
		String name = "";
		//登録できない場合ループ処理をする
        while (name.isEmpty() || name.length() > 10) {
            System.out.print("「ユーザー名を入力してください」 ");
         // ユーザー名を入力する
            name = scanner.nextLine();
         // ユーザー名が0文字以下もしくはnullの場合のメッセージを表示
            if (name.isEmpty()) {
                System.out.println("「名前を入力してください」");
          // ユーザー名が10文字より大きい場合のメッセージを表示
            } else if (name.length() > 10) {
                System.out.println("「名前を10文字以内にしてください」");
            }
        }

        /*ユーザー名が正常だった場合「ユーザー名「入力したユーザー名」を登録しました」と出力
         じゃんけん開始*/
         
        System.out.println("ユーザー名「" + name + "」を登録しました");
        playJankenGame(name, scanner);
        // ユーザー名をコンソールに表示
        scanner.close();
     
	}
        
        
	public static void playJankenGame(String name, Scanner scanner) {
		//回数の初期値は0
        int totalRounds = 0;
        boolean winFlag = false;
        //ループ処理
        while (!winFlag) {
        	//選択肢と選択肢たものの入力欄
            System.out.println("0: グー, 1: チョキ, 2: パー");
            System.out.print("自分の手を選んでください: ");
            int playerHand = scanner.nextInt();// プレイヤーの手は選択可能

            int computerHand = (int) (Math.random() * 3); // コンピュータの手をランダムに選択
            
            //プレイヤーと相手の出した手を出力
            System.out.println(name + "の手は: " + convertHand(playerHand));
            System.out.println("相手の手は: " + convertHand(computerHand));

            int result = ( computerHand - playerHand + 3) % 3;
            //あいこだった時のメッセージと処理
            if (playerHand == computerHand) {
                System.out.println("DRAW あいこ もう一回しましょう！");
                totalRounds++;
            }   
          //プレイヤーが勝った時のメッセージと処理
            if ((playerHand == 0 && computerHand == 1) || (playerHand == 1 && computerHand == 2)
                    || (playerHand == 2 && computerHand == 0)) {
                System.out.println("やるやん。");
                System.out.println("次は俺にリベンジさせて");
                winFlag = true;
                totalRounds++;
            } 
            //プレイヤーがグーで負けた時のメッセージと繰り返し処理
            if  (playerHand == 1 && computerHand == 0) {
            	 System.out.println("俺の勝ち！ 負けは次につながるチャンスです！ ネバーギブアップ！");
            	 winFlag = false;
            	 totalRounds++;
            } 
          //プレイヤーがチョキーで負けた時のメッセージと繰り返し処理
            if (playerHand == 2 && computerHand == 1 ) {
            	System.out.println("俺の勝ち！ たかがじゃんけん、そう思ってないですか？ それやったら次も、俺が勝ちますよ");
            	winFlag = false;
            	totalRounds++;
            } 
          //プレイヤーがパーで負けた時のメッセージと繰り返し処理
            if (playerHand == 0 && computerHand == 2 ) {
            	System.out.println("俺の勝ち！ なんで負けたか、明日まで考えといてください。 そしたら何かが見えてくるはずです");
            	winFlag = false;
            	totalRounds++;
            }
           
        }
        
        //それぞれの回数を足す処理
        System.out.println("じゃんけんを行った回数は " + (totalRounds ) + "回です");
        System.out.println("勝つまでにかかった合計回数は " + (totalRounds ) + "回です");
    }

    public static String convertHand(int hand) {
    	//0と入力された場合グーを返す
    	if (hand == 0) {
            return "グー"; 
        } 
    	//1と入力された場合グーを返す
    	else if (hand == 1) {
            return "チョキ";
        } 
    	//2と入力された場合パーを返す
    	else {
            return "パー";
        }
    }

    
	}


