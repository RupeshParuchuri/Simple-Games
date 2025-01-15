'''
PBM Project
12/02/2022
Rupesh Paruchuri
'''
#still a work in progress
import time, random, os


def exits():
 print("\nBye, bye!")
 exit()

def rules(start, chName):
 print("_______________________________________________________________________________________________________________________")
 print("\nThis is a text-based [REDACTED]! Just enter the number next to the decision or you can enter the decision itself!")
 print("Enter 'exit' anytime to quit the game if you like!")
 print("This is a pretty diverse (I think) game that is still in work.")
 print("Make your input/output window VERY BIG!")
 print("Created by Rupesh Paruchuri!")
 print("\nWould you ike to start now?")
 print(" 1: yes")
 print(" 2: no")
 while True:
  playyesorNo = input(" ?: ").lower()
  if playyesorNo == 'yes' or playyesorNo == 'y' or playyesorNo == 'begin' or playyesorNo == '1' or playyesorNo.startswith('y'): 
   game(playyesorNo,chName)
   break
  elif playyesorNo == 'no' or playyesorNo == 'n' or playyesorNo == '2' or playyesorNo.startswith('n'):
   print("\nToo bad for you...")
   exit()
   break
  elif playyesorNo == 'exit' or playyesorNo == 'e' or playyesorNo == 'leave' or playyesorNo.startswith('e') or playyesorNo == '3':
   exits()
  else:
   print("Enter either YES or NO!")
 '''
 while True:
  playyesorNo = input("\nWould you like to start now?: ").lower()
  if playyesorNo == 'yes' or playyesorNo == 'y' or playyesorNo == 'begin': 
    game(start,chName)
    break
  elif playyesorNo == 'no' or playyesorNo == 'n':
    print("\nToo bad for you...")
    exit()
  else:
    print("Enter either YES or NO!")
 '''

