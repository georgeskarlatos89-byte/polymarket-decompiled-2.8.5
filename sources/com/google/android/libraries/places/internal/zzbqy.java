package com.google.android.libraries.places.internal;

import defpackage.ace;
import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbqy extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbqy(long j, long j2, int i, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), th);
        Locale locale = Locale.US;
        StringBuilder p = ace.p(j, "Pos: ", ", limit: ");
        p.append(j2);
        p.append(", len: ");
        p.append(i);
    }

    public zzbqy() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzbqy(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
