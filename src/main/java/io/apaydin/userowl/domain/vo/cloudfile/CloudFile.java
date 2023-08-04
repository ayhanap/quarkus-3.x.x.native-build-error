package io.apaydin.userowl.domain.vo.cloudfile;

import io.apaydin.userowl.domain.vo.Copyable;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;

@BsonDiscriminator(key = "bucket")
public interface CloudFile extends Copyable<CloudFile> {




}
