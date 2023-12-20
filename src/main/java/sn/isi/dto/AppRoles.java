package sn.isi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppRoles {
    private int id;
    @NotNull(message = "le nom ne doit pas etre nul")
    private String nom;

}
