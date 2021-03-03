function factorial(n) {
    let value = 1;
    if (n > 1) {
        value = n * factorial(n - 1);
    }
    return value;
}
