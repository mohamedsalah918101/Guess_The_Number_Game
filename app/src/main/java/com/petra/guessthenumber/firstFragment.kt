package com.petra.guessthenumber

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.collections.mutableListOf as mutableListOf

class firstFragment : Fragment() {

    // Random number
    private var randomNumber: Int = 1
    private lateinit var imageViews: Array<ImageView>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        // Random number
        randomNumber = Random.nextInt(1..9)

        // Image View
        imageViews = arrayOf(
            view.findViewById(R.id.number1),
            view.findViewById(R.id.number2),
            view.findViewById(R.id.number3),
            view.findViewById(R.id.number4),
            view.findViewById(R.id.number5),
            view.findViewById(R.id.number6),
            view.findViewById(R.id.number7),
            view.findViewById(R.id.number8),
            view.findViewById(R.id.number9)
        )
        for ((index, imageView) in imageViews.withIndex()) {
            val number = index + 1
            imageView.setImageResource(getImageResource(number))

            imageView.setOnClickListener {
                if (number == randomNumber) {
                    imageView.setImageResource(R.drawable.correct)

                }
                else{
                    imageView.setImageResource(R.drawable.wrong)
                }
            }
        }

        return view
    }
    private fun getImageResource(number: Int): Int {
        return when (number) {
            1 -> R.drawable.number1
            2 -> R.drawable.number2
            3 -> R.drawable.number3
            4 -> R.drawable.number4
            5 -> R.drawable.number5
            6 -> R.drawable.number6
            7 -> R.drawable.number7
            8 -> R.drawable.number8
            9 -> R.drawable.number9
            else -> throw IllegalArgumentException("Invalid number")
        }
    }

}

