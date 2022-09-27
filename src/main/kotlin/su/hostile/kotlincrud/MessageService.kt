package su.hostile.kotlincrud

import org.springframework.stereotype.Service

@Service
class MessageService(val messageRepo: MessageRepo) {

    fun getAllMessages(): List<Message> = messageRepo.findAll()
    fun postMessage(message: Message) = messageRepo.save(message)
}