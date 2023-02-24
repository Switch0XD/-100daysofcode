function processData(prices) {
  let minPrice = prices[0];
  let maxProfit = Number.MIN_SAFE_INTEGER;
  for (let i = 1; i < prices.length; i++) {
    let currPrice = prices[i];
    let currProfit = currPrice - minPrice;
    if (currProfit > maxProfit) {
      maxProfit = currProfit;
    }
    if (currPrice < minPrice) {
      minPrice = currPrice;
    }
  }
  return maxProfit > 0 ? maxProfit : 0;
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (prices) {
  _input += prices;
});

process.stdin.on("end", function () {
  console.log(processData(_input.trim().split('\n')[1].split(' ').map(Number)));
});
