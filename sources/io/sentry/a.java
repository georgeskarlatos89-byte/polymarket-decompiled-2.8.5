package io.sentry;

import defpackage.vx;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class a {
    public final byte[] a;
    public final io.sentry.protocol.j0 b;
    public final vx c;
    public final String d;
    public final String e;
    public final String f;

    public a(io.sentry.protocol.j0 j0Var) {
        this.a = null;
        this.b = j0Var;
        this.c = null;
        this.d = "view-hierarchy.json";
        this.e = "application/json";
        this.f = "event.view_hierarchy";
    }

    public a(String str, String str2, byte[] bArr, String str3) {
        this.a = bArr;
        this.b = null;
        this.c = null;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public a(byte[] bArr, String str, String str2) {
        this(str, str2, bArr, "event.attachment");
    }

    public a(vx vxVar) {
        this.a = null;
        this.b = null;
        this.c = vxVar;
        this.d = "screenshot.png";
        this.e = "image/png";
        this.f = "event.attachment";
    }
}
