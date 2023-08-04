package io.apaydin.userowl.domain.vo.feedback;

import io.apaydin.userowl.domain.vo.cloudfile.CloudFile;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonIgnore;

import java.nio.file.Path;
import java.util.Map;

@BsonDiscriminator(key = "bucket", value = "")
public class FeedbackAttachmentCloudFile implements CloudFile {

    @BsonIgnore
    private final String bucket = "";
    private boolean needHTMLToImageConversion;
    @BsonIgnore
    private String organizationId;
    @BsonIgnore
    private String projectId;
    @BsonIgnore
    private String feedbackId;

    private String filename;

    @BsonIgnore
    private String cloudFileId;

    @BsonIgnore
    private Path localFilePath;
    private String contentType;
    private Long size;
    private String cloudUri;

    private Map<String, String> metadata;

    private String sizeSpecifier;

    private boolean resized;

    private Integer width;
    private Integer height;

    private static final String screenshotFilenameFormat = "''{0}'': '{' $regex: {1} '}'";



    @Override
    public CloudFile copy() {
        return null;
    }
}


