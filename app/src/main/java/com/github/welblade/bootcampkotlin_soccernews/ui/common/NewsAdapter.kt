package com.github.welblade.bootcampkotlin_soccernews.ui.common
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.github.welblade.bootcampkotlin_soccernews.data.model.News
import com.github.welblade.bootcampkotlin_soccernews.databinding.ItemNewsBinding

class NewsAdapter : ListAdapter<News, NewsAdapter.ViewHolder>(DiffCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemNewsBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ViewHolder(private val binding: ItemNewsBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(news: News) {
            binding.tvTitle.text = news.title
            binding.tvContent.text = news.content
        }
    }

    class DiffCallBack: DiffUtil.ItemCallback<News>() {
        override fun areItemsTheSame(oldItem: News, newItem: News): Boolean {
            TODO("Not yet implemented")
        }

        override fun areContentsTheSame(oldItem: News, newItem: News): Boolean {
            TODO("Not yet implemented")
        }

    }

}