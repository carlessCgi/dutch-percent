import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class RoundsTest {
  RoundsInterface rounds;

  @Test
  void zeroIsAllWhite() {
    assertEquals("⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪", rounds.getRounds(0.0));
  }

  @Test
  void oneIsAllBlue() {
    assertEquals("🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵", rounds.getRounds(1.0));
  }

  @Test
  void alwaysRoundsUp() {
    var five = "🔵🔵🔵🔵🔵⚪⚪⚪⚪⚪";
    assertEquals(five, rounds.getRounds(0.44));
    assertEquals(five, rounds.getRounds(0.45));
    assertEquals(five, rounds.getRounds(0.46));
  }

  @Test
  void boundariesAroundScoreOne() {
    var one = "🔵⚪⚪⚪⚪⚪⚪⚪⚪⚪";
    var two = "🔵🔵⚪⚪⚪⚪⚪⚪⚪⚪";
    assertEquals(one, rounds.getRounds(0.0000001));
    assertEquals(one, rounds.getRounds(0.0999999));
    assertEquals(one, rounds.getRounds(0.1));
    assertEquals(two, rounds.getRounds(0.1000001));
  }

  @Test
  void anyNegativeIsAllBlue() {
    assertEquals("🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵", rounds.getRounds(-0.00001));
    assertEquals("🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵", rounds.getRounds(-1.0));
    assertEquals("🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵", rounds.getRounds(-100.0));
  }

  @Test
  void greaterThanOneIsAllBlue() {
    assertEquals("🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵", rounds.getRounds(1.1));
    assertEquals("🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵", rounds.getRounds(100.0));
  }
}