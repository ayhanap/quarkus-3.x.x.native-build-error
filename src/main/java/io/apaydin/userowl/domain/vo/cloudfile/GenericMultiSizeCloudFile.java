package io.apaydin.userowl.domain.vo.cloudfile;

import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "cloudFile")
public class GenericMultiSizeCloudFile extends MultiSizeCloudFile<CloudFile>{



}
