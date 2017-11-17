package test_main;

import java.util.Random;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2) 입력:");
		
		int inputNum=scan.nextInt();
		Random ran=new Random();
		int ouputNum=ran.nextInt(3);
		
		String My=null;
		String cpu=null;
		
		if(inputNum==0) {
			My="가위";			
		}else if(inputNum==1) {
			My="바위";
				
		}else if(inputNum==2) {
			My="보";		
		}
		
		System.out.println(inputNum);
		
		if(ouputNum==0) {
			cpu="가위";		
		}else if(ouputNum==1) {
			cpu="바위";
		}else if(ouputNum==2) {
			cpu="보";
		}
		
		if(inputNum==ouputNum) {
			System.out.println("My:"+My);
			System.out.println("cpu:"+cpu);	
			System.out.println("비김");
		}else if(inputNum>=ouputNum) {
			System.out.println("My:"+My);
			System.out.println("cpu:"+cpu);	
			System.out.println("이김");
			
		}else{
			System.out.println("My:"+My);
			System.out.println("cpu:"+cpu);	
			System.out.println("패배자 ㅋㅋ");
			
		}
		
	}
}
