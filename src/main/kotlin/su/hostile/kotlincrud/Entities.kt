package su.hostile.kotlincrud

import org.hibernate.annotations.CreationTimestamp
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "messages")
class Message(
    @Id @GeneratedValue val id: UUID?,
    val text: String?,
    @CreationTimestamp val createdAt: Date?
)
