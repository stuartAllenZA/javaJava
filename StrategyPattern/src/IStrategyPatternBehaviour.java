public interface IStrategyPatternBehaviour {

    void doesSomething();
}

class Behaviour1 implements IStrategyPatternBehaviour {

    public void doesSomething() {
        System.out.println("Behaviour 1");
    }
}

class Behaviour2 implements IStrategyPatternBehaviour {

    public void doesSomething() {
        System.out.println("Behaviour 2");
    }
}