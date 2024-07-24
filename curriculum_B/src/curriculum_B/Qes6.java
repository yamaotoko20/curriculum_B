package curriculum_B;

import java.util.Random;
import java.util.Scanner;


public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//ユーザーの入力を受け取るためのScannerオブジェクトを作成
				Scanner scanner = new Scanner(System.in);
				//ランダムな数値を生成するためのRandomオブジェクトを作成
		        Random random = new Random();

		      //ユーザーからの入力を受け取る
		        String input = scanner.nextLine();
		        //入力された商品名をコンマで区切り、商品名の配列に分割
		        String[] products = input.split("、");
		        //商品名の配列に対して拡張forループを使用し各商品名ごとに処理
		        for (String product : products) {
		            //商品名ごとに処理を分岐させる
		        	switch (product) {
		        	//パソコンと入力したらランダムな整数を生成し出力
		                case "パソコン":
		                    int remainingComputers = random.nextInt(12);
		                    System.out.println("パソコンの残り台数は " + remainingComputers + " 台です");
		                    break;
		                  //冷蔵庫、扇風機と入力したらそれぞれランダムな整数を生成し出力
		                case "冷蔵庫":
		                case "扇風機":
		                    int remainingOthers = 11 - random.nextInt(12);
		                    System.out.println(product + "の残り台数は " + remainingOthers + " 台です");
		                    break;
		                  //洗濯機と入力したらランダムな整数を生成し出力
		                case "洗濯機":
		                    int remainingWashingMachines = random.nextInt(12);
		                    System.out.println("洗濯機の残り台数は " + remainingWashingMachines + " 台です");
		                    break;
		                  //加湿器と入力したらランダムな整数を生成し出力
		                case "加湿器":
		                    int remainingHumidifiers = random.nextInt(12);
		                    System.out.println("加湿器の残り台数は " + remainingHumidifiers + " 台です");
		                    break;
		                  //テレビ、ディスプレイと入力したらそれぞれランダムな整数を生成し出力
		                case "テレビ":
		                case "ディスプレイ":
		                    int remainingTVs = random.nextInt(12);
		                    System.out.println(product + "の残り台数は " + remainingTVs + " 台です");
		                    break;
		                //指定された商品名以外が入力された場合、デフォルトの処理として指定外の商品であることを表示
		                default:
		                    System.out.println("『 " + product + " 』は指定の商品ではありません");
		                    break;
		            }
		        }
			}

		}
