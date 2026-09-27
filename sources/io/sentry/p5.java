package io.sentry;

import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum p5 implements j2 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    @Override // io.sentry.j2
    public void serialize(l3 l3Var, x0 x0Var) {
        ((io.sentry.internal.debugmeta.c) l3Var).D(name().toLowerCase(Locale.ROOT));
    }
}
