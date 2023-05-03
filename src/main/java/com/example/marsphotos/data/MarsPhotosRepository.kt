package com.example.marsphotos.data

import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.MarsApi
import com.example.marsphotos.network.MarsApiService

interface MarsPhotosRepository{
suspend fun  getMarsPhotos(): List<MarsPhoto>
}


class DefaultMarsPhotosRepository(retrofitService: MarsApiService) : MarsPhotosRepository{

    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return marsApiService.getPhotos()

    }

    class DefaultMarsPhotosRepository(
        private val marsApiService: MarsApiService
    ) : MarsPhotosRepository
}