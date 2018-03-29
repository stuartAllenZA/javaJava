public class StrategyPatternParent {
    public IStrategyPatternBehaviour behaviour;
    public void performBehaviour() {
        behaviour.doesSomething();
    }

}
