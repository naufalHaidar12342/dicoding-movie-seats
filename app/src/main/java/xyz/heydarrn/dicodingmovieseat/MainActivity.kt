package xyz.heydarrn.dicodingmovieseat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seatView = findViewById<SeatsView>(R.id.custom_view_seats)
        val button = findViewById<Button>(R.id.button_selesai)

        button.setOnClickListener {
            seatView.seat?.let {
                Toast.makeText(this, "Kursi Anda nomor ${it.name}.", Toast.LENGTH_SHORT).show()
            } ?: run {
                Toast.makeText(this, "Silakan pilih kursi terlebih dahulu.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}