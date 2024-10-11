package nqt.my_resurrection_be.repository;

import nqt.my_resurrection_be.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    // Bạn có thể định nghĩa các phương thức tùy chỉnh ở đây nếu cần
}
