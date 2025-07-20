import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
    @Email(message = "E-mail moet geldig zijn")
    @NotBlank(message = "E-mail is verplicht")
    String email,

    @NotBlank(message = "Wachtwoord is verplicht")
    @Size(min = 6, message = "Wachtwoord moet minstens 6 tekens zijn")
    String password,

    @NotBlank(message = "Naam is verplicht")
    String name,

    Role role
) {}
