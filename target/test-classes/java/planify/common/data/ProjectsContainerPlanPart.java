package planify.common.data;

import org.openqa.selenium.WebElement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ProjectsContainerPlanPart {
    private File file = new File("C:\\Users\\User\\PlanifiPr\\output\\output.txt");
    private BufferedWriter writer;

    private List<ProjectsComponentsPlanPart> listOfProjects;

    public ProjectsContainerPlanPart(List<ProjectsComponentsPlanPart> list) {
        this.listOfProjects = list;
    }

    private List<ProjectsComponentsPlanPart> getList() {
        return listOfProjects;
    }

    //Business logic

    public Boolean checkIfThereIsProjectByAttribute(String value) throws IOException {
        {
            try {
                writer = new BufferedWriter(new FileWriter(file));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Boolean flag = null;
        writer.write(listOfProjects.size());
        for (ProjectsComponentsPlanPart element : getList()) {
            writer.write(element.toString());
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
