package planify.common.data;

import java.util.List;

public class EmployeeContainerPlanPart {
    private List<EmployeeComponentsPlanPart> list;

    public EmployeeContainerPlanPart(List<EmployeeComponentsPlanPart> listOfEmployee) {
        this.list = listOfEmployee;
    }


    private List<EmployeeComponentsPlanPart> getList() {
        return list;
    }

    //TODO custom exception
    public EmployeeComponentsPlanPart getEmplyeeByName(String employeeName) {
        for (EmployeeComponentsPlanPart current : getList()) {
            if (current.getEmployeeName(employeeName).equals(employeeName)) {
                return current;
            }
        }
        throw new RuntimeException("There is not any employee with this name");
    }

    public Boolean checkIfThereIsAnEmployeeByName(String employeeName) {
        Boolean flag = null;
        for (EmployeeComponentsPlanPart current : getList()) {
            if (current.getEmployeeName(employeeName).equals(employeeName)) {
                flag = true;
                return flag;
            } else {
                flag = false;
                return flag;
            }
        }
        if (flag == null)
            throw new RuntimeException("There are not any employee with this name");
        return flag;
    }
}
