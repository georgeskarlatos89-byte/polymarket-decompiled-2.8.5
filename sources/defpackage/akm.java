package defpackage;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class akm {
    public static final HashMap a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        a = new HashMap();
        m51.j(Process.myUid(), "UID: [", Process.myPid(), "]  PID: [", "] ").concat("PlayCoreVersion");
    }
}
