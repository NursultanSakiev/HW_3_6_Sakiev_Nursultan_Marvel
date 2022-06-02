package com.example.marvel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class SecondFragment : Fragment() {
private val data= arrayListOf<Hero>()
    private var recView:RecyclerView?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
loadData()
        recView=view.findViewById(R.id.recycler_view)
        var adapter=HeroesAdapter(data = data)
        recView?.adapter=adapter
        recView?.layoutManager=GridLayoutManager(requireContext(),2)
    }

    private fun loadData() {
        data.add(Hero(R.color.black,"Черная пантера","https://i.pinimg.com/originals/97/7e/57/977e57043787edecc39eeb55fee3d040.jpg"))
        data.add(Hero(R.color.green,"Халк","https://kinogo.pub/uploads/posts/2021-10/1634803728_iphone360_7962.jpg"))
        data.add(Hero(R.color.purple_500,"Тор","https://s8.cdn.teleprogramma.pro/wp-content/uploads/2017/10/b40f515c6376b0591caf7b64a0e29615.jpg"))
        data.add(Hero(R.color.red,"Железный человек","https://cdn.britannica.com/49/182849-050-4C7FE34F/scene-Iron-Man.jpg"))
        data.add(Hero(R.color.purple_700,"Соколиый глаз","https://upload.wikimedia.org/wikipedia/ru/thumb/f/f6/Hawkeye_Renner.jpg/250px-Hawkeye_Renner.jpg"))
data.add(Hero(R.color.white,"Черная вдава","https://wheny.ru/wp-content/uploads/2021/08/%D1%87%D0%B5%D1%80%D0%BD%D0%B0%D1%8F-%D0%B2%D0%B4%D0%BE%D0%B2%D0%B0-1.png"))
data.add(Hero(R.color.green,"Капитан Америка","https://vokrug.tv/pic/news/0/5/e/3/05e3798f461046b8199d5539141ea7ac.jpg"))
        data.add(Hero(R.color.teal_200,"Фьюри","https://upload.wikimedia.org/wikipedia/ru/b/b5/SECRET_INVASION-Nick_Fury.jpg"))
    }

}