package planify.common.data;

import java.io.IOException;
import java.util.List;

public class ProjectsContainerPlanPart {

    private List<ProjectsComponentsPlanPart> listOfProjects;

    public ProjectsContainerPlanPart(List<ProjectsComponentsPlanPart> list) {
        this.listOfProjects = list;
    }

    private List<ProjectsComponentsPlanPart> getList() {
        return listOfProjects;
    }

    //Business logic

    public Boolean checkIfThereIsProjectByAttribute(String value) throws IOException {
        Boolean flag = null;
        for (ProjectsComponentsPlanPart element : getList()) {
            if (element.getElementNameAttribute().equals(value)) {
                flag = true;
                return flag;
            }
        }
        if (flag == null)
            throw new RuntimeException("There are not any projects with this name");
//        listOfProjects.addAll(getWebProjectPart().findElements(By.name("VisualPlanning.KeyValueVm")));
        return flag;
    }

//    public String checkIfThereIsProjectByName(String projectName) throws IOException {
//
//        for (WebElement element : checkIfThereIsProjectByAttribute()) {
//            if (element.getAttribute("Name").equals(projectName)) {
//                return element.getAttribute("Name");
//            } else
//                throw new RuntimeException("There are not any matches");
//        }
//        return null;
//    }

}
