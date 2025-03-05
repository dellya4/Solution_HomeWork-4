package Part2;

public class ChatAdapterDemo {
    public static void main(String[] args) {
        // Create old object
        LegacyChatService legacyChatService = new LegacyChatService();
        // Create adapter
        ChatService adapter = new ChatServiceAdapter(legacyChatService);

        // Print message
        adapter.sendMessage("Hello world!");
    }
}
