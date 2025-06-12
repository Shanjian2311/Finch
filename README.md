# Finch-Phone Filming holder 
---
This is a finch that designed to be a phone holder, as well as holder for phones to film videos using the Brainbird and Finch2 java ver.

 ****The coding program are in [Move.java](https://github.com/Shanjian2311/Finch/blob/main/Move.java) file, other files are import from the finch library***
- The holder should be able to hold amoung most cell phones in the market.
- The program had set up a if statement that ***help prevent the phone holder and the phone itself from hitting or falling***
## Progress Check:
___
| Progress  | Task         | Description |
|:---------:| :-----------:|:------------|
|    ✅     | Familiarize  |  <ul><li>Brainstorming what things my finch will do with the 3D print</li><li>Moving to designing the 3D design</li><li>Setup a local developing environment to code in Java(Eclipse)</li></ul>|
|    ✅     | 3D Design    |      <ul><li>Designed the phone holder</li></ul>       |
|    Processing     | Develop Code |      <ul><li> Coding basic function for the finch, detail codes might be done with the user who use the holder, they decide how the finch will move like.</li></ul>       |
___
### 3D design Demo:
![3D design demo](https://github.com/user-attachments/assets/e8bc0647-5744-4128-ac47-2ae1ed947ebf)
###### Left: Phone holder itself
###### Right: Blocker to make sure the phone fits.
___
## Example codes:

1. Distance safety function
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
