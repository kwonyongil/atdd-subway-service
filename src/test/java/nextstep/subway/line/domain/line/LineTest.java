package nextstep.subway.line.domain.line;

import nextstep.subway.exception.LineException;
import nextstep.subway.station.domain.Station;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

public class LineTest {

    @Test
    public void 노선_정상_생성() {
        Station 강남역 = new Station("강남역");
        Station 광교역 = new Station("광교역");

        Line actual = new Line("신분당선", "red", 강남역, 광교역, 10);

        assertAll(
                () -> assertThat(actual.getName()).isEqualTo("신분당선"),
                () -> assertThat(actual.getColor()).isEqualTo("red"),
                () -> assertThat(actual.getSections().get(0).getUpStation()).isEqualTo(강남역),
                () -> assertThat(actual.getSections().get(0).getDownStation()).isEqualTo(광교역)
        );
    }

    @Test
    public void 노선_생성_오류() {
        Station 강남역 = new Station("강남역");
        Station 광교역 = new Station("광교역");

        assertThatThrownBy(() -> {
            new Line("", "red", 강남역, 광교역, 10);
        }).isInstanceOf(LineException.class);
    }


}