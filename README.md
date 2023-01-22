# A1 - Piraten Karpen

  * Author: < Khalid Farag >
  * Email: < faragk1@mcmaster.ca >

## Build and Execution

  * To clean your working directory:
    * `mvn clean`
  * To compile the project:
    * `mvn compile`
  * To run the project in development mode:
    * `mvn -q exec:java` (here, `-q` tells maven to be _quiet_)
  * To package the project as a turn-key artefact:
    * `mvn package`
  * To run the packaged delivery:
    * `java -jar target/piraten-karpen-jar-with-dependencies.jar` 

Remark: **We are assuming here you are using a _real_ shell (e.g., anything but PowerShell on Windows)**

## Feature Backlog

 * Status: 
   * Pending (P), Started (S), Blocked (B), Done (D)
 * Definition of Done (DoD):
   * < For confirming that a feature is done and can be delivered for good, I must run some checks and see if it there's a bugs coming up. For F01, I will create a simulator to check how many times and a faces has appeared. F02, this I just have to check if the right amount of dices is rolled each time.  >

### Backlog 

| MVP? | Id  | Feature  | Status  |  Started  | Delivered |
| :-:  |:-:  |---       | :-:     | :-:       | :-:       |
| x   | F01 | Roll eight dices  |  D |  12/01/23 |
| x   | F02 | Keep track of points  |  D |  12/01/23 |
| x   | F03 | end of turn when three skulls are rolled | S | 10/12/23 |
| x   | F04 | Introduce the combo startegy | S | 10/12/23 |
| x   | F05[F03] | Caclculate how many of each faces are rolled | S | 10/12/23 |
| x   | F06 | Optimize to keep the the dice that will lead to highest points| S | 10/12/23 |
| x   | F07 | Reroll the random amount of dice subtracting the skulls rolled and the dices that are kept |  D |  12/01/23 |
| x   | F08 | Score points: Rolling Gold coins or diamonds| S | 11/12/23 | 
| x   | F09 | Keep rerolling if the points score isnt greater or equal to 6000| S | 11/12/23 | 
| x   | F10 | 42 games are played.  |  D  | 12/01/23 |
| x   | F12 | Calculate the stdout of the wins after all the games has been played  |  D |  12/01/23 |
| x   | F13 | Set up the games for two players  |  D |  12/01/23 |
| x   | F14 | Player wins, if they have more points(greater than 6000)| S | 11/12/23 | 
| ... | ... | ... |

