package io.intercom.android.sdk.utilities.commons;

import defpackage.ahh;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface TimeProvider {
    public static final TimeProvider SYSTEM = new ahh(9);

    long currentTimeMillis();
}
