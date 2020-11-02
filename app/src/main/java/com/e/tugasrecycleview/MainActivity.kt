package com.e.tugasrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.e.tugasrecycleview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnCarItemClickListener {

    lateinit var binding: ActivityMainBinding
    lateinit var carList: ArrayList<Cars>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_main)
        carList= ArrayList()
        addCar()
        carRecycler.layoutManager=LinearLayoutManager(this)
        carRecycler.addItemDecoration(DividerItemDecoration(this, 1))
        carRecycler.adapter=CarAdapter(carList, this)
    }

    fun addCar() {
        carList.add(Cars("Toyota","Dealer", R.drawable.toyota_brand_logo) )
        carList.add(Cars("Daihatsu","Dealer", R.drawable.daihatsu_brand_logo) )
        carList.add(Cars("Datsun","Dealer", R.drawable.datsun_brand_logo) )
        carList.add(Cars("Honda","Dealer", R.drawable.honda_brand_logo) )
        carList.add(Cars("Mazda","Dealer", R.drawable.mazda_brand_logo) )
        carList.add(Cars("Mercedes","Dealer", R.drawable.mercy_brand_logo) )
        carList.add(Cars("Mitsubishi","Dealer", R.drawable.mitsubishi_brand_logo) )
        carList.add(Cars("Nissan","Dealer", R.drawable.nissan_brand_logo) )
        carList.add(Cars("Suzuki","Dealer", R.drawable.suzuki_brand_logo) )
        carList.add(Cars("Wuling","Dealer", R.drawable.wuling_brand_logo) )
    }

    override fun onItemClick(item: Cars, position: Int) {
        Toast.makeText(this, "Halo ${item.name}", Toast.LENGTH_LONG).show()
    }
}