package com.patrick.alcoolougasolina

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatAutoCompleteTextView
import com.google.android.material.textfield.TextInputEditText

class AppGasolinaOuAlcool : AppCompatActivity() {

    private lateinit var Input_Alcool: TextInputEditText
    private lateinit var Input_Gasolina: TextInputEditText
    private lateinit var Btn_calcular:  Button
    private lateinit var text_Resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_gasolina_ou_alcool)

        inicializarComponentesInterface()
        Btn_calcular.setOnClickListener {
            calcularmelhorpreco()
        }
    }

    fun inicializarComponentesInterface(){
        Input_Alcool = findViewById(R.id.Input_Alcool)
        Input_Gasolina = findViewById(R.id.Input_Gasolina)
        Btn_calcular = findViewById(R.id.Btn_calcular)
        text_Resultado = findViewById(R.id.text_Resultado)
    }

    fun calcularmelhorpreco(){
        val precoAlcool = Input_Alcool.text.toString()
        val precoGasolina = Input_Gasolina.text.toString()

        val validacaoresultado = validarCampos(precoAlcool, precoGasolina)
        if (validacaoresultado) {
            val precoAlcoolDouble = precoAlcool.toDouble()
            val precoGasolinaDouble = precoGasolina.toDouble()
            val resultadoTotal = precoAlcoolDouble / precoGasolinaDouble

            if (resultadoTotal >= 0.7) {
                text_Resultado.text = "Melhor utilizar Gasolina"
            } else {
                text_Resultado.text = "Melhor utilizar Alcool"
            }
        }
    }

    fun validarCampos(pAlcool: String, pGasolina: String): Boolean {
        Input_Alcool.error = null
        Input_Gasolina.error = null

        if (pAlcool.isEmpty()) {
            Input_Alcool.error = "Digite um valor válido para Alcool"
            return false
        } else if (pGasolina.isEmpty()) {
            Input_Gasolina.error = "Digite um valor válido para Gasolina"
            return false
        }

        return true
    }
}
