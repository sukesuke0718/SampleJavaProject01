/**
 * じゃんけん
 */
package jankenSample;

/**
 * @author ユウスケ
 *
 */
public class ObjectJanken {

	public static void main(String[] args) {

		//	審判のインスタンスを作成
		Judge judge = new Judge();
		
		
		//	プレイヤー1のインスタンスを作成
		Player player1 = new Player("みやこさん");
		//	戦略クラスを作成する
		Tactics player1Tactics = new RandomTactics();
		//	戦略クラスを渡す
		player1.setTactics(player1Tactics);
		
		//	プレイヤー2のインスタンスを作成
		Player player2 = new Player("こうこさん");
		//	戦略クラスを作成する
		Tactics player2Tactics = new RandomTactics();
		//	戦略クラスを渡す
		player2.setTactics(player2Tactics);
		
		//	ジャンケンを開始する
		judge.startJanken(player1, player2);

	}

}
