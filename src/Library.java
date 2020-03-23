
public abstract class Library {

// fields
	private int itemNumber;
	private String itemTitle;
	private int daysAllowed;
	
// super constructor
	public Library (int number, String title) {
		this.itemNumber = number;
		this.itemTitle = title;
	}

	public int getDaysAllowed() {
		return daysAllowed;
	}

	public void setDaysAllowed(int daysAllowed) {
		this.daysAllowed = daysAllowed;
	}
// getters-Setters for constructor fields
	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemTitle() {
		return itemTitle;
	}

	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}
	
// other methods
	public abstract boolean reserved();
	
	public abstract boolean checkedIn(); 

	public abstract int daysLate(int days);
	
	//public double finesAccrued () {
	//	return lateDays * .50;
	//}
	
	public String info() {
		return "Item Number: " + getItemNumber() + "\nItemTitle: " + getItemTitle() + "\nCheckout days allowed: " + getDaysAllowed();
	}
}
