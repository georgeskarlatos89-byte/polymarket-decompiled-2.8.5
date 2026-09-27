package com.launchdarkly.sdk;

import java.util.Comparator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class h implements Comparator {
    public static final h a = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((LDContext) obj).kind.a.compareTo(((LDContext) obj2).kind.a);
    }
}
