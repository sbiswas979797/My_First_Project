package myPackage;
import myPackage.Video;

public class VideoStore {
	Video[] Store = new Video[5];
	int i = 0;
	
	void addVideo(String name) {
		Store[i] = new Video(name);
		i++;
	}
	
	void doCheckout(String name) {
		for(int c=0; c<i; c++) {
			if(Store[c].getName().equals(name)) {
				Store[c].doCheckout();
				System.out.println("Video “"+Store[c].getName()+"” checked out successfully.");
			}
		}
	}
	
	void  doReturn(String name) {
		for(int c=0; c<i; c++) {
			if(Store[c].getName().equals(name)) {
				Store[c].doReturn();
				System.out.println("Video “"+Store[c].getName()+"” returned successfully.");
			}
		}
	}
	
	void receiveRating(String name,int rating) {
		for(int c=0; c<i; c++) {
			if(Store[c].getName().equals(name)) {
				Store[c].receiveRating(rating);
				System.out.println("Rating “"+Store[c].getRating()+"” has been mapped to the Video “"+Store[c].getName()+"”");
			}
		}
	}
	
	void listInventory() {
		System.out.println("-------------------------------------------");
		System.out.println("Video Name | Checkout Status | Rating ");
		for(int c=0; c<i; c++) {
			System.out.println(Store[c].getName()+" | "+Store[c].getCheckout()+" | "+Store[c].getRating());
		}
		System.out.println("-------------------------------------------");
	}
}