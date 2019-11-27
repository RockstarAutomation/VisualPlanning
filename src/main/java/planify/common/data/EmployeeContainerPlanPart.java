package planify.common.data;

import java.util.List;

public class EmployeeContainerPlanPart {
    private List<EmployeeComponentsPlanPart> list;

    public EmployeeContainerPlanPart(List<EmployeeComponentsPlanPart> list) {
        this.list = list;
    }


    public List<EmployeeComponentsPlanPart> getList() {
        return list;
    }

    //TODO custom exception
    public EmployeeComponentsPlanPart getEmplyeeByName(String emplyeeName){
        for(EmployeeComponentsPlanPart current :  getList()){
            if(current.getEmployeeName(emplyeeName).equals(emplyeeName)){
                return current;
            }
        }
        throw new RuntimeException("There is not any employee with this name");
    }
//    public void setList(List<EmployeeComponentsPlanPart> list) {
//        this.list = list;
//    }
}
