package com.springapp.dao;

import com.springapp.entity.CityEntity;
import com.springapp.entity.CountryEntity;
import com.springapp.entity.CountryLanguageEntity;

import java.util.List;

/**
 * Created by anatoliy on 01.03.14.
 */
public interface Dao {
    List<CityEntity> getCities();
    List<CountryEntity> getCountries();
    List<CountryLanguageEntity> getLanguages();
}
