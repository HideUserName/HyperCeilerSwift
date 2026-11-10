package com.sevtinge.hyperceiler.provision.state;

public class TermsAndStatementState extends State {

    @Override
    public boolean isAvailable(boolean available) {
        return false;
    }

    @Override
    public String getPageTag() {
        return "terms";
    }
}
