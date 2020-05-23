package forloop;

public class TestInner {
	
	public void m2() {
		
		System.out.println("m2 from outer class");
		innerTest inner=new innerTest();
		inner.m1();
	         }
	
	
public static class innerTest{
	public static void  m1() {
		     System.out.println("m1 from innettest();");
	               }
	
              }
       }
