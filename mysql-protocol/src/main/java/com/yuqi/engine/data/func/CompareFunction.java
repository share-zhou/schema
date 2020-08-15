package com.yuqi.engine.data.func;

import com.yuqi.engine.data.type.DataType;
import com.yuqi.engine.data.value.Value;

import java.util.List;

/**
 * @author yuqi
 * @mail yuqi4733@gmail.com
 * @description your description
 * @time 6/8/20 11:26
 **/
public abstract class CompareFunction extends Scalar {

    public CompareFunction() {
        super(2);
    }

    public static final CompareFunction LESS_THAN = new CompareFunction() {
        @Override
        public Value evaluate(List<Value> args, DataType returnType) {
            assert args.size() == 2;
            final Value v1 = args.get(0);
            final Value v2 = args.get(1);

            if (v1.isNull() && v2.isNull()) {
                return Value.ofBooleanTrue();
            } else if (!v1.isNull() && !v2.isNull()) {
                return Value.ofBooean(0 > v1.compareTo(v2));
            } else {
                return Value.ofBooleanFalse();
            }
        }
    };

    public static final CompareFunction LESS_THAN_OR_EQUAL = new CompareFunction() {
        @Override
        public Value evaluate(List<Value> args, DataType returnType) {
            assert args.size() == 2;
            final Value v1 = args.get(0);
            final Value v2 = args.get(1);

            if (v1.isNull() && v2.isNull()) {
                return Value.ofBooleanTrue();
            } else if (!v1.isNull() && !v2.isNull()) {
                return Value.ofBooean(v1.compareTo(v2) <= 0);
            } else {
                return Value.ofBooleanFalse();
            }
        }
    };

    public static final CompareFunction GREATER_THAN = new CompareFunction() {
        @Override
        public Value evaluate(List<Value> args, DataType returnType) {
            assert args.size() == 2;
            final Value v1 = args.get(0);
            final Value v2 = args.get(1);

            if (v1.isNull() && v2.isNull()) {
                return Value.ofBooleanTrue();
            } else if (!v1.isNull() && !v2.isNull()) {
                return Value.ofBooean(v1.compareTo(v2) > 0);
            } else {
                return Value.ofBooleanFalse();
            }
        }
    };

    public static final CompareFunction GREATER_THAN_OR_EQUAL = new CompareFunction() {
        @Override
        public Value evaluate(List<Value> args, DataType returnType) {
            assert args.size() == 2;
            final Value v1 = args.get(0);
            final Value v2 = args.get(1);

            if (v1.isNull() && v2.isNull()) {
                return Value.ofBooleanTrue();
            } else if (!v1.isNull() && !v2.isNull()) {
                return Value.ofBooean(v1.compareTo(v2) >= 0);
            } else {
                return Value.ofBooleanFalse();
            }
        }
    };

    public static final CompareFunction EQUALS = new CompareFunction() {
        @Override
        public Value evaluate(List<Value> args, DataType returnType) {
            assert args.size() == 2;
            final Value v1 = args.get(0);
            final Value v2 = args.get(1);

            if (v1.isNull() && v2.isNull()) {
                return Value.ofBooleanTrue();
            } else if (!v1.isNull() && !v2.isNull()) {
                return Value.ofBooean(v1.compareTo(v2) == 0);
            } else {
                return Value.ofBooleanFalse();
            }
        }
    };

    public static final CompareFunction NOT_EQUALS = new CompareFunction() {
        @Override
        public Value evaluate(List<Value> args, DataType returnType) {
            assert args.size() == 2;
            final Value v1 = args.get(0);
            final Value v2 = args.get(1);

            if (v1.isNull() && v2.isNull()) {
                return Value.ofBooleanTrue();
            } else if (!v1.isNull() && !v2.isNull()) {
                return Value.ofBooean(v1.compareTo(v2) != 0);
            } else {
                return Value.ofBooleanFalse();
            }
        }
    };

}
