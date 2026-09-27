package io.sentry;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class p3 {
    public final io.sentry.protocol.w a;
    public final io.sentry.protocol.w b;
    public final ConcurrentHashMap c;
    public final File d;
    public final double e;
    public String f;

    public p3(io.sentry.protocol.w wVar, io.sentry.protocol.w wVar2, HashMap hashMap, File file, y4 y4Var) {
        this.a = wVar;
        this.b = wVar2;
        this.c = new ConcurrentHashMap(hashMap);
        this.d = file;
        this.e = y4Var.d() / 1.0E9d;
    }
}
