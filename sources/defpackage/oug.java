package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class oug {
    public final String a;
    public final Function2 b;
    public final boolean c;

    public oug(String str, Function2 function2) {
        this.a = str;
        this.b = function2;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ oug(String str) {
        this(str, jug.t);
    }

    public oug(String str, int i) {
        this(str);
        this.c = true;
    }

    public oug(String str, boolean z, Function2 function2) {
        this(str, function2);
        this.c = z;
    }
}
