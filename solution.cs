```C#
using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter the base number: ");
        double baseNumber = Convert.ToDouble(Console.ReadLine());

        Console.Write("Enter the exponent: ");
        int exponent = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Result: " + Power(baseNumber, exponent));
    }

    static double Power(double baseNumber, int exponent)
    {
        if (exponent == 0)
            return 1;
        else if (exponent % 2 == 0)
            return Power(baseNumber, exponent / 2) * Power(baseNumber, exponent / 2);
        else
            return baseNumber * Power(baseNumber, exponent / 2) * Power(baseNumber, exponent / 2);
    }
}
```