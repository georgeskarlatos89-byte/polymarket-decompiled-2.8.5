package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nt6 implements Executor {
    private static final /* synthetic */ nt6[] $VALUES;
    public static final nt6 INSTANCE;

    /* JADX WARN: Type inference failed for: r0v0, types: [nt6, java.lang.Enum] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        INSTANCE = r0;
        $VALUES = new nt6[]{r0};
    }

    public static nt6 valueOf(String str) {
        return (nt6) Enum.valueOf(nt6.class, str);
    }

    public static nt6[] values() {
        return (nt6[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
