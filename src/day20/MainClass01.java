package day20;

import java.util.ArrayList;
import java.util.HashMap;

/*
 *Wrapper Class
 -일반 8대 자료형을 클래스 타입으로 변경한 것
 -int, char, double
 -Integer, Character   
 */
//매개변수 가변처리 
class A01<E22>{
	public void sumFunc(E22 n1, E22 n2) {
		System.out.println(n1 +", "+n2);
	}
}

public class MainClass01 {
	public static void main(String[] args) {
	A01<Integer> a = new A01();
	a.sumFunc(10, 20);
	A01<String> a1 = new A01();
	//a.sumFunc("as", "aa");
	}
}
