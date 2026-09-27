package com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SNAStatus.values().length];
        try {
            iArr[SNAStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SNAStatus.CELLULAR_NETWORK_NOT_AVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SNAStatus.NETWORKING_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SNAStatus.NO_RESULT_FROM_THE_URL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
