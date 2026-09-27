package com.fingerprintjs.android.fpjs_pro_internal;

import defpackage.nin;
import java.io.ByteArrayInputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterInputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()[B"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class p2 extends Lambda implements Function0<byte[]> {
    public final /* synthetic */ byte[] h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(byte[] bArr) {
        super(0);
        this.h = bArr;
    }

    public final byte[] b() {
        DeflaterInputStream deflaterInputStream = new DeflaterInputStream(new ByteArrayInputStream(this.h), new Deflater(-1, true));
        try {
            byte[] c = nin.c(deflaterInputStream);
            deflaterInputStream.close();
            return c;
        } finally {
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ byte[] invoke() {
        return b();
    }
}
