function factorial(n) {
    if (n > 1) {
        let value = n * factorial(n - 1);
        return value;
    } else {
        return 1;
    }
}
