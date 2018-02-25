package com.example.kh2191.digi_invi;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;

import static android.view.View.GONE;

/**
 * Created by KH2191 on 24-02-2018.
 */

public class networkcalls extends AsyncTask<Void, Void, String> {


    //the url where we need to send the request
    String url;

    //the parameters
    HashMap<String, String> params;

    //the request code to define whether it is a GET or POST
    int requestCode;

    //constructor to initialize values
    networkcalls(String url, HashMap<String, String> params, int requestCode) {
        this.url = url;
        this.params = params;
        this.requestCode = requestCode;
    }

    //when the task started displaying a progressbar
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }


    //this method will give the response from the request
    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        try {
            JSONObject object = new JSONObject(s);
            if (!object.getBoolean("error")) {

                //refreshing the herolist after every operation
                //so we get an updated list
                //we will create this method right now it is commented
                //because we haven't created it yet
                //refreshHeroList(object.getJSONArray("heroes"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    public static final String REQUEST_METHOD = "GET";
    public static final int READ_TIMEOUT = 15000;
    public static final int CONNECTION_TIMEOUT = 15000;
    //the network operation will be performed in background
    @Override
    protected String doInBackground(Void... voids) {

        String result;
        String inputLine;
        URL myUrl = null;

        try {
            myUrl = new URL("http://192.168.0.116:8989/dbconnect/get_all.php?id=1");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        //Create a connection
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection)
                    myUrl.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Set methods and timeouts
        try {
            connection.setRequestMethod(REQUEST_METHOD);
        } catch (ProtocolException e) {
            e.printStackTrace();
        }
        connection.setReadTimeout(READ_TIMEOUT);
        connection.setConnectTimeout(CONNECTION_TIMEOUT);

        //Connect to our url
        try {
            connection.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Create a new InputStreamReader
        InputStreamReader streamReader = null;
        try {
            streamReader = new
                    InputStreamReader(connection.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Create a new buffered reader and String Builder
        BufferedReader reader = new BufferedReader(streamReader);
        StringBuilder stringBuilder = new StringBuilder();
        //Check if the line we are reading is not null

        try {
            while((inputLine = reader.readLine()) != null){
                stringBuilder.append(inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Close our InputStream and Buffered reader
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            streamReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Set our result equal to our stringBuilder
        result = stringBuilder.toString();

    return result;
}

    }

