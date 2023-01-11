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
   * < For confirming that the a feature is done and can be delivered for good, I must run some checks and see if it there's a bugs coming up. For F01, I will create a simulator to check how many times and a faces has appeared. F02, this I just have to check if the right amount of dices is rolled each time.  >

### Backlog 

| MVP? | Id  | Feature  | Status  |  Started  | Delivered |
| :-:  |:-:  |---       | :-:     | :-:       | :-:       |
| x   | F01 | Roll a dice |  D | 01/01/23 |  |
| x   | F02 | Roll eight dices  |  P |  10/01/23 |
| x   | F03 | Select how many games as command-line arg.  |  P  |   |
| x   | F04 | end of game with three skulls | P | |
| x   | F05 | Player keeping random dice at their turn | B (F02) | | 
| x   | F06 | Score points: Rolling Gold coinds or diamonds and multiplying by 100| B (F04) | | 
| ... | ... | ... |

