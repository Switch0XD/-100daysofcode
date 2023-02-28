function rotateArray(nums, k) {
  // Get the index to rotate the array
  const index = nums.length - k % nums.length;

  // Rotate the array using Array.prototype.splice()
  nums.splice(0, 0, ...nums.splice(index));

  // Return the rotated array
  return nums;
}

// Read input from standard input (stdin)
process.stdin.resume();
process.stdin.setEncoding('ascii');
let input = '';

process.stdin.on('data', function (chunk) {
  input += chunk;
});

process.stdin.on('end', function () {
  // Split the input into an array of lines
  const lines = input.trim().split('\n');

  // Parse the input
  const n = parseInt(lines[0]);
  const nums = lines[1].split(' ').map(Number);
  const k = parseInt(lines[2]);

  // Rotate the array
  const rotatedArray = rotateArray(nums, k);

  // Print the rotated array
  console.log(rotatedArray.join(' '));
});
