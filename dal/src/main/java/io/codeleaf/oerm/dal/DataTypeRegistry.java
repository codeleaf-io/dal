package io.codeleaf.oerm.dal;

import io.codeleaf.oerm.entity.EntitySchema;
import io.codeleaf.oerm.object.Entity;

public interface DataTypeRegistry {

    void register(Class<? extends Entity> object);

    void register(EntitySchema entitySchema);

    Iterable<EntitySchema> listEntityTypes();

    EntitySchema lookup(String dataType);

    boolean isPresent(Class<? extends Entity> objectType);

    boolean isPresent(String dataType);

    boolean isBound(Class<? extends Entity> objectType);

    boolean isBound(String dataType);
}
