package Part2;

public class ChatServiceAdapter implements ChatService {
    private final LegacyChatService legacyChatService;

    // Create constructor for adapter with old class
    public ChatServiceAdapter(LegacyChatService legacyChatService) {
        this.legacyChatService = legacyChatService;
    }

    @Override
    public void sendMessage(String message) {
        legacyChatService.sendLegacyMessage(message);
    }
}
