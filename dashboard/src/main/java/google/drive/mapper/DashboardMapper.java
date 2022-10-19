package google.drive.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import google.drive.dto.entity.Dashboard;

@Mapper
public interface DashboardMapper{
    public List<Dashboard> findList();

    public Dashboard findOneById(Long id);
} 