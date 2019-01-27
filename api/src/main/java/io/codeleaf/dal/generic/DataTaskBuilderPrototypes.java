package io.codeleaf.dal.generic;

import io.codeleaf.dal.generic.tasks.impl.*;

import java.util.Objects;

public final class DataTaskBuilderPrototypes<E, K, D, F, V> {

    private final RepositoryTypes<E, K, D, F, V> repositoryTypes;

    private DataTaskBuilderPrototypes(RepositoryTypes<E, K, D, F, V> repositoryTypes) {
        this.repositoryTypes = repositoryTypes;
    }

    public RepositoryTypes<E, K, D, F, V> getRepositoryTypes() {
        return repositoryTypes;
    }

    public CountTaskImpl.Builder<D, F, V> count() {
        return new CountTaskImpl.Builder<>(
                null,
                getRepositoryTypes().getFieldNameType(),
                getRepositoryTypes().getFieldValueType());
    }

    public CreateFieldsTaskImpl.Builder<K, D, F, V> createFields() {
        return new CreateFieldsTaskImpl.Builder<>(
                getRepositoryTypes().getObjectIdType(),
                null,
                getRepositoryTypes().getFieldNameType(),
                getRepositoryTypes().getFieldValueType());
    }

    public CreateObjectTaskImpl.Builder<E, K, D> createObject() {
        return new CreateObjectTaskImpl.Builder<>(
                getRepositoryTypes().getObjectType(),
                getRepositoryTypes().getObjectIdType(),
                null);
    }

    public CursorSearchAndCountTaskImpl.Builder<D, F, V, E> cursorSearchAndCount() {
        return new CursorSearchAndCountTaskImpl.Builder<>(
                null,
                getRepositoryTypes().getFieldNameType(),
                getRepositoryTypes().getFieldValueType(),
                getRepositoryTypes().getObjectType());
    }

    public CursorSearchTaskImpl.Builder<D, F, V, E> cursorSearch() {
        return new CursorSearchTaskImpl.Builder<>(
                null,
                getRepositoryTypes().getFieldNameType(),
                getRepositoryTypes().getFieldValueType(),
                getRepositoryTypes().getObjectType());
    }

    public DeleteTaskImpl.Builder<D, F, V> delete() {
        return new DeleteTaskImpl.Builder<>(
                null,
                getRepositoryTypes().getFieldNameType(),
                getRepositoryTypes().getFieldValueType());
    }

    public PageSearchAndCountTaskImpl.Builder<D, F, V, E> pageSearchAndCount() {
        return new PageSearchAndCountTaskImpl.Builder<>(
                null,
                getRepositoryTypes().getFieldNameType(),
                getRepositoryTypes().getFieldValueType(),
                getRepositoryTypes().getObjectType());
    }

    public PageSearchTaskImpl.Builder<D, F, V, E> pageSearch() {
        return new PageSearchTaskImpl.Builder<>(
                null,
                getRepositoryTypes().getFieldNameType(),
                getRepositoryTypes().getFieldValueType(),
                getRepositoryTypes().getObjectType());
    }

    public RetrieveTaskImpl.Builder<D, F, V, E> retrieve() {
        return new RetrieveTaskImpl.Builder<>(
                null,
                getRepositoryTypes().getFieldNameType(),
                getRepositoryTypes().getFieldValueType(),
                getRepositoryTypes().getObjectType());
    }

    public UpdateFieldsTaskImpl.Builder<D, F, V> updateFields() {
        return new UpdateFieldsTaskImpl.Builder<>(
                null,
                getRepositoryTypes().getFieldNameType(),
                getRepositoryTypes().getFieldValueType());
    }

    public UpdateObjectTaskImpl.Builder<E, D, F, V> updateObject() {
        return new UpdateObjectTaskImpl.Builder<>(
                getRepositoryTypes().getObjectType(),
                null,
                getRepositoryTypes().getFieldNameType(),
                getRepositoryTypes().getFieldValueType());
    }

    public static <E, K, D, F, V, H> DataTaskBuilderPrototypes<E, K, D, F, V> create(RepositoryTypes<E, K, D, F, V> repositoryTypes) {
        Objects.requireNonNull(repositoryTypes);
        return new DataTaskBuilderPrototypes<>(repositoryTypes);
    }
}
