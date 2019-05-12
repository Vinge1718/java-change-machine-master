public class ChangeMachine {
  private int mQuarters;
  private int mDimes;
  private int mNickels;
  private int mPennies;

  public ChangeMachine() {
    mQuarters = 20;
    mDimes = 20;
    mNickels = 20;
    mPennies = 20;
  }

  public int getQuarters(){
    return mQuarters;
  }

  public int getDimes(){
    return mDimes;
  }

  public int getNickels(){
    return mNickels;
  }

  public int getPennies(){
    return mPennies;
  }

  public int makeQuarterChange(Float totalCash){
    int quarterChangeQuantity = 0;
    while (totalCash >= 0.25f && mQuarters > 0){
      totalCash -= 0.25f;
      quarterChangeQuantity++;
      mQuarters--;
    }
    return quarterChangeQuantity;
  }

  public int makeDimeChange(Float totalCash){
    int dimeChangeQuantity = 0;
    while (totalCash >= 0.10f && mDimes > 0){
      totalCash -= 0.10f;
      dimeChangeQuantity++;
      mDimes--;
    }
    return dimeChangeQuantity;
  }

  public int makeNickelChange(Float totalCash){
    int nickelChangeQuantity = 0;
    while (totalCash >= 0.05f && mNickels > 0){
      totalCash -= 0.05f;
      nickelChangeQuantity++;
      mNickels--;
    }
    return nickelChangeQuantity;
  }

  public int makePennyChange(Float totalCash){
    int pennyChangeQuantity = 0;
    while (totalCash > 0.009f && mPennies > 0){
      pennyChangeQuantity++;
      mPennies--;
      totalCash -= 0.01f;
    }
    return pennyChangeQuantity;
  }

  public String makeChange(Float totalCash){
    int quarterChangeTotal = makeQuarterChange(totalCash);
    float updatedCashTotal = totalCash - (quarterChangeTotal * 0.25f);
    int dimeChangeTotal = makeDimeChange(updatedCashTotal);
    updatedCashTotal -= (dimeChangeTotal * 0.10f);
    int nickelChangeTotal = makeNickelChange(updatedCashTotal);
    updatedCashTotal -= (nickelChangeTotal * 0.05f);
    int pennyChangeTotal = makePennyChange(updatedCashTotal);
    return String.format("Quarters: %d, Dimes: %d, Nickels: %d, Pennies: %d", quarterChangeTotal, dimeChangeTotal, nickelChangeTotal, pennyChangeTotal);
  }

}
