package com.stephaneki.monvelib.services;

import com.stephaneki.monvelib.modele.jcDecaux.Contract;
import com.stephaneki.monvelib.modele.jcDecaux.Station;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by stephaneki on 10/09/2018 .
 */
public interface JcDecauxAPIservices {

    public static final String BASE_URL = "https://api.jcdecaux.com/vls/v1/";

    /**
     * Récupérer la liste des contrats de Jc Decaux
     * @param apiKey lA clé API pour accéder à l'API
     * @return La liste des contrats
     */
    @GET("contracts")
    Call<List<Contract>> getContracts(@Query("apiKey") String apiKey);

    /**
     * Récupérer la liste des stations d'un contrat
     * @param contractName Nom du contrat
     * @return La liste des station du contrat spécifié
     */
    @GET("stations")
    Call<List<Station>> getContractStations(@Query("contract") String contractName,
                                            @Query("apiKey") String apiKey);


    /**
     * Récupérer les infos d'une station
     *
     * @param stationNumber Le numéro de la station
     * @param contractName Le nom du contrat
     * @return Le détail des informations de la station
     */
    @GET("{station_number}")
    Call<Station> getStationInfo(@Path("station_number") String stationNumber,
                                 @Query("contract") String contractName,
                                 @Query("apiKey") String apiKey);
}
