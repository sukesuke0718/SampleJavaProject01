/**
 * ジャンケン
 */
package jankenSample;

/**
 * @author ユウスケ
 *ジャンケンの審判を表すクラス
 */
public class Judge {
	
	/*
	 * @param	player1
	 * @param	player2
	 */
	public void startJanken(Player player1, Player player2) {
		
		//	ジャンケンの開始を宣言する
		System.out.println("【ジャンケン開始】\n");
		
		//	ジャンケンを3回行う
		for(int i = 0; i < 3; i++) {
			
			// 何回戦目かを表示する
			System.out.println("【" + (i +1) + "回戦目】");
			
			// プレイヤーの手を見て、どちらが勝ちか判定する
			Player winner = judgeJanken(player1, player2);
			
			if(winner != null) {
				
				//勝者を表示する
				System.out.println("\n" + winner.getName() + "が勝ちました\n");
				
				// 勝ったプレイヤーへ結果を伝える
				winner.notifyResult(true);
			}else {
				
				// 引き分けの場合
				System.out.println("\n引き分けです");
			}			
		}
		
		// ジャンケンの終了を宣言する
		System.out.println("【ジャンケン終了】\n");
		
		// 最終的な勝者を判定する
		Player finalWinner = judgeFinalWinner(player1, player2);
		
		// 結果の表示
		System.out.println(player1.getWinCount() + " 対 " + player2.getWinCount() + "で");
		
		if(finalWinner != null) {
			
			System.out.println(finalWinner.getName() + "の勝ちです\n");
			
		}else {
			
			System.out.println("引き分けです\n");
			
		}
		
	}
	
	/*
	 * 勝ち負けの判定を行う
	 * @param1 player1
	 * @param2 player2
	 * @return 勝ったプレイヤー。引き分けの場合null
	 */
	private Player judgeJanken(Player player1, Player player2) {
		
		Player winner	=	null;
		
		// プレイヤー1の手を出す
		
		// プレイヤー2の手を出す
		
		
		
		
		return winner;
	}
	
	/*
	 * 最終的な勝者を判定する
	 * 
	 * @param player1
	 * @param player2
	 * @return 勝ったプレイヤー。引き分けの場合はnullを返す
	 */
	private Player judgeFinalWinner(Player player1, Player player2) {
		
		Player winner	=	null;
		
		
		return winner;
	}
	
	/*
	 * ジャンケンの手を表示する
	 * 
	 * @param hand
	 */
	private void printeHand(int hand) {
		
		
		
		
	}
	
}
