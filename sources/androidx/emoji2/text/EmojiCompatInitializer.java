package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.gb7;
import defpackage.jb7;
import defpackage.kb7;
import defpackage.m64;
import defpackage.p6b;
import defpackage.pv9;
import defpackage.qc1;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements pv9 {
    /* JADX WARN: Type inference failed for: r0v0, types: [zh8, gb7] */
    @Override // defpackage.pv9
    public final Object create(Context context) {
        Object obj;
        ?? gb7Var = new gb7(new qc1(context, 2));
        gb7Var.a = 1;
        if (jb7.k == null) {
            synchronized (jb7.j) {
                try {
                    if (jb7.k == null) {
                        jb7.k = new jb7(gb7Var);
                    }
                } finally {
                }
            }
        }
        m64 C = m64.C(context);
        C.getClass();
        synchronized (m64.e) {
            try {
                obj = ((HashMap) C.a).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = C.x(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        p6b lifecycle = ((LifecycleOwner) obj).getLifecycle();
        lifecycle.a(new kb7(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // defpackage.pv9
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
