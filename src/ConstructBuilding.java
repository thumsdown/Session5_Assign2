
public class ConstructBuilding {
	public static void main(String[] args) {
		Home myHome = new Home();
		myHome.enterBuildingType("Home");		
		myHome.enterAddress("Patna");
		myHome.getDetails();
		
		Office myOffice = new Office();
		myOffice.enterBuildingType("Office");
		myOffice.enterAddress("Gurgaon");
		myOffice.getDetails();
	}

}
