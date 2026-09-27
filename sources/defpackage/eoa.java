package defpackage;

import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.PaymentMethodName;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class eoa {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public eoa(Class cls, ki[] kiVarArr) {
        this.a = 0;
        this.c = cls;
        HashMap hashMap = new HashMap();
        for (ki kiVar : kiVarArr) {
            boolean containsKey = hashMap.containsKey(kiVar.a);
            Class cls2 = kiVar.a;
            if (!containsKey) {
                hashMap.put(cls2, kiVar);
            } else {
                dmk.v(ace.l(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                throw null;
            }
        }
        if (kiVarArr.length > 0) {
            this.d = kiVarArr[0].a;
        } else {
            this.d = Void.class;
        }
        this.b = Collections.unmodifiableMap(hashMap);
    }

    public abstract xl8 a();

    public p3j b() {
        return p3j.ALGORITHM_NOT_FIPS;
    }

    public String c() {
        return (String) this.d;
    }

    public x77 d() {
        return (x77) this.c;
    }

    public abstract String e();

    public abstract String f();

    public List g() {
        ComponentName componentName = (ComponentName) ((Function0) this.b).invoke();
        if (componentName == PaymentMethodName.Card) {
            return (List) this.c;
        }
        if (componentName == PaymentMethodName.RememberMe) {
            return (List) this.d;
        }
        return CollectionsKt.emptyList();
    }

    public abstract x4 h();

    public abstract wma i();

    public abstract g4 j(fw1 fw1Var);

    public abstract void k(g4 g4Var);

    public String toString() {
        switch (this.a) {
            case 2:
                return getClass().getSimpleName() + ": " + a();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ eoa(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
