package com.pavel.response.code;

import android.content.Context;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class HttpResponseCode {

    public Context context;
    public boolean isShowStatus;

    public HttpResponseCode(){

    }

    public HttpResponseCode(Context context , boolean isShowStatus){
        this.context = context;
        this.isShowStatus = isShowStatus;
    }


    public boolean checkResponse(int responseCode){

        boolean returnResponse = false;

        if (responseCode == 200){
            returnResponse = true;
        }


        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }

        else if(responseCode == 101 ){
            returnResponse = false;
            showStatus("Server Switching Protocols");
        }

        else if(responseCode == 103  ){
            returnResponse = false;
            showStatus("Server Early Hints");
        }

        else if(responseCode == 201  ){
            returnResponse = false;
            showStatus("Server resources are created");
        }


        else if(responseCode == 202  ){
            returnResponse = false;
            showStatus("Server request accepted");
        }



        else if(responseCode == 203  ){
            returnResponse = false;
            showStatus("Server Non-Authoritative Information ");
        }


        else if(responseCode == 204  ){
            returnResponse = false;
            showStatus("The server successfully processed the request and is not returning any content.");
        }


        else if(responseCode == 205  ){
            returnResponse = false;
            showStatus("Server is no returning any content");
        }


        else if(responseCode == 206  ){
            returnResponse = false;
            showStatus("The server is delivering only part of the resource ");
        }


        else if(responseCode == 207  ){
            returnResponse = false;
            showStatus(" XML message and can contain a number");
        }


        else if(responseCode == 208  ){
            returnResponse = false;
            showStatus("The members of a DAV binding have already been enumerated");
        }


        else if(responseCode == 226  ){
            returnResponse = false;
            showStatus("The server has fulfilled a request for the resource");
        }


        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }


        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }

        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }

        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }

        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }

        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }

        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }

        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }

        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }

        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }

        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }

        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }

        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }

        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }

        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }

        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }

        else if(responseCode == 100 ){
            returnResponse = false;
            showStatus("Server continue working");
        }


        return returnResponse;
    }


    private void showStatus(String status){

        if (isShowStatus==true){
            Toasty.error(context.getApplicationContext() , ""+status , Toast.LENGTH_SHORT , true).show();
        }
    }
}

