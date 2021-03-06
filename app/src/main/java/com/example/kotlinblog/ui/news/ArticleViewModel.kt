package com.example.kotlinblog.ui.news

import androidx.lifecycle.MutableLiveData
import com.example.kotlinblog.BaseViewModel
import com.example.kotlinblog.model.news.Article

class ArticleViewModel : BaseViewModel() {
    private val articleTitle = MutableLiveData<String>()
    private val articleBody = MutableLiveData<String>()

    fun bind(article: Article) {
        articleTitle.value = article.title
        articleBody.value = article.description
    }

    fun getArticleTitle(): MutableLiveData<String> {
        return articleTitle
    }

    fun getArticleBody(): MutableLiveData<String> {
        return articleBody
    }
}