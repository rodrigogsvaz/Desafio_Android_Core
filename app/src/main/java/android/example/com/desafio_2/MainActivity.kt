package android.example.com.desafio_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.toolbar.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Set toolbar as actionbar
        setSupportActionBar(findViewById(R.id.toolBarLogin))

        //Go to Register when button is pressed
        bRegister.setOnClickListener {
            openRegisterActivity()
        }

        //Go to Home when button is pressed
        bLogin.setOnClickListener {
            openHomeActivity()
        }

    }

    private fun openRegisterActivity() {
        var intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    private fun openHomeActivity() {
        var intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}
