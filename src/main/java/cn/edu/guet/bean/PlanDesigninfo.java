package cn.edu.guet.bean;

/**
 * @ClassName PlanDesigninfo
 * @Description TODO
 * @Author 1475
 * @Date 2023/5/27 15:46
 * @Version 1.0
 */

public class PlanDesigninfo {
    private Long id;
    private String plan_bill_no;
    private String plan_design_name;
    private  String design_company;
    private  String spec_id;
    private  String project_director;
    private  String spec_leader;
    private  String designer;
    private  String reviewer;

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getPlan_bill_no() {
        return plan_bill_no;
    }

    public void setPlan_bill_no(String plan_bill_no) {
        this.plan_bill_no = plan_bill_no;
    }

    public String getPlan_design_name() {
        return plan_design_name;
    }

    public void setPlan_design_name(String plan_design_name) {
        this.plan_design_name = plan_design_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesign_company() {
        return design_company;
    }

    public void setDesign_company(String design_company) {
        this.design_company = design_company;
    }

    public String getSpec_id() {
        return spec_id;
    }

    public void setSpec_id(String spec_id) {
        this.spec_id = spec_id;
    }

    public String getProject_director() {
        return project_director;
    }

    public void setProject_director(String project_director) {
        this.project_director = project_director;
    }

    public String getSpec_leader() {
        return spec_leader;
    }

    public void setSpec_leader(String spec_leader) {
        this.spec_leader = spec_leader;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    @Override
    public String toString() {
        return "PlanDesigninfo{" +
                "id=" + id +
                ", plan_bill_no='" + plan_bill_no + '\'' +
                ", plan_design_name='" + plan_design_name + '\'' +
                ", design_company='" + design_company + '\'' +
                ", spec_id='" + spec_id + '\'' +
                ", project_director='" + project_director + '\'' +
                ", spec_leader='" + spec_leader + '\'' +
                ", designer='" + designer + '\'' +
                ", reviewer='" + reviewer + '\'' +
                '}';
    }
}
