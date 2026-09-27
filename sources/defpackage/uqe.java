package defpackage;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uqe {
    public final rn6 a;
    public final Object b;

    static {
        new uqe();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, rn6] */
    public uqe() {
        rn6 rn6Var;
        if (u1k.a >= 31) {
            ?? obj = new Object();
            obj.a = LogSessionId.LOG_SESSION_ID_NONE;
            rn6Var = obj;
        } else {
            rn6Var = null;
        }
        this.a = rn6Var;
        this.b = new Object();
    }

    public final synchronized LogSessionId a() {
        rn6 rn6Var;
        rn6Var = this.a;
        rn6Var.getClass();
        return (LogSessionId) rn6Var.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uqe) {
                uqe uqeVar = (uqe) obj;
                if ("".equals("") && this.a == uqeVar.a && this.b == uqeVar.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash("", this.a, this.b);
    }
}
