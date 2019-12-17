package com.weng.demo.Demo13.Collectionhomework;

public class question {
    private int qnumber=1;
    private String name;
    String option;
    private String answer;

    public question( String name, String option, String answer) {
        this.qnumber = qnumber++;
        this.name = name;
        this.option = option;
        this.answer = answer;
    }

    public question() {
    }

    public int getQnumber() {
        return qnumber++;
    }

    public void setQnumber(int qnumber) {
        this.qnumber = qnumber++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
