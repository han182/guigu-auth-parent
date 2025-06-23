package com.atguigu.system;

import com.atguigu.model.system.SysRole;
import com.atguigu.system.mapper.SysRoleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SysRoleMapperTest {

    //@Resource
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Test
    public void testSelectList(){
        // 现在 sysRoleMapper 是 null，说明没有正确注入进来
        System.out.println("test");
        List<SysRole> sysRoles = sysRoleMapper.selectList(null);
        //sysRoles.forEach(System.out::println);
        for (SysRole sysRole : sysRoles) {
            System.out.println(sysRole);
        }

    }
}


