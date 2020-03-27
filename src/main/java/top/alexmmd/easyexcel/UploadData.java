package top.alexmmd.easyexcel;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author 汪永晖
 */
@Data
@Entity(name = "upload_data")
public class UploadData {

    @Id
    @GeneratedValue
    private Long id;
    private String string;
    private Date date;
    private Double doubleData;
}
