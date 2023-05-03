/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.marsphotos.network

import com.example.marsphotos.model.MarsPhoto
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import retrofit2.Retrofit


private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"



private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()



/*
interface MarsApiService {

    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>
}
*/

interface MarsApiService {

    @GET("photos")
    suspend fun getPhotos():List<MarsPhoto>
}

object MarsApi {
    val retrofitService : MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }
}







//$ git clone https://github.com/google-developer-training/basic-android-kotlin-compose-training-mars-photos.git