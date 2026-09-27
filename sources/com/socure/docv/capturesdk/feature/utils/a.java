package com.socure.docv.capturesdk.feature.utils;

import defpackage.zfd;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a implements zfd {
    public final boolean a;
    public final zfd b;
    public boolean c;

    public a(boolean z, zfd zfdVar) {
        zfdVar.getClass();
        this.a = z;
        this.b = zfdVar;
    }

    @Override // defpackage.zfd
    public final void onChanged(Object obj) {
        if (!this.a || this.c) {
            this.b.onChanged(obj);
        }
        this.c = true;
    }
}
