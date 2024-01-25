package com.bor.biencuta.main.infra

import com.bor.biencuta.main.core.MainRepository
import javax.inject.Inject


class MainRepositoryImpl @Inject constructor(
    private val biencuta: String
) : MainRepository {


    override fun getData(): String = biencuta

}