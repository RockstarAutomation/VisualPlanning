package planify.common.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProjectsContainerPlanPart {


    private WebElement projectPartWeb;
    private WebElement searchFieldProjectsPart;
    private List<ProjectsComponentsPlanPart> listOfProjects;

    public ProjectsContainerPlanPart(List<ProjectsComponentsPlanPart> list){
        this.listOfProjects = list;
    }

    private List<ProjectsComponentsPlanPart> getList(){
        return listOfProjects;
    }


    //Business logic

    public Boolean checkIfThereIsProjectByAttribute(String projectAttribute, String value) throws IOException {
        ProjectsComponentsPlanPart componentsPlanPart = null;
        for(ProjectsComponentsPlanPart element : getList()){
            if(element.getElementAttribute(projectAttribute).equals(value))
                return true;
        }
        throw new RuntimeException("There is not any matches");
//        listOfProjects.addAll(getWebProjectPart().findElements(By.name("VisualPlanning.KeyValueVm")));
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
