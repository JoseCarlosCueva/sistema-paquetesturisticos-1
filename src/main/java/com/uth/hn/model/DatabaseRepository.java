package com.uth.hn.model;

import com.uth.hn.data.PaquetesTuristicos;
import com.uth.hn.data.PaquetesTuristicosResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface DatabaseRepository {
	@Headers({
	    "Accept: application/json",
	    "User-Agent: Retrofit-Sample-App"
	})
	@GET("/pls/apex/202210020065/paquetes/PAQUETES_TURISTICOS")
	Call<PaquetesTuristicosResponse> consultarPaquetesTuristicos();
	
	/*@Headers({
	    "Accept: application/json",
	    "User-Agent: Retrofit-Sample-App"
	})
	@POST("/pls/apex/202210020065/paquetes/PAQUETES_TURISTICOS")
	Call<ResponseBody> crearPaquetesTuristicos(@Body PaquetesTuristicos nuevo);*/
}
