/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.webservices.forms.web.controller;

import org.openmrs.module.webservices.forms.web.resource.FieldTypeResource;
import org.openmrs.module.webservices.rest.web.RestConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.openmrs.module.webservices.rest.web.v1_0.controller.BaseCrudController;

/**
 * Controller for REST web service access to the FieldType. Supports CRUD on the resource itself.
 */
@Controller
@RequestMapping(value = "/rest/wsforms/fieldType")
public class FieldTypeController extends BaseCrudController<FieldTypeResource> {
}