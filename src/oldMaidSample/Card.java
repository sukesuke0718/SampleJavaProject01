/**
 * トランプのカードを表すクラス
 */
package oldMaidSample;

/**
 * @author ユウスケ
 *
 */

/*
 * トランプのカードを表すクラス
 */
public class Card {

	//	クラス定数
	public static final int JOKER			=	0;		//	ジョーカーを表す定数	
	public static final int SUIT_SPADE		=	1;		//	スペードを表す定数
	public static final int SUIT_DIAMOND	=	2;		//	ダイヤを表す定数
	public static final int SUIT_CLUB		=	3;		//	クラブを表す定数
	public static final int SUIT_HEART		=	4;		//	ハートを表す定数
	
	//	クラス変数
	private int suit_;									//	カードの示すスート
	private int number_;								//	カードの示す数
	
	/*
	 * コンストラクタ
	 * @param suit スート
	 * @param number 数（0の場合はジョーカーとして扱う）
	 */
	public Card(int suit, int number) {
		
		this.suit_		=	suit;
		this.number_	=	number;
		
	}
	
	/*
	 * 数を見る
	 * 
	 * @return 数
	 */
	public int getNumber() {
		
		return number_;
		
	}
	
	/*
	 * カードを文字列で表現する
	 * ObjectクラスのtoStringメソッドをオーバーライドしたメソッド
	 * 
	 * @return カードの文字表現
	 */
	public String toString() {
		
		StringBuffer	string	=	new	StringBuffer();
		
		if(number_	>	0) {
			
			// スートの表示
			switch(suit_) {
			
			case SUIT_SPADE:
				string.append("S");
				
			case SUIT_DIAMOND:
				string.append("D");
				
			case SUIT_CLUB:
				string.append("C");
				
			case SUIT_HEART:
				string.append("H");
			
			default:
				break;
			
			}
			
			// 数の表示
			switch(number_) {
			
			case 1:
				string.append("A");
			
			case 10:
				string.append("T");
			
			case 11:
				string.append("J");
			
			case 12:
				string.append("Q");
			
			case 13:
				string.append("K");
			
			default:
				string.append(number_);
				break;
				
			}
			
		}else {
			
			// ジョーカーを表す
			string.append("JK");
		}
		
		return string.toString();
	}
	
}
