public class SlidingWindowRounds implements RoundsInterface {

  private static final int MAX_RANK = 10;
  private static final String DOTS = "🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪";

  @Override
  public String getRounds(double score) {
    int rank = scoreToRank(score);
    return rankToRounds(rank);
  }

  private int scoreToRank(double score) {
    if (score < 0.0 || score > 1.0) return MAX_RANK;
    return (int) Math.ceil(score * MAX_RANK);
  }

  private String rankToRounds(int rank) {
    return DOTS.substring(MAX_RANK - rank, MAX_RANK*2 - rank);
  }
}
