package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class koa {
    public static final koa e = new koa(null, null, null, null, 63);
    public final Function1 a;
    public final Function1 b;
    public final Function1 c;
    public final Function1 d;

    public koa(Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i) {
        function1 = (i & 1) != 0 ? null : function1;
        function12 = (i & 4) != 0 ? null : function12;
        function13 = (i & 16) != 0 ? null : function13;
        function14 = (i & 32) != 0 ? null : function14;
        this.a = function1;
        this.b = function12;
        this.c = function13;
        this.d = function14;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof koa) {
                koa koaVar = (koa) obj;
                if (this.a == koaVar.a && this.b == koaVar.b && this.c == koaVar.c && this.d == koaVar.d) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        Function1 function1 = this.a;
        if (function1 != null) {
            i = function1.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 961;
        Function1 function12 = this.b;
        if (function12 != null) {
            i2 = function12.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 961;
        Function1 function13 = this.c;
        if (function13 != null) {
            i3 = function13.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        Function1 function14 = this.d;
        if (function14 != null) {
            i4 = function14.hashCode();
        }
        return i7 + i4;
    }
}
