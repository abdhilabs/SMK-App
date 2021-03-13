package id.sch.smk2yk.smkapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAbout = findViewById<Button>(R.id.btn_about)
        val btnVision = findViewById<Button>(R.id.btn_vision)
        val btnOrganization = findViewById<Button>(R.id.btn_organization)
        val btnLocation = findViewById<Button>(R.id.btn_location)

        btnAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
        btnVision.setOnClickListener {
            val intent = Intent(this, VisionActivity::class.java)
            startActivity(intent)
        }
        btnOrganization.setOnClickListener {
            val intent = Intent(this, OrganizationActivity::class.java)
            startActivity(intent)
        }
        btnLocation.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.google.co.id/maps/place/SMK+Negeri+2+Yogyakarta/@-7.7772886,110.3675029,18.41z/data=!4m5!3m4!1s0x2e7a58373fffffff:0xa4ec1ca156555926!8m2!3d-7.7770729!4d110.3673696")
            )
            startActivity(intent)
        }
    }
}