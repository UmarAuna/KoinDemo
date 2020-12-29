package com.koin.koindemo.ui.main.viewmodel

import android.net.Network
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koin.koindemo.data.model.Movies
import com.koin.koindemo.data.repository.MainRepository
import com.koin.koindemo.utils.NetworkHelper
import com.koin.koindemo.utils.Resource
import kotlinx.coroutines.launch

class MainViewModel(
    private val mainRepository: MainRepository,
    private val networkHelper: NetworkHelper
): ViewModel() {
    private val _users = MutableLiveData<Resource<List<Movies>>>()
    val users: LiveData<Resource<List<Movies>>>
        get() = _users

    init {
        fetchUsers()
    }

    private fun fetchUsers(){
        viewModelScope.launch {
            _users.postValue(Resource.loading(null))
            if(networkHelper.isNetworkConnected()){
                mainRepository.getFood().let {
                    if (it.isSuccessful){
                        _users.postValue(Resource.success(it.body()))
                    }else _users.postValue(Resource.error(it.errorBody().toString(), null))
                }
            }else _users.postValue(Resource.error("No internet connection", null))
        }
    }
}