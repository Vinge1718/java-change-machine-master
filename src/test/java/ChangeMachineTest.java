import org.junit.*;
import static org.junit.Assert.*;

public class ChangeMachineTest {

  @Test
  public void newChangeMachine_instantiatesCorrectly() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(true, testChangeMachine instanceof ChangeMachine);
  }

  @Test
  public void newChangeMachine_beginsWith20Quarters_20() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(20, testChangeMachine.getQuarters());
  }

  @Test
  public void newChangeMachine_beginsWith20Dimes_20() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(20, testChangeMachine.getDimes());
  }

  @Test
  public void newChangeMachine_beginsWith20Nickels_20() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(20, testChangeMachine.getNickels());
  }

  @Test
  public void newChangeMachine_beginsWith20Pennies_20() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(20, testChangeMachine.getPennies());
  }

  @Test
  public void makeQuarterChange_determinesNumberOfQuartersNeeded_4() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(4, testChangeMachine.makeQuarterChange(1.15f));
  }

  @Test
  public void makeDimeChange_determinesNumberOfDimesNeeded_7() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(7, testChangeMachine.makeDimeChange(0.73f));
  }

  @Test
  public void makeNickelChange_determinesNumberOfNickelsNeeded_6() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(6, testChangeMachine.makeNickelChange(0.33f));
  }

  @Test
  public void makePennyChange_determinesNumberOfPenniesNeeded_11() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(11, testChangeMachine.makePennyChange(0.11f));
  }

  @Test
  public void makeQuarterChange_subtractsQuartersFromTotalWhenGivenAsChange_18() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    testChangeMachine.makeQuarterChange(0.55f);
    assertEquals(18, testChangeMachine.getQuarters());
  }

  @Test
  public void makeDimeChange_subtractsDimesFromTotalWhenGivenAsChange_10() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    testChangeMachine.makeDimeChange(1.05f);
    assertEquals(10, testChangeMachine.getDimes());
  }

  @Test
  public void makeNickelChange_subtractsNickelsFromTotalWhenGivenAsChange_17() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    testChangeMachine.makeNickelChange(0.17f);
    assertEquals(17, testChangeMachine.getNickels());
  }

  @Test
  public void makePennyChange_subtractsPenniesFromTotalWhenGivenAsChange_13() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    testChangeMachine.makePennyChange(0.07f);
    assertEquals(13, testChangeMachine.getPennies());
  }

  @Test
  public void makeChange_accuratelyReturnsAllCoinAmounts_String() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals("Quarters: 8, Dimes: 1, Nickels: 1, Pennies: 3", testChangeMachine.makeChange(2.18f));
  }

  // Since there are only 20 of each coin, one type may run out. More of another coin should be provided in this case.
  @Test
  public void makeChange_providesMoreOfAnotherCoinWhenOneCoinIsOut_String() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals("Quarters: 20, Dimes: 20, Nickels: 5, Pennies: 2", testChangeMachine.makeChange(7.27f));
  }


}
