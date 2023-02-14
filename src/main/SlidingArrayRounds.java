public class SlidingArrayRounds implements RoundsInterface {

  private static final String DOTS = "🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪";

  @Override
  public String getRounds(double score) {
    int rank = scoreToRank(score);
    return DOTS.substring(10 - rank, 20 - rank);
  }

  private int scoreToRank(double score) {
    assert score >= 0.0 && score <= 1.0 : "score should be 0.0-1.0";
    return (int) Math.ceil(score * 10);
  }
}
