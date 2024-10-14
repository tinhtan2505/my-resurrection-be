package nqt.my_resurrection_be.service.impl;

import nqt.my_resurrection_be.dto.project.response.GetDetailProjectResponse;
import nqt.my_resurrection_be.repository.ProjectRepository;
import nqt.my_resurrection_be.service.iservices.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService implements IProjectService {
    @Autowired
    private ProjectRepository repository;

    @Override
    public List<GetDetailProjectResponse> getAll() {
        List<GetDetailProjectResponse> record = repository.getAll();
        return null;
    }
}
