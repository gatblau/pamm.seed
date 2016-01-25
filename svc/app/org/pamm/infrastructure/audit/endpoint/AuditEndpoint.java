package org.pamm.infrastructure.audit.endpoint;

import com.google.inject.Inject;
import org.pamm.endpoint.ResourceEndpoint;
import org.pamm.infrastructure.audit.service.AuditService;
import play.db.jpa.Transactional;
import play.mvc.Result;


public class AuditEndpoint extends ResourceEndpoint {

    private final AuditService auditService;

    @Inject
    public AuditEndpoint(AuditService auditService) {
        this.auditService = auditService;
    }

    @Transactional
    public Result log() {
        return response(auditService.log(request().body().asJson()));
    }

}
