public class ParameterisedBuilderRounds implements RoundsInterface {

  private static final int MAX_RANK = 10;
  private static final String SCORE_DOT = "🔵";
  private static final String PAD_DOT = "⚪";

  @Override
  public String getRounds(double score) {
    var rank = scoreToRank(score, MAX_RANK);
    return rankToRounds(rank, MAX_RANK, SCORE_DOT, PAD_DOT);
  }

  private int scoreToRank(double score, int max) {
    if (score < 0.0 || score > 1.0) return max;
    return (int) Math.ceil(score * max);
  }

  private String rankToRounds(int rank, int max, String dot, String pad) {
    return dot.repeat(rank) + pad.repeat(max - rank);
  }
}
