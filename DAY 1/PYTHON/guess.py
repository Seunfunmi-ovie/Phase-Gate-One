
import random
wrong = random.randInt(1, 100) + 1
guesses = 0
print("Guess my number between 1 and 100 :")
while guess < 5:  
        guess_number = int(input("Enter your guess: "))
        
        
        if guess_number < 1 or guess_number > 100:
            print("1 - 100 only")
            continue 
guesses += 1  
if guess_number == wrong:
   print("You win")
break
   
elif guess_number > wrong:
   print("Too high. Try again.")
else:  
   print("Too low. Try again.")
   break    
  
        
if(guess == 1):
   print("Lengendary")
                
elif(guess == 2):
    print("Excellent")
elif(guess == 3 and guess == 4):
    print("Good")
elif (guess == 5):
    print("Close")
else:
    print("Better luck")
                
          
    
    
    
    
       
