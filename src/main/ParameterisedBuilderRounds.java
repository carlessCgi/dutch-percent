public class ParameterisedBuilderRounds implements RoundsInterface {

  private static final int MAX_RANK = 10;
  private static final String SCORE_DOT = "🔵";
  private static final String PAD_DOT = "⚪";

  @Override
  public String getRounds(double score) {
    return rankToRounds(scoreToRank(score));
  }

  private int scoreToRank(double score) {
    if (score < 0.0 || score > 1.0) return MAX_RANK;
    return (int) Math.ceil(score * MAX_RANK);
  }

  private String rankToRounds(int rank) {
      return SCORE_DOT.repeat(rank) + PAD_DOT.repeat(MAX_RANK - rank);
  }
}
