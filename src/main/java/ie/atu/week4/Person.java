package ie.atu.week4;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @NotBlank(message = "This value cannot be blank.")
    private String name;
    @Min(value=1, message = "Value must be greater than 1")
    private int age;
}
