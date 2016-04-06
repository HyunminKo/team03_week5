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
   public void UserSetLine()
   {
	   setUp();
       user.setNumberOfLines(1);
       assertEquals(1, user.getNumberOfLines());
   }
   @Test
   public void UserSetUsedTime()
   {
	   setUp();
       user.setMinutesUsed(500);;
       assertEquals(500, user.getMinutesUsed());
   }
   
   @Test
   public void UserGoldBill()
   {
	   setUp();
       user.setPlanTypeName("Gold");
       user.setNumberOfLines(1);
       user.setMinutesUsed(500);
       planType = new Gold();
       totalRate.calTotalRate(user, planType);
       assertEquals(49.95, totalRate.getTotalRate(),0.01);
   }
   @Test
   public void UserGoldAddLine()
   {
	   setUp();
       user.setPlanTypeName("Gold");
       user.setNumberOfLines(2);
       user.setMinutesUsed(500);
       planType = new Gold();
       totalRate.calTotalRate(user, planType);
       assertEquals(64.45, totalRate.getTotalRate(),0.01);
   }
   @Test
   public void UserGoldAddLines()
   {
	   setUp();
       user.setPlanTypeName("Gold");
       user.setNumberOfLines(4);
       user.setMinutesUsed(500);
       planType = new Gold();
       totalRate.calTotalRate(user, planType);
       assertEquals(83.95, totalRate.getTotalRate(),0.01);
   }
   @Test
   public void UserGoldOverTime()
   {
	   setUp();
       user.setPlanTypeName("Gold");
       user.setNumberOfLines(1);
       user.setMinutesUsed(1300);
       planType = new Gold();
       totalRate.calTotalRate(user, planType);
       assertEquals(184.95, totalRate.getTotalRate(),0.01);
   }
   @Test
   public void UserSilverBill()
   {
	   setUp();
       user.setPlanTypeName("Silver");
       user.setNumberOfLines(1);
       user.setMinutesUsed(250);
       planType = new Silver();
       totalRate.calTotalRate(user, planType);
       assertEquals(29.95, totalRate.getTotalRate(),0.01);
   }
   @Test
   public void UserSilverAddLine()
   {
	   setUp();
       user.setPlanTypeName("Silver");
       user.setNumberOfLines(2);
       user.setMinutesUsed(250);
       planType = new Silver();
       totalRate.calTotalRate(user, planType);
       assertEquals(51.45, totalRate.getTotalRate(),0.01);
   }
   @Test
   public void UserSilverAddLines()
   {
	   setUp();
       user.setPlanTypeName("Silver");
       user.setNumberOfLines(4);
       user.setMinutesUsed(250);
       planType = new Silver();
       totalRate.calTotalRate(user, planType);
       assertEquals(77.95, totalRate.getTotalRate(),0.01);
   }
   @Test
   public void UserSilverOverTime()
   {
	   setUp();
       user.setPlanTypeName("Silver");
       user.setNumberOfLines(1);
       user.setMinutesUsed(1000);
       planType = new Silver();
       totalRate.calTotalRate(user, planType);
       assertEquals(299.95, totalRate.getTotalRate(),0.01);
   }
}
