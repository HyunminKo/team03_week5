package com.team03.week5;
import static org.junit.Assert.*;
import org.junit.*;

public class AppTest 

{
   @Test
    public void testApp()
    {
        assertEquals("","" );
    }
   @Test
   public void UserSmallGold()
   {
       User user = new User();
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
}
