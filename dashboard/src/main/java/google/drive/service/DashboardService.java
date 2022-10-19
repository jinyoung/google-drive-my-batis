
package google.drive.service;

import java.util.List;
import google.drive.dto.entity.Dashboard;

public interface DashboardService{
    public List<Dashboard> getList();

    public Dashboard getById(Long id);

}