package io.apaydin.userowl.domain.vo.cloudfile;

import io.quarkus.mongodb.panache.common.MongoEntity;
import io.smallrye.mutiny.Uni;
import lombok.Data;
import org.bson.codecs.pojo.annotations.BsonIgnore;
import org.bson.types.ObjectId;

import java.util.Arrays;
import java.util.Optional;

@Data
@MongoEntity(collection = "cloudFile")
public class MultiSizeCloudFile<T extends CloudFile>  {

    private ObjectId id;


    @BsonIgnore
    private CloudFileTransformer resizer;

    public interface CloudFileTransformer {
        Uni<CloudFile> resize(CloudFile source, Size size);

        Uni<CloudFile> convertHTMLToImage(CloudFile source);

        Uni<String> blurHash(CloudFile source);

    }

    public static enum Size{

        SOURCE ("source", 0),

        BLUR ("blur", 0),
        SMALL ("sm", 256),
        MEDIUM ("md", 512),
        LARGE ("lg", 1024),
        X_LARGE ("xl", 2048);

        public final String name;
        public final double maxDimension;

        Size(String name, int maxDimension) {
            this.name = name;
            this.maxDimension = maxDimension;
        }

        public static Optional<Size> fromText(String text) {
            return Arrays.stream(values())
                    .filter(bl -> bl.name.equalsIgnoreCase(text))
                    .findFirst();
        }
    }



}
