package defpackage;

import android.app.Notification;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ek8 {
    public final int a;
    public final int b;
    public final Notification c;

    public ek8(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ek8.class == obj.getClass()) {
            ek8 ek8Var = (ek8) obj;
            if (this.a == ek8Var.a && this.b == ek8Var.b) {
                return this.c.equals(ek8Var.c);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
