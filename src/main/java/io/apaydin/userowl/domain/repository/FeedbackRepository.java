package io.apaydin.userowl.domain.repository;

import io.apaydin.userowl.domain.entity.feedback.Feedback;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class FeedbackRepository implements ReactivePanacheMongoRepository<Feedback> {
//
//    @Inject
//    ManagedExecutor managedExecutor;



}
