package project_euler;

 class NumberSpiralDiagonals {
    static int spiralDiaSum(int n)
    {
        if (n == 1)
            return 1;
        return (4 * n * n - 6 * n + 6 +
                spiralDiaSum(n - 2));
    }
    public static void main (String[] args)
    {
        int n = 1001;
        System.out.print(spiralDiaSum(n));
    }
}
