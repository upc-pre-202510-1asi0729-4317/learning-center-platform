package com.acme.center.platform.iam.domain.model.commaands;

import java.util.List;

public record SignUpCommand(String username, String password, List<String> roles) {
}
