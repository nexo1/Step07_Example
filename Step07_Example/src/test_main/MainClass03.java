package test_main;

import java.util.Random;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("����(0),����(1),��(2) �Է�:");
		
		int inputNum=scan.nextInt();
		Random ran=new Random();
		int ouputNum=ran.nextInt(3);
		
		String My=null;
		String cpu=null;
		
		if(inputNum==0) {
			My="����";			
		}else if(inputNum==1) {
			My="����";
				
		}else if(inputNum==2) {
			My="��";		
		}
		
		System.out.println(inputNum);
		
		if(ouputNum==0) {
			cpu="����";		
		}else if(ouputNum==1) {
			cpu="����";
		}else if(ouputNum==2) {
			cpu="��";
		}
		
		if(inputNum==ouputNum) {
			System.out.println("My:"+My);
			System.out.println("cpu:"+cpu);	
			System.out.println("���");
		}else if(inputNum>=ouputNum) {
			System.out.println("My:"+My);
			System.out.println("cpu:"+cpu);	
			System.out.println("�̱�");
			
		}else{
			System.out.println("My:"+My);
			System.out.println("cpu:"+cpu);	
			System.out.println("�й��� ����");
			
		}
		
	}
}
