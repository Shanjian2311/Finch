# Finch-Phone Filming holder 
---
This is a finch that designed to be a phone holder, as well as holder for phones to film videos using the Brainbird and Finch2 java ver.
- The holder should be able to hold amoung most cell phones in the market.
- The program had set up a if statement that ***help prevent the holder and the phone hits or falls***
## Example codes:
___
1. Distance safety and back up function
```java
if(f1.getDistance() < 5) {
  f1.setMove("B",10, 10);
  f1.setBeak(100,0,0);
  f1.setTurn("R", 90, 5);
}
  ```
###### Pulling distance as output to check if the distance of the finch is greater or less than 5, if so the finch will go back for 10 distances and turn 90 degree to the Right, as well it lights RED-LED light when processing that.
---
2. Safety stop function
```java
if(f1.getDistance() <= 3) {
  f1.stop();
		}
```
###### If in any case, the finch reach the very end of distance, where the distance is less or equal to 3, then the finch will stop the program.
