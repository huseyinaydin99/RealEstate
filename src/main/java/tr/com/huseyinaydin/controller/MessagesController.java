package tr.com.huseyinaydin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.huseyinaydin.dto.message.CreateMessageDto;
import tr.com.huseyinaydin.service.MessageService;

@RestController
@RequestMapping("/api/messages")
@RequiredArgsConstructor
public class MessagesController {
    private final MessageService messageService;

    @GetMapping("/inbox/{id}")
    public ResponseEntity<?> getAllMessageInBox(@PathVariable int id) {
        return ResponseEntity.ok(messageService.getAllMessageInBox(id));
    }

    @GetMapping("/sendbox/{id}")
    public ResponseEntity<?> getAllMessageSendBox(@PathVariable int id) {
        return ResponseEntity.ok(messageService.getAllMessageSendBox(id));
    }

    @GetMapping("/last3/{id}")
    public ResponseEntity<?> getInBoxLast3MessageListByReceiver(@PathVariable int id) {
        return ResponseEntity.ok(messageService.getInBoxLast3MessageListByReceiver(id));
    }

    @PostMapping
    public ResponseEntity<?> createMessage(@RequestBody CreateMessageDto createMessageDto) {
        messageService.createMessage(createMessageDto);
        return ResponseEntity.ok("Mesaj başarıyla gönderildi.");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMessage(@PathVariable int id) {
        return ResponseEntity.ok(messageService.getMessage(id));
    }
}
