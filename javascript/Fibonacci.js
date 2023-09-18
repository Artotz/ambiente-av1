function calculateFibonacci(n) {
  if (n <= 0) return -1;

  if (n == 1 || n == 2) {
    return 1;
  }

  let fib1 = 1;
  let fib2 = 1;
  let result = 0;

  for (let i = 3; i <= n; i++) {
    result = fib1 + fib2;
    fib1 = fib2;
    fib2 = result;
  }

  return result;
}
