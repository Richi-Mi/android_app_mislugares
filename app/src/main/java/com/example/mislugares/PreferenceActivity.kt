package com.example.mislugares

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PreferenceActivity : AppCompatActivity() {
    // Preferencias
    val preferencias = getPreferences( MODE_PRIVATE )
    // Editor de Preferencias
    val editor = preferencias.edit()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    fun read_preferences() {
        val name = preferencias.getString("nombre", "valor por defecto")
        val edad = preferencias.getInt("edad", 9)
    }
    fun saveData() {
        editor.putString("nombre", "teutle")
        editor.putInt("edad", 18)
        editor.apply()
    }

}