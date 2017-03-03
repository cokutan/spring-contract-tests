package tr.gov.tubitak.bilgem.yte.maliye;

import org.hibernate.QueryException;
import org.hibernate.dialect.function.SQLFunction;
import org.hibernate.engine.spi.Mapping;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.type.BooleanType;
import org.hibernate.type.Type;

import java.util.List;
import java.util.StringJoiner;

public class StartsWithPostgresFunction implements  SQLFunction {

    @Override
    public String render(final Type firstArgumentType, final List arguments, final SessionFactoryImplementor factory) throws QueryException {
        if (arguments.size() < 2) {
            throw new IllegalArgumentException("En az iki argümanlı parametre geçmelisiniz.");
        }

        String columnName = (String) arguments.get(0);
        String value = (String) arguments.get(1);
        return columnName+" ~ '"+value.toString()+"*.*{,}'";
    }

    @Override
    public Type getReturnType(Type columnType, Mapping mapping)
        throws QueryException {
        return new BooleanType();
    }

    @Override
    public boolean hasArguments() {
        return true;
    }

    @Override
    public boolean hasParenthesesIfNoArguments() {
        return false;
    }

}
