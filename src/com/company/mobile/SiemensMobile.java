package com.company.mobile;

public abstract class SiemensMobile {

    protected Boolean startingCall;
    protected Boolean breakCall;

    public SiemensMobile(Boolean startingCall, Boolean breakCall) {
        this.startingCall = startingCall;
        this.breakCall = breakCall;
    }

    abstract void connectToSiemensMobile();

    public Boolean getStartingCall() {
        return startingCall;
    }

    public void setStartingCall(Boolean startingCall) {
        this.startingCall = startingCall;
    }

    public Boolean getBreakCall() {
        return breakCall;
    }

    public void setBreakCall(Boolean breakCall) {
        this.breakCall = breakCall;
    }
}
