package ast;

public abstract class Expression {
    public abstract void accept();

    public static class AddExpression extends Expression{
        private Expression left;
        private Expression right;

        public Expression getLeft() {
            return left;
        }

        public Expression getRight() {
            return right;
        }

        public AddExpression(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        public void accept() {

        }
    }
}
