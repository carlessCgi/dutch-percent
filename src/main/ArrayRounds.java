public class ArrayRounds implements RoundsInterface {

    private static final String[] DOTS = new String[] {
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
        return DOTS[scoreToInt(score)];
    }

    private int scoreToInt(double score) {
        assert score >= 0.0 && score <= 1.0 : "score outside the range 0-1";
        return (int)Math.ceil(score * 10);
    }
}
