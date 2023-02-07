public class SwitchExpressionRounds implements RoundsInterface {
    @Override
    public String getRounds(double score) {
        return switch (scoreToRank(score)) {
            case 0  -> "⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪";
            case 1  -> "🔵⚪⚪⚪⚪⚪⚪⚪⚪⚪";
            case 2  -> "🔵🔵⚪⚪⚪⚪⚪⚪⚪⚪";
            case 3  -> "🔵🔵🔵⚪⚪⚪⚪⚪⚪⚪";
            case 4  -> "🔵🔵🔵🔵⚪⚪⚪⚪⚪⚪";
            case 5  -> "🔵🔵🔵🔵🔵⚪⚪⚪⚪⚪";
            case 6  -> "🔵🔵🔵🔵🔵🔵⚪⚪⚪⚪";
            case 7  -> "🔵🔵🔵🔵🔵🔵🔵⚪⚪⚪";
            case 8  -> "🔵🔵🔵🔵🔵🔵🔵🔵⚪⚪";
            case 9  -> "🔵🔵🔵🔵🔵🔵🔵🔵🔵⚪";
            default -> "🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵";
        };
    }

    private int scoreToRank(double score) {
        return (int)Math.ceil(score * 10);
    }
}
