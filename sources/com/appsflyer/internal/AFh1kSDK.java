package com.appsflyer.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class AFh1kSDK extends AFh1sSDK {
    private final boolean copy;
    private final boolean copydefault;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFh1kSDK(String str, Boolean bool, Boolean bool2) {
        super(str, null, Boolean.valueOf(r4));
        boolean z;
        boolean z2;
        if (bool2 != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        this.copydefault = z2;
        this.copy = true;
    }

    public AFh1kSDK() {
        this(null, null, null);
    }
}
