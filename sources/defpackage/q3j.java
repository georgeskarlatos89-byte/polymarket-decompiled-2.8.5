package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class q3j {
    public static final Logger a = Logger.getLogger(q3j.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static boolean a() {
        if (b.get()) {
            return true;
        }
        return false;
    }
}
