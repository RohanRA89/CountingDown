package com.ironyard.dto;

/**
 * Created by rohanayub on 2/23/17.
 */
public class TIYResponse {

    private boolean success;
    private Integer number;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public TIYResponse(boolean success, Integer number) {
        this.success = success;
        this.number = number;
    }

    public TIYResponse() {
    }

    @Override
    public String toString() {
        return "TIYResponse{" +
                "success=" + success +
                ", number=" + number +
                '}';
    }
}
