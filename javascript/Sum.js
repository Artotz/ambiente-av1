function sumArray(numbers) {
  if (numbers.length == 0) return 0;

  let sum = 0;
  numbers.map((value) => (sum += value));

  return sum;
}
