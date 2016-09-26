package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入進入時間，24小時制(ex.1023)：");
		int inTime=scn.nextInt();
		System.out.print("請輸入離開時間，24小時制(ex.1520)：");
		int outTime=scn.nextInt();
		inTime=((int)inTime/100)*60+inTime%100; //換算分鐘
		outTime=((int)outTime/100)*60+outTime%100; //換算分鐘
		int totalTime=outTime-inTime; //計算共停留時間
		int totalMoney=0;
		totalTime /= 30; //共停留幾個30分鐘
		if(totalTime > 1 && totalTime <= 4){ //兩小時內以30元計費
			totalMoney=totalTime*30;
		}
		if(totalTime >4 && totalTime <= 8){ //兩小時到四小時以40元計費，並加上前面兩小時的費用
			totalMoney=(totalTime-4)*40+120;
		}
		if(totalTime > 8){
			totalMoney=(totalTime-8)*60+120+160;//四小時以上以40元計費，並加上前面兩小時內與四小時內的費用
		}
		System.out.print("停了"+totalTime/2+"個小時，共需繳交："+totalMoney+"元停車費" );
	}	
}
