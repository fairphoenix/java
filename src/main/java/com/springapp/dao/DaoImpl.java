package com.springapp.dao;

import com.springapp.entity.CityEntity;
import com.springapp.entity.CountryEntity;
import com.springapp.entity.CountryLanguageEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by anatoliy on 01.03.14.
 */
public class DaoImpl implements Dao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public List<CityEntity> getCities() {
        return sessionFactory.getCurrentSession().createQuery("from CityEntity ").list();
    }

    @Transactional
    @Override
    public List<CountryEntity> getCountries() {
        return sessionFactory.getCurrentSession().createQuery("from CountryEntity ").list();
    }

    @Transactional
    @Override
    public List<CountryLanguageEntity> getLanguages() {
        return sessionFactory.getCurrentSession().createQuery("from CountryLanguageEntity ").list();
    }
}
