package com.example.weatherapp.datasource

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

object SupabaseClient {

    val supabase = createSupabaseClient(
        supabaseUrl = "https://pszswernrrnxhholapwn.supabase.co",
        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InBzenN3ZXJucnJueGhob2xhcHduIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MTQ5ODI3NTcsImV4cCI6MjAzMDU1ODc1N30.DwYEwJyNPuMh7Kk2_tXzgDePtBbulRzPHOGZhfaipEg"
    ) {
        install(Postgrest)
        //install other modules
    }
}