package io.caster.designpatterns.facade;

public class CalculationFacadeImpl implements CalculationFacade {

    ClassA a;
    ClassB b;
    ClassC c;

    public CalculationFacadeImpl(ClassA a, ClassB b, ClassC c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int getSum() {
        return a.ValueA() + b.ValueB() + c.ValueC();
    }
}
