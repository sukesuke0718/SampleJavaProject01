/**
 * 
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
		
		//	ジャンケンの手
		int hand = 0;
		
		System.out.println("\nジャンケンの手を入力してください。");
		System.out.println("0：グー");		
		System.out.println("1：チョキ");
		System.out.println("2：パー\n");
		System.out.print("? > ");
		
		/* TODO
		 * 入力処理を作成する
		 * 
		 * 
		 */
		
		
		
		
		
		return hand;
	}

}
