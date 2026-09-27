package defpackage;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fak {
    public final KClass a;
    private final Function1<CreationExtras, dak> b;

    public fak(KClass kClass, Function1 function1) {
        kClass.getClass();
        function1.getClass();
        this.a = kClass;
        this.b = function1;
    }

    public final Function1 a() {
        return this.b;
    }
}
