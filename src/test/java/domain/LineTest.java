package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

class LineTest {

    @DisplayName("생성 테스트")
    @Test
    void createLine() {
        assertThatCode(() -> new Line(filledStickGenerator(), 3))
                .doesNotThrowAnyException();
    }

    @DisplayName("라인은 인원 수 만큼의 막대를 갖는다.")
    @Test
    void lineHasStick() {
        int playerSize = 3;
        Line line = new Line(filledStickGenerator(), playerSize);

        List<Stick> sticks = line.getSticks();

        assertThat(sticks).hasSize(playerSize);
    }

    @DisplayName("라인에 연속된 막대는 있을 수 없다.")
    @Test
    void opposite() {
        int playerSize = 2;
        Line line = new Line(filledStickGenerator(), playerSize);

        List<Stick> sticks = line.getSticks();

        assertThat(sticks.get(playerSize - 1)).isEqualTo(Stick.EMPTY);
    }

    private StickGenerator filledStickGenerator() {
        return () -> Stick.FILLED;
    }
}
