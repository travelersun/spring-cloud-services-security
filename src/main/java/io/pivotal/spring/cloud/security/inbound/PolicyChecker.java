package io.pivotal.spring.cloud.security.inbound;

import java.util.List;
import java.util.Map;

public interface PolicyChecker {

	void checkPolicy(Map<String, Object> initialTokenClaims, List<SelfIssuedToken> callStack) throws PolicyException;

}
