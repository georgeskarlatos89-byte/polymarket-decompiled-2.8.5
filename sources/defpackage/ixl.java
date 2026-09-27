package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ixl implements Executor {
    public static final ixl zza;
    private static final /* synthetic */ ixl[] zzb;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ixl] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        zza = r0;
        zzb = new ixl[]{r0};
    }

    public static ixl[] values() {
        return (ixl[]) zzb.clone();
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
