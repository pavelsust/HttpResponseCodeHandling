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


        else if(responseCode == 300  ){
            returnResponse = false;
            showStatus("Server Multiple Choices");
        }


        else if(responseCode == 301 ){
            returnResponse = false;
            showStatus("Server Moved Permanently");
        }

        else if(responseCode == 302 ){
            returnResponse = false;
            showStatus("Server Found (Previously Moved temporarily)");
        }

        else if(responseCode == 303  ){
            returnResponse = false;
            showStatus("The response to the request can be found under another URI using the GET method");
        }

        else if(responseCode == 304 ){
            returnResponse = false;
            showStatus("Server Not Modified ");
        }

        else if(responseCode == 305 ){
            returnResponse = false;
            showStatus("Server use Proxy");
        }

        else if(responseCode == 306  ){
            returnResponse = false;
            showStatus("Server switch Proxy");
        }

        else if(responseCode == 307  ){
            returnResponse = false;
            showStatus("Server Temporary Redirect");
        }

        else if(responseCode == 308 ){
            returnResponse = false;
            showStatus("Server permanent Redirect");
        }

        else if(responseCode == 400  ){
            returnResponse = false;
            showStatus("Server Bad Request");
        }

        else if(responseCode == 401  ){
            returnResponse = false;
            showStatus("Server Unauthorized ");
        }

        else if(responseCode == 402  ){
            returnResponse = false;
            showStatus("Server Payment Required");
        }

        else if(responseCode == 403 ){
            returnResponse = false;
            showStatus("Server Forbidden");
        }

        else if(responseCode == 404 ){
            returnResponse = false;
            showStatus("Server Not Found ");
        }

        else if(responseCode == 405  ){
            returnResponse = false;
            showStatus("Server Request Method Not Allowed");
        }

        else if(responseCode == 406  ){
            returnResponse = false;
            showStatus("Server request not acceptable");
        }

        else if(responseCode == 407  ){
            returnResponse = false;
            showStatus("Server Proxy Authentication Required");
        }

        else if(responseCode == 408 ){
            returnResponse = false;
            showStatus("Server Request Timeout");
        }

        else if(responseCode == 409  ){
            returnResponse = false;
            showStatus("Server Conflict");
        }

        else if(responseCode == 410  ){
            returnResponse = false;
            showStatus("Server Gone");
        }


        else if(responseCode == 411  ){
            returnResponse = false;
            showStatus("The request did not specify the length of its content");
        }

        else if(responseCode == 412  ){
            returnResponse = false;
            showStatus("Server Precondition Failed ");
        }

        else if(responseCode == 413  ){
            returnResponse = false;
            showStatus("Server Payload Too Large");
        }

        else if(responseCode == 414  ){
            returnResponse = false;
            showStatus("Server  URI Too Long");
        }

        else if(responseCode == 415  ){
            returnResponse = false;
            showStatus("Server Unsupported Media Type");
        }

        else if(responseCode == 416  ){
            returnResponse = false;
            showStatus("Server Range Not Satisfiable ");
        }

        else if(responseCode == 417  ){
            returnResponse = false;
            showStatus("Server Expectation Failed");
        }

        else if(responseCode == 418  ){
            returnResponse = false;
            showStatus("Server I'm a teapot");
        }

        else if(responseCode == 422   ){
            returnResponse = false;
            showStatus("Server Unprocessable Entity ");
        }

        else if(responseCode == 421   ){
            returnResponse = false;
            showStatus("Server Misdirected Request ");
        }


        else if(responseCode == 422   ){
            returnResponse = false;
            showStatus("Server Uncrossable Entity");
        }


        else if(responseCode == 423   ){
            returnResponse = false;
            showStatus("Server Locked");
        }


        else if(responseCode == 424   ){
            returnResponse = false;
            showStatus("The request failed because it depended on another request");
        }


        else if(responseCode == 426   ){
            returnResponse = false;
            showStatus("Server Upgrade Required");
        }


        else if(responseCode == 428   ){
            returnResponse = false;
            showStatus("Server Precondition Required ");
        }


        else if(responseCode == 429   ){
            returnResponse = false;
            showStatus("Server too many request");
        }


        else if(responseCode == 431   ){
            returnResponse = false;
            showStatus("Server Request Header Fields Too Large");
        }


        else if(responseCode == 451  ){
            returnResponse = false;
            showStatus("Server Unavailable For Legal Reasons");
        }


        else if(responseCode == 500   ){
            returnResponse = false;
            showStatus("Internal Server Error");
        }

        else if(responseCode == 501   ){
            returnResponse = false;
            showStatus("The server does not recognize the request method");
        }

        else if(responseCode == 502   ){
            returnResponse = false;
            showStatus("Bad Gateway");
        }

        else if(responseCode == 503   ){
            returnResponse = false;
            showStatus("Server Service Unavailable");
        }

        else if(responseCode == 504   ){
            returnResponse = false;
            showStatus("Server Gateway Timeout");
        }

        else if(responseCode == 505   ){
            returnResponse = false;
            showStatus("Server HTTP Version Not Supported");
        }

        else if(responseCode == 506   ){
            returnResponse = false;
            showStatus("Server Variant Also Negotiates");
        }


        else if(responseCode == 507   ){
            returnResponse = false;
            showStatus("Server Insufficient Storage");
        }

        else if(responseCode == 508   ){
            returnResponse = false;
            showStatus("Server Loop Detected");
        }

        else if(responseCode == 510   ){
            returnResponse = false;
            showStatus("Server Not Extended");
        }

        else if(responseCode == 511   ){
            returnResponse = false;
            showStatus("Server Network Authentication Required");
        }
        else if(responseCode == 103   ){
            returnResponse = false;
            showStatus("Server Checkpoint");
        }

        else if(responseCode == 218   ){
            returnResponse = false;
            showStatus("Server This is fine");
        }

        else if(responseCode == 419   ){
            returnResponse = false;
            showStatus("Server Page Expired");
        }



        else if(responseCode == 420   ){
            returnResponse = false;
            showStatus("Server Method Failure ");
        }


        else if(responseCode == 450   ){
            returnResponse = false;
            showStatus("Server Blocked by Windows Parental Controls ");
        }



        else if(responseCode == 498   ){
            returnResponse = false;
            showStatus("Server Invalid Token");
        }



        else if(responseCode == 499   ){
            returnResponse = false;
            showStatus("Server Token Required");
        }

        else if(responseCode == 509   ){
            returnResponse = false;
            showStatus("Server Bandwidth Limit Exceeded");
        }

        else if(responseCode == 526   ){
            returnResponse = false;
            showStatus("Server  Invalid SSL Certificate");
        }

        else if(responseCode == 530   ){
            returnResponse = false;
            showStatus("Site is frozen");
        }


        else if(responseCode == 598   ){
            returnResponse = false;
            showStatus("Server Network read timeout error");
        }


        else if(responseCode == 440   ){
            returnResponse = false;
            showStatus("Login Time-out");
        }


        else if(responseCode == 449   ){
            returnResponse = false;
            showStatus("The server cannot honour the request");
        }


        else if(responseCode == 451   ){
            returnResponse = false;
            showStatus("Server Redirect");
        }


        else if(responseCode == 444   ){
            returnResponse = false;
            showStatus("Server No Response");
        }


        else if(responseCode == 494   ){
            returnResponse = false;
            showStatus("Server Request header too large");
        }


        else if(responseCode == 495   ){
            returnResponse = false;
            showStatus("SSL Certificate Error");
        }


        else if(responseCode == 496   ){
            returnResponse = false;
            showStatus("SSL Certificate Required");
        }


        else if(responseCode == 497   ){
            returnResponse = false;
            showStatus("HTTP Request Sent to HTTPS Port");
        }


        else if(responseCode == 499   ){
            returnResponse = false;
            showStatus(" Client Closed Request");
        }


        else if(responseCode == 520   ){
            returnResponse = false;
            showStatus("Unknown Error");
        }


        else if(responseCode == 521   ){
            returnResponse = false;
            showStatus("Web Server Is Down");
        }

        else if(responseCode == 522   ){
            returnResponse = false;
            showStatus("Connection Timed Out");
        }

        else if(responseCode == 523   ){
            returnResponse = false;
            showStatus("Origin Is Unreachable");
        }

        else if(responseCode == 524   ){
            returnResponse = false;
            showStatus(" A Timeout Occurred");
        }

        else if(responseCode == 525   ){
            returnResponse = false;
            showStatus("SSL Handshake Failed");
        }

        else if(responseCode == 526   ){
            returnResponse = false;
            showStatus("Invalid SSL Certificate");
        }
        else if(responseCode == 527   ){
            returnResponse = false;
            showStatus(" Railgun Error");
        }

        else if(responseCode == 530   ){
            returnResponse = false;
            showStatus("Origin DNS Error");
        }

        return returnResponse;
    }


    private void showStatus(String status){
        if (isShowStatus==true){
            Toasty.error(context.getApplicationContext() , ""+status , Toast.LENGTH_SHORT , true).show();
        }
    }
}

