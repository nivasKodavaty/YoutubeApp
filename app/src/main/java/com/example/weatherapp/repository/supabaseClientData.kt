package com.example.weatherapp.repository

import com.example.weatherapp.data.Country
import com.example.weatherapp.datasource.SupabaseClient
import io.github.jan.supabase.postgrest.from

interface SupabaseRepository {
    suspend fun channelList() : List<Country>
}

class SupabaseRepositoryImpl : SupabaseRepository {
    override suspend fun channelList(): List<Country> {
        return SupabaseClient.supabase.from("cities").select().decodeList<Country>()
    }

}