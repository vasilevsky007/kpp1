package com.kpp.demo1;

public class ReturnValue {

    private final long id;
    private final String content;

    public ReturnValue(long id, long number, String calculation) {
        this.id = id;
        long newnumber;
        if(calculation.equals(" 1")){
            newnumber=number+1;
            this.content = " your number: "+number+" your number +"+calculation+": "+newnumber;
        }else{
            if(calculation.equals(" 10")){
                newnumber=number+10;
                this.content = " your number: "+number+" your number +"+calculation+": "+newnumber;
            }else{
                if(calculation.equals("-1")){
                    newnumber=number-1;
                    this.content = " your number: "+number+" your number "+calculation+": "+newnumber;
                }else{
                    if(calculation.equals("-10")){
                        newnumber=number-10;
                        this.content = " your number: "+number+" your number "+calculation+": "+newnumber;
                    }else{
                        this.content=" you haven't selected the right calculation";
                    }
                }
            }
        }
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}