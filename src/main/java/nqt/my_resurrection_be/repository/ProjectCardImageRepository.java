package nqt.my_resurrection_be.repository;

import nqt.my_resurrection_be.entity.ProjectCardImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProjectCardImageRepository extends JpaRepository<ProjectCardImage, UUID> {
    // Bạn có thể định nghĩa các phương thức tùy chỉnh ở đây nếu cần
}
