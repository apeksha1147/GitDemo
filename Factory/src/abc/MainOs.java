package abc;
public class MainOs {

	public static void main(String[] args) {
		
		
		ObjectFactory os=new ObjectFactory();
		
		OperatingSys obj=os.getInstance("closed");
		
		obj.spec();
		
	}
	
	
	
}
