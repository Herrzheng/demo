package com.moistwind.demo.dao;

import com.moistwind.demo.entity.Area;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
class AreaDaoTest {
    @Autowired
    AreaDao areaDao;
    @Test
    @Ignore
    void queryArea() {
//        List<Area> areaList = areaDao.queryArea();
//        assertEquals(2,areaList.size());
    }

    @Test
    void queryAreaById() {
//        Area area = areaDao.queryAreaById(1);
//        assertEquals("东苑",area.getAreaName());
    }

    @Test
    void insertArea() {
//        Area area = new Area();
//        area.setAreaName("南苑");
//        area.setPriority(1);
//        int effectedNum = areaDao.insertArea(area);
//        assertEquals(1,effectedNum);
    }

    @Test
    @Ignore
    void updateArea() {
//        Area area = new Area();
//        area.setAreaName("西苑");
//        area.setAreaId(3);
//        area.setLastEditTime(new Date());
//        int effectedNum = areaDao.updateArea(area);
//        assertEquals(1,effectedNum);
    }

    @Test
    void deleteArea() {
//       int effectNum = areaDao.deleteArea(3);
//       assertEquals(1,effectNum);
    }
}