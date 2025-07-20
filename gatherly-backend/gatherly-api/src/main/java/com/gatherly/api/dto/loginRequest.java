import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record LoginRequest(
    @NotBlank(message = "E-mail is verplicht")
    @Email(message = "Geen geldig e-mailadres")
    String email,

    @NotBlank(message = "Wachtwoord is verplicht")
    String password
) {}
