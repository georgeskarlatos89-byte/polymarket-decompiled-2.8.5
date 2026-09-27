package defpackage;

import java.util.Comparator;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class v4m implements Comparator {
    public static final v4m zza;
    private static final /* synthetic */ v4m[] zzb;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v4m] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        zza = r0;
        zzb = new v4m[]{r0};
    }

    public static v4m[] values() {
        return (v4m[]) zzb.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < min; i++) {
            int i2 = (bArr[i] & MessagePack.Code.EXT_TIMESTAMP) - (bArr2[i] & MessagePack.Code.EXT_TIMESTAMP);
            if (i2 != 0) {
                return i2;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
