package com.yuqi.protocol.pkg.response;

import com.yuqi.protocol.pkg.AbstractPackage;
import com.yuqi.protocol.utils.IOUtils;
import io.netty.buffer.ByteBuf;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description your description
 * @time 6/7/20 20:57
 */
public class ColumnCountPackage extends AbstractPackage {

    private int columnCount;

    public ColumnCountPackage(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public void read(ByteBuf byteBuf) {
        IOUtils.readLengthEncodedInteger(byteBuf);
    }

    @Override
    public void write(ByteBuf byteBuf) {
        IOUtils.writeLengthEncodedInteger(columnCount, byteBuf);
    }
}
