package singletone;

public class test {

	public static void main(String[] args) {
		Singletone s=Singletone.getInstance();
		Singletone s1=Singletone.getInstance();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		}

}
