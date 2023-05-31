package cn.edu.guet.dao.impl;

import cn.edu.guet.bean.PlanDesigninfo;
import cn.edu.guet.dao.PlanDesignDao;
import cn.edu.guet.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PlanDesignDaoImpl
 * @Description TODO
 * @Author 1475
 * @Date 2023/5/29 21:39
 * @Version 1.0
 */

public class PlanDesignDaoImpl extends BaseDaoImpl<PlanDesigninfo> implements PlanDesignDao {
    @Override
    public List<String> getPlanBillNo() {
        Connection conn= DBConnection.getConn();
        String sql=" SELECT plan_bill_no  FROM plandesigninfo ORDER BY plan_bill_no DESC";
        List<String> planBillNumbers=new ArrayList<>();
            PreparedStatement pstmt=null;
        try {
            pstmt=conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet rs= null;
        try {
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

            while(true)
            {
                try {
                    if (!rs.next()) break;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                String planBillno= null;
                try {
                    planBillno = rs.getString(1);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                planBillNumbers.add(planBillno);
            }


        return planBillNumbers;
    }
}
