package ci.gestcantineada.gestcantineada.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuDTO {
    private Long id;
    private Date creationDate;
    private DishDTO dish;


}