def power(x, n):
    if n == 0:
        return 1
    elif n % 2 == 0:
        return power(x, n // 2) * power(x, n // 2)
    else:
        return x * power(x, n // 2) * power(x, n // 2)

def main():
    x = float(input("Enter the base number: "))
    n = int(input("Enter the power: "))
    print("The result is: ", power(x, n))

if __name__ == "__main__":
    main()