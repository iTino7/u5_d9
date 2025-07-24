package epicode.u5d8hw.payloads;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class NewBlogPayloaDTO {

    @NotEmpty(message = "La categoria è obbligatoria")
    @Size(min = 4, max = 20, message = "Il nome della categoria deve essere compresa tra 4 e 20 caratteri")
    private String category;

    @NotEmpty(message = "Il contenuto è obbligatorio!")
    @Min(value = 100, message = "Il contenuto deve contenere almeno 100 caratteri")
    private String content;

    @NotEmpty(message = "Il reading è obbligatorio")
    @Size(min = 1, max = 120, message = "Il tempo deve essere un numero compreso tra 1 e 120 minuti")
    private double readingTime;

    private String title;

    private int id;
}
