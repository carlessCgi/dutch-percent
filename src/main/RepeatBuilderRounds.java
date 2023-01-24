public class RepeatBuilderRounds implements RoundsInterface {
    @Override
    public String getRounds(double score) {
        var normalised = (int)Math.ceil(score * 10);
        return "🔵".repeat(normalised) + "⚪".repeat(10 - normalised);
    }
}
