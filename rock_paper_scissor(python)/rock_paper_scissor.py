# Rock Paper Scissors Game (Using Random Module)

import random
l = ["rock","scissor","paper"]

#     rock vs paper -> paper wins
#     rock vs scissor -> rock wins
#     paper vs scissor -> scissor wins

while True:
    ccount = 0
    ucount = 0
    uc = int(input('''
                        Game Start.......
                        1 Yes
                        2 No | Exit
                    '''))

    if uc == 1:
        for a in range(1,6):
            userInput = int(input('''
                                    1 Rock
                                    2 Scissor
                                    3 Paper
                                '''))
            if userInput == 1:
                Uchoice = "rock"
            elif userInput == 2:
                Uchoice = "scissor" 
            elif userInput == 3:
                Uchoice = "paper"

            Cchoice = random.choice(l)
            
            if Cchoice == Uchoice:
                print("Computer Value",Cchoice)
                print("User Value",Uchoice)
                print("Game Draw")
                ucount = ucount + 1
                ccount = ccount + 1
            elif (Uchoice == "rock" and Cchoice == "scissor") or (Uchoice == "paper" and Cchoice == "rock") or (Uchoice == "scissor" and Cchoice == "paper"):
                print("Computer Value",Cchoice)
                print("User Value",Uchoice)
                print("You Win")
                ucount = ucount + 1
            else:
                print("Computer Value",Cchoice)
                print("User Value",Uchoice)
                print("Computer Win")
                ccount = ccount + 1

        if ucount == ccount:
            print("\nFinal Game Draw...")
            print("User Score",ucount)
            print("Computer Score",ccount)
        elif ucount > ccount:
            print("\nFinal You Win the Game...")
            print("User Score",ucount)
            print("Computer Score",ccount)
        else:
            print("\nFinal Computer Win the Game...")
            print("User Score",ucount)
            print("Computer Score",ccount)

    else:
        break