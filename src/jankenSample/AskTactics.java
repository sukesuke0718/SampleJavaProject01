/**
 * 	ジャンケン
 */
package jankenSample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author ユウスケ
 *
 *	標準入力により手の出し方をユーザに聞くクラス
 */
public class AskTactics implements Tactics {

	/*
	 * @see jankenSample.Tactics#readTactics()
	 */
	@Override
	public int readTactics() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.println("\nジャンケンの手を入力してください。");
		System.out.println("0：グー");		
		System.out.println("1：チョキ");
		System.out.println("2：パー\n");
		System.out.print("? > ");
		
		//	ジャンケンの手
		int hand = 0;
		
		while(true) {
			
			try {
				// 入力文字列を受け取る
				String inputStr	=	br.readLine();
				
				// 入力文字列を数値に変換する
				hand	=	Integer.parseInt(inputStr);
				
				// 0～2のいずれかが入力されたらループを抜ける
				if(hand	==	Player.GC_PAPER_I
					||	hand	==	Player.GC_SCISSORS_I
					||	hand	==	Player.GC_STONE_I) {
					break;
				}else {
					System.out.println("入力が正しくありません。再度入力してください");
					System.out.print("？");
				}
				
			}catch(Exception ex){
				System.out.println("入力が正しくありません。再度入力してください");
				System.out.print("？");
			}
			
			
		}
		
		
		return hand;
	}

}
