package top.alexmmd.easyexcel;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 汪永晖
 */
@Data
@Entity
@Table(name = "upload_data")
public class UploadData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String string;
    private Date date;
    private Double doubleData;
}
