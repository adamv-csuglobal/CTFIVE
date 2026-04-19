Pseudocode
Start

Create arraylist for days
Create arraylist for temperature

Store amount of days in the week, sunday to saturday
Prompt user to enter temp
Store days in days list
Store temp in temp list

Utilize Loop until user quits
	Prompt user:
		Enter a day or type week

  IF input is day
		Find index of days in days list
		Display day and its temp

  Else IF input is week
		For day in list
			Display day and temp
		Calculate sum of temps
		Calculate average
		Display weekly average

  Else
		Display: invalid input

End
