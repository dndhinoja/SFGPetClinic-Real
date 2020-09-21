package com.nd.SFGPetClinicReal.services.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import com.nd.SFGPetClinicReal.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
	protected Map<Long, T> map = new HashMap<>();

	Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	T findById(ID id) {
		return map.get(id);
	}

	T save(T object) {
		if (object != null) {
			if (object.getId() == null) {
				object.setId(nextId());
			}
			map.put(object.getId(), object);
		} else {
			throw new RuntimeException("object cannot null");
		}

		return object;
	}

	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

	void deleteById(ID id) {
		map.remove(id);

	}

	private Long nextId() {
		Long nextId = null;
		try {
			nextId = Collections.max(map.keySet()) + 1;
		}catch(NoSuchElementException e) {
			nextId = 1L;
		}
		return nextId;
	}
}
