package hw;
/*
 * Topic: 已知男生標準體重＝(身高－80 )*0.7；女生標準體重＝(身高－70)*0.6；
 * 試寫一個程式可以計算男生女生的標準體重。
 * (輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
 * Date: 2016/09/26
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class hw02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.print("請輸入身高：");
		int hight = scn.nextInt();
		System.out.print("請輸入性別 (1代表男性；2代表女性)：");
		short  sex = scn.nextShort();
		float standardWeigh = 0 ;
		if(sex ==1){
			standardWeigh = (hight-80)*0.7f;
			System.out.println("你是男性，身高為"+hight+"\t標準體重為"+standardWeigh);
		}
		if(sex ==2){
			standardWeigh = (hight-70)*0.6f;
			System.out.println("你是女性，身高為"+hight+"\t標準體重為"+standardWeigh);
		}

	}

}
