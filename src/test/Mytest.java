package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.player.controller.UserController;
import com.player.model.User;
import com.player.service.Impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath*:**/applicationContext.xml"})  
public class Mytest {
	@Test
	public void test01(){
		UserController userController=new UserController();
		
		System.out.println(userController.userIsExist(new User()));
	}
}
