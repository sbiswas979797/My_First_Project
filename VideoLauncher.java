package myPackage;
import myPackage.Video;
import myPackage.VideoStore;
import java.util.Scanner;

public class VideoLauncher {
	public static void main(String[] args) {
		int n, rating;
		String videoName;
		VideoStore videostore = new VideoStore();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("MAIN MENU\r\n" + 
					"=========\r\n" + 
					"1.Add Videos: \r\n" + 
					"2.Check Out Video : \r\n" + 
					"3.Return Video : \r\n" + 
					"4.Receive Rating : \r\n" + 
					"5.List Inventory : \r\n" + 
					"6.Exit : Enter your choice(1..6): ");
			n = scanner.nextInt();
			switch(n) {
				case 1:
					System.out.print("Enter the name of the video you want to add : ");
					videostore.addVideo(scanner.next());
					break;
				case 2:
					System.out.print("Enter the name of the video you want to check out: ");
					videoName = scanner.next();
					videostore.doCheckout(videoName);
					break;
				case 3:
					System.out.print("Enter the name of the video you want to Return: ");
					videoName = scanner.next();
					videostore.doReturn(videoName);
					break;
				case 4:
					System.out.print("Enter the name of the video you want to Rate: ");
					videoName = scanner.next();
					System.out.print("Enter the rating for this video: ");
					rating = scanner.nextInt();
					videostore.receiveRating(videoName, rating);
					break;
				case 5:
					videostore.listInventory();
					break;
				case 6:
					System.out.print("Exiting...!! Thanks for using the application.");
					System.exit(1);
					break;
			}
		}while(n<=6);
		
	}
}