def game(start,chName):

 def ded():
  print('\n*****************************************************************************************************')
  print('*                                         YOU DIED                                                  *')
  print('*****************************************************************************************************')
 
 def character(chName):
  print("_______________________________________________________________________________________________________________________")
  print("\nWhich character type would you like?")
  print(" 1: Depressed nerd in school.")
  print(" 2: Psychopath")
  print(" 3: Exit game!")
  chType = input(" ?: ").lower()
 
  if chType == '1' or chType == 'depressed nerd in school' or chType=='depressed'or chType == 'depressed nerd' or chType == 'nerd in school' or chType == 'nerd' or chType == 'school nerd' or chType.startswith('d') or chType.startswith('n'):
   depressedNerd()
  elif chType == '2' or chType == 'psychopath' or chType == 'psycho' or chType.startswith('p'):
   psychopath(chName)
  elif chType == '3' or chType == 'exit' or chType == 'exit game' or chType == 'e' or chType == 'game' or chType.startswith('e') or chType.startswith('q'):
   print("_______________________________________________________________________________________________________________________")
   print("\nToo bad! I'd better watch out if I were you...")
   exit()
 
 def depressedNerd():
  print("_____________________________________________________________________________________________________")
  print("\nYou wake up to a series of vibrations from your watch. It's 6:50 AM! You want to...")
  print(" 1: sleep for 10 more minutes")
  print(" 2: wake up")
  wakeupDecision = input(" ?: ").lower()
  if wakeupDecision == '1' or wakeupDecision == 'sleep' or wakeupDecision == 'sleep for 10 more minutes' or wakeupDecision == 'sleep for 10 minutes':
   print("_____________________________________________________________________________________________________")
   print("\nYou snooze your watch...")
   time.sleep(1.5)
   print("and suddenly get woken up again by your watch! It's already 7?! It felt like a second.")
   print("Then it hits you all at once! Today's the first day of school!")
   time.sleep(2)
   print("_____________________________________________________________________________________________________")
   print("\nYou groggily wake up, cursing 'someday...'...")
   print(" 1: go brush and take a shower")
   print(" 2: pack your backpack")
   print(" 3: go jump out your house because school starts today")
   showerpack = input(" ?: ").lower()
   if showerpack == '1' or showerpack == 'brush' or showerpack=='shower' or showerpack=='brush and shower' or showerpack=='go brush and take a shower':
    print("\n_____________________________________________________________________________________________________")
    print("\nYou speedrun your brushing and strip down to shower. You realize you have morning wood and nvm...\nYou speedrun your shower as well, thoroughly enjoying the hot water that contrasts with your room. ")
    print("What do you want to wear?: ")
    print(" 1: some clothes")
    print(" 2: go naked")
    wear = input(" ?: ").lower()
    if wear == '1' or wear == 'some clothes' or wear == 'clothes':
     print("\n_____________________________________________________________________________________________________")
     print("\nYou wear your clothes, pack your backpack, and go down to eat your breakfast.")
     print("You finish breakfast and wear your new Under Armour shoes.")
     print("As you are arriving at the bus stop, you see a person that looks like you. Do you dare to talk to him?")
     print(" 1: talk")
     print(" 2: stay quiet")
     talk = input(" ?: ").lower()
     if talk == '1' or talk == 'talk':
      print("\nYou struck up quite a conversation with Viraj! He likes to play video games just like you among other things. You are similar!")
      time.sleep(2.5)
      print("\nThe bus finally comes after a long time of waiting!\nThe journey to school seems like blur, until you get to your first class, Chemistry Honors.")
      print("The teacher's name is [REDACTED] and she looks not very nice.")
      print("\n_____________________________________________________________________________________________________")
      print("\nNext class, Python Programming.")
      print("\n_____________________________________________________________________________________________________")
      print("\nYou make it through your classes and get a load of homework!")
      print("You don't notice the truck that is coming down the road as you walk back home and it flattens you!")
      ded()
     elif talk == '2' or talk == 'stay quiet' or talk == 'quiet' or talk.startswith('q'):
      print("\nYou just stay quiet, taking in the sunshine.")
      time.sleep(2)
      print("It seems like forever, but the bus finally arrives.")
      print("The teacher's name is [REDACTED] and she looks not very nice.")
      print("\n_____________________________________________________________________________________________________")
      print("\nNext class, Python Programming.")
      print("\n_____________________________________________________________________________________________________")
      print("\nYou make it through your classes and get a load of homework!")
      print("You don't notice the truck that is coming down the road as you walk back home.")
      ded()
     elif talk == '3' or talk == 'quit' or talk == 'exit' or talk == 'leave' or talk.startswith('e'):
      exits()
    elif wear == '2' or wear == 'go naked' or wear == 'naked':
     print("Your mom sees you as you come down, she dies of a heart attack. The FBI bust through your door and gun you down!")
     ded()
    elif wear == '3' or wear == 'exit' or wear == 'e' or wear.startswith('e'):
     exits()
   elif showerpack == '2' or showerpack =='pack backpack' or showerpack=='pack' or showerpack=='backpack' or showerpack== 'pack your backpack':
    print("\n_____________________________________________________________________________________________________")
    print("\nYou speedrun your brushing and strip down to shower. You realize you have morning wood and nvm...\nYou speedrun your shower as well, thoroughly enjoying the hot water that contrasts with your room. ")
    print("\n_____________________________________________________________________________________________________")
    print("\nWhat do you want to wear?: ")
    print(" 1: some clothes")
    print(" 2: go naked")
    wear = input(" ?: ").lower()
    if wear == '1' or wear == 'some clothes' or wear == 'clothes':
     print("\n_____________________________________________________________________________________________________")
     print("\nYou wear your clothes and go down to eat your breakfast.")
     print("You finish breakfast and wear your new Under Armour shoes.")
     print("As you are arriving at the bus stop, you see a person that looks like you. Do you dare to talk to him?")
     print(" 1: talk")
     print(" 2: stay quiet")
     talk = input(" ?: ").lower()
     if talk == '1' or talk == 'talk':
      print("_____________________________________________________________________________________________________")
      print("\nYou struck up quite a conversation with Viraj! He likes to play video games just like you among other things. You are similar!")
      time.sleep(2.5)
      print("The bus finally comes after a long time of waiting!\nThe journey to school seems like blur, until you get to your first class, Chemistry Honors.")
      print("The teacher's name is [REDACTED] and she looks not very nice.")
      print("\n_____________________________________________________________________________________________________")
      print("\nNext class, Python Programming.")
      print("\n_____________________________________________________________________________________________________")
      print("\nYou make it through your classes and get a load of homework!")
      print("You don't notice the truck that is coming down the road as you walk back home.")
      ded()
     elif talk == '2' or talk == 'stay quiet' or talk == 'quiet' or talk.startswith('q'):
      print("You just stay quiet, taking in the sunshine.")
      time.sleep(2)
      print("It seems like forever, but the bus finally arrives.\nThe journey to school seems like a blur until you get to your first class, Chemistry Honors!")
      print("The teacher's name is [REDACTED] and she looks not very nice.")
      print("\n_____________________________________________________________________________________________________")
      print("\nNext class, Python Programming.")
      print("\n_____________________________________________________________________________________________________")
      print("\nYou make it through your classes and get a load of homework!")
      print("You don't notice the truck that is coming down the road as you walk back home.")
      ded()
     elif talk == '3' or talk == 'exit' or talk == 'quit':
      exits()
    elif wear == '2' or wear == 'go naked' or wear == 'naked':
     print("Your mom sees you as you come down, she dies of a heart attack. The FBI bust through your door and gun you down!")
     ded()
    elif wear == '3' or wear == 'exit' or wear == 'e' or wear.startswith('e'):
     exits()
   elif showerpack == '3' or showerpack == 'go jump our your house because school starts today' or showerpack == 'jump' or showerpack == 'school starts today':
    print("\nYou try to jump out the window, but it is very sturdy and you flatten your entire body. ")
    print("You never got to commit that sinister act you thought you were going to do...")
    ded()
   elif showerpack == '4' or showerpack == 'exit' or showerpack == 'exit game' or showerpack == 'e' or showerpack.startswith('e'):
    exits()
  elif wakeupDecision == '2' or wakeupDecision == 'wake' or wakeupDecision == 'wake up':
   print("_____________________________________________________________________________________________________")
   print("\nYou snooze your watch...")
   print("It hits you all at once! Today's the first day of school!")
   time.sleep(1)
   print("_____________________________________________________________________________________________________")
   print("\nYou groggily wake up, cursing 'someday...'...")
   print(" 1: go brush and take a shower")
   print(" 2: pack your backpack")
   print(" 3: go jump out your house because school starts today")
   showerpack = input(" ?: ").lower()
   if showerpack == '1' or showerpack == 'brush' or showerpack=='shower' or showerpack=='brush and shower' or showerpack=='go brush and take a shower':
    print("\n_____________________________________________________________________________________________________")
    print("\nYou speedrun your brushing and strip down to shower. You realize you have morning wood and nvm...\nYou speedrun your shower as well, thoroughly enjoying the hot water that contrasts with your room. ")
    print("What do you want to wear?: ")
    print(" 1: some clothes")
    print(" 2: go naked")
    wear = input(" ?: ").lower()
    if wear == '1' or wear == 'some clothes' or wear == 'clothes':
     print("\nYou wear your clothes, pack your backpack, and go down to eat your breakfast.")
     print("You finish breakfast and wear your new Under Armour shoes.")
     print("As you are arriving at the bus stop, you see a person that looks like you. Do you dare to talk to him?")
     print(" 1: talk")
     print(" 2: stay quiet")
     talk = input(" ?: ").lower()
     if talk == '1' or talk == 'talk':
      print("\nYou struck up quite a conversation with Viraj! He likes to play video games just like you among other things. You are similar!")
      time.sleep(2.5)
      print("\nThe bus finally comes after a long time of waiting!\nThe journey to school seems like blur, until you get to your first class, Chemistry Honors.")
      print("The teacher's name is [REDACTED] and she looks not very nice.")
      print("\n_____________________________________________________________________________________________________")
      print("\nNext class, Python Programming.")
      print("\n_____________________________________________________________________________________________________")
      print("\nYou make it through your classes and get a load of homework!")
      print("You don't notice the truck that is coming down the road as you walk back home and it flattens you!")
      ded()
     elif talk == '2' or talk == 'stay quiet' or talk == 'quiet' or talk.startswith('q'):
      print("You just stay quiet, taking in the sunshine.")
      time.sleep(2)
      print("It seems like forever, but the bus finally arrives.")
      print("The teacher's name is [REDACTED] and she looks not very nice.")
      print("\n_____________________________________________________________________________________________________")
      print("\nNext class, Python Programming.")
      print("\n_____________________________________________________________________________________________________")
      print("\nYou make it through your classes and get a load of homework!")
      print("You don't notice the truck that is coming down the road as you walk back home.")
      ded()
     elif talk == '3' or talk == 'quit' or talk == 'exit' or talk == 'leave' or talk.startswith('e'):
      exits()
    elif wear == '2' or wear == 'go naked' or wear == 'naked':
     print("Your mom sees you as you come down, she dies of a heart attack. The FBI bust through your door and gun you down!")
     ded()
    elif wear == '3' or wear == 'exit' or wear == 'e' or wear.startswith('e'):
     exits()
   elif showerpack == '2' or showerpack =='pack backpack' or showerpack=='pack' or showerpack=='backpack' or showerpack== 'pack your backpack':
    print("\n_____________________________________________________________________________________________________")
    print("You pack your backpack filling it with very suggestive material! ")
    print("\nYou speedrun your brushing and strip down to shower. You realize you have morning wood and nvm...\nYou speedrun your shower as well, thoroughly enjoying the hot water that contrasts with your room. ")
    print("\n_____________________________________________________________________________________________________")
    print("\nWhat do you want to wear?: ")
    print(" 1: some clothes")
    print(" 2: go naked")
    wear = input(" ?: ").lower()
    if wear == '1' or wear == 'some clothes' or wear == 'clothes':
     print("\n_____________________________________________________________________________________________________")
     print("\nYou wear your clothes and go down to eat your breakfast.")
     print("You finish breakfast and wear your new Under Armour shoes.")
     print("As you are arriving at the bus stop, you see a person that looks like you. Do you dare to talk to him?")
     print(" 1: talk")
     print(" 2: stay quiet")
     talk = input(" ?: ").lower()
     if talk == '1' or talk == 'talk':
      print("_____________________________________________________________________________________________________")
      print("\nYou struck up quite a conversation with Viraj! He likes to play video games just like you among other things. You are similar!")
      time.sleep(2.5)
      print("The bus finally comes after a long time of waiting!\nThe journey to school seems like blur, until you get to your first class, Chemistry Honors.")
      print("The teacher's name is [REDACTED] and she looks not very nice.")
      print("\n_____________________________________________________________________________________________________")
      print("\nNext class, Python Programming.")
      print("\n_____________________________________________________________________________________________________")
      print("\nYou make it through your classes and get a load of homework!")
      print("You don't notice the truck that is coming down the road as you walk back home.")
      ded()
     elif talk == '2' or talk == 'stay quiet' or talk == 'quiet' or talk.startswith('q'):
      print("You just stay quiet, taking in the sunshine.")
      time.sleep(2)
      print("It seems like forever, but the bus finally arrives.\nThe rest is a blur. You get to your first class, Chemistry Honors.")
      print("The teacher's name is [REDACTED] and she looks not very nice.")
      print("\n_____________________________________________________________________________________________________")
      print("\nNext class, Python Programming.")
      print("\n_____________________________________________________________________________________________________")
      print("\nYou make it through your classes and get a load of homework!")
      print("You don't notice the truck that is coming down the road as you walk back home.")
      ded()
     elif talk == '3' or talk == 'quit' or talk == 'exit' or talk == 'leave' or talk.startswith('e'):
      exits()
    elif wear == '2' or wear == 'go naked' or wear == 'naked':
     print("Your mom sees you as you come down, she dies of a heart attack. The FBI bust through your door and gun you down!")
     ded()
    elif wear == '3' or wear == 'exit' or wear == 'e' or wear.startswith('e'):
     exits()
   elif showerpack == '3' or showerpack == 'go jump our your house because school starts today' or showerpack == 'jump' or showerpack == 'school starts today':
    print("\nYou try to jump out the window, but it is very sturdy and you flatten your entire body. ")
    print("You never got to commit that sinister act you thoguht you were going to...")
    ded()
   elif showerpack == '4' or showerpack == 'exit' or showerpack == 'exit game' or showerpack == 'e' or showerpack.startswith('e'):
    exits()
  elif wakeupDecision == '3' or wakeupDecision == 'exit' or wakeupDecision == 'exit game' or wakeupDecision == 'game':
   exits()
  elif wakeupDecision == '':
   print("\nYou died of a brain attack because you took too long to take your decisions. ")
   ded()
 
 def psychopath(chName):
  print("\n_____________________________________________________________________________________________________")
  print("Hello",chName.capitalize() +'!')
  print("You are a world-class psychopath who has escaped from Alcatraz and now are on the hunt for your next victim.")
  print("What do you want to do?")
  print(" 1: eliminate")
  print(" 2: torture")
  psycho = input(" ?: ").lower()
  if psycho == '1' or psycho == 'kill' or psycho == 'k' or psycho.startswith('k') or psycho == 'one':
   print("\n_____________________________________________________________________________________________________")
   print("\nYou set your sights on a 16 year old nerd who seems depressed.")
   print("You find a truck and run down the little tiny-tot...")
  elif psycho == '2' or psycho == 'torture' or psycho == 't' or psycho.startswith('t') or psycho == 'two':
   print("\n_____________________________________________________________________________________________________")
   print("\nYou set your sights on a 16 year old nerd who seems depressed.")
   print("You find him, kidnap him, and start to torture him. That eventually kills him.")
  elif psycho == '3' or psycho == 'exit' or psycho == 'quit' or psycho.startswith('e') or psycho.startswith('q'):
   exits()

 if start == '1' or start == 'play' or start == 'p' or start.startswith('p') or start == 'y' or start == 'yes' or start == 'begin' or start.startswith('y'): 
  character(chName)
 elif start == '3' or start == 'exit' or start == 'e' or start.startswith('e'):
  print("_______________________________________________________________________________________________________________________")
  print("\nI'd watch out if I were you...\r")
  exit()

#______________________________________________________________________________________________________________________________________________________________________________

print("Welcome to [REDACTED] game!")
print("\nPlease make your input/output window VERY BIG for optimal performance!")
print("\nWould you like to begin?")
print(" 1: PLAY")
print(" 2: HOW TO PLAY")
print(" 3: EXIT")
begin = input(" ?: ").lower()
if begin == '1' or begin == 'play' or begin == 'p' or begin.startswith('p'): 
 name = input("\nEnter character name: ").capitalize()
 game(begin,name)
elif begin == '2' or begin =='how to play' or begin == 'rules':
 name = input("\nEnter character name: ").capitalize()
 rules(begin,name)
elif begin == '3' or begin == 'exit' or begin == 'e'  or begin.startswith('e'):
 print("_______________________________________________________________________________________________________________________")
 print("\nI'd watch out if I were you...\r")
 exit()
else:
 print("\nEnter the corresponding number or the word next to it.")
 exit()


















