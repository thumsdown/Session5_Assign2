
public class Office extends Building{
	public void getDetails()
	{
		System.out.println("Building Type = "+super.Name);
		System.out.println("Building Address = "+super.Address);
		System.out.println("Number of doors = "+super.numDoors);
		System.out.println("Number of Windows = "+super.numWindows);
		System.out.println("Entry Restricted to Employee only");
	}
	
	public void enterBuildingType(String value)
	{
		super.Name = value;
	}
	
	public void enterAddress(String value)
	{
		super.Address = value;
	}
}
