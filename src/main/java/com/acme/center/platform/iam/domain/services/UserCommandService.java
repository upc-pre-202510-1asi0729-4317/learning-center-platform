package com.acme.center.platform.iam.domain.services;

import com.acme.center.platform.iam.domain.model.aggregates.User;
import com.acme.center.platform.iam.domain.model.commaands.SignInCommand;
import com.acme.center.platform.iam.domain.model.commaands.SignUpCommand;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.Optional;

public interface UserCommandService {

    Optional<ImmutablePair<User, String>> handle(SignInCommand command);

    Optional<User> handle(SignUpCommand command);
}
