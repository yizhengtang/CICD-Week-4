package ie.atu.week4;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank!")
    private String name;
    @NotBlank(message = "Title cannot be blank!")
    private String title;
    @Min(value=1, message = "Employee ID must be greater than 1!")
    private int employeeId;
    @Min(value=20, message = "Your age must be greater than 20!")
    private int age;
    @Email(message = "This must be a valid email address!")
    private String email;
    @NotBlank(message = "Please fill in your position!")
    private String position;
    @NotBlank(message = "Please fill in your department!")
    private String department;
}
