package io.apaydin.userowl.domain.repository;

import io.apaydin.userowl.domain.vo.cloudfile.CloudFile;
import io.apaydin.userowl.domain.vo.cloudfile.MultiSizeCloudFile;
import io.quarkus.arc.All;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.unchecked.Unchecked;
import jakarta.annotation.Priority;
import org.eclipse.microprofile.context.ManagedExecutor;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.xml.bind.DatatypeConverter;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@ApplicationScoped
public class ImageTransformRepository implements MultiSizeCloudFile.CloudFileTransformer {

    @Inject
    ManagedExecutor executor;

    @Inject
    @All
    List<AWTCloudFileTransformer> awtCloudFileTransformers;

    private AWTCloudFileTransformer getCurrentCloudFileTransformer(){
        return awtCloudFileTransformers.get(awtCloudFileTransformers.size() - 1);
    }

    @Override
    public Uni<String> blurHash(CloudFile source) {
        return getCurrentCloudFileTransformer().blurHash(source);
    }


    public Uni<File> convertBase64ToFile(String base64String) {
    return null;


    }

    @Override
    public Uni<CloudFile> resize(CloudFile source, MultiSizeCloudFile.Size size) {
        return getCurrentCloudFileTransformer().resize(source, size);
    }

    @Override
    public Uni<CloudFile> convertHTMLToImage(CloudFile source) {
        return getCurrentCloudFileTransformer().convertHTMLToImage(source);
    }

    public interface AWTCloudFileTransformer extends MultiSizeCloudFile.CloudFileTransformer {

    }

}
