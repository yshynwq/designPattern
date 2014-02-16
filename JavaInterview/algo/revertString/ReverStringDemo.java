package revertString;

public class ReverStringDemo {
	
	public static void main(String[] args) {
		String s = "Hello world, welcome to JAVA.";
		System.out.println(s);
		System.out.println(revert(s));
	}
	
	
	public static String revert(String s){
		if(s!=null){
			char[] chars = s.toCharArray();
			int low=0;
			int top = chars.length-1;
			char tmp;
			while(low<top){
				tmp = chars[low];
				chars[low] = chars[top];
				chars[top] = tmp;
				
				low++;
				top--;
			}
			return new String(chars);
		}else{
			return null;
		}
	}
}
