package nqt.my_resurrection_be.repository;

import nqt.my_resurrection_be.entity.ProjectSampleImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectSampleImageRepository extends JpaRepository<ProjectSampleImage, Long> {
    // Bạn có thể định nghĩa các phương thức tùy chỉnh ở đây nếu cần
}
