package nqt.my_resurrection_be.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import nqt.my_resurrection_be.dto.CustomResponse;
import nqt.my_resurrection_be.dto.project.response.GetDetailProjectResponse;
import nqt.my_resurrection_be.service.iservices.IProjectService;
import nqt.my_resurrection_be.utils.ErrorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/project")
@Tag(name = "Project")
public class ProjectController {
    @Autowired
    private IProjectService iService;

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            List<GetDetailProjectResponse> result = iService.getAll();
            return ResponseEntity.ok(CustomResponse.success(result, "Thành công"));
        } catch (Exception e) {
            HttpStatus status = ErrorUtils.determineHttpStatus(e);
            return ResponseEntity.status(status)
                    .body(CustomResponse.error(e.getMessage(), status.value()));
        }
    }
}
