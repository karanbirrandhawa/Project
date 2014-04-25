/* Problem 1:
 * Find the sum of all the multiples of 3 and 5 below 1000
 *
 */

var sum = 2;

(function fibo(prevNum, currentNum) {
  var newNum = prevNum + currentNum;
  if (newNum >= 4000000) {
    return;
  }
  prevNum = currentNum;
  currentNum = newNum;
  if (newNum % 2 === 0) {
    sum += newNum;
  }
  fibo(prevNum, currentNum);
}( 1, 2));

console.log(sum);