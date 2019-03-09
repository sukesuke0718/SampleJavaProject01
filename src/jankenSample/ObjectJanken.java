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

		// 審判のインスタンスを作成
		Judge judge = new Judge();
		
		// プレイヤー1のインスタンスを作成
		Player player1 = new Player("みやこさん");
		
		// プレイヤー2のインスタンスを作成
		Player player2 = new Player("こうこさん");
		
		// ジャンケンを開始する
		judge.startJanken(player1, player2);

	}

}
