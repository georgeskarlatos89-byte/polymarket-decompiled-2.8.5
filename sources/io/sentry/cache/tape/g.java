package io.sentry.cache.tape;

import defpackage.ix2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class g {
    public static final g c = new g(0, 0);
    public final long a;
    public final int b;

    public g(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(g.class.getSimpleName());
        sb.append("[position=");
        sb.append(this.a);
        sb.append(", length=");
        return ix2.i(this.b, "]", sb);
    }
}
