import org.junit.jupiter.api.BeforeEach;

class SlidingWindowRoundsTest extends RoundsTest{
    @BeforeEach
    void setup() { rounds = new SlidingWindowRounds(); }
}