function countWholeNumbers(numbers) {
  if (numbers == null || numbers.length == 0) {
    return 0;
  }

  let count = 0;

  numbers.map((value) => {
    if (value % 1 == 0.0) count++;
  });

  return count;
}
