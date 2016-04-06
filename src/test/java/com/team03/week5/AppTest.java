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
   /*
   @Test
   public void UserGoldBill()
   {
	   setUp();
       user.setPlanTypeName("Gold");
       user.setNumberOfLines(1);
       user.setMinutesUsed(500);
       totalRate.calTotalRate(user, planType);
       assertEquals("Gold", user.getPlanTypeName());
   }
   */
}
