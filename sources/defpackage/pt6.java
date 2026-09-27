package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class pt6 implements Executor {
    private static final /* synthetic */ pt6[] $VALUES;
    public static final pt6 INSTANCE;

    /* JADX WARN: Type inference failed for: r0v0, types: [pt6, java.lang.Enum] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        INSTANCE = r0;
        $VALUES = new pt6[]{r0};
    }

    public static pt6 valueOf(String str) {
        return (pt6) Enum.valueOf(pt6.class, str);
    }

    public static pt6[] values() {
        return (pt6[]) $VALUES.clone();
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
