
    class NumericFunctions<T extends Number>{
        private T num;

        public NumericFunctions(T num){
            this.num=num;
        }

        public double reciprocal(){
            return 1.0/num.doubleValue();
        }

        public double fractionalPart(){
            double value = num.doubleValue();
            return value - (int)value;
        }

        public <U extends Number> boolean absEqual(U num2) {
            return Math.abs(num.doubleValue()) == Math.abs(num2.doubleValue());
        }
    }

    public class Main {
        public static void main(String[] args) {
            NumericFunctions<Integer> n1 = new NumericFunctions<>(4);
            NumericFunctions<Double> n2 = new NumericFunctions<>(9.76);

            System.out.println(n1.reciprocal());
            System.out.printf("%.2f%n", n2.fractionalPart());

            NumericFunctions<Double> n3 = new NumericFunctions<>(-5.0);
            System.out.println(n3.absEqual(5.0f));
        }
    }

