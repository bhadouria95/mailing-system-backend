package com.duckcode.mailing.intranetmailingserverapp.dao.repository;

import com.duckcode.mailing.intranetmailingserverapp.dao.entity.FoldersEntity;
import org.springframework.data.repository.CrudRepository;

public interface FolderRepository extends CrudRepository<FoldersEntity, Long> {
}
