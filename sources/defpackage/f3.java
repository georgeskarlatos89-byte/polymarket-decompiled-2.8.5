package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.ReflectionObjectRenderer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class f3 implements xka, bj6, v78, u7h, hgj {
    public final ReflectProperties.LazySoftVal a;

    public f3(Function0 function0) {
        ReflectProperties.LazySoftVal lazySoftVal;
        ReflectProperties.LazySoftVal lazySoftVal2 = null;
        if (function0 instanceof ReflectProperties.LazySoftVal) {
            lazySoftVal = (ReflectProperties.LazySoftVal) function0;
        } else {
            lazySoftVal = null;
        }
        if (lazySoftVal == null) {
            if (function0 != null) {
                lazySoftVal2 = ReflectProperties.lazySoft(function0);
            }
        } else {
            lazySoftVal2 = lazySoftVal;
        }
        this.a = lazySoftVal2;
    }

    public abstract wka b();

    public abstract KClass e();

    public boolean equals(Object obj) {
        if ((obj instanceof f3) && n7n.l(gdn.C, this, (mta) obj)) {
            return true;
        }
        return false;
    }

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public int hashCode() {
        int i;
        tja c = c();
        if (c != null) {
            i = c.hashCode();
        } else {
            i = 0;
        }
        int hashCode = d().hashCode();
        return Boolean.hashCode(a()) + ((hashCode + (i * 31)) * 31);
    }

    public abstract boolean i();

    public abstract f3 j();

    public abstract f3 k(boolean z);

    public abstract f3 l(boolean z);

    public abstract f3 m();

    public String toString() {
        return ReflectionObjectRenderer.renderType$default(ReflectionObjectRenderer.INSTANCE, this, false, 2, null);
    }
}
