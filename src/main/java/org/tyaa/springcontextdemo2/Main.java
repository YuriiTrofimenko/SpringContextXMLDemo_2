package org.tyaa.springcontextdemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tyaa.springcontextdemo2.builder.Unit;
import org.tyaa.springcontextdemo2.implementations.House;
import org.tyaa.springcontextdemo2.implementations.WarriorPool;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context =
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		/*Unit warriorUnit = (Unit) context.getBean("warrior_unit");
		Unit peasantUnit = (Unit) context.getBean("peasant_unit");
		
		warriorUnit.show();
		warriorUnit.testActions();
		
		peasantUnit.show();
		peasantUnit.testActions();*/
		
		/* Inheritance */
		
		/*Unit rusL3WarriorUnit = (Unit) context.getBean("russian_l3_warrior_unit");
		rusL3WarriorUnit.show();
		rusL3WarriorUnit.testActions();*/
		
		/*Unit rusL4WarriorUnit = (Unit) context.getBean("russian_l4_warrior_unit");
		rusL4WarriorUnit.show();
		rusL4WarriorUnit.testActions();*/
		
		/* Method injection */
		
		/*House house = (House) context.getBean("house");
		//Unit warriorUnit = house.createUnit();
		Unit peasantUnit = house.createUnit();
		Unit peasantUnit2 = house.createUnit();
		System.out.println(peasantUnit);
		System.out.println(peasantUnit2);
		peasantUnit.testActions();
		peasantUnit2.testActions();*/
		
		/* Pool */
		
		//WarriorPool warriorPool = (WarriorPool)context.getBean("warriorPool");
		//warriorPool.testActions();
		//warriorPool.show();
		
		/* Autowire */
		
		Unit rusL3WarriorUnit = (Unit) context.getBean("russian_l3_warrior_unit");
		rusL3WarriorUnit.show();
		rusL3WarriorUnit.testActions();
		
		//Unit warriorUnit = (Unit) context.getBean("warrior_unit");
	}

}
