package com.duckcode.mailing.intranetmailingserverapp.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class FoldersEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String folder;

    public FoldersEntity() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoldersEntity folderEntity = (FoldersEntity) o;
        return Objects.equals(id, folderEntity.id) &&
                Objects.equals(username, folderEntity.username) &&
                Objects.equals(folder, folderEntity.folder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, folder);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", userName=" + username + '\'' +
                ", folder=" + folder + '\'' +
                '}';

    }
}
