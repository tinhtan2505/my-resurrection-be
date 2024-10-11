package nqt.my_resurrection_be.entity;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@MappedSuperclass
public class BaseEntity {
    private LocalDateTime created;
    private LocalDateTime modified;

    @Transient
    public LocalDateTime getCreatedUtc() {
        return created != null ? created.atOffset(ZoneOffset.UTC).toLocalDateTime() : null;
    }

    @Transient
    public LocalDateTime getModifiedUtc() {
        return modified != null ? modified.atOffset(ZoneOffset.UTC).toLocalDateTime() : null;
    }

    // Getters và Setters cho created và modified
    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

}
