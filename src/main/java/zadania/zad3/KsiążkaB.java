package zadania.zad3;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class KsiążkaB {

    private final String tytuł;
    private final String autor;
    private final String rokWydania;
    private final String wydawnictwo;
    private final String isbn;
}
