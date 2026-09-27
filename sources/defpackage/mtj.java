package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class mtj implements Executor {
    private static final /* synthetic */ mtj[] $VALUES;
    private static final Handler HANDLER;
    public static final mtj INSTANCE;

    /* JADX WARN: Type inference failed for: r0v0, types: [mtj, java.lang.Enum] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        INSTANCE = r0;
        $VALUES = new mtj[]{r0};
        HANDLER = new Handler(Looper.getMainLooper());
    }

    public static mtj valueOf(String str) {
        return (mtj) Enum.valueOf(mtj.class, str);
    }

    public static mtj[] values() {
        return (mtj[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        HANDLER.post(runnable);
    }
}
