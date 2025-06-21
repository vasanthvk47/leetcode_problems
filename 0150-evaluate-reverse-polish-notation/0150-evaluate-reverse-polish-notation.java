class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < t.length; i++) {
            String token = t[i];

            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int a = s.pop(); // second operand
                int b = s.pop(); // first operand

                switch (token) {
                    case "+":
                        s.push(b + a);
                        break;
                    case "-":
                        s.push(b - a);
                        break;
                    case "*":
                        s.push(b * a);
                        break;
                    case "/":
                        s.push(b / a); // Integer division
                        break;
                }
            } else {
                s.push(Integer.valueOf(token));
            }
        }

        return s.isEmpty() ? 0 : s.pop();
    }
}
