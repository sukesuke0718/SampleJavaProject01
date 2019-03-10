/**
 * 
 */
package jankenSample;

/**
 * @author ユウスケ
 * 
 * ランダムにジャンケンの手を決めるクラス
 *
 */
public class RandomTactics implements Tactics {

	/* 
	 * @see jankenSample.Tactics#readTactics()
	 * 
	 * @return ジャンケンの手
	 */
	@Override
	public int readTactics() {

		//	プレイヤーの手
		int	hand	=	0;
		
		//	0.0以上3.0未満の小数を乱数として取得する
		double	randamNum	=	Math.random()	*	3;
		
		if(randamNum < 1) {		
			//	randamNumが0.0以上1.0未満の場合グーを返す
			hand	=	Player.GC_STONE_I;
			
		}else if(randamNum < 2) {
			//	randamNumが1.0以上2.0未満の場合チョキを返す
			hand	=	Player.GC_SCISSORS_I;
			
		}else if(randamNum < 3) {
			//	randamNumが2.0以上3.0未満の場合パーを返す
			hand	=	Player.GC_PAPER_I;
		}
			
		//	決定した手を戻値として返す
		return	hand;

	}

}
