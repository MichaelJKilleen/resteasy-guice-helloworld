package com.bottomfeeder.helloworld.persist;

import com.bottomfeeder.helloworld.persist.dao.CustomerDao;
import com.google.inject.Binder;
import com.google.inject.Module;

public class PersistModule implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(CustomerPersist.class).to(CustomerDao.class);
        binder.bind(DataSourceFactory.class);
    }
}
