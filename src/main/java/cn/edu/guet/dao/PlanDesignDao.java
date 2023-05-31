package cn.edu.guet.dao;

import cn.edu.guet.bean.PlanDesigninfo;

import java.util.List;

public interface PlanDesignDao extends BaseDao<PlanDesigninfo>{
    List<String> getPlanBillNo();


}
