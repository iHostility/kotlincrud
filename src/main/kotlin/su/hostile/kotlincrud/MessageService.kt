package su.hostile.kotlincrud

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class MessageService(val messageRepo: MessageRepo) {

    fun getAllMessages(): List<Message> = messageRepo.findAll()
    fun postMessage(message: Message) = messageRepo.save(message)
    fun editMessage(message: Message) {
        val toEdit: Message? = messageRepo.findByIdOrNull(message.id)
        if (toEdit != null)
            message.createdAt = toEdit.createdAt
        messageRepo.save(message)
    }
    fun deleteMessage(message: Message) = messageRepo.delete(message)
}
