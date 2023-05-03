package test;
/*String[] str = {"aaa", "bbb", "ccc"};
 for - for-each출력 
 */
public class Test2 {

	public static void main(String[] args) {
		String[] str = {"aaa", "bbb", "ccc"};
		//1.for
		for (int i=0; i<str.length; i++) {
			
			System.out.println(str[i]);
		}
		
		//2.for-each
		
		for (String s: str) {
			System.out.println(s);
		}
		
	}

}
