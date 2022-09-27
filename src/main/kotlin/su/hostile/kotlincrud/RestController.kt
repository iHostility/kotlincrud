package su.hostile.kotlincrud

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController(val service: MessageService) {

    @GetMapping
    fun getMessages(): List<Message> = service.getAllMessages()

    @PostMapping
    fun postMessage(@RequestBody message: Message) {
        service.postMessage(message)
    }
}