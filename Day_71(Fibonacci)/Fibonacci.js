function fibonaciGerator(n) {
  output = [];
  if (n === 0) {
    output = [0];
  }
  else if (n === 2) {
    output = [0, 1];
  } else {
    output = [0, 1];
    for (let i = 2; i < n; i++) {
      output.push(output[output.length - 2] + output[output.length - 1]);
    }
  }
  console.log(output);
}
fibonaciGerator(245);