# JavaFX_Project2_Fall23


We will implement a one player version of the popular casino game bacarat

How the game is played:

The user will first bid some amount of money on either The Banker to win or The Player to win or it will be a Draw. These are the only three outcomes of the game.

Next, the dealer will deal two cards each to The Banker and The Player. The Player always gets to go first.

For the cards: 10’s and face cards are worth zero points. Ace’s are worth one point and all other cards are worth their face value.

If either The Banker’s hand or The Player’s hand add up to 8 or 9 points, it is a “natural” win and the game is over and bets are paid.

Otherwise, The Player will go first: if hand totals to 5 or less, The Player gets one more card. If the hand totals to 6 or 7 points, no more cards are given.

counting the points: if the total value of the two cards is greater than 9, remove the first number of the total. For example, if I had a 9 and a 6: 9 + 6 = 15 so I would have 5 after dropping the 1.

Next it’s The Banker’s turn: if the bankers first two cards total 7 or more, no more cards are dealt. If The Banker’s cards total 2 or less, The Banker gets one additional card. If The Bankers first two cards total 3, 4, 5, or 6, it depends on if The Player drew another card and if so, the value of that card to determine if The Banker receives another card.

The winning hand is the one with a total of 9 or as close to 9 as possible.
