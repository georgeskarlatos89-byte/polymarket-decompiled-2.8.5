package defpackage;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class mog {
    public final Object a;
    public final Function3 b;
    public final Function3 c;
    public final Function3 d;

    public mog(Object obj, Function3 function3, Function3 function32, Function3 function33) {
        this.a = obj;
        this.b = function3;
        this.c = function32;
        this.d = function33;
    }

    public /* synthetic */ mog(Object obj, Function3 function3, Function3 function32, Function3 function33, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function3, function32, (i & 8) != 0 ? null : function33);
    }
}
