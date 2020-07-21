package com.stayready.as03.problem05;

public abstract class Bird {

    String mvmt;
    String migrationMonth;

    public String move() {
       mvmt="fly";
        return mvmt;
    }

    public void setMigrationMonth(String expected) {
        this.migrationMonth=expected;
    }

    public String getMigrationMonth() {
        return migrationMonth;
    }
}
