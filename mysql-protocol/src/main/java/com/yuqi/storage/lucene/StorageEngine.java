package com.yuqi.storage.lucene;

import com.yuqi.engine.data.value.Value;
import com.yuqi.sql.LifeCycle;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * @author yuqi
 * @mail yuqi4733@gmail.com
 * @description your description
 * @time 13/8/20 16:58
 **/
public interface StorageEngine extends LifeCycle {

    /**
     * Insert row
     *
     * @param row
     * @return
     */
    boolean insert(List<List<Value>> row) throws IOException;

    /**
     * Query
     *
     * @param queryContext
     */
    Iterator<List<Value>> query(QueryContext queryContext) throws IOException;


    /**
     * Mark read only
     *
     * @return
     */
    default boolean readOnly() {
        return false;
    }


    /**
     * @param readOnly
     */
    default void setReadOnly(boolean readOnly) {
        //todo
    }
}
