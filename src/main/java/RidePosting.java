package main.java;

public class RidePosting {
	public String createRider(Ride ride){
		return null;
		
	}

	public String SaveRide(Ride ride) {
		if (ride != null) {
			if (ride.getEmployeeName().equals("")){
				return "Username Can't Be Empty.";
			}
			return "Post was successful.";
		} else {
			return "Post was unsuccessful.";

		}
	}
}
