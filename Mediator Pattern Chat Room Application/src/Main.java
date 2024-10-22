public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new RegularUser(chatRoom, "Alice");
        User user2 = new RegularUser(chatRoom, "Bob");
        User user3 = new PremiumUser(chatRoom, "Charlie");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("Hello everyone!");
        user2.sendMessage("Hi Alice!");
        user3.sendMessage("Hello, I am Charlie!");
    }
}

