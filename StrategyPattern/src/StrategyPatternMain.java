public class StrategyPatternMain {
    public static void main(String[] args) {
        StrategyPatternChild1 child1 = new StrategyPatternChild1();
        StrategyPatternChild2 child2 = new StrategyPatternChild2();

        child1.performBehaviour();
        child2.performBehaviour();
    }
}
