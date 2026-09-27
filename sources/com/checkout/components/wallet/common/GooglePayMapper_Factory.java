package com.checkout.components.wallet.common;

import defpackage.blc;
import defpackage.dv7;
import defpackage.jgf;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class GooglePayMapper_Factory implements dv7 {
    private final jgf a;

    public GooglePayMapper_Factory(jgf jgfVar) {
        this.a = jgfVar;
    }

    public static GooglePayMapper_Factory create(jgf jgfVar) {
        return new GooglePayMapper_Factory(jgfVar);
    }

    public static GooglePayMapper newInstance(blc blcVar) {
        return new GooglePayMapper(blcVar);
    }

    @Override // defpackage.kgf
    public final GooglePayMapper get() {
        return new GooglePayMapper((blc) this.a.get());
    }

    @Override // defpackage.kgf
    public final /* bridge */ /* synthetic */ Object get() {
        return get();
    }
}
