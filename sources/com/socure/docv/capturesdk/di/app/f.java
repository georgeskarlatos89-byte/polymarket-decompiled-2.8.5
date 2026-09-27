package com.socure.docv.capturesdk.di.app;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class f implements com.socure.docv.capturesdk.core.provider.interfaces.d {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.d
    public final Object get() {
        switch (this.a) {
            case 0:
                return Float.valueOf(0.45f);
            case 1:
                return Float.valueOf(0.5f);
            case 2:
                return Float.valueOf(0.3f);
            case 3:
                return Float.valueOf(0.65f);
            case 4:
                return Long.valueOf(System.currentTimeMillis());
            default:
                return Long.valueOf(System.currentTimeMillis());
        }
    }
}
