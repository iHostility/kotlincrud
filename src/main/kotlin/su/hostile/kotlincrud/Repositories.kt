package su.hostile.kotlincrud

import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface MessageRepo : JpaRepository<Message, UUID>