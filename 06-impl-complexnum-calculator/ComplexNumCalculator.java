class ComplexNumCalculator {
    int nOpDone;
    ComplexNumber lastRes;

    void build() {
        nOpDone = 0;
    }

    ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber returnValue = new ComplexNumber();
        returnValue.build(n1.re + n2.re, n1.im + n2.im);
        return doOp(returnValue);
    }

    ComplexNumber sub(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber returnValue = new ComplexNumber();
        returnValue.build(n1.re - n2.re, n1.im - n2.im);
        return doOp(returnValue);
    }

    ComplexNumber mul(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber returnValue = new ComplexNumber();
        returnValue.build(n1.re * n2.re - n1.im * n2.im, n1.im * n2.re + n1.re * n2.im);
        return doOp(returnValue);
    }

    ComplexNumber div(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber returnValue = new ComplexNumber();
        double re = (n1.re * n2.re + n1.im * n2.im) / (n2.re * n2.re + n2.im * n2.im);
        double im = (n1.im * n2.re - n1.re * n2.im) / (n2.re * n2.re + n2.im * n2.im);
        returnValue.build(re, im);
        return doOp(returnValue);
    }

    ComplexNumber doOp(ComplexNumber result) {
        nOpDone++;
        lastRes = result;
        return lastRes;
    }
}
