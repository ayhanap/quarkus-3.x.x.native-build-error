package io.apaydin.userowl.domain.entity.feedback;

import io.apaydin.userowl.domain.vo.cloudfile.MultiSizeCloudFile;
import io.apaydin.userowl.domain.vo.feedback.FeedbackAttachmentCloudFile;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Data;
import org.bson.BsonType;
import org.bson.codecs.pojo.annotations.BsonRepresentation;
import org.bson.types.ObjectId;

@Data
@MongoEntity(collection = "feedback")
public class Feedback {
    private ObjectId id;
    private ObjectId projectId;

    @BsonRepresentation(BsonType.OBJECT_ID)
    private MultiSizeCloudFile<FeedbackAttachmentCloudFile> cloudFile;






}
