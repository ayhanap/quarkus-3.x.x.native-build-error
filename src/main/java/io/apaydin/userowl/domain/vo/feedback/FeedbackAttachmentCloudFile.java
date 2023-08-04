package io.apaydin.userowl.domain.vo.feedback;

import io.apaydin.userowl.domain.vo.cloudfile.CloudFile;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;

@BsonDiscriminator(key = "bucket", value = "")
public class FeedbackAttachmentCloudFile implements CloudFile {



    @Override
    public CloudFile copy() {
        return null;
    }
}


