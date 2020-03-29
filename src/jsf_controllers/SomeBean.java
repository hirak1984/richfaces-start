package jsf_controllers;


@ManagedBean
public class SomeBean {
  private String someProperty;

  public String getSomeProperty() {
    return(someProperty);
  }

  public void setSomeProperty(String someProperty) {
    this.someProperty = someProperty;
  }
  
  public String someActionControllerMethod() {
    return("some-page");
  }
}
