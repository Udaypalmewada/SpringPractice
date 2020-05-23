package singletone_witn_multithreding;

public class test {

	public static void main(String[] args) {
    student s1=new student();
    student s2=new student();
    
    s1.start();
    s2.start();
    
    
	}

}
