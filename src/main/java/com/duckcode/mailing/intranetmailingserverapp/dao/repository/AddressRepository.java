package com.duckcode.mailing.intranetmailingserverapp.dao.repository;

import com.duckcode.mailing.intranetmailingserverapp.dao.entity.AddressEntity;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<AddressEntity, Long> {
}
