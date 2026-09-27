package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import android.os.Trace;
import android.util.Log;
import io.sentry.android.core.m0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class mb7 implements Runnable {
    public static final /* synthetic */ mb7 b = new mb7(2);
    public static final /* synthetic */ mb7 c = new mb7(3);
    public static final /* synthetic */ mb7 d = new mb7(5);
    public final /* synthetic */ int a;

    public /* synthetic */ mb7(hkn hknVar) {
        this.a = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        switch (this.a) {
            case 0:
                try {
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (jb7.d()) {
                        jb7.a().e();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i = runningAppProcessInfo.importance;
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 17);
                    sb.append("Memory state is: ");
                    sb.append(i);
                    Log.i("PhenotypeProcessReaper", sb.toString());
                } catch (RuntimeException e) {
                    m0.q("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
                }
                if (runningAppProcessInfo.importance >= 400) {
                    z = true;
                    if (!new Boolean(z).booleanValue()) {
                        Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                        Process.killProcess(Process.myPid());
                        System.exit(0);
                        return;
                    }
                    return;
                }
                z = false;
                if (!new Boolean(z).booleanValue()) {
                }
        }
    }

    public /* synthetic */ mb7(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final /* synthetic */ void b() {
    }

    private final /* synthetic */ void c() {
    }

    private final void d() {
    }

    private final /* synthetic */ void e() {
    }
}
