package su.hostile.kotlincrud

import org.hibernate.annotations.CreationTimestamp
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "messages")
class Message(
    @Column(columnDefinition = "TEXT") var text: String?,
    @CreationTimestamp var createdAt: Date?,
    @Id @GeneratedValue val id: UUID? = null,
)
