package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yma {
    public final KeyEvent a;

    public /* synthetic */ yma(KeyEvent keyEvent) {
        this.a = keyEvent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yma) {
            if (!Intrinsics.areEqual(this.a, ((yma) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
