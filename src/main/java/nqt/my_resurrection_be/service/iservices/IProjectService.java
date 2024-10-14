package nqt.my_resurrection_be.service.iservices;

import nqt.my_resurrection_be.dto.project.response.GetDetailProjectResponse;

import java.util.List;

public interface IProjectService {
    List<GetDetailProjectResponse> getAll();
}
