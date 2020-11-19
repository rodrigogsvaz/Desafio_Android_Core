package android.example.com.desafio_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.bRegister
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        setSupportActionBar(findViewById(R.id.toolBarRegister))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        bRegister.setOnClickListener {
            openHomeActivity()
        }
    }

    private fun openHomeActivity() {
        var intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}