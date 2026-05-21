

def get_Largest(numbers):
    largest = 0;
for count in numbers:
     if(numbers[count] > largest):
        largest = numbers[count];


return largest;



def get_Smallest(numbers):
    smallest = 0;
for count in numbers:
    if(numbers[count] < smallest):
        smallest = numbers[count];



return smallest;

def get_Sorted(numbers):
    length = numbers.length;

for count in numbers:
    smallest = count;
    for row in count +1 in row < length:
        if(numbers[row] < numbers[smallest]):
            smallest = row;
   
    
temp = numbers[count];
numbers[count] = numbers[smallest]
numbers[smallest] = temp; 

return numbers


