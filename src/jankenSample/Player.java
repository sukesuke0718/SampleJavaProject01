/**
 * 
 */
package jankenSample;

/**
 * @author ユウスケ
 * ジャンケンのプレイヤーを表すクラス。
 */
public class Player {
	// ジャンケンの手を表す定数
	public	static	final	int	GC_STONE_I		=	0;	// グー
	public	static	final	int	GC_SCISSORS_I	=	1;	// チョキ
	public	static	final	int	GC_PAPER_I		=	2;	// パー
	
	//-----------------------------
	// プレイヤーの属性
	//-----------------------------
	private	String name_;		// プライヤーの名前
	private	int winCount_;		// プレイヤーの勝った回数
	
	//-----------------------------
	// プレイヤーのクラスのコンストラクタ
	//-----------------------------	
	public	Player(String	name) {
		name_	=	name;
	}
	
	//-----------------------------
	// プレイヤークラスの操作
	//-----------------------------	
	
	/*
	 * ジャンケンの手を出す
	 * 
	 * @return	ジャンケンの手
	 */
	public	int	showHand() {
		
		//	プレイヤーの手
		int	hand	=	0;
		
		//	0.0以上3.0未満の小数を乱数として取得する
		double	randamNum	=	Math.random()	*	3;
		
		if(randamNum	<	1) {		
			//	randamNumが0.0以上1.0未満の場合グーを返す
			hand	=	GC_STONE_I;
			
		}else	if(randamNum	<	2) {
			//	randamNumが1.0以上2.0未満の場合チョキを返す
			hand	=	GC_SCISSORS_I;
			
		}else	if(randamNum	<	3) {
			//	randamNumが2.0以上3.0未満の場合パーを返す
			hand	=	GC_PAPER_I;
		}
			
		//	決定した手を戻値として返す
		return	hand;
		
	}
	
	/*
	 * 新刊から勝敗を聞く
	 * 
	 * @param	result	true:勝ち,false：負け
	 */
	public	void	notifyResult(boolean	result) {
		
		if(result	==	true) {
			// 勝った場合は勝ち数を加算する
			winCount_	++;
		}
	}
	
	/*
	 * 自分の勝った回数を答える
	 * 
	 * @return 勝った回数
	 */
	public	int	getWinCount() {
		return	winCount_;
	}
	
	/*
	 * 自分の名前を答える
	 * 
	 * @return	名前
	 */
	public	String	getName() {
		return	name_;
	}
	
	
	
}
