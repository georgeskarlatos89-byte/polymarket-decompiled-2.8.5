package com.socure.docv.capturesdk.common.utils;

import defpackage.c1c;
import defpackage.dmk;
import defpackage.g1a;
import defpackage.lnf;
import defpackage.py2;
import defpackage.y0a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.Tensor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/ModelOutputs;", "", "interpreter", "Lorg/tensorflow/lite/Interpreter;", "numberOfBuffers", "", "<init>", "(Lorg/tensorflow/lite/Interpreter;I)V", "outputBuffers", "", "Ljava/nio/ByteBuffer;", "buffers", "getBuffers", "()Ljava/util/Map;", "getFloatArray", "", "index", "createOutputBuffer", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModelOutputs {
    public static final int $stable = 8;
    private final Interpreter interpreter;
    private final Map<Integer, ByteBuffer> outputBuffers;

    public ModelOutputs(Interpreter interpreter, int i) {
        interpreter.getClass();
        this.interpreter = interpreter;
        IntRange k = lnf.k(0, i);
        int a = c1c.a(CollectionsKt.w(k));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a < 16 ? 16 : a);
        Iterator it = k.iterator();
        while (((g1a) it).c) {
            Object next = ((y0a) it).next();
            linkedHashMap.put(next, createOutputBuffer(((Number) next).intValue()));
        }
        this.outputBuffers = linkedHashMap;
    }

    private final ByteBuffer createOutputBuffer(int index) {
        Tensor outputTensor = this.interpreter.getOutputTensor(index);
        if (outputTensor.dataType() == DataType.FLOAT32) {
            int[] shape = outputTensor.shape();
            shape.getClass();
            if (shape.length != 0) {
                int i = shape[0];
                int i2 = 1;
                int length = shape.length - 1;
                if (1 <= length) {
                    while (true) {
                        i *= shape[i2];
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                ByteBuffer order = ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder());
                order.getClass();
                return order;
            }
            py2.f("Empty array can't be reduced.");
            return null;
        }
        dmk.v("Only FLOAT32 outputs are supported");
        return null;
    }

    public final Map<Integer, ByteBuffer> getBuffers() {
        return this.outputBuffers;
    }

    public final float[] getFloatArray(int index) {
        ByteBuffer byteBuffer = this.outputBuffers.get(Integer.valueOf(index));
        if (byteBuffer == null) {
            return NumberUtilsKt.floatArrayOf(new double[0]);
        }
        byteBuffer.rewind();
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = new float[asFloatBuffer.remaining()];
        asFloatBuffer.get(fArr);
        return fArr;
    }
}
