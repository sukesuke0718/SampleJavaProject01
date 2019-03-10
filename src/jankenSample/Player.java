/**
 * ジャンケン
 */
package jankenSample;

/**
 * @author ユウスケ
 * ジャンケンのプレイヤーを表すクラス。
 */
public class Player {
	//	ジャンケンの手を表す定数
	public	static	final	int	GC_STONE_I		=	0;	//	グー
	public	static	final	int	GC_SCISSORS_I	=	1;	//	チョキ
	public	static	final	int	GC_PAPER_I		=	2;	//	パー
	
	//-----------------------------
	//	プレイヤーの属性
	//-----------------------------
	private	String name_;		//	プライヤーの名前
	private	int winCount_;		//	プレイヤーの勝った回数
	
	//-----------------------------
	//	プレイヤーのクラスのコンストラクタ
	//-----------------------------	
	public Player(String name) {
		name_	=	name;
	}
	
	//-----------------------------
	//	プレイヤークラスの操作
	//-----------------------------	
	
	private Tactics tactics_;
	
	/*
	 * プレイヤーに戦略を渡す
	 * 
	 * @param tactics
	 */
	void setTactics(Tactics tactics) {
		
		tactics_ = tactics;
	}
	
	/*
	 * ジャンケンの手を出す
	 * 
	 * @return	ジャンケンの手
	 */
	public int showHand() {
		
		//	与えられた戦略を読んでジャンケンの手を決める
		int hand = tactics_.readTactics();
		
		return hand;
		
	}
	
	/*
	  * 審判から勝敗を聞く
	 * 
	 * @param	result	true:勝ち,false：負け
	 */
	public void notifyResult(boolean result) {
		
		if(result == true) {
			//	勝った場合は勝ち数を加算する
			winCount_	++;
		}
	}
	
	/*
	 * 自分の勝った回数を答える
	 * 
	 * @return 勝った回数
	 */
	public int getWinCount() {
		return	winCount_;
	}
	
	/*
	 * 自分の名前を答える
	 * 
	 * @return	名前
	 */
	public String getName() {
		return	name_;
	}
	
}
