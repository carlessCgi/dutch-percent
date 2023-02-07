public class OriginalRounds implements RoundsInterface {
  @Override
  public String getRounds(double score) {
    if (score == 0)
      return "⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪";
    if (score > 0.0 && score <= 0.1)
      return "🔵⚪⚪⚪⚪⚪⚪⚪⚪⚪";
    if (score > 0.1 && score <= 0.2)
      return "🔵🔵⚪⚪⚪⚪⚪⚪⚪⚪";
    if (score > 0.2 && score <= 0.3)
      return "🔵🔵🔵⚪⚪⚪⚪⚪⚪⚪";
    if (score > 0.3 && score <= 0.4)
      return "🔵🔵🔵🔵⚪⚪⚪⚪⚪⚪";
    if (score > 0.4 && score <= 0.5)
      return "🔵🔵🔵🔵🔵⚪⚪⚪⚪⚪";
    if (score > 0.5 && score <= 0.6)
      return "🔵🔵🔵🔵🔵🔵⚪⚪⚪⚪";
    if (score > 0.6 && score <= 0.7)
      return "🔵🔵🔵🔵🔵🔵🔵⚪⚪⚪";
    if (score > 0.7 && score <= 0.8)
      return "🔵🔵🔵🔵🔵🔵🔵🔵⚪⚪";
    if (score > 0.8 && score <= 0.9)
      return "🔵🔵🔵🔵🔵🔵🔵🔵🔵⚪";

    return "🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵";
  }
}
