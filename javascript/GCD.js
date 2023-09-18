function calculateGCD(n1, n2) {
  if (n2 == 0) {
    return n1;
  }
  return calculateGCD(n2, n1 % n2);
}
