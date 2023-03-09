import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


class ScoreKeeperTest {

    @Test
    void shouldReturnStartingScoreOfZeroForTeamAAndB() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        String actualScore = scoreKeeper.getScore();
        String expectedScore = "000:000";
        assertThat(actualScore)
                .isEqualTo(expectedScore);
    }

    @ParameterizedTest
    @CsvSource({"1,001:000", "10,010:000", "100,100:000", "1000,999:000"})
    void shouldReturnCorrectScoreForTeamA(int increment, String expectedScore) {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        for (int i = 0; i < increment; i++) {
            scoreKeeper.scoreTeamA1();
        }
        String actualScore = scoreKeeper.getScore();
        assertThat(actualScore).isEqualTo(expectedScore);
    }
}
