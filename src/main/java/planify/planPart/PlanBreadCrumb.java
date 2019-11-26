package planify.planPart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;
import planify.common.data.ProjectsComponentsPlanPart;
import planify.common.data.ProjectsContainerPlanPart;
import planify.common.mainParts.Plan;
import planify.common.sidebar.*;

import java.util.ArrayList;
import java.util.List;

public class PlanBreadCrumb extends Plan {
    private List<ProjectsComponentsPlanPart> listOfProjects;

    public PlanBreadCrumb(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private WebElement getWebProjectPart() {
        return driver.findElementByName("PROJECTS");
    }

    private WebElement getSearchFieldProjectsPartWeb() {
        return getWebProjectPart().findElement(By.className("TextBox"));
    }


    private void initElements() {
        listOfProjects= new ArrayList<>();
        for(WebElement current : getWebProjectPart().findElements(By.name("VisualPlanning.KeyValueVm"))){
            listOfProjects.add(new ProjectsComponentsPlanPart(current ));
        }
    }

    public ProjectsContainerPlanPart listWithProjects(){
        return new ProjectsContainerPlanPart(listOfProjects);
    }

    private void clickSearchFieldProjectsPart() {
        getSearchFieldProjectsPartWeb().click();
    }

    private void clearSearchFieldProjectsPart() {
        getSearchFieldProjectsPartWeb().clear();
    }


    private void setSearchFieldProjectsPart(String value) {
        getSearchFieldProjectsPartWeb().sendKeys(value);
    }

    //
    public PlanBreadCrumb fillSearchField(String value) {
        clickSearchFieldProjectsPart();
        clearSearchFieldProjectsPart();
        setSearchFieldProjectsPart(value);
        return new PlanBreadCrumb(driver);
    }

    public WebElement getProjectByName(String name){
        return driver.findElementByName("PROJECTS").findElement(By.name("VisualPlanning.KeyValueVm")).findElement(By.name(name));
    }


}
