package ex;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author:  103051089 林冠磊
 */
import java.util.Scanner;
public class ex02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("有一圓形，直徑為200，且中心座標為(0,0)。\n輸入「點」的座標，並判斷「點」是否在圓形的範圍內。\n");
		System.out.print("請輸入「點」的X座標：");
		int x=scn.nextInt();
		System.out.print("請輸入「點」的Y座標：");
		int y=scn.nextInt();
;
		if(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2))<=100){
			System.out.println("( "+ x +" , "+ y +" )"+"在圓形範圍內。");
		}else{
			System.out.println("( "+ x +" , "+ y +" ) "+"不在圓形範圍內。");
		}
	}

}
