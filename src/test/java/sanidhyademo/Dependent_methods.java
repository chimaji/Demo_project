package sanidhyademo;

import org.testng.annotations.Test;

public class Dependent_methods {
@Test( dependsOnGroups ={"group1"})
void test1()
{
System.out.println("test 1 executed");	
}

@Test(priority=2, groups= {"group1"})
void test2()
{
System.out.println("test 2 executed");	
}
@Test(priority=3,groups= {"group1"})
void test3()
{
System.out.println("test 3 executed");	
}
@Test(priority=4,groups= {"group1"})
void test4()
{
System.out.println("test 4 executed");	
}



}
