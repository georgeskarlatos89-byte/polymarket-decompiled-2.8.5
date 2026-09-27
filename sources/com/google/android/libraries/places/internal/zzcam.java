package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcam extends zzcao {
    private final zzcan zzb;

    public /* synthetic */ zzcam(String str, boolean z, zzcan zzcanVar, byte[] bArr) {
        super(str, false, zzcanVar, null);
        brn.j(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        brn.m(zzcanVar, "marshaller");
        this.zzb = zzcanVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcao
    public final byte[] zza(Object obj) {
        String zzb = this.zzb.zzb(obj);
        brn.m(zzb, "null marshaller.toAsciiString()");
        return zzb.getBytes(StandardCharsets.US_ASCII);
    }

    @Override // com.google.android.libraries.places.internal.zzcao
    public final Object zzb(byte[] bArr) {
        return this.zzb.zza(new String(bArr, StandardCharsets.US_ASCII));
    }
}
