import dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/7/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;
    @Test
    public void testUpdateUser() throws Exception {
        int updateResult= userDao.updateUserHeadImg(120,"11223");
        System.out.println(updateResult);
    }

    @Test
    public void testSelectUserById() throws Exception {
        System.out.println(userDao.selectUserById(120));
    }

    @Test
    public void testUpdateUser1() throws Exception {
        int testResult = userDao.updateUser(125,"史哥来啦更新","1151650717@qq.comyyyy","美国","我是史哥");
        System.out.println(testResult);
    }
}