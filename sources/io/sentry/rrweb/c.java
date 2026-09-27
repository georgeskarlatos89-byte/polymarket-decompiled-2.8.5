package io.sentry.rrweb;

import io.sentry.j2;
import io.sentry.l3;
import io.sentry.x0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum c implements j2 {
    DomContentLoaded,
    Load,
    FullSnapshot,
    IncrementalSnapshot,
    Meta,
    Custom,
    Plugin;

    @Override // io.sentry.j2
    public void serialize(l3 l3Var, x0 x0Var) {
        ((io.sentry.internal.debugmeta.c) l3Var).z(ordinal());
    }
}
