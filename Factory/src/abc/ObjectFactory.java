package abc;

public class ObjectFactory {

	public OperatingSys getInstance(String s) {
	
		
		if(s.equals("open"))
		{
			return new Android(); 
			
		}
		
		else {
			return new Ios();
			
		}
		
	}
	
	
}
