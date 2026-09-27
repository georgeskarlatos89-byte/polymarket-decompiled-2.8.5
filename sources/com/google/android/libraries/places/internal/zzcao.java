package com.google.android.libraries.places.internal;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.brn;
import defpackage.dmk;
import defpackage.ix2;
import defpackage.wql;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzcao {
    public static final /* synthetic */ int zza = 0;
    private static final BitSet zzb;
    private final String zzc;
    private final String zzd;
    private final byte[] zze;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        zzb = bitSet;
    }

    public zzcao(String str, boolean z, Object obj, byte[] bArr) {
        brn.m(str, Keys.KEY_NAME);
        this.zzc = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        brn.m(lowerCase, Keys.KEY_NAME);
        brn.g("token must have at least 1 tchar", !lowerCase.isEmpty());
        if (lowerCase.equals("connection")) {
            zzcan zzcanVar = zzcas.zza;
            zzcas.zzg().logp(Level.WARNING, "io.grpc.Metadata$Key", "validateName", "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        int i = 0;
        while (i < lowerCase.length()) {
            char charAt = lowerCase.charAt(i);
            if (z && charAt == ':') {
                if (i == 0) {
                    i = 0;
                    i++;
                } else {
                    charAt = ':';
                }
            }
            if (zzb.get(charAt)) {
                i++;
            } else {
                dmk.v(wql.a("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
                throw null;
            }
        }
        this.zzd = lowerCase;
        this.zze = lowerCase.getBytes(StandardCharsets.US_ASCII);
    }

    public static zzcao zzc(String str, zzcan zzcanVar) {
        return new zzcam(str, false, zzcanVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.zzd.equals(((zzcao) obj).zzd);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final String toString() {
        String str = this.zzd;
        return ix2.p(new StringBuilder(String.valueOf(str).length() + 12), "Key{name='", str, "'}");
    }

    public abstract byte[] zza(Object obj);

    public abstract Object zzb(byte[] bArr);

    public final String zzd() {
        return this.zzd;
    }

    public final byte[] zze() {
        return this.zze;
    }
}
