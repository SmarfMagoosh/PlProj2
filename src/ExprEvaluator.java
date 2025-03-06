package src;

public class ExprEvaluator implements ExprVisitor<Float> {
    public Float visitFloat(FloatExpr e) {
        return e.literal;
    }

    public Float visitPlus(PlusExpr e) {
        return e.getE1().accept(this) + e.getE2().accept(this);
    }

    public Float visitMinus(MinusExpr e) {
        return e.getE1().accept(this) - e.getE2().accept(this);
    }

    public Float visitTimes(TimesExpr e) {
        return e.getE1().accept(this) * e.getE2().accept(this);
    }

    public Float visitDiv(DivExpr e) {
        return e.getE1().accept(this) / e.getE2().accept(this);
    }
}
