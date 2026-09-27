package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzbpz;
import com.google.android.libraries.places.internal.zzbqa;
import defpackage.ix2;
import defpackage.omf;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzbqa<MessageType extends zzbqa<MessageType, BuilderType>, BuilderType extends zzbpz<MessageType, BuilderType>> implements zzbsz {
    protected transient int zza = 0;

    public static void zzbv(Iterable iterable, List list) {
        zzbpz.zzv(iterable, list);
    }

    @Override // com.google.android.libraries.places.internal.zzbsz
    public final zzbqq zzbr() {
        try {
            int zzbE = zzbE();
            zzbqq zzbqqVar = zzbqq.zza;
            byte[] bArr = new byte[zzbE];
            zzbqw zzbqwVar = new zzbqw(bArr, 0, zzbE, null);
            zzbT(zzbqwVar);
            return zzbqn.zza(zzbqwVar, bArr);
        } catch (IOException e) {
            String name = this.getClass().getName();
            omf.m(ix2.p(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbsz
    public final byte[] zzbs() {
        try {
            int zzbE = zzbE();
            byte[] bArr = new byte[zzbE];
            zzbqw zzbqwVar = new zzbqw(bArr, 0, zzbE, null);
            zzbT(zzbqwVar);
            zzbqwVar.zzI();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            omf.m(ix2.p(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbsz
    public final void zzbt(OutputStream outputStream) {
        int zzbE = zzbE();
        if (zzbE > 4096) {
            zzbE = 4096;
        }
        zzbqz zzbqzVar = new zzbqz(outputStream, zzbE);
        zzbT(zzbqzVar);
        zzbqzVar.zzx();
    }

    public int zzbu(zzbtm zzbtmVar) {
        throw null;
    }
}
