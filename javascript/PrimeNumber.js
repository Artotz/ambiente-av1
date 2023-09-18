function isPrime(number) {
  if (number <= 0) return false;

  if (number % 2 == 0) return false;

  let divisor = 3;
  while (divisor < number) {
    if (number % divisor == 0) return false;
    divisor += 2;
  }

  return true;
}
