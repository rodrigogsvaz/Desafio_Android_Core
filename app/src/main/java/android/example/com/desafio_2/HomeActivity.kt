package android.example.com.desafio_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.digitalhouse.digitalhousefoods.RestauranteAdapter
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setSupportActionBar(findViewById(R.id.toolBarHome))

        val recyclerView = rvHome

        recyclerView.adapter = RestauranteAdapter(Restaurantes(), this)
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.setHasFixedSize(true)
    }

    private fun Restaurantes(): List<Restaurante> = listOf(
        Restaurante(
            1,
            "Tony Roma's",
            "Av. Lavandisca, 717 - Indianópolis, São Paulo",
            R.drawable.image1
        ),
        Restaurante(
            2,
            "Aoyama - Moema",
            "Alameda dos Arapanés, 532 - Moema",
            R.drawable.image2
        ),
        Restaurante(
            3,
            "Outback - Moema",
            "Av. Moaci, 187, 187 - Moema, São Paulo",
            R.drawable.image3
        ),
        Restaurante(
            4,
            "Sí Señor!",
            "Alameda Jauaperi, 626 - Moema",
            R.drawable.image4
        )
    )


}