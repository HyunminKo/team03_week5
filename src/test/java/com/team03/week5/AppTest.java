package com.team03.week5;
import static org.junit.Assert.*;
import org.junit.*;

public class AppTest 
{
	User user;
	PlanType planType;
	TotalRate totalRate;
   
	@Test
    public void setUp()
    {
        user = new User();
        planType = new Gold();
        totalRate = new TotalRate();
    }
	@Test
	public void UserSmallGold()
	{
		setUp();
		user.setPlanTypeName("gold");
		assertEquals("gold", user.getPlanTypeName());
	}
   @Test
   public void UserBigGold()
   {
	   setUp();
       user.setPlanTypeName("Gold");
       assertEquals("Gold", user.getPlanTypeName());
   }
   @Test
	public void UserSmallSilver()
	{
		setUp();
		user.setPlanTypeName("silver");
		assertEquals("silver", user.getPlanTypeName());
	}
  @Test
  public void UserBigSilver()
  {
	   setUp();
      user.setPlanTypeName("Silver");
      assertEquals("Silver", user.getPlanTypeName());
  }
   
 
   @Test
   public void UserGoldBill()
   {
	   setUp();
       user.setPlanTypeName("Gold");
       user.setNumberOfLines(1);
       user.setMinutesUsed(500);
       assertEquals(49.95, totalRate.getTotalRate(),0.01);
   }
   @Test
   public void UserGoldAddLine()
   {
	   setUp();
       user.setPlanTypeName("Gold");
       user.setNumberOfLines(2);
       user.setMinutesUsed(500);
       assertEquals(64.45, totalRate.getTotalRate(),0.01);
   }
   @Test
   public void UserGoldAddLines()
   {
	   setUp();
       user.setPlanTypeName("Gold");
       user.setNumberOfLines(4);
       user.setMinutesUsed(500);
       assertEquals(83.95, totalRate.getTotalRate(),0.01);
   }
   @Test
   public void UserSilverBill()
   {
	   setUp();
       user.setPlanTypeName("Silver");
       user.setNumberOfLines(1);
       user.setMinutesUsed(250);
       assertEquals(29.95, totalRate.getTotalRate(),0.01);
   }
   @Test
   public void UserSilverAddLine()
   {
	   setUp();
       user.setPlanTypeName("Silver");
       user.setNumberOfLines(2);
       user.setMinutesUsed(250);
       assertEquals(54.45, totalRate.getTotalRate(),0.01);
   }
   @Test
   public void UserSilverAddLines()
   {
	   setUp();
       user.setPlanTypeName("Silver");
       user.setNumberOfLines(4);
       user.setMinutesUsed(250);
       assertEquals(77.95, totalRate.getTotalRate(),0.01);
   }
}
