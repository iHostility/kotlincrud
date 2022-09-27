package su.hostile.kotlincrud

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController(val service: MessageService) {

    @GetMapping
    fun getMessages(): List<Message> = service.getAllMessages()

    @PostMapping
    fun postMessage(@RequestBody message: Message) = service.postMessage(message)

    @PutMapping
    fun editMessage(@RequestBody message: Message) = service.editMessage(message)

    @DeleteMapping
    fun deleteMessage(@RequestBody message: Message) = service.deleteMessage(message)
}