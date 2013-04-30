package org.primefaces.examples.view;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.inject.Named;

import org.primefaces.push.PushContext;
import org.primefaces.push.PushContextFactory;

@Named("globalCounter")
@ApplicationScoped
public class GlobalCounterBean {

    private int count;

    public GlobalCounterBean() {
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increment() {
        count++;
        String msg = "Count = " + String.valueOf(count);

        PushContext pushContext = PushContextFactory.getDefault().getPushContext();
        pushContext.push("/counter", new FacesMessage(FacesMessage.SEVERITY_INFO, "", msg));
    }
}
