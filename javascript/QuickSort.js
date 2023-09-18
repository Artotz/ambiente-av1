function quickSort(array) {
  if (array == null || array.length == 0) {
    return;
  }
  let length = array.length;
  quickSortRecursive(array, 0, length - 1);
}

function quickSortRecursive(array, left, right) {
  if (left < right) {
    let pivotIndex = partition(array, left, right);

    quickSortRecursive(array, left, pivotIndex - 1);
    quickSortRecursive(array, pivotIndex + 1, right);
  }
}

function partition(array, left, right) {
  let pivot = array[right];
  let i = left - 1;

  for (let j = left; j < right; j++) {
    if (array[j] < pivot) {
      i++;
      let temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
  }

  let temp = array[i + 1];
  array[i + 1] = array[right];
  array[right] = temp;

  return i + 1;
}
