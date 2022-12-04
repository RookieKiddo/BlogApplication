package com.example.madproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Home.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home : Fragment() {

    private lateinit var adapter: HomeAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var BlogArrayList: ArrayList<Model>

    lateinit var imageId : Array<Int>
    lateinit var title : Array<String>
    lateinit var description : Array<String>





    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Home.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Home().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        dataIntialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = HomeAdapter(BlogArrayList,this )
        recyclerView.adapter = adapter
    }
    private fun dataIntialize() {
        BlogArrayList = arrayListOf<Model>()

        imageId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.a,
            R.drawable.b,
        )

        title = arrayOf(
            getString(R.string.head_1),
            getString(R.string.head_2),
            getString(R.string.head_3),
            getString(R.string.head_4),
            getString(R.string.head_5),
            getString(R.string.head_6),
            getString(R.string.head_7),
            getString(R.string.head_8),
            getString(R.string.head_9),
        )

        description = arrayOf(
            getString(R.string.blog_1),
            getString(R.string.blog_2),
            getString(R.string.blog_3),
            getString(R.string.blog_4),
            getString(R.string.blog_5),
            getString(R.string.blog_6),
            getString(R.string.blog_7),
            getString(R.string.blog_8),
            getString(R.string.blog_9),
        )

        for (i in imageId.indices) {
            val blog = Model(title[i], description[i], imageId[i] )
            BlogArrayList.add(blog)
        }
    }
}