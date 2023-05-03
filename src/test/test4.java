package test;

import java.util.Random;

/*랜덤한 5개의 숫자를 출력하고자 한다.
숫자의 범위는 10~14까지의 범위로 설정하여 출력하시오(아래 for이용하시오)
for(int i=0; i<5; i++) {

}*/
public class test4 {

	public static void main(String[] args) {
		Random r = new Random();
		for(int i=0; i<5; i++) {
			System.out.println(r.nextInt(10,14));
		}
		
	}

}
