package com.tuing.chain.of.responsibility;

public class ChainOfResponsibilityTest {

    public static void main(String[] args) {
        Request request = new Request.Builder()
                .BuilderRequestFrequency(true)
                .BuilderRequestVerify(false)
                .BuilderRequestPermission(true)
                .builder();

        Handle handle = new RequestFrequencyHandle(new RequestVerifyHandle(null));
//        System.out.println(handle);

        boolean process = handle.process(request);
        if (process){
            System.out.println("request ok");
        } else {
            System.out.println("request fail");
        }

    }


}

class Request {

    private boolean requestFrequency;
    private boolean requestVerify;
    private boolean requestPermission;
    private String requestBody;

    public Request(boolean requestFrequency, boolean requestVerify, boolean requestPermission) {
        this.requestFrequency = requestFrequency;
        this.requestVerify = requestVerify;
        this.requestPermission = requestPermission;
    }

    public boolean isRequestFrequency() {
        return requestFrequency;
    }

    public void setRequestFrequency(boolean requestFrequency) {
        this.requestFrequency = requestFrequency;
    }

    public boolean isRequestVerify() {
        return requestVerify;
    }

    public void setRequestVerify(boolean requestVerify) {
        this.requestVerify = requestVerify;
    }

    public boolean isRequestPermission() {
        return requestPermission;
    }

    public void setRequestPermission(boolean requestPermission) {
        this.requestPermission = requestPermission;
    }

    static class Builder {
        private boolean requestFrequency;
        private boolean requestVerify;
        private boolean requestPermission;

        public Builder() {
        }

        public Builder BuilderRequestFrequency(boolean requestFrequency){
            this.requestFrequency = requestFrequency;
            return this;
        }

        public Builder BuilderRequestVerify(boolean requestVerify){
            this.requestVerify = requestVerify;
            return this;
        }

        public Builder BuilderRequestPermission(boolean requestPermission){
            this.requestPermission = requestPermission;
            return this;
        }

        public Request builder(){
            return new Request(requestFrequency, requestVerify, requestPermission);
        }
    }

}

abstract class Handle{

    Handle next;

    public Handle(Handle next) {
        this.next = next;
    }

    public Handle getNext() {
        return next;
    }

    public void setNext(Handle next) {
        this.next = next;
    }

    abstract boolean process(Request request);
}

class RequestFrequencyHandle extends Handle{

    public RequestFrequencyHandle(Handle next) {
        super(next);
    }

    @Override
    boolean process(Request request) {

        System.out.println("RequestFrequencyHandle ");

        if(request.isRequestFrequency()){
            Handle next = getNext();

            //沒有下一個認證,成功
            if(next == null){
                return true;
            }

            if (!next.process(request)){
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}

class RequestVerifyHandle extends Handle{

    public RequestVerifyHandle(Handle next) {
        super(next);
    }

    @Override
    boolean process(Request request) {

        System.out.println("RequestVerifyHandle " );

        if(request.isRequestVerify()){
            Handle next = getNext();

            //沒有下一個認證,成功
            if(next == null){
                return true;
            }

            if (!next.process(request)){
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}









