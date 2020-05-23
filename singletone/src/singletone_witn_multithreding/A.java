package singletone_witn_multithreding;

public class A {
private static A instance;//storing the object
private A() {
	//don't remove
	//stop other class to create object of this class
}
 // public static  A  getInstance() {
	  //non synchronized will allow to create multiple object
	  
  public static synchronized A  getInstance() {
	  //synchronized kw will not allow to multiple threat it allow 
	  //only one threat at a time to 
	  //create object of this class
	//create object if instance is null or empty
	if(instance==null) {
		
	    instance= new A();
	   }
	return instance;
}
}
