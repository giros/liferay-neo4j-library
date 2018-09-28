/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.neo4j.service;

import com.liferay.neo4j.api.LiferayGraphDatabaseNode;
import com.liferay.neo4j.api.LiferayGraphDatabaseService;
import com.liferay.neo4j.embedded.EmbeddedGraphDatabase;
import com.liferay.portal.kernel.model.ClassedModel;

import org.neo4j.graphdb.GraphDatabaseService;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Map;

/**
 * @author Gergely Mathe
 */
@Component(immediate = true, service = LiferayGraphDatabaseService.class)
public class LiferayGraphDatabaseServiceImpl
	implements LiferayGraphDatabaseService {

	@Activate
	public void activate(Map<String, Object> properties) {
		_graphDatabaseService =
			_embeddedGraphDatabase.getEmbeddedDatabaseService();
	}

	public LiferayGraphDatabaseNode addNode(ClassedModel classedModel) {
		return new LiferayGraphDatabaseNode();
	}

	public void deleteNode(String className, long classPK) {

	}

	private GraphDatabaseService _graphDatabaseService;

	@Reference
	EmbeddedGraphDatabase _embeddedGraphDatabase;

}