package defpackage;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xhi implements Lazy, Serializable {
    public Function0 a;
    public volatile Object b;
    public final Object c;

    public xhi(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i & 2) != 0 ? null : obj;
        function0.getClass();
        this.a = function0;
        this.b = nkj.a;
        this.c = obj == null ? this : obj;
    }

    @Override // kotlin.Lazy
    public final boolean b() {
        if (this.b != nkj.a) {
            return true;
        }
        return false;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object obj;
        Object obj2 = this.b;
        nkj nkjVar = nkj.a;
        if (obj2 != nkjVar) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == nkjVar) {
                Function0 function0 = this.a;
                function0.getClass();
                obj = function0.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (b()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
