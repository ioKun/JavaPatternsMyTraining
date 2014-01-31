package patterns.strategy.base;



class StrategyExample {

    public static void main(String[] args) {

        Context context = new Context();

        context.setStrategy(new ConcreteStrategyAdd());
        int resultA = context.executeStrategy(3,4);
        System.out.println(resultA);

        context.setStrategy(new ConcreteStrategySubtract());
        int resultB = context.executeStrategy(3,4);
        System.out.println(resultB);

        context.setStrategy(new ConcreteStrategyMultiply());
        int resultC = context.executeStrategy(3,4);
        System.out.println(resultC);
    }
}