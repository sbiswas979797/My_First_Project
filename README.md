# My_First_Project
The following are the various classes that have been implemented.
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
