factorial(0,1). 

factorial(N,F) :-  
   N>0, 
   N1 is N-1, 
   factorial(N1,F1), 
   F is N * F1.

#factorial(3,What)
#factorial(2,What)
#factorial(1,What)
#factorial(0,What)
#F = 1*1
#F = 2*1*1
#f = 3*2*1*1