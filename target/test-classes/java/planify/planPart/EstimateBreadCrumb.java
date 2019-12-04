package planify.planPart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.data.EmployeeComponentsPlanPart;
import planify.common.data.EmployeeContainerPlanPart;
import planify.common.data.ProjectsComponentsPlanPart;
import planify.common.data.ProjectsContainerPlanPart;
import planify.common.mainParts.Plan;
import planify.common.sidebar.*;

import java.util.ArrayList;
import java.util.List;

public class EstimateBreadCrumb extends Plan {
    private List<ProjectsComponentsPlanPart> listOfProjects;
    private List<EmployeeComponentsPlanPart> listOfEmployees;

    public EstimateBreadCrumb(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    //.findElements(By.className("TextBlock"))
    private void initElements() {
        listOfProjects = new ArrayList<>();
        listOfEmployees = new ArrayList<>();

        for (WebElement current : getWebProjectPart().findElements(By.className("ListBoxItem"))) {
            listOfProjects.add(new ProjectsComponentsPlanPart(current));
        }
        for (WebElement current : getWebListOfEmployee()
                .findElements(By.name("VisualPlanning.GetEmployeeVisualsQueryResponse"))) {
            listOfEmployees.add(new EmployeeComponentsPlanPart(current, driver));
        }
    }
    //Page Object

    private WebElement getWebProjectPart() {
        return driver.findElementByName("PROJECTS");
    }

    private WebElement getWebEmployeeTab() {
        return driver.findElement(By.name("EMPLOYEE / ROLE"));
    }

    private WebElement getWebListOfEmployee() {
        return getWebEmployeeTab().findElement(By.className("ListView"));
    }

    private WebElement getWebEmployeeSearchField() {
        return getWebEmployeeTab().findElement(By.className("TextBox")).findElement(By.className("ScrollViewer"));
    }

    private WebElement getProjectByName(String name) {
        return getWebProjectPart()
                .findElement(By.className("ListView"))
                .findElement(By.name("VisualPlanning.KeyValueVm"))
                .findElement(By.className("TextBlock"))
                .findElement(By.name(name));
    }

    //Functionality
    private void clickOnSomeProject(String name) {
        getProjectByName(name).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Business logic

    public EstimateBreadCrumb clickOnProjectByName(String projectName)
    {
        clickOnSomeProject(projectName);
        return new EstimateBreadCrumb(driver);
    }
    public EmployeeContainerPlanPart getListOfEmployees() {
        return new EmployeeContainerPlanPart(listOfEmployees);
    }

    public ProjectsContainerPlanPart listWithProjects() {
        return new ProjectsContainerPlanPart(listOfProjects);
    }

}
