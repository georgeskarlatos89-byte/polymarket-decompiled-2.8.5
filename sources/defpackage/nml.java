package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class nml implements Iterator {
    public static final nml zza;
    private static final /* synthetic */ nml[] zzb;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, nml] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        zza = r0;
        zzb = new nml[]{r0};
    }

    public static nml[] values() {
        return (nml[]) zzb.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        scn.d("no calls to next() since the last call to remove()", false);
    }
}
