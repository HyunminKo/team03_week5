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
        planType = null;
        totalRate = new TotalRate();
    }
	@Test
	public void UserSmallGold()
	{
		user.setPlanTypeName("gold");
       assertEquals("gold", user.getPlanTypeName());
	}
   @Test
   public void UserBigGold()
   {
       User user = new User();
       user.setPlanTypeName("Gold");
       assertEquals("Gold", user.getPlanTypeName());
   }
   @Test
   public void UserGoldBill()
   {
       User user = new User();
       user.setPlanTypeName("Gold");
       user.setNumberOfLines(1);
       user.setMinutesUsed(500);
       assertEquals("Gold", user.getPlanTypeName());
   }
}
