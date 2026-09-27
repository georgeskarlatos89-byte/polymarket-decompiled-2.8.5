package com.google.android.gms.internal.mlkit_vision_mediapipe;

import defpackage.ace;
import defpackage.bdm;
import defpackage.s4l;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class zzhu extends RuntimeException {
    public zzhu(int i, String str) {
        super(ace.m(bdm.values()[i].a(), ": ", str));
        bdm bdmVar = bdm.values()[i];
    }

    public zzhu(int i, byte[] bArr) {
        this(i, new String(bArr, s4l.a));
    }
}
