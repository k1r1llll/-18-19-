package com.example.practice18

import androidx.fragment.app.Fragment
import android.widget.TextView
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView


class InfoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_info, container, false)
    }
    // обновление текстового поля
    fun setSelectedItem(selectedItem: String?) {
        val textView = view?.findViewById<TextView>(R.id.textView)
        val image  = view?.findViewById<ImageView>(R.id.imageView)
        image?.visibility = View.VISIBLE

        when(selectedItem){
            getString(R.string.breed1) ->{
                image?.setImageResource(R.drawable.si)
                textView?.setText(R.string.breed1info)
            }
            getString(R.string.breed2) ->{
                image?.setImageResource(R.drawable.mei)
                textView?.setText(R.string.breed2info)
            }
            getString(R.string.breed3) ->{
                image?.setImageResource(R.drawable.me)
                textView?.setText(R.string.breed3info)
            }

        }
    }
}