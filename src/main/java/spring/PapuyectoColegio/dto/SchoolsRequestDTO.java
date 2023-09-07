package spring.PapuyectoColegio.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
public class SchoolsRequestDTO {
    @NotNull
    @NotEmpty
    private String name;
    @NotNull
    private String address;
    @NotNull
    private Integer phone;
    @NotNull
    private Timestamp createdAt;
    private Timestamp updateAt;

}
