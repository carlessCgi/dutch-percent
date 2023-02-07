public class ArrayRounds implements RoundsInterface {

  private static final String[] DOTS = new String[]{
    "⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪",
    "🔵⚪⚪⚪⚪⚪⚪⚪⚪⚪",
    "🔵🔵⚪⚪⚪⚪⚪⚪⚪⚪",
    "🔵🔵🔵⚪⚪⚪⚪⚪⚪⚪",
    "🔵🔵🔵🔵⚪⚪⚪⚪⚪⚪",
    "🔵🔵🔵🔵🔵⚪⚪⚪⚪⚪",
    "🔵🔵🔵🔵🔵🔵⚪⚪⚪⚪",
    "🔵🔵🔵🔵🔵🔵🔵⚪⚪⚪",
    "🔵🔵🔵🔵🔵🔵🔵🔵⚪⚪",
    "🔵🔵🔵🔵🔵🔵🔵🔵🔵⚪",
    "🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵"
  };

  @Override
  public String getRounds(double score) {
    return DOTS[scoreToRank(score)];
  }

  private int scoreToRank(double score) {
    assert score >= 0.0 && score <= 1.0 : "score should be 0.0-1.0";
    return (int) Math.ceil(score * 10);
  }
}
