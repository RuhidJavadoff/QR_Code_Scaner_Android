package com.ruhidjavadoff.qrcodescaner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.core.content.ContextCompat
import android.widget.ImageView
import android.widget.FrameLayout
import com.ruhidjavadoff.qrcodescaner.R

class HeaderFragment : Fragment() {

    private lateinit var themeToggleButton: FrameLayout
    private lateinit var sunIcon: ImageView
    private lateinit var moonIcon: ImageView

    // Dəyişənlər: Gündüz və gecə rejimini tutmaq üçün
    private var isDayMode = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.header_fragment, container, false)

        // Elementlərə istinad
        themeToggleButton = view.findViewById(R.id.themeToggleButton)
        sunIcon = view.findViewById(R.id.sunIcon)
        moonIcon = view.findViewById(R.id.moonIcon)

        // Başlanğıc rejimi: Gündüz (day mode)
        updateTheme()

        // Toggle düyməsinə klikləndikdə
        themeToggleButton.setOnClickListener {
            isDayMode = !isDayMode // Gündüz və gecə rejimini dəyiş
            updateTheme() // Dəyişiklikləri tətbiq et
        }

        return view
    }

    private fun updateTheme() {
        if (isDayMode) {
            // Gündüz rejimi
            sunIcon.visibility = View.VISIBLE
            moonIcon.visibility = View.GONE
            activity?.window?.decorView?.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.day_mode))
        } else {
            // Gece rejimi
            sunIcon.visibility = View.GONE
            moonIcon.visibility = View.VISIBLE
            activity?.window?.decorView?.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.night_mode))
        }
    }
}
