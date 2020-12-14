package com.example.studentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun register(view: View) {
        var getname=findViewById<EditText>(R.id.name)
        var getroll=findViewById<EditText>(R.id.roll)
        var getadm=findViewById<EditText>(R.id.adm)
        var getclg=findViewById<EditText>(R.id.clg)
        var getpname=findViewById<EditText>(R.id.pname)
        var getpmail=findViewById<EditText>(R.id.pmail)
        var getpmob=findViewById<EditText>(R.id.pmob)
        var getuname=findViewById<EditText>(R.id.uname)
        var getpas=findViewById<EditText>(R.id.pas)
        var getcpas=findViewById<EditText>(R.id.cpas)

        Toast.makeText(this,getname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getroll.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getadm.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getclg.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getpname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getpmail.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getpmob.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getuname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getpas.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getcpas.text.toString(),Toast.LENGTH_LONG).show()
    }
}