package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xsl implements Executor {
    public static final xsl zza;
    private static final /* synthetic */ xsl[] zzb;

    /* JADX WARN: Type inference failed for: r0v0, types: [xsl, java.lang.Enum] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        zza = r0;
        zzb = new xsl[]{r0};
    }

    public static xsl[] values() {
        return (xsl[]) zzb.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
