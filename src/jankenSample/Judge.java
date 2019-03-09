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
		int player1hand = player1.showHand();
		
		// プレイヤー2の手を出す
		int player2hand = player2.showHand();
		
		// それぞれの手を表示する
		printHand(player1hand);
		System.out.println(" vs. ");
		printHand(player2hand);
		System.out.println("\n");
		
		//プレイヤー1が勝つ場合
		if((player1hand == Player.GC_STONE_I && player2hand == Player.GC_SCISSORS_I)
			|| (player1hand == Player.GC_SCISSORS_I && player2hand == Player.GC_PAPER_I) 
			|| (player1hand == Player.GC_PAPER_I && player2hand == Player.GC_STONE_I)) {
			
			winner = player1;
		}else if((player1hand == Player.GC_STONE_I && player2hand == Player.GC_PAPER_I)
				 || (player1hand == Player.GC_SCISSORS_I && player2hand == Player.GC_STONE_I)
				 || (player1hand == Player.GC_PAPER_I && player2hand == Player.GC_SCISSORS_I)) {
			
			winner = player2;
			
		}
		
		//どちらでもない場合はnull
		
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
		
		// player1から勝ち数を聞く
		int player1WinCount = player1.getWinCount();
		
		// player2から勝ち数を聞く
		int player2WinCount = player2.getWinCount();
		
		if(player1WinCount > player2WinCount) {
			
			// プレイヤー1の勝ち
			winner = player1;
		}else if(player1WinCount < player2WinCount) {
			
			// プレイヤー2の勝ち
			winner = player2;
		}
		
		// どちらでもない場合、引き分け
		
		return winner;
	}
	
	/*
	 * ジャンケンの手を表示する
	 * 
	 * @param hand
	 */
	private void printHand(int hand) {
		
		switch(hand) {
		
		case Player.GC_STONE_I:
			System.out.println("グー");
			break;
			
		case Player.GC_SCISSORS_I:
			System.out.println("チョキ");
			break;
			
		case Player.GC_PAPER_I:
			System.out.println("パー");
			break;
		
		default:
			break;
		}
		
	}
	
}
