package nqt.my_resurrection_be.repository;

import nqt.my_resurrection_be.dto.project.response.GetDetailProjectResponse;
import nqt.my_resurrection_be.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProjectRepository extends JpaRepository<Project, UUID> {

    @Query(
            "SELECT new nqt.my_resurrection_be.dto.project.response.GetDetailProjectResponse(" +
                    "p.id, " +
                    "p.name, " +
                    "p.globalName, " +
                    "p.path, " +
                    "p.pathDone, " +
                    "p.imageLink, " +
                    "p.customerKeyRs, " +
                    "p.imageCount, " +
                    "p.price, " +
                    "p.totalAmount, " +
                    "p.isTesting, " +
                    "p.deadline, " +
                    "c.label) " +
                    "FROM Project p " +
                    "LEFT JOIN Category c ON c.id = p.statusForCustomer.id ")
    List<GetDetailProjectResponse> getAll();
}
