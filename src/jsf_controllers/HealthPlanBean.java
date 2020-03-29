package jsf_controllers;

import javax.faces.bean.*;

@ManagedBean
public class HealthPlanBean {
public String signup() {
if (Math.random() < 0.2) {
return("accepted");
} else {
return("rejected");
}
}
}