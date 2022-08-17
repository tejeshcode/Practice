package sat;

public class StringTest {

	public static void main(String[] args) {
		
		String s1="test";
		String s2="test";
		String s3="Test";
		String s4="itest";
		
		String s5=new String("test");
		String s6=new String("test");
		String s7=new String("Test");
		String s8=new String("itest");
		
		String s9=s1+s2;
		
		System.out.println(s1==s5);
		System.out.println(s4+12+13);
		System.out.println(12+13+s4);
		System.out.println(s3.compareTo(s1));
		System.out.println(s1.compareTo(s8));
		System.out.println(s1.concat(s9));
		System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode()+" "+s5.hashCode()+" "+s6.hashCode());

	}

}
