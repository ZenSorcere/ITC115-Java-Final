
public class LibraryUser {

	public static void main(String[] args) {
		// creating named book item, and running various tests
		Book test1 = new Book(1, "Book of Tests");  //construct item
		System.out.println(test1);					//display item info
		test1.reserved();							//change reserved status
		System.out.println(test1.getReservedStatus()); //check just reserved status
		System.out.println(test1);					// display updated info
		test1.checkedIn();							//change reserved status
		System.out.println(test1.daysLate(10));		// displays results of daysLate method
		System.out.println(test1.finesAccrued());  // display any accrued fines
		System.out.println();
		
// runs through an array of each item type created and displays the information for that item.
		Library[] items = { new Book(1, "Book of Tests"), new Magazine(2, "Entertainment Weekly"), new Dvd(3, "Captain Marvel") };
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i].toString());
			System.out.println();
		}
		
		
	}

}
