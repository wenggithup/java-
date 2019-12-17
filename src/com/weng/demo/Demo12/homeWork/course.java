package com.weng.demo.Demo12.homeWork;

import java.util.ArrayList;

public class course {
    private int cid;
    private String cnmae;

    public course(int cid, String cnmae) {
        this.cid = cid;
        this.cnmae = cnmae;
    }

    public course() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCnmae() {
        return cnmae;
    }

    public void setCnmae(String cnmae) {
        this.cnmae = cnmae;
    }

    @Override
    public String toString() {
        return "course{" +
                "cid=" + cid +
                ", cnmae='" + cnmae + '\'' +
                '}';
    }
}
