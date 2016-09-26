package hw;
/*
 * Topic: 假設銅板有1元、5元、50元共三種，媽媽請小明去菜市場買水果，給了小明N元，且媽媽交待，要老闆找小明的零錢的數目要最少，
 * 而小明到了水果攤買了a1顆蘋果，a2顆柳丁，及a3顆桃子，1顆蘋果15元，1顆柳丁20元，1顆桃子30元，
 * 請問老問需找多少個1元、5元、50元，其銅板數目最少。
 * (先輸入媽媽給小明多少錢，N，接著輸入a1, a2, a3 ， 在此n, a1, a2, a3為整數，且a1*15+ a2*20+ a3*30小於或等於N。
 * 列出共找小明多少個1元，5元及50元，若帶的錢不夠買水果，則顯示”0”)
 * Date: 2016/09/26
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class hw01_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("獲得多少錢：");
		int getMoney=scn.nextInt();
		System.out.println("1顆蘋果15元，1顆柳丁20元，1顆桃子30元");
		System.out.print("請問要買幾個蘋果？");
		int buyApple=scn.nextInt();
		System.out.print("請問要買幾個柳丁？");
		int buyOrange=scn.nextInt();
		System.out.print("請問要買幾個桃子？");
		int buyPeach=scn.nextInt();
		int reMoney=getMoney-(buyApple*15)-(buyOrange*20)-(buyPeach*30);
		int cont50=0,cont5=0,cont1=0;
		if(reMoney<=0){//不夠買或是不找零
			System.out.println("0");
		}else{			
			if(reMoney>=50){//需要找50元銅板
				cont50 = reMoney/50;
				reMoney %= 50;
				if(reMoney >= 5){//需要找5元銅板
					cont5 = reMoney/5;
					reMoney %= 5;		
					cont1 = reMoney;
				}else{//找1元銅板
					cont1 = reMoney;
				}
			}else{
				if(reMoney>5){//需要找5元銅板
					cont5 = reMoney/5;
					reMoney %= 5;	
					cont1 = reMoney;
				}else{
					cont1 = reMoney;
				}				
			}
			System.out.println("買了"+buyApple+"顆蘋果\t"+buyOrange+"顆柳丁\t"+buyPeach+"顆桃子");
			System.out.println("找了"+cont50+"個50元"+cont5+"個5元"+cont1+"個1元，共計"+(cont50*50+cont5*5+cont1)+"元");
		}
		
	}

}
