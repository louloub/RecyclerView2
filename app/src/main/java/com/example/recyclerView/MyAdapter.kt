package com.example.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val myDataset: Array<ObjectBonPlan>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class MyViewHolder(val textView: View) : RecyclerView.ViewHolder(textView) {
        lateinit var tv : TextView
        lateinit var  tv2 : TextView

        fun MyViewHolder(itemView : View) {
            super.itemView

            tv = itemView.findViewById(R.id.my_text_view)
            tv2 = itemView.findViewById(R.id.my_text_view2)

        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int):
            MyAdapter.MyViewHolder {
        // create a new view

        val inflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.my_text_view, null)

        return MyViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element



        holder.textView.text = myDataset[position]
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size
}