package com.socure.docv.capturesdk.feature.base.presentation.ui;

import com.socure.docv.capturesdk.common.utils.PermissionState;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PermissionState.values().length];
        try {
            iArr[PermissionState.PERMISSION_GRANTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PermissionState.PERMISSION_DO_NOT_ASK_DENIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PermissionState.PERMISSION_DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
