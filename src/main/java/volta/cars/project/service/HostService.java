package volta.cars.project.service;

import volta.cars.project.model.HostModel;

public interface HostService {
    Iterable<HostModel> retrieveAll();
    void createHostMember(HostModel newMember);
}