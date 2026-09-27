package defpackage;

import okhttp3.Request;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface bv2<T> extends Cloneable {
    void cancel();

    bv2 clone();

    void enqueue(uv2 uv2Var);

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    b3j timeout();
}
