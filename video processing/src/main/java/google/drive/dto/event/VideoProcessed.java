package google.drive.dto.event;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String videoUrl;
    private Long fileId;

    public VideoProcessed(){
        super();
    }
}