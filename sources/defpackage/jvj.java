package defpackage;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class jvj implements Lazy, Serializable {
    public Function0 a;
    public Object b;

    @Override // kotlin.Lazy
    public final boolean b() {
        if (this.b != nkj.a) {
            return true;
        }
        return false;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object obj = this.b;
        if (obj == nkj.a) {
            Function0 function0 = this.a;
            function0.getClass();
            Object invoke = function0.invoke();
            this.b = invoke;
            this.a = null;
            return invoke;
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
