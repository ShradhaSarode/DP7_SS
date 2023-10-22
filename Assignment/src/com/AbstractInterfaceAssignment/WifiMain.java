package com.AbstractInterfaceAssignment;
/*
 2)You have been assigned to create a wifi which can be accessed
by the employees inside a room as well as the admin staff from the adjacent room.
Protected
 */
class WifiRoom
{
    protected String ssid;

    public WifiRoom(String ssid)
    {
        this.ssid = ssid;
    }
    protected void connectForEmployees()
    {
        System.out.println("Employees can access Wi-Fi with SSID: " + ssid);
    }
    protected void connectForAdminStaff()
    {
        System.out.println("Admin staff from adjacent room can access Wi-Fi with SSID: " + ssid);
    }
}
class EmployeeRoom extends WifiRoom
{
    public EmployeeRoom(String ssid)
    {
		super(ssid);
		
	}
    public void connectForEmployees()
    {
    	super.connectForEmployees();
        //System.out.println("Employees can access Wi-Fi with SSID: " + ssid);
    }

//	public void accessWifi(WifiRoom wifi)
//    {
//        wifi.connectForEmployees();
//    }
}
class AdjacentRoom extends WifiRoom
{
    public AdjacentRoom(String ssid)
    {
		super(ssid);
	}
    public void connectForAdminStaff()
    {
    	super.connectForAdminStaff();
        //System.out.println("Admin staff from adjacent room can access Wi-Fi with SSID: " + ssid);
    }

//	public void accessWifi(WifiRoom wifi)
//    {
//        wifi.connectForAdminStaff();
//    }
}
public class WifiMain
{
	public static void main(String[] args)
	{
		//WifiRoom wifi = new WifiRoom("My CompanyWiFi");

        EmployeeRoom eR = new EmployeeRoom("CompanyWiFi");
        eR.connectForEmployees();
       // eR.accessWifi(wifi);
        
        System.out.println("------------------------------------------------------------------------------------------------------");
        
        AdjacentRoom aR = new AdjacentRoom("CompanyWiFi");
        aR.connectForAdminStaff();
       // aR.accessWifi(wifi);
	}

}
