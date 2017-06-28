package io.altar.jseproject.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import io.altar.jseproject.model.Entity;
import io.altar.jseproject.repository.EntityRepository;

public class EntityService<E extends Entity> {
	
	public List<Entity> showEntities(EntityRepository<Entity> entityList){
		List<Entity> list = new ArrayList<Entity>((Collection<Entity>)entityList.getAll());
		return list;
	}
	
	public void addEntity(EntityRepository<E> entityList, E entity){
		entityList.addToList(entity);
	}
	
	public void removeEntity(EntityRepository<E> entityList, E entity){
		entityList.remove(entity.getId());
	}
}
