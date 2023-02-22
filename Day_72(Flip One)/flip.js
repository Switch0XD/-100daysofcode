function flipAndFind(arr, memo = {}) {
  const key = arr.toString(); // Use the array as the key for memoization

  // Return the memoized result if it exists
  if (memo.hasOwnProperty(key)) {
    return memo[key];
  }

  const n = arr.length;
  let maxSquare = 0;

  if (n === 1) {
    maxSquare = arr[0][0] === 0 ? 1 : 0;
  } else {
    // Recursively find the longest square of 1's after flipping a bit
    for (let i = 0; i < n; i++) {
      for (let j = 0; j < n; j++) {
        if (arr[i][j] === 0) {
          arr[i][j] = 1;
          maxSquare = Math.max(maxSquare, flipAndFind(arr, memo));
          arr[i][j] = 0;
        }
      }
    }

    // Find the longest square of 1's without flipping a bit
    let squareSize = 0;
    for (let i = 0; i < n; i++) {
      let count = 0;
      for (let j = 0; j < n; j++) {
        if (arr[i][j] === 1) {
          count++;
        } else {
          count = 0;
        }
        squareSize = Math.max(squareSize, count);
      }
    }
    maxSquare = Math.max(maxSquare, squareSize);
  }

  // Memoize the result before returning it
  memo[key] = maxSquare;
  return maxSquare;
}


