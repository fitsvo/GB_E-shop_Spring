package com.geekbrains.geekmarketwinter.repositories.interfaces;

import com.geekbrains.geekmarketwinter.entites.FileMetaDTO;

import java.util.Collection;
import java.util.UUID;

public interface IFileMetaProvider {

    String checkFileExists(UUID fileHash);
    String checkFileNameExists(UUID fileHash, String fileName);

    void saveFileMeta(UUID Hash, String fileName, int sybType);

    void deleteFileMeta(UUID Hash, String fileName);

    Collection<FileMetaDTO> getMetaFiles(int subtype);
}