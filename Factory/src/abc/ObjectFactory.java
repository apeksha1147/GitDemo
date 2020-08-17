package abc;

public class ObjectFactory {

	public OperatingSys getInstance(String s) {
	
		
		if(s.equals("open"))
		{
			return new Android(); 
			
		}
		
		else {
			System.out.println("hi");
			return new Ios();
		
			
		}
		
	}
	
	
}
