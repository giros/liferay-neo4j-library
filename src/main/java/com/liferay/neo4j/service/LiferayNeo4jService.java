package com.liferay.neo4j.service;

import com.liferay.neo4j.GraphDatabase;
import com.liferay.neo4j.api.LiferayNeo4jNode;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = LiferayNeo4jService.class)
public class LiferayNeo4jService {

	public LiferayNeo4jNode addNode(ClassedModel classedModel) {
	}

	@Reference
	GraphDatabase _graphDatabase;
}
