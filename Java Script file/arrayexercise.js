
const numbers = [40, 50, 30, 60, 90]; 

for (let index = 0; index < numbers.length; index++) {
  for (let count = index + 1; count < numbers.length; count++) {
if (numbers[index] + numbers[count] === 90) {
      console.log(index, count);
    }
  }
}

