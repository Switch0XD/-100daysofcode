function canJump(nums) {
  // Initialize the furthest reachable index to be the first index
  let furthestIndex = 0;

  // Iterate through each index of the array
  for (let i = 0; i < nums.length; i++) {
    // If the current index is beyond the furthest reachable index, return false
    if (i > furthestIndex) {
      return false;
    }

    // Update the furthest reachable index
    furthestIndex = Math.max(furthestIndex, i + nums[i]);
  }

  // If we made it to the end of the array, return true
  return true;
}

// Read input from standard input
process.stdin.resume();
process.stdin.setEncoding("ascii");
let input = "";
process.stdin.on("data", function (chunk) {
  input += chunk;
});

// Process input and print output
process.stdin.on("end", function () {
  const lines = input.trim().split('\n');
  const nums = lines[1].split(' ').map(Number);
  const result = canJump(nums);
  console.log(result);
});
