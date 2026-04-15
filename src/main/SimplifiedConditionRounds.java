public class SimplifiedConditionRounds implements RoundsInterface {
  @Override
  public String getRounds(double score) {
    if (score <  0.0) return "🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵";
    if (score == 0.0) return "⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪";
    if (score <= 0.1) return "🔵⚪⚪⚪⚪⚪⚪⚪⚪⚪";
    if (score <= 0.2) return "🔵🔵⚪⚪⚪⚪⚪⚪⚪⚪";
    if (score <= 0.3) return "🔵🔵🔵⚪⚪⚪⚪⚪⚪⚪";
    if (score <= 0.4) return "🔵🔵🔵🔵⚪⚪⚪⚪⚪⚪";
    if (score <= 0.5) return "🔵🔵🔵🔵🔵⚪⚪⚪⚪⚪";
    if (score <= 0.6) return "🔵🔵🔵🔵🔵🔵⚪⚪⚪⚪";
    if (score <= 0.7) return "🔵🔵🔵🔵🔵🔵🔵⚪⚪⚪";
    if (score <= 0.8) return "🔵🔵🔵🔵🔵🔵🔵🔵⚪⚪";
    if (score <= 0.9) return "🔵🔵🔵🔵🔵🔵🔵🔵🔵⚪";
                      return "🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵";
  }
}
