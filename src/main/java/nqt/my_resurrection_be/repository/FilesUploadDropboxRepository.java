package nqt.my_resurrection_be.repository;

import nqt.my_resurrection_be.entity.FilesUploadDropbox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FilesUploadDropboxRepository extends JpaRepository<FilesUploadDropbox, UUID> {
    // Bạn có thể định nghĩa các phương thức tùy chỉnh ở đây nếu cần
}
