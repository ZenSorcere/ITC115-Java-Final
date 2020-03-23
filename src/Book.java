
public class Book extends Library {

	public boolean reserved = false;
	public int lateDays;
	
	public Book(int number, String title) {
		super(number, title);
		setDaysAllowed(7);
		reserved = false;
	}

	@Override
	public void setItemTitle(String itemTitle) {
		// TODO Auto-generated method stub
		super.setItemTitle(itemTitle);
	}

	@Override
	public boolean reserved() {
		reserved = true;
		return true;
	}
	public String getReservedStatus() {
		return "Checked out yet? " + reserved;
	}
	//@Override
	public boolean checkedIn() {
		reserved = false;
		return false;
	}

	@Override
	public int daysLate(int daysOut) {
	//TODO Auto-generated method stub -- if daysLate > 0, run finesAccrued
		if (daysOut > getDaysAllowed()) {
				lateDays = daysOut - getDaysAllowed();
				
				} else {
					lateDays = 0;
				}
				return lateDays;
			}
	
	public double getFines() {
		return lateDays * .50;
	}
	
	public String finesAccrued() {
		return "Late Fees applied: " + getFines();
	}
	public String toString() {
		return "Book info--\n" + info() + "\nChecked out? " + reserved + "\n" + finesAccrued();
	}
	
}
