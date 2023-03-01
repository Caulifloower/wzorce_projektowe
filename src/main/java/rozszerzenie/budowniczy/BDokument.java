package rozszerzenie.budowniczy;

import lombok.Builder;
import lombok.Getter;

@Getter //zachęcam do poczytania o lomboku
@Builder
public class BDokument {

    private final String nagłówek;
    private final String stopka;
}
