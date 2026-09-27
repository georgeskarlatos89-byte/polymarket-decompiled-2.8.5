package io.sentry;

import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface k3 extends Closeable {
    TimeZone B(x0 x0Var);

    Double M();

    Date P(x0 x0Var);

    Boolean S();

    Object V(x0 x0Var, w1 w1Var);

    Float V0();

    Object Z0();

    void beginArray();

    void beginObject();

    void endArray();

    void endObject();

    ArrayList g1(x0 x0Var, w1 w1Var);

    boolean hasNext();

    Integer n0();

    double nextDouble();

    float nextFloat();

    int nextInt();

    long nextLong();

    String nextName();

    String nextString();

    io.sentry.vendor.gson.stream.b peek();

    Long r0();

    void setLenient(boolean z);

    void skipValue();

    String w0();

    void x(x0 x0Var, AbstractMap abstractMap, String str);

    HashMap z0(x0 x0Var, w1 w1Var);
}
