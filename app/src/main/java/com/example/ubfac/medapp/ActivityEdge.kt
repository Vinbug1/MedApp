package com.example.ubfac.medapp

import android.os.AsyncTask
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.View
import android.widget.Toast

import java.util.ArrayList

class ActivityEdge : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edge)

        //start an asynctask
        val sampleAsyncTask = SampleAsyncTask()
        sampleAsyncTask.execute()
    }

    // Today
    // AsyncTask
    // Main Thread and Background Thread
    //Connnecting to server
    // Reading files fo

    //Java How to Program


    //Monday
    //Connecting to Internet
    //Loaders
    //Parsing JSON data
    //


    internal inner class SampleAsyncTask : AsyncTask<String, Int, ArrayList<String>>() {

        //onPreExecute
        //doInBackground
        //onPostExecute
        //onProgressUpdate


        override fun doInBackground(vararg strings: String): ArrayList<String> {

            //we are doing a very heavy work here
            val arrayList = ArrayList<String>()

            arrayList.add("Hello")
            arrayList.add("World")


            return arrayList
        }

        override fun onPostExecute(strings: ArrayList<String>) {
            super.onPostExecute(strings)

            Toast.makeText(this@ActivityEdge, "" + strings, Toast.LENGTH_SHORT).show()
        }
    }


}
