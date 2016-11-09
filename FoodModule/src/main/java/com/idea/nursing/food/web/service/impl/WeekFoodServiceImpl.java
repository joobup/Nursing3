package com.idea.nursing.food.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.core.util.DateConversion;
import com.idea.nursing.food.web.dao.WeekFoodMapper;
import com.idea.nursing.food.web.dao.myself.WeekFoodMapperMyself;
import com.idea.nursing.food.web.domain.pojo.Dishes;
import com.idea.nursing.food.web.domain.pojo.WeekFood;
import com.idea.nursing.food.web.domain.pojo.WeekFoodExample;
import com.idea.nursing.food.web.domain.vo.SelectVOWeekFood;
import com.idea.nursing.food.web.domain.vo.WeekFoodOneEarlyVO;
import com.idea.nursing.food.web.domain.vo.WeekFoodShowVO;
import com.idea.nursing.food.web.domain.vo.WeekFoodVO;
import com.idea.nursing.food.web.service.WeekFoodService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

import static com.idea.nursing.core.util.DateConversion.getWeekByYearWeek;
import static javafx.scene.input.KeyCode.L;


@Service
public class WeekFoodServiceImpl extends GenericServiceImpl<WeekFood, Long, WeekFoodExample> implements WeekFoodService {
    @Autowired
    private WeekFoodMapper weekfoodDao;
    @Autowired
    private WeekFoodMapperMyself weekFoodMapperMyself;

    @Override
    public GenericDao<WeekFood, Long, WeekFoodExample> getDao() {
        return weekfoodDao;
    }


    public void insert(Date mdate) {
        if (mdate == null) {
            mdate = new Date();
        }

        Calendar cl = Calendar.getInstance();
        cl.setTime(mdate);
        int week = cl.get(Calendar.WEEK_OF_YEAR);
        int b = mdate.getDay();
        Date fdate;

        Long fTime = mdate.getTime() - b * 24 * 3600000;
        for (int a = 1; a <= 7; a++) {
            fdate = new Date();
            fdate.setTime(fTime + (a * 24 * 3600000));
            for (int j = 1; j <= 3; j++) {
                WeekFood weekFood = new WeekFood();
                weekFood.setDishesList("");
                weekFood.setFoodDate(fdate);
                weekFood.setOneEarly((byte) j);
                weekFood.setWeekDate((byte) week);
                weekfoodDao.insert(weekFood);
            }

        }

    }

    @Override
    public WeekFoodShowVO findWeekVO(SelectVOWeekFood selectVOWeekFood) {

        List<WeekFoodVO> weekFoodVOList = weekFoodMapperMyself.findWeekFood(selectVOWeekFood);


        //获取本周时间数组
        Date[] weekDateList = DateConversion.getWeekByYearWeek(selectVOWeekFood.getYear(), selectVOWeekFood.getWeek());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //封装返回数据
        WeekFoodShowVO weekFoodShow = new WeekFoodShowVO();
        weekFoodShow.setWeekStartDate(weekDateList[0]);
        weekFoodShow.setWeekEndDate(weekDateList[6]);
        weekFoodShow.setWeek(selectVOWeekFood.getWeek());

        List<List<WeekFoodOneEarlyVO>> weekFoodOneEarlyVOListList =  new ArrayList<>();
        for (Date date : weekDateList) {

            List<WeekFoodOneEarlyVO> weekFoodOneEarlyVOList = new ArrayList<>();
            for (WeekFoodVO weekFoodVO : weekFoodVOList) {

                if (sdf.format(date).equals(weekFoodVO.getFoodDate())) {
                    WeekFoodOneEarlyVO weekFoodOneEarlyVO = new WeekFoodOneEarlyVO();
                    weekFoodOneEarlyVO.setFoodDate(weekFoodVO.getFoodDate());


                    if (weekFoodVO.getOneEarly() == 1) {
                        Map<String, Object> morningDishes = new HashedMap();
                        morningDishes.put("id", weekFoodVO.getId());
                        morningDishes.put("dishesList", weekFoodVO.getDishesVOList());
                    }
                    if (weekFoodVO.getOneEarly() == 2) {
                        Map<String, Object> noonDishes = new HashedMap();
                        noonDishes.put("id", weekFoodVO.getId());
                        noonDishes.put("dishesList", weekFoodVO.getDishesVOList());
                    }
                    if (weekFoodVO.getOneEarly() == 3) {
                        Map<String, Object> nightDishes = new HashedMap();
                        nightDishes.put("id", weekFoodVO.getId());
                        nightDishes.put("dishesList", weekFoodVO.getDishesVOList());
                    }

                    weekFoodOneEarlyVOList.add(weekFoodOneEarlyVO);

                }

            }

            weekFoodOneEarlyVOListList.add(weekFoodOneEarlyVOList);
        }
        weekFoodShow.setWeekFoodOneEarlyVOs(weekFoodOneEarlyVOListList);
        return weekFoodShow;
    }
}
