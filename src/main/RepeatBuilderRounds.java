public class RepeatBuilderRounds implements RoundsInterface {
  @Override
  public String getRounds(double score) {
    var rank = (int) Math.ceil(score * 10);
    return "🔵".repeat(rank) + "⚪".repeat(10 - rank);
  }
}
