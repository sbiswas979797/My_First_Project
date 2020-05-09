# My_First_Project
Video Rental Inventory System
The goal of this project is to design and implement a simple inventory control system for a
small video rental store.
The following are the various classes that are to be implemented.
1. Video
Member variables
• String videoName
• boolean checkout
• int rating
Member functions
• String getName();
• void doCheckout();
• void doReturn();
• void receiveRating(int rating);
• int getRating();
• boolean getCheckout();
Constructor
• Video(String name)
2. VideoStore
Member variables
• Video[] store;
Member functions
• void addVideo(String name);
• void doCheckout(String name);
• void doReturn(String name);
• void receiveRating(String name, int rating);
• void listInventory();
3. VideoLaucher
Contains the main method to test the program
Sensitivity: Internal & Restricted
Sample Output:
D:\Batches\Milestone1> java VideoLauncher
MAIN MENU
=========
1.Add Videos:
2. Check Out Video :
3. Return Video :
4. Receive Rating :
5. List Inventory :
6. Exit :
Enter your choice (1..6): 1
Enter the name of the video you want to add: Matrix
Video “Matrix” added successfully.
MAIN MENU
=========
1.Add Videos:
2. Check Out Video :
3. Return Video :
4. Receive Rating :
5. List Inventory :
6. Exit :
Enter your choice (1..6): 4
Enter the name of the video you want to Rate: Matrix
Enter the rating for this video: 9
Rating “9” has been mapped to the Video “Matrix”.
MAIN MENU
=========
1.Add Videos:
2. Check Out Video :
3. Return Video :
4. Receive Rating :
5. List Inventory :
6. Exit :
Enter your choice (1..6): 2
Enter the name of the video you want to check out: Matrix
Video “Matrix” checked out successfully.
Sensitivity: Internal & Restricted
MAIN MENU
=========
1.Add Videos:
2. Check Out Video :
3. Return Video :
4. Receive Rating :
5. List Inventory :
6. Exit :
Enter your choice (1..6): 5
--------------------------------------------------------
Video Name | Checkout Status | Rating
Matrix | true | 9
--------------------------------------------------------
MAIN MENU
=========
1.Add Videos:
2. Check Out Video :
3. Return Video :
4. Receive Rating :
5. List Inventory :
6. Exit :
Enter your choice (1..6): 3
Enter the name of the video you want to Return: Matrix
Video “Matrix” returned successfully.
MAIN MENU
=========
1.Add Videos:
2. Check Out Video :
3. Return Video :
4. Receive Rating :
5. List Inventory :
6. Exit :
Enter your choice (1..6): 5
--------------------------------------------------------
Video Name | Checkout Status | Rating
Matrix | false | 9
--------------------------------------------------------
Sensitivity: Internal & Restricted
MAIN MENU
=========
1.Add Videos:
2. Check Out Video :
3. Return Video :
4. Receive Rating :
5. List Inventory :
6. Exit :
Enter your choice (1..6): 6
Exiting...!! Thanks for using the application.
