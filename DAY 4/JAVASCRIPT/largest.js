
let[] numbers = {14,9,6,5,8,10};


function getLargest(numbers){
largest = 0;
for(let count = 0; count < numbers.length; count++){
if(numbers[count] > largest){
largest = numbers[count];
}
}
return largest;
}
console.log("largest" + largest);

function getSmallest(numbers){
smallest = 0;
for(let count = 0; count < numbers.length; count++){
if(numbers[count] < smallest){
smallest = numbers[count];
}

}
return smallest;
}

console.log("Smallest: " + smallest);
function getSorted(numbers){
let length = numbers.length;

for(let count = 0; count < length - 1; count ++){
let smallest = count;
   for(let row = count +1; row < length; row++){
   if(numbers[row] < numbers[smallest]){
            smallest = row;
   }
   } 
   let temp = numbers[count];
   numbers[count] = numbers[smallest];
   numbers[smallest] = temp; 
}
return numbers;
}
}
