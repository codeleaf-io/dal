package io.codeleaf.dal.record;

import io.codeleaf.common.utils.Types;
import io.codeleaf.dal.generic.Repository;
import io.codeleaf.dal.generic.RepositoryTypes;
import io.codeleaf.dal.generic.TypedRepositoryImpl;
import io.codeleaf.modeling.data.IdentifierWithType;
import io.codeleaf.modeling.data.RecordWithType;
import io.codeleaf.modeling.data.ValueWithType;

public interface RecordRepository extends Repository<RecordWithType, IdentifierWithType, String, String, ValueWithType<?>> {

    RepositoryTypes<RecordWithType, IdentifierWithType, String, String, ValueWithType<?>> GENERIC_TYPES = new RepositoryTypes<>(
            RecordWithType.class,
            IdentifierWithType.class,
            String.class,
            String.class,
            Types.cast(ValueWithType.class));

    @Override
    default RepositoryTypes<RecordWithType, IdentifierWithType, String, String, ValueWithType<?>> getGenericTypes() {
        return GENERIC_TYPES;
    }

    default RecordTypedRepository toTypedRepository(String dataType) {
        return Types.cast(
                TypedRepositoryImpl.create(this, dataType),
                RecordTypedRepository.class);
    }
}