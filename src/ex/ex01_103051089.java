package ex;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex01_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入單月使用分時間(分鐘)：");
		int time = scn.nextInt();
		float money = 0.5f;
		if(time<600){
			System.out.print("已撥打"+time+"分鐘，電話費為"+time*money);
		}
		if(time>=600 && time <=1200  ){
			System.out.print("已撥打"+time+"分鐘，電話費為"+time*money*0.9);
		}
		if(time > 1200){
			System.out.print("已撥打"+time+"分鐘，電話費為"+time*money*0.79);
		}
	}

}
